package racingcar;

import racingcar.game.Game;

public class Controller {

    Game game = new Game();

    public void run(){
        setGame();
    }

    public void setGame(){
        game.setGame();
    }

}
