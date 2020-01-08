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
        if pyxel.btn(pyxel.KEY_LEFT):
            self.x = self.x - 2
        if pyxel.btn(pyxel.KEY_RIGHT):
            self.x = self.x + 2
        if pyxel.btn(pyxel.KEY_UP):
            self.y = self.y - 2
        if pyxel.btn(pyxel.KEY_DOWN):
            self.y = self.y + 2