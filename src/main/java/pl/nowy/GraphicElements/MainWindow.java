package pl.nowy.GraphicElements;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import pl.nowy.HumanElements.Dictionary;
import pl.nowy.HumanElements.Entry;
import pl.nowy.dictionary.DictionaryService;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static com.vaadin.ui.Alignment.TOP_LEFT;
import static com.vaadin.ui.Alignment.TOP_RIGHT;

/**
 * Created by Kasia on 09.06.2017.
 */
public class MainWindow extends VerticalLayout {

    private TopPanel topPanel;
    private HorizontalLayout mainPanel;
    private IndexPanel indexPanel;
    private EntryWindowFactory factory = new EntryWindowFactory();
    private EntryHolder entryHolder;

    //private static Dictionary WalentyHumanLayer;
    //private TemporaryEntryFactory tempFactory = new TemporaryEntryFactory();

    public MainWindow() throws JAXBException {
        //populateDictionary();
        setMargin(new MarginInfo(false, true, true, true));

        topPanel = new TopPanel();
        topPanel.setSizeFull();

        topPanel.getSearchPanel().getSearchButton().addClickListener(event ->
            {searchEntryWindow(topPanel.getSearchPanel().getSearchField().getValue());
            topPanel.getSearchPanel().getSearchField().setValue("");});

        topPanel.getAboutButton().addClickListener(event ->
            {entryHolder.removeAllComponents();
            entryHolder.addComponent(topPanel.getAboutInformation());});

        topPanel.getGuideButton().addClickListener(event ->
            {entryHolder.removeAllComponents();
            entryHolder.addComponent(topPanel.getGuideInformation());});

        mainPanel = new HorizontalLayout();
        mainPanel.addStyleName("main-panel");
        mainPanel.setMargin(false);
        entryHolder = new EntryHolder();
        indexPanel = new IndexPanel();

        indexPanel.updateGrid(DictionaryService.getWalentyHumanLayer().getEntries());
        indexPanel.getGrid().addItemClickListener(event ->
                changeEntryWindow(event.getItem()));

        mainPanel.setSizeFull();
        mainPanel.addComponent(entryHolder);
        mainPanel.addComponent(indexPanel);

        mainPanel.setExpandRatio(entryHolder, 3f);
        mainPanel.setExpandRatio(indexPanel, 2f);

        mainPanel.setComponentAlignment(entryHolder, TOP_LEFT);
        mainPanel.setComponentAlignment(indexPanel, TOP_RIGHT);

        addComponent(topPanel);
        addComponent(mainPanel);

        setComponentAlignment(mainPanel, Alignment.TOP_CENTER);
        setComponentAlignment(topPanel, Alignment.TOP_CENTER);
    }

//    public void populateDictionary() throws JAXBException {
//        JAXBContext ctx = JAXBContext.newInstance(Dictionary.class);
//        Unmarshaller unmarshaller = ctx.createUnmarshaller();
//        String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
//        FileResource data = new FileResource(new File(basepath + "/WEB-INF/data.xml"));
//        WalentyHumanLayer = (Dictionary) unmarshaller.unmarshal(data.getSourceFile());
//    }

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




}
