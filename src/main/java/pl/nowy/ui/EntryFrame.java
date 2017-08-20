package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import pl.nowy.HumanElements.Entry;

/**
 * Created by kosss on 08.07.2017.
 */
public class EntryFrame extends VerticalLayout {

    private Entry entry;

    private HorizontalLayout EntryFrameTop;
    private VerticalLayout EntryFrameCenter;


    private VerticalLayout SemanticFrame;
    private VerticalLayout SyntaxFrame;

    public EntryFrame() {
        EntryFrameTop = new HorizontalLayout();
        EntryFrameCenter = new VerticalLayout();
        Button semButton = new Button("Semantyka");
        Button synButton = new Button("Składnia");
        semButton.addClickListener(clickEvent -> showSemanticFrame());
        synButton.addClickListener(clickEvent -> showSyntaxFrame());
        EntryFrameTop.addComponent(semButton);
        EntryFrameTop.addComponent(synButton);


        this.setStyleName("entry");
        setMargin(new MarginInfo(true, false, true, false));

        addComponent(EntryFrameTop);
        addComponent(EntryFrameCenter);
    }

    public void showSemanticFrame(){
        EntryFrameCenter.removeAllComponents();
        EntryFrameCenter.addComponent(SemanticFrame);
        SemanticFrame.setSizeFull();
    }

    public void showSyntaxFrame(){
        EntryFrameCenter.removeAllComponents();
        EntryFrameCenter.addComponent(SyntaxFrame);
        SyntaxFrame.setSizeFull();
    }


    public HorizontalLayout getEntryFrameTop() {
        return EntryFrameTop;
    }

    public VerticalLayout getEntryFrameCenter() {
        return EntryFrameCenter;
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
