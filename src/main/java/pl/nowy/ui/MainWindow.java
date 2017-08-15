package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;
import pl.nowy.dictionary.DictionaryService;

import java.util.List;

import javax.xml.bind.JAXBException;

import static com.vaadin.ui.Alignment.TOP_LEFT;
import static com.vaadin.ui.Alignment.TOP_RIGHT;

/**
 * Created by Kasia on 09.06.2017.
 */
public class MainWindow extends HorizontalLayout {

    private TopPanel topPanel;

    private EntryWindowFactory factory = new EntryWindowFactory();
    private EntryHolder entryHolder;
    private LeftPanel leftPanel;
    private VerticalLayout mainPanel;



    public MainWindow() throws JAXBException {

        setMargin(new MarginInfo(false, false, false, false));

        topPanel = new TopPanel();
        topPanel.setSizeFull();

//        topPanel.getSearchPanel().getSearchButton().addClickListener(event ->
//            {searchEntryWindow(topPanel.getSearchPanel().getSearchField().getValue());
//            topPanel.getSearchPanel().getSearchField().setValue("");});

        topPanel.getAboutButton().addClickListener(event ->
            {entryHolder.removeAllComponents();
            entryHolder.addComponent(topPanel.getAboutInformation());});

        topPanel.getGuideButton().addClickListener(event ->
            {entryHolder.removeAllComponents();
            entryHolder.addComponent(topPanel.getGuideInformation());});

        mainPanel = new VerticalLayout();
        mainPanel.addStyleName("main-panel");
        mainPanel.setMargin(false);
        entryHolder = new EntryHolder();


        leftPanel = new LeftPanel();
        leftPanel.getIndexPanel().getGrid().addItemClickListener(event ->
                changeEntryWindow(event.getItem()));

        mainPanel.setSizeFull();
        mainPanel.addComponent(entryHolder);

        //mainPanel.setExpandRatio(entryHolder, 3f);
        //mainPanel.setExpandRatio(indexPanel, 2f);

        mainPanel.setComponentAlignment(entryHolder, TOP_LEFT);
        //mainPanel.setComponentAlignment(indexPanel, TOP_RIGHT);

        mainPanel.addComponent(topPanel);
        addComponent(leftPanel);
        addComponent(mainPanel);

        setComponentAlignment(mainPanel, Alignment.TOP_CENTER);
//        setComponentAlignment(topPanel, Alignment.TOP_CENTER);
    }



    public void changeEntryWindow(Entry entry){
        entryHolder.removeAllComponents();
        EntryWindow ew = EntryWindowFactory.createEntryWindow(entry);
        entryHolder.addComponent(ew);
        entryHolder.setComponentAlignment(ew, TOP_LEFT);
    }

    public void searchEntryWindow (String searchedVerb){
        List<Entry> entries = DictionaryService.getWalentyHumanLayer().getEntries();
        Entry outEntry = null;
        for (Entry entry : entries){
            String entryOrth = entry.getOrth();
            if (entryOrth.equals(searchedVerb)){
                outEntry = entry;
            }
        }
        if (outEntry != null){
            changeEntryWindow(outEntry);
        } else {
            entryHolder.removeAllComponents();
            Notification.show ("Nie ma takiego czasownika na liście");
        }

    }

    public void nic(){

    }




}
