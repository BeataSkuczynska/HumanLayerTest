package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.shared.ui.Orientation;
import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;
import pl.nowy.dictionary.DictionaryService;

import java.util.List;

import javax.xml.bind.JAXBException;

import static com.vaadin.ui.Alignment.TOP_LEFT;

/**
 * Created by Kasia on 09.06.2017.
 */
public class MainWindow extends HorizontalLayout {

    private TopPanel topPanel;

    private EntryFrameFactory factory = new EntryFrameFactory();
    private EntryHolder entryHolder;
    private LeftPanel leftPanel;
    private VerticalLayout mainPanel;



    public MainWindow() throws JAXBException {

        setMargin(new MarginInfo(false, false, false, false));


        mainPanel = new VerticalLayout();
        mainPanel.addStyleName("main-panel");
        mainPanel.setMargin(false);
        mainPanel.setSpacing(false);
        entryHolder = new EntryHolder();


        leftPanel = new LeftPanel();
        leftPanel.getIndexPanel().getGrid().addItemClickListener(event ->
                changeEntryWindow(event.getItem()));

        topPanel = new TopPanel();
        topPanel.setSizeFull();

        leftPanel.getSearchPanel().getSearchButton().addClickListener(event ->
        {searchEntryWindow(leftPanel.getSearchPanel().getSearchField().getValue());
            topPanel.getSearchPanel().getSearchField().setValue("");});

        topPanel.getAboutButton().addClickListener(event ->
        {entryHolder.removeAllComponents();
            entryHolder.addComponent(topPanel.getAboutInformation());});

        topPanel.getGuideButton().addClickListener(event ->
        {entryHolder.removeAllComponents();
            entryHolder.addComponent(topPanel.getGuideInformation());});


        mainPanel.addComponent(topPanel);
        mainPanel.addComponent(entryHolder);

        //entryHolder.setSizeFull();

        //leftPanel.setSizeFull();
        //mainPanel.setSizeFull();


        //mainPanel.setComponentAlignment(entryHolder, TOP_LEFT);
        //mainPanel.setComponentAlignment(indexPanel, TOP_RIGHT);

        addComponent(leftPanel);
        addComponent(mainPanel);

        setExpandRatio(leftPanel, 1f);
        setExpandRatio(mainPanel, 3f);

        //setComponentAlignment(mainPanel, Alignment.TOP_CENTER);


        setSizeFull();
    }



    public void changeEntryWindow(Entry entry){
        entryHolder.removeAllComponents();
        EntryFrame ew = EntryFrameFactory.createEntryFrame(entry);
        //ew.setSizeFull();
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
