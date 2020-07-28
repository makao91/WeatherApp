package application.model;

import javafx.scene.control.TextField;

public class TextFieldData {
    private final TextField textField;

    public TextFieldData(TextField textField) {

        this.textField = textField;
    }

    public TextField getTextField() {
        return textField;
    }
    public String getNewText () {
       return this.textField.getText();
    }
}
