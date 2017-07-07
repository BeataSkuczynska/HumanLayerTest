package pl.nowy.Elements;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

/**
 * Created by Kasia on 17.06.2017.
 */
public class TopPanel extends HorizontalLayout {

    private Button guideButton;
    private Button aboutButton;
    private TextField queryField;
    private Button filterButton;

    public TopPanel() {
        init();
    }

    public void init(){

        guideButton = new Button("JAK KORZYSTAĆ ZE SŁOWNIKA?");
        aboutButton = new Button("O PROJEKCIE");
        guideButton.addStyleName("top-panel-button");
        aboutButton.addStyleName("top-panel-button");
        addComponent(guideButton);
        addComponent(aboutButton);

        queryField = new TextField();
        filterButton = new Button("Szukaj");
        addComponent(queryField);
        addComponent(filterButton);

        addStyleName("top-panel");

    }

    public Button getAboutButton() {
        return aboutButton;
    }
}
