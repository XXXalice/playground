import pyxel
from handler.logger import Logger
from handler import FIELD_X, FIELD_Y

class Player:
    def __init__(self, name='shamiko', age=32):
        self.log = Logger(log_file='logs')
        self.stat = {
            'name': name,
            'age': age
        }
        self.x = 0
        self.y = 0
        self.bullets = []
        self.log.debug('init games.')

    def update_player(self):
        if pyxel.btn(pyxel.KEY_A):
            self.x = self.x - 2
        if pyxel.btn(pyxel.KEY_D):
            self.x = self.x + 2
        if pyxel.btn(pyxel.KEY_W):
            self.y = self.y - 2
        if pyxel.btn(pyxel.KEY_S):
            self.y = self.y + 2

        if pyxel.btnr(pyxel.KEY_SPACE):
            self.shoot_bullet()

        if self.bullets:
            for b in self.bullets:
                b.diff_x = 1
                b.update_bullet()
                if not b.active:
                    self.bullets.remove(b)

    def draw_player(self):
        pyxel.blt(
            x=self.x,
            y=self.y,
            img=0,
            u=0,
            v=0,
            w=16,
            h=16,
            colkey=0
        )
        if self.bullets:
            for b in self.bullets:
                b.draw_bullet()

    def shoot_bullet(self):
        self.log.debug('shoot!')
        bullet_id = len(self.bullets)
        b = Bullet(token_id=bullet_id, x=self.x, y=self.y)
        self.bullets.append(b)
        print(self.bullets)
        print([b.token_id for b in self.bullets])



class Bullet:
    def __init__(self, token_id, x, y):
        self.token_id = token_id
        self.x = x
        self.y = y
        self.active = True
        self.diff_x = 0
        self.diff_y = 0

    def update_bullet(self):
        self.x += self.diff_x
        self.y += self.diff_y
        if self.x >= FIELD_X or self.y >= FIELD_Y:
            self.active = False

    def draw_bullet(self):
        pyxel.blt(
            x=self.x,
            y=self.y,
            img=0,
            u=0,
            v=16,
            w=16,
            h=16,
            colkey=0
        )