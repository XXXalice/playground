import pyxel

class App:
    def __init__(self):
        pyxel.init(width=160, height=120, caption='test')
        pyxel.run(self.update, self.draw)

    def update(self):
        pass

    def draw(self):
        pyxel.cls(12)


App()
