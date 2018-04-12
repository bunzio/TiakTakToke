package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

/**
 * Created by Bunzio on 04.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class GuiControler {
    private Image kolkoImg = new Image("img/o.bmp");
    private Image krzyzykImg = new Image("img/x.bmp");
    private Image nicImg = new Image("img/nic.bmp");
    private Image kolkoSmallImg = new Image("img/osmall.bmp");
    private Image krzyzykSmallImg = new Image("img/xsmall.bmp");
    private boolean[] isKliked = new boolean[9];
    private boolean turaGracza = false;   // false = kolko true = krzyzyk
    private int[] whoKliked = new int[9];    // 1- kolko 2- krzyzyk 3-null


    @FXML
    private ImageView gameWindow1;
    @FXML
    private ImageView gameWindow2;
    @FXML
    private ImageView gameWindow3;
    @FXML
    private ImageView gameWindow4;
    @FXML
    private ImageView gameWindow5;
    @FXML
    private ImageView gameWindow6;
    @FXML
    private ImageView gameWindow7;
    @FXML
    private ImageView gameWindow8;
    @FXML
    private ImageView gameWindow9;
    @FXML
    private ImageView turaGraczaWindow;
    @FXML
    private Button bNewGame;


    @FXML
    private void gameWindowAction1() {
        if (isKliked[0] == false) {
            if (turaGracza == false) {
                gameWindow1.setImage(kolkoImg);
                turaGraczaWindow.setImage(krzyzykSmallImg);
                isKliked[0] = true;
                whoKliked[0] = 1;


            } else {
                gameWindow1.setImage(krzyzykImg);
                turaGraczaWindow.setImage(kolkoSmallImg);
                isKliked[0] = false;
                whoKliked[0] = 2;

            }
        }


    }

    @FXML
    private void bNewyGameAction() {
        gameWindow1.setImage(nicImg);
        gameWindow2.setImage(nicImg);
        gameWindow3.setImage(nicImg);
        gameWindow4.setImage(nicImg);
        gameWindow5.setImage(nicImg);
        gameWindow6.setImage(nicImg);
        gameWindow7.setImage(nicImg);
        gameWindow8.setImage(nicImg);
        gameWindow9.setImage(nicImg);
        turaGraczaWindow.setImage(kolkoSmallImg);

        turaGracza = false;

        for (int i = 0; i <= 8; i++) {
            isKliked[i] = false;

        }
        for (int i = 0; i <= 8; i++) {
            whoKliked[i] = 3;
        }

    }

}
