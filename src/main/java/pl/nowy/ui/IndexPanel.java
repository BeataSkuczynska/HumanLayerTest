package pl.nowy.ui;

import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;

import java.util.List;


/**
 * Created by Kasia on 14.06.2017.
 */
public class IndexPanel extends VerticalLayout {

    private HorizontalLayout headPanel;
    private Grid<Entry> grid;

    public HorizontalLayout getHeadPanel() {
        return headPanel;
    }

    public void setHeadPanel(HorizontalLayout headPanel) {
        this.headPanel = headPanel;
    }

    public Grid<Entry> getGrid() {
        return grid;
    }

    public void setGrid(Grid<Entry> grid) {
        this.grid = grid;
    }

    public IndexPanel() { init();}

    private void init(){
        setMargin(false);
        grid = new Grid<>();
        addComponent(grid);
        grid.addStyleName("index");
        addStyleName("index-panel");
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
    }

    public void updateGrid(List<Entry> entryList) {
        grid.setItems(entryList);
        grid.addColumn(Entry::getOrth).setCaption("Leksem");
        grid.addColumn(Entry::getPos).setCaption("Część mowy");
    }


}
