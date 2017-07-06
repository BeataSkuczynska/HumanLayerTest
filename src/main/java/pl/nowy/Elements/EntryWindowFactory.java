package pl.nowy.Elements;

import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kasia on 14.06.2017.
 */
public class EntryWindowFactory {



    public VerticalLayout createEntryWindow(Entry entry){
        VerticalLayout entryWindow = new VerticalLayout();
        entryWindow.addStyleName("entryOld");
        Label label = new Label(entry.getOrth());
        entryWindow.addComponent(label);
        return entryWindow;
    }


//    public VerticalLayout createEntryWindow(EntryOld entryOld){
//        VerticalLayout entryWindow = new VerticalLayout();
//        entryWindow.addStyleName("entryOld");
//        Label label = new Label(entryOld.getRepresentation());
//        entryWindow.addComponent(label);
//        for (Meaning meaning : entryOld.getMeanings()){
//            VerticalLayout meaningLayout = new VerticalLayout();
//            Label meaningLabel = new Label(entryOld.getRepresentation());
//            meaningLayout.addComponent(meaningLabel);
//            meaningLabel.setSizeFull();
//            meaningLayout.addStyleName("meaning");
//            List<Component> reprList = new ArrayList<>();
//            for (Schema schema: meaning.getSchemas()){
//                Label test = new Label("test");
//                Component schemaRepr = createSchemaRepresentation(schema);
//                reprList.add(schemaRepr);
//                meaningLayout.addComponent(test);
//            }
//            for (Component comp: reprList){
//                //meaningLayout.addComponent(comp);
//                System.out.println(comp.getId());
//            }
//            entryWindow.addComponent(meaningLayout);
//            System.out.println(reprList.size());
//        }
//        return entryWindow;
//    }
//
//    public HorizontalLayout createSchemaRepresentation(Schema schema){
//        HorizontalLayout frame = new HorizontalLayout();
//        frame.addStyleName("form");
//        System.out.println("pharase");
//        for (Phrase phrase: schema.getPhrases()){
//            Label phraseLabel = new Label(phrase.getSemanticInfo());
//            frame.addComponent(phraseLabel);
//        }
//        return frame;
//    }
}
