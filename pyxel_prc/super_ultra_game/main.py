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
        self.player.draw_player()
        self._draw_player_xy()

    def _draw_player_xy(self):
        pyxel.text(
            x=pyxel.width - 50,
            y=pyxel.height - 10,
            s='x:{} y:{}'.format(self.player.x, self.player.y),
            col=10
        )

App()
