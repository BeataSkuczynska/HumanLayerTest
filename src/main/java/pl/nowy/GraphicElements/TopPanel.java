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

        guideButton = new Button("JAK UŻYWAĆ SŁOWNIKA?");
        aboutButton = new Button("O PROJEKCIE");
        searchPanel = new SearchPanel();
        aboutInformation = new TextArea();
        guideInformation = new TextArea();

        guideButton.addStyleName("top-panel-button");
        aboutButton.addStyleName("top-panel-button");
        aboutInformation.addStyleName("about-information-TextArea");
        guideInformation.addStyleName("guide-information-TextArea");

        aboutInformation.setValue("Walenty to słownik Walencyjny języka polskiego tworzony w Instytucie Podstaw Informatyki PAN. Wcześniejsza praca nad tym słownikiem doprowadziła do stworzenia kilku jego warstw, które razem miały dokładnie odwzorowywać zjawisko walencji w języku polskim. Z założenia miał to być słownik czytelny zarówno dla maszyn, jak i dla ludzi. To pierwsze założenie zaskutkowało trudną w odbiorze i nieintuicyjną formą. Celem projektu jest zaprezentowanie w przystępny użytkownikowi sposób danych zawartych w Walentym.\n" +
                "\n" +
                "Projekt został rozpoczęty przez Beatę Skuczyńską oraz Konrada Zielińskiego w ramach projektu grupowego na ostatnim roku studiów kognitywistycznych na Uniwestytecie Warszawskim pod opieką dr hab Adama Przepiórkowskiego. W tym zespole stworzono algorytm przekształcania warstw syntaktycznej i semantycznej na przystępną dla użytkownika języka polskiego formę prototypowych zdań. Aplikacja webowa, którą teraz oglądamy jest wynikiem pracy Beaty Skuczyńskiej, Kasi Skowrońskiej i Konrada Zielińskiego. Aktualnie prowadzone są testy użyteczności, w których bierzesz udział :)\n" +
                "\n" +
                "Oba etapy projektu dostępne są na wolnej licencji i dostępne na GitHubie:\n" +
                "1. Algorytm przekształcania: GitHub(Ptython)\n" +
                "2. Aplikacja webowa (Java): https://github.com/HumanLayer/webapplication");
        guideInformation.setValue("Słowniki walencyjne określają sposób, w jaki jednostki języka łączą się ze swoimi podrzędnikami. Na przykład z czasownikiem 'pomagać' poprawnie łączą się frazy nominalne w mianowniku lub celowniku. W ramach tej aplikacji walencja czasowników jest prezentowana jako prototypowe zdanie. Przykładowo: czasownik 'abdykować' może mieć w podmiocie frazę nominalną w mianowniku, a na następnych pozycjach frazę nominalną w dopełniaczu oraz frazę z przyimkiem złożonym 'na rzecz', również w dopełniaczu. Aby uprzystępnić formę prezentacji zaczerpnięto informacje z warstwy semantycznej Walentego i odmieniono znalezione tam słowa w odpowiedni sposób. Aby wybrać interesujący Cię czasownik, wpisz w pole wyszukiwania jego formę bezokolicznikową lub wybierz go z listy. Wersja, którą teraz testujesz to prototyp, który zawiera ograniczoną liczbę czasowników.");
        //TextField searchField = new TextField();
        //Button searchButton = new Button("Szukaj");


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
