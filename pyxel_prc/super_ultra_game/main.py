import player
import pyxel

class App:
    def __init__(self):
        pyxel.init(width=160, height=120, caption='test')
        pyxel.load('./super.pyxel')
        self.player = player.Player()
        pyxel.run(self.update, self.draw)

    def update(self):
        self.player.update_player()

    def draw(self):
        pyxel.cls(12)
        pyxel.blt(
            x=self.player.x,
            y=self.player.y,
            img=0,
            u=0,
            v=0,
            w=16,
            h=16,
            colkey=0
        )
        self._draw_player_xy()

    def _draw_player_xy(self):
        pyxel.text(
            x=pyxel.width - 50,
            y=pyxel.height - 10,
            s='x:{} y:{}'.format(self.player.x, self.player.y),
            col=10
        )


App()
