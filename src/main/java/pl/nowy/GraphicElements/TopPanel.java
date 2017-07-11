package pl.nowy.GraphicElements;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;

/**
 * Created by Kasia on 17.06.2017.
 */
public class TopPanel extends HorizontalLayout {

    private SearchPanel searchPanel;
    private Button guideButton;
    private Button aboutButton;
    private TextArea aboutInformation;
    private TextArea guideInformation;

    public SearchPanel getSearchPanel() { return searchPanel; }

    public void setSearchPanel(SearchPanel searchPanel) { this.searchPanel = searchPanel; }

    public Button getGuideButton() { return guideButton; }

    public Button getAboutButton() { return aboutButton; }

    public TextArea getAboutInformation() { return aboutInformation; }

    public TextArea getGuideInformation() { return guideInformation; }

    public TopPanel() {
        init();
    }

    public void init(){
        addStyleName("top-panel");
        setMargin(new MarginInfo(false, true,false, true));

        guideButton = new Button("JAK KORZYSTAĆ ZE SŁOWNIKA?");
        aboutButton = new Button("O PROJEKCIE");
        searchPanel = new SearchPanel();
        aboutInformation = new TextArea();
        guideInformation = new TextArea();
        aboutInformation.setValue("Projekt współtworzony przez ich troje: KS, BS, KZ");
        guideInformation.setValue("Strona w budowie");
        //TextField searchField = new TextField();
        //Button searchButton = new Button("Szukaj");

        guideButton.addStyleName("top-panel-button");
        aboutButton.addStyleName("top-panel-button");
        aboutInformation.addStyleName("about-Information-TextArea");
        guideInformation.addStyleName("guide-information-TextArea");
        //searchField.addStyleName("search-field");
        //searchButton.addStyleName("search-button");
        //searchPackage.addStyleName("search-package");

        addComponent(guideButton);
        //addComponent(searchField);
        addComponent(searchPanel);
            //searchPackage.addComponent(searchField);
            //searchPackage.addComponent(searchButton);
        addComponent(aboutButton);

        setComponentAlignment(guideButton, Alignment.TOP_LEFT);
        setComponentAlignment(searchPanel, Alignment.TOP_CENTER);
        setComponentAlignment(aboutButton, Alignment.TOP_RIGHT);
    }

}
