/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author amine
 */
public class AddPostController implements Initializable {

    @FXML
    private ImageView logoHomeImage;
    @FXML
    private TextField homesearch;
    @FXML
    private ImageView searchHomeImage;
    @FXML
    private Label labelusername;
    @FXML
    private ImageView userHomeImage;
    @FXML
    private Button buttonYourPostsHome;
    @FXML
    private Button buttonAddPostHome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
