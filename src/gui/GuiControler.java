package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Bunzio on 04.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class GuiControler implements Initializable {
    private Image kolkoImg = new Image("img/o.bmp");
    private Image krzyzykImg = new Image("img/x.bmp");
    private Image nicImg = new Image("img/nic.bmp");
    private Image kolkoSmallImg = new Image("img/osmall.bmp");
    private Image krzyzykSmallImg = new Image("img/xsmall.bmp");
    private boolean[] isKliked = new boolean[9];
    private boolean turaGracza = false;   // false = kolko true = krzyzyk
    private int[] whoKliked = new int[9];    // 1- kolko 2- krzyzyk 3-null
    private ImageView imageView;
    private int witchWindow;

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
    private void bNewyGameAction() {
        setImageToStart();
        turaGracza = false;
        setToStartValeue();
        setMouseTransparentToFalse();

    }

    private void gameWindowAction(ImageView imageView, int witchWindow) {
        this.witchWindow = witchWindow;
        if (turaGracza == false) {
            imageView.setImage(kolkoImg);
            turaGraczaWindow.setImage(krzyzykSmallImg);
            isKliked[witchWindow] = true;
            whoKliked[witchWindow] = 1;
            turaGracza = true;
            imageView.setMouseTransparent(true);


        } else {
            imageView.setImage(krzyzykImg);
            turaGraczaWindow.setImage(kolkoSmallImg);
            isKliked[witchWindow] = false;
            whoKliked[witchWindow] = 2;
            turaGracza = false;
            imageView.setMouseTransparent(true);

        }
        ifWin();


    }

    private void setImageToStart() {
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
    }

    private void setToStartValeue() {
        for (int i = 0; i <= 8; i++) {
            isKliked[i] = false;

        }
        for (int i = 0; i <= 8; i++) {
            whoKliked[i] = 3+i;
        }
    }

    private void setMouseTransparentToFalse() {
        gameWindow1.setMouseTransparent(false);
        gameWindow2.setMouseTransparent(false);
        gameWindow3.setMouseTransparent(false);
        gameWindow4.setMouseTransparent(false);
        gameWindow5.setMouseTransparent(false);
        gameWindow6.setMouseTransparent(false);
        gameWindow7.setMouseTransparent(false);
        gameWindow8.setMouseTransparent(false);
        gameWindow9.setMouseTransparent(false);
    }

    private void winInformation() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Koniec Gry");
        alert.setHeaderText(null);
        if(turaGracza==false)
            alert.setContentText("Brawo wygrywa: Krzyżyk   Gratulacje!!");
        else if(turaGracza==true)
            alert.setContentText("Brawo wygrywa: Kółko   Gratulacje!!");

        alert.showAndWait();
    }

    private void ifWin() {
        if (checkWin()) {
            winInformation();

        }
    }

    private boolean checkWin() {
        if (whoKliked[0] == whoKliked[1] && whoKliked[0] == whoKliked[2] ||
                whoKliked[3] == whoKliked[4] && whoKliked[3] == whoKliked[5] ||
                whoKliked[6] == whoKliked[7] && whoKliked[6] == whoKliked[8] ||
                whoKliked[0] == whoKliked[3] && whoKliked[0] == whoKliked[8] ||
                whoKliked[1] == whoKliked[4] && whoKliked[1] == whoKliked[7] ||
                whoKliked[2] == whoKliked[5] && whoKliked[2] == whoKliked[8] ||
                whoKliked[0] == whoKliked[4] && whoKliked[0] == whoKliked[8] ||
                whoKliked[2] == whoKliked[4] && whoKliked[2] == whoKliked[6]) {
            return true;
        } else return false;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setToStartValeue();
        setImageToStart();
        setMouseTransparentToFalse();

        gameWindow1.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow1, 0);
        }));
        gameWindow2.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow2, 1);
        }));
        gameWindow3.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow3, 2);
        }));
        gameWindow4.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow4, 3);
        }));
        gameWindow5.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow5, 4);
        }));
        gameWindow6.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow6, 5);
        }));
        gameWindow7.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow7, 6);
        }));
        gameWindow8.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow8, 7);
        }));
        gameWindow9.setOnMouseClicked((event -> {
            gameWindowAction(gameWindow9, 8);
        }));


    }
}
