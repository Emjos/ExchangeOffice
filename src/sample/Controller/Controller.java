package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;

import java.util.ResourceBundle;

import static sample.Controller.Currency.*;

public class Controller implements Initializable {

    @FXML
    private TextField AmountText;

    @FXML
    private TextField ExchangeRateField;

    @FXML
    private Button ExchangeButton;

    @FXML
    private TextField ExchangedText;

    @FXML
    private Text FromString;

    @FXML
    private Text ToExchangeString;

    @FXML
    private  ListView<Currency> FromList;

    @FXML
    private  ListView<Currency> ToList;

ObservableList<Currency> list = FXCollections.observableArrayList(USD,EUR,PLN,GBP);
    @FXML
    void setFromText(MouseEvent event) {
        FromString.setVisible(true);
        FromString.setText(FromList.getSelectionModel().getSelectedItems().toString());

    }

    @FXML
    void setToText(MouseEvent event) {
        ToExchangeString.setVisible(true);
        ToExchangeString.setText(ToList.getSelectionModel().getSelectedItems().toString());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FromList.getItems().addAll(list);
        ToList.getItems().addAll(list);
    }

    @FXML
    void setExchange(ActionEvent event) throws Exception{
        double ammount = Double.parseDouble(AmountText.getText());
        Currency from = FromList.getSelectionModel().getSelectedItem();
        Currency to = ToList.getSelectionModel().getSelectedItem();
        double exchanged = new ExchangeOffice().exhange(ammount,from,to);
        double exchangedRate = new ExchangeOffice().exchangedRate(from,to);
    ExchangedText.setText(String.valueOf(exchanged));
        System.out.println(exchanged);
        ExchangeRateField.setText(String.valueOf(exchangedRate));

    }

}
