package pl.nowy.Elements;

import com.vaadin.event.selection.SelectionEvent;
import com.vaadin.event.selection.SelectionListener;
import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;

import java.util.List;
import java.util.Set;


/**
 * Created by Kasia on 14.06.2017.
 */
public class IndexPanel extends VerticalLayout {

    private HorizontalLayout headPanel;
    private Grid<Entry> grid;


    public IndexPanel() { init();}

    private void init(){
        grid = new Grid<>();
        addComponent(grid);
        grid.addStyleName("index");
        addStyleName("index-panel");
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
        grid.addItemClickListener(event ->
                Notification.show("Value: " + event.getItem().prettyPrint()));
    }

    public void updateGrid(List<Entry> entryList) {
        grid.setItems(entryList);
        grid.addColumn(Entry::getOrth).setCaption("Leksem");
        grid.addColumn(Entry::getPos).setCaption("Część mowy");
    }


}
