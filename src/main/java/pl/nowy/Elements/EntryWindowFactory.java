package pl.nowy.Elements;

import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;
import pl.nowy.HumanElements.HumanPhrase;
import pl.nowy.HumanElements.HumanPosition;
import pl.nowy.HumanElements.HumanSentence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kasia on 14.06.2017.
 */
public class EntryWindowFactory {



    public static VerticalLayout createEntryWindow(Entry entry){
        VerticalLayout entryWindow = new VerticalLayout();
        entryWindow.addStyleName("entry");
        Label label = new Label(entry.getOrth());
        Label allLabel = new Label(entry.prettyPrint());
        entryWindow.addComponent(label);
        entryWindow.addComponent(allLabel);
        for (HumanSentence sent : entry.getHumanLayer().getHumanSentences()){
            HorizontalLayout sentenceFrame = createSentenceFrame(sent);
            entryWindow.addComponent(sentenceFrame);
        }
        return entryWindow;
    }



    public static HorizontalLayout createSentenceFrame(HumanSentence sentence){
        HorizontalLayout sentenceFrame = new HorizontalLayout();
        for (HumanPosition position : sentence.getPositions()){
            HumanPhrase phrase = position.getPhrases().get(0);
            HorizontalLayout phraseFrame = new HorizontalLayout();
            Label phraseLabel = new Label(phrase.getTextRepresentation());
            phraseFrame.addComponent(phraseLabel);
            phraseFrame.addStyleName("form");
            sentenceFrame.addComponent(phraseFrame);
        }
        return sentenceFrame;
    }
}
