package pl.nowy.ui;

import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;


/**
 * Created by Wiedźma on 2017-07-10.
 */
public class SearchPanel extends HorizontalLayout {

   // private Grid<Entry> grid;
    private TextField searchField;
    private Button searchButton;

    public TextField getSearchField() { return searchField; }

    public void setSearchField(TextField searchField) { this.searchField = searchField; }

    public Button getSearchButton() { return searchButton; }

    public void setSearchButton(Button searchButton) { this.searchButton = searchButton; }

    public SearchPanel() {
        init();
    }

    public void init(){

        searchField = new TextField();
        searchButton = new Button("Szukaj");

        addStyleName("search-package");
        searchField.addStyleName("search-field");
        searchButton.addStyleName("search-button");

        searchButton.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        searchField.setPlaceholder("Wpisz czasownik, którego szukasz");

        addComponent(searchField);
        addComponent(searchButton);
    }
}
