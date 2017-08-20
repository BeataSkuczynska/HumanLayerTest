package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;

import java.util.List;

import static com.vaadin.ui.Alignment.TOP_CENTER;
import static com.vaadin.ui.Alignment.TOP_LEFT;


/**
 * Created by Kasia on 14.06.2017.
 */
public class IndexPanel extends HorizontalLayout {

    private final static String[] FIRST_LETTERS = new String[]{"A", "B", "C", "D", "E",
    "F", "G", "H", "I", "J", "K", "L"};

    //private HorizontalLayout headPanel;
    private Grid<Entry> grid;
    private VerticalLayout letterPanel;

//    public HorizontalLayout getHeadPanel() {
//        return headPanel;
//    }
//
//    public void setHeadPanel(HorizontalLayout headPanel) {
//        this.headPanel = headPanel;
//    }

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
        letterPanel = generateLetters();
        //letterPanel.setSpacing(false);
        letterPanel.setMargin(new MarginInfo(false, false, true, false));
        addComponent(letterPanel);

        setComponentAlignment(letterPanel, TOP_LEFT);
        addComponent(grid);
        grid.addStyleName("index");
        addStyleName("index-panel");
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);

        setExpandRatio(letterPanel, 1f);
        setExpandRatio(grid, 5f);

        setSpacing(false);

        grid.setSizeFull();
        letterPanel.setSizeFull();
        setSizeFull();
    }

    public void populate(List<Entry> entryList) {
        grid.setItems(entryList);
        grid.addColumn(Entry::getOrth)
                .setCaption("Leksem")
                //.setWidth(200)
                .setResizable(false);
//        grid.addColumn(Entry::getPos)
//                .setCaption("?")
//                .setWidth(80)
//                .setResizable(false);
    }


    public VerticalLayout generateLetters(){
        VerticalLayout letterPanel = new VerticalLayout();
        letterPanel.addStyleName("letter-panel");
        for (String letter : FIRST_LETTERS){
            Label letterLabel = new Label(letter);
            letterLabel.addStyleName("index-letter");
            letterPanel.addComponent(letterLabel);
        }
        return letterPanel;
    }

}
