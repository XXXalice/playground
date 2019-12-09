from sqlalchemy import create_engine
from sqlalchemy.orm import scoped_session, sessionmaker
from sqlalchemy.ext.declarative import declarative_base
import os
import inspect

db_file = os.path.join('/'.join(inspect.stack()[0][1].split('/')[:-1]), 'posts.db')
engine = create_engine('sqlite:///'+ db_file, convert_unicode=True)
db_sess = scoped_session(sessionmaker(autocommit=False, autoflush=False, bind=engine))

Base = declarative_base()
Base.query = db_sess.query_property()

def init_db():
    import models
    Base.metadata.create_all(bind=engine)