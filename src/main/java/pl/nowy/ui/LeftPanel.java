package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import pl.nowy.HumanElements.Entry;
import pl.nowy.dictionary.DictionaryService;

import java.util.List;

import static com.vaadin.ui.Alignment.TOP_CENTER;
import static com.vaadin.ui.Alignment.TOP_LEFT;

/**
 * Created by Kasia on 14.08.2017.
 */

public class LeftPanel  extends VerticalLayout {



    private IndexPanel indexPanel;
    private SearchPanel searchPanel;

    public LeftPanel() { init();}

    private void init(){

        addStyleName("left-panel");

        setMargin(new MarginInfo(true, true, false, true));
        setSpacing(false);
        searchPanel = new SearchPanel();
        addComponent(searchPanel);

        indexPanel = new IndexPanel();
        indexPanel.populate(DictionaryService.getWalentyHumanLayer().getEntries());
        addComponent(indexPanel);

        setComponentAlignment(indexPanel, TOP_CENTER);


        //indexPanel.setSizeFull();
    }

    public IndexPanel getIndexPanel() {
        return indexPanel;
    }

    public SearchPanel getSearchPanel() {
        return searchPanel;
    }


}
