package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import pl.nowy.HumanElements.Entry;
import pl.nowy.dictionary.DictionaryService;

import java.util.List;

/**
 * Created by Kasia on 14.08.2017.
 */

public class LeftPanel  extends VerticalLayout {

    private IndexPanel indexPanel;
    private SearchPanel searchPanel;

    public LeftPanel() { init();}

    private void init(){

        addStyleName("left-panel");

        setMargin(new MarginInfo(true, false, true, true));
        searchPanel = new SearchPanel();
        addComponent(searchPanel);

        indexPanel = new IndexPanel();
        indexPanel.populate(DictionaryService.getWalentyHumanLayer().getEntries());
        addComponent(indexPanel);
    }

    public IndexPanel getIndexPanel() {
        return indexPanel;
    }
}
