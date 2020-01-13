import pyxel

class Player:
    def __init__(self, name='shamiko', age=32):
        self.stat = {
            'name': name,
            'age': age
        }
        self.x = 0
        self.y = 0

    def update_player(self):
        if pyxel.btn(pyxel.KEY_A):
            self.x = self.x - 2
        if pyxel.btn(pyxel.KEY_D):
            self.x = self.x + 2
        if pyxel.btn(pyxel.KEY_W):
            self.y = self.y - 2
        if pyxel.btn(pyxel.KEY_S):
            self.y = self.y + 2

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

class Bullet:
    def __init__(self, token_id, x, y):
        self.token_id = token_id
        self.x = x
        self.y = y

    def shoot(self):
        if pyxel.btn(pyxel.KEY_SPACE):
            pass
