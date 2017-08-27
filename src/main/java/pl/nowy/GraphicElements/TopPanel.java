package pl.nowy.GraphicElements;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;

/**
 * Created by Kasia on 17.06.2017.
 */
public class TopPanel extends HorizontalLayout {

    private SearchPanel searchPanel;
    private Button guideButton;
    private Button aboutButton;
    private TextArea aboutInformation;
    private TextArea guideInformation;

    public SearchPanel getSearchPanel() { return searchPanel; }

    public void setSearchPanel(SearchPanel searchPanel) { this.searchPanel = searchPanel; }

    public Button getGuideButton() { return guideButton; }

    public Button getAboutButton() { return aboutButton; }

    public TextArea getAboutInformation() { return aboutInformation; }

    public TextArea getGuideInformation() { return guideInformation; }

    public TopPanel() {
        init();
    }

    public void init(){
        addStyleName("top-panel");
        setMargin(new MarginInfo(false, true,false, true));

        guideButton = new Button("JAK KORZYSTAĆ ZE SŁOWNIKA?");
        aboutButton = new Button("O PROJEKCIE");
        searchPanel = new SearchPanel();
        aboutInformation = new TextArea();
        guideInformation = new TextArea();
        aboutInformation.setValue("Słowniki walencyjne określają sposób, w jaki jednostki języka łączą się ze swoimi podrzędnikami. Walenty to słownik Walencyjny języka polskiego tworzony w Instytucie Podstaw Informatyki PAN. Wcześniejsza praca nad tym słownikiem doprowadziła do stworzenia kilku jego warstw, które razem miały dokładnie odwzorowywać zjawisko walencji w języku polskim. Z założenia miał to być słownik czytelny zarówno dla maszyn, jak i dla ludzi. To pierwsze założenie zaskutkowało trudną w odbiorze i nieintuicyjną formą. Celem projektu jest zaprezentowanie w przystępny użytkownikowi sposób danych zawartych w Walentym.\n" +
                "\n" +
                "Projekt został ropoczęty przez Beatę Skuczyńską oraz Konrada Zielińskiego w ramach projektu grupowego na ostatnim roku studiów kognitywistycznych na Uniwestytecie Warszawskim pod opieką dr hab Adamma Przepiórkowskiego. W tym zespole stworzono algorytm przekształcania warstw syntaktycznej i semantycznej na przystępną dla użytkownika języka polskiego formę prototypowych zdań. Aplikacja webowa, którą teraz oglądamy jest wynikiem pracy Beaty Skuczyńskiej, Kasi Skowrońskiej i Konrada Zielińskiego. Aktualnie prowadzone są testy użyteczności, w których bieżesz udział :)\n" +
                "\n" +
                "Oba etapy projektu dostępne są na wolnej licencji i dostępne na GitHubie:\n" +
                "1. Algorytm przekształcania: GitHub(Ptython)\n" +
                "2. Aplikacja webowa: GitHub (Java)");
        guideInformation.setValue("Słowniki walencyjne określają sposób, w jaki jednostki języka łączą się ze swoimi podrzędnikami. Walenty to słownik Walencyjny języka polskiego tworzony w Instytucie Podstaw Informatyki PAN. " +
                "W ramach tej aplikacji walencja czasowników jest prezentowana jako zdanie. Przykładowo: czasownik 'borykać' może mieć w podmiocie frazę nominalną, reprezentowaną przez PODMIOT (kategorię predefiniowaną zawierającą w sobie ludzi oraz instutucje), a na drugiej pozycji frazę przyimkową z przyimkiem 'z' lub frazę pytajno-zależną z przyimkiem 'z' lub frazę zdaniową z przyimkiem 'z'");
        //TextField searchField = new TextField();
        //Button searchButton = new Button("Szukaj");

        guideButton.addStyleName("top-panel-button");
        aboutButton.addStyleName("top-panel-button");
        aboutInformation.addStyleName("about-information-TextArea");
        guideInformation.addStyleName("guide-information-TextArea");
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
