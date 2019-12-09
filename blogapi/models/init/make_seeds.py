import sys
import inspect
sys.path.append('../')
import database as db
import models
from random import choice as r

seeds = {
    'title': ["うんこ",
              "ちんこ",
              "おしっこ"],

    'body': ["うんこうんこチンチン",
             "ウンチが漏れたかしらねっ(^o^)",
             "いうほどシャミ子が悪いか？？？",
             "これは激レア文章だよっd(^-^)b"]
}
db.init_db()
seed_contents = []
for term in range(5):
    seed_contents.append(models.PostContent(title=r(seeds['title']), body=r(seeds['body'])))
for seed in seed_contents:
    db.db_sess.add(seed)
db.db_sess.commit()