package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import pl.nowy.HumanElements.Entry;

/**
 * Created by kosss on 08.07.2017.
 */
public class EntryFrame extends VerticalLayout {

    private Entry entry;

    private HorizontalLayout EntryFrameTop;
    private VerticalLayout SemanticFrame;
    private VerticalLayout SyntaxFrame;

    public EntryFrame() {
        this.setStyleName("entry");
        setMargin(new MarginInfo(true, false, true, false));
    }

    public void showSemanticFrame(){
        removeAllComponents();
        addComponent(SemanticFrame);
    }

    public void showSyntaxFrame(){
        removeAllComponents();
        addComponent(SyntaxFrame);
    }



    public void setSemanticFrame(VerticalLayout semanticFrame) {
        SemanticFrame = semanticFrame;
    }

    public void setSyntaxFrame(VerticalLayout syntaxFrame) {
        SyntaxFrame = syntaxFrame;
    }

    public VerticalLayout getSemanticFrame() {
        return SemanticFrame;
    }

    public VerticalLayout getSyntaxFrame() {
        return SyntaxFrame;
    }
}
