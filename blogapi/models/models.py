from sqlalchemy import Column, Integer, String, DateTime
from models.database import Base
from datetime import datetime

class PostContent(Base):
    # 投稿のモデル定義
    __tablename__ = 'postcontents'
    id = Column(Integer, primary_key=True)
    title = Column(String(64))
    body = Column(String(256))
    time = Column(DateTime, default=datetime.now())

    def __init__(self, title=None, body=None, time=None):
        self.title = title
        self.body = body
        self.time = time

    def __repr__(self):
        return '<Title %r>' % (self.title)