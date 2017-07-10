package pl.nowy.GraphicElements;

import com.vaadin.server.ClassResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
import pl.nowy.HumanElements.Dictionary;
import pl.nowy.HumanElements.Entry;

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
    private HorizontalLayout entryWindow;

    private static Dictionary WalentyHumanLayer;
    //private TemporaryEntryFactory tempFactory = new TemporaryEntryFactory();

    public MainWindow() throws JAXBException {
        populateDictionary();
        setMargin(new MarginInfo(false, true, true, true));
        topPanel = new TopPanel();
        topPanel.setSizeFull();

        topPanel.getSearchPanel().getSearchButton().addClickListener(event ->
        {searchEntryWindow(topPanel.getSearchPanel().getSearchField().getValue());
        topPanel.getSearchPanel().getSearchField().setValue("");});

        mainPanel = new HorizontalLayout();
        mainPanel.addStyleName("main-window");

        //setComponentAlignment(mainPanel, Alignment.TOP_CENTER);

        entryWindow = new EntryWindow();
        mainPanel.addComponent(entryWindow);
        //entryWindow.setSizeFull();

        indexPanel = new IndexPanel();
//        indexPanel.setSizeFull();

        indexPanel.updateGrid(WalentyHumanLayer.getEntries());
        indexPanel.getGrid().addItemClickListener(event ->
                changeEntryWindow(event.getItem()));

        mainPanel.addComponent(indexPanel);

        mainPanel.setSizeFull();
        mainPanel.setComponentAlignment(indexPanel, TOP_RIGHT);
        mainPanel.setComponentAlignment(entryWindow, TOP_RIGHT);

        addComponent(topPanel);
        addComponent(mainPanel);

        setComponentAlignment(mainPanel, Alignment.TOP_CENTER);
        setComponentAlignment(topPanel, Alignment.TOP_CENTER);

//        setSizeFull();
    }

    public void populateDictionary() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Dictionary.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
        FileResource data = new FileResource(new File(basepath + "/WEB-INF/data.xml"));
        WalentyHumanLayer = (Dictionary) unmarshaller.unmarshal(data.getSourceFile());
    }

    public void changeEntryWindow(Entry entry){
        entryWindow.removeAllComponents();
        entryWindow.addComponent(EntryWindowFactory.createEntryWindow(entry));
    }

    public void searchEntryWindow (String searchedVerb){
        List<Entry> entries = WalentyHumanLayer.getEntries();
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
            entryWindow.removeAllComponents();
        }

    }




}
