package pl.nowy.GraphicElements;

import com.vaadin.ui.*;
import pl.nowy.HumanElements.Entry;
import pl.nowy.HumanElements.HumanPhrase;
import pl.nowy.HumanElements.HumanPosition;
import pl.nowy.HumanElements.HumanSentence;

/**
 * Created by Kasia on 14.06.2017.
 */
public class EntryWindowFactory {

    public static EntryWindow createEntryWindow(Entry entry){
        EntryWindow entryWindow = new EntryWindow();
        Label orth = new Label(entry.getOrth());
        entryWindow.addComponent(orth);
        for (HumanSentence sent : entry.getHumanLayer().getHumanSentences()){
            HorizontalLayout sentenceFrame = createSentenceFrame(sent);
            entryWindow.addComponent(sentenceFrame);
        }
        return entryWindow;
    }



    public static HorizontalLayout createSentenceFrame(HumanSentence sentence){
        HorizontalLayout sentenceFrame = new HorizontalLayout();
        sentenceFrame.setStyleName("sentence");
        for (HumanPosition position : sentence.getPositions()){
            HumanPhrase phrase = position.getPhrases().get(0);
            HorizontalLayout phraseFrame = new HorizontalLayout();
            Label phraseLabel = new Label(phrase.getTextRepresentation());
            phraseFrame.addComponent(phraseLabel);
            phraseFrame.addStyleName("form");
            sentenceFrame.addComponent(phraseFrame);
        }
        Component headComponent = new Label(sentence.getHead().getTextRepresentation());
        sentenceFrame.addComponent(headComponent, 1);
        return sentenceFrame;
    }
}
