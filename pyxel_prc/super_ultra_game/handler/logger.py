from logging import Formatter, getLogger, handlers
from logging import DEBUG

import inspect
import os

class Logger:
    def __init__(self, log_file, n=__name__, max_bytes=10**10, backup_count=5):
        abs_path = inspect.stack()[0][1]
        save_log_path = '/'.join(abs_path.split('/')[:-1])
        self.logger = getLogger(n)
        self.logger.setLevel(DEBUG)
        handler = handlers.RotatingFileHandler(
            filename=os.path.join(save_log_path, log_file),
            maxBytes=max_bytes,
            backupCount=backup_count,
        )
        handler.setLevel(DEBUG)
        fmt = Formatter('%(asctime)s - %(name)s - %(levelname)s : %(message)s')
        handler.setFormatter(fmt=fmt)
        self.logger.addHandler(handler)

    def debug(self, msg):
        self.logger.debug(msg)

    def info(self, msg):
        self.logger.info(msg)

    def warn(self, msg):
        self.logger.warning(msg)

    def error(self, msg, errmsg='occer_error.'):
        self.logger.error('{} [{}]'.format(msg, errmsg))

    def critical(self,msg):
        self.logger.critical(msg)

    def log(self, type, msg):
        """
        可変式
        typeに入力されたstringからそれを実行する
        :param type: str
        :param msg: str
        """
        obj_methods = [m[0] for m in inspect.getmembers(self, inspect.ismethod)]
        if type in obj_methods:
            exec('self.{}("{}")'.format(type, msg))
