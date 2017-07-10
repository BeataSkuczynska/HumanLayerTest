package pl.nowy.GraphicElements;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

/**
 * Created by Kasia on 17.06.2017.
 */
public class TopPanel extends HorizontalLayout {

    private SearchPanel searchPanel;

    public SearchPanel getSearchPanel() { return searchPanel; }

    public void setSearchPanel(SearchPanel searchPanel) { this.searchPanel = searchPanel; }

    public TopPanel() {
        init();
    }

    public void init(){
        addStyleName("top-panel");
        setMargin(new MarginInfo(false, true,false, true));

        Button guideButton = new Button("JAK KORZYSTAĆ ZE SŁOWNIKA?");
        Button aboutButton = new Button("O PROJEKCIE");
        searchPanel = new SearchPanel();
        //TextField searchField = new TextField();
        //Button searchButton = new Button("Szukaj");

        guideButton.addStyleName("top-panel-button");
        aboutButton.addStyleName("top-panel-button");
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
