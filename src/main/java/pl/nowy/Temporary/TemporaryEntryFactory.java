package pl.nowy.Temporary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kasia on 16.06.2017.
 */
public class TemporaryEntryFactory {

    public EntryOld createEntry(){
        Phrase phrase1 = new Phrase("Instytucja", "MIANOWNIK");
        Phrase phrase2 = new Phrase("adresuje", "adresuje");
        Phrase phrase3 = new Phrase("przedmiot", "BIERNIK");
        Phrase phrase4 = new Phrase("na ~ imię", "NA + BIERNIK");
        List<Phrase> phraseList1 = new ArrayList<Phrase>();
        phraseList1.add(phrase1);
        phraseList1.add(phrase2);
        phraseList1.add(phrase3);
        phraseList1.add(phrase4);

        Phrase phrase5 = new Phrase("do ~ jednostki", "DO + DOPEŁNIACZ");
        List<Phrase> phraseList2 = new ArrayList<Phrase>();
        phraseList1.add(phrase1);
        phraseList1.add(phrase2);
        phraseList1.add(phrase3);
        phraseList1.add(phrase5);

        Schema schema1 = new Schema(phraseList1);
        Schema schema2 = new Schema(phraseList2);
        List<Schema> schemaList1 = new ArrayList<Schema>();
        schemaList1.add(schema1);
        schemaList1.add(schema2);


        Phrase phrase6 = new Phrase("treść", "BIERNIK");
        Phrase phrase7 = new Phrase("do ~ kogoś", "DO + DOPEŁNIACZ");
        List<Phrase> phraseList3 = new ArrayList<Phrase>();
        phraseList1.add(phrase1);
        phraseList1.add(phrase2);
        phraseList1.add(phrase6);
        phraseList1.add(phrase7);

        Schema schema3 = new Schema(phraseList3);
        List<Schema> schemaList2 = new ArrayList<Schema>();
        schemaList2.add(schema3);

        Meaning meaning1 = new Meaning(schemaList1);
        Meaning meaning2 = new Meaning(schemaList2);

        List<Meaning> meaningsList1 = new ArrayList<Meaning>();
        meaningsList1.add(meaning1);
        meaningsList1.add(meaning2);

        EntryOld entryOld = new EntryOld("Adresować","Niedokonany", "Przechodni", meaningsList1);

        return entryOld;
    }
}
