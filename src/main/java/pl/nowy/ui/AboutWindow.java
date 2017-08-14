package pl.nowy.ui;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;

/**
 * Created by Kasia on 12.07.2017.
 */
public class AboutWindow extends VerticalLayout {

    private TextArea aboutInformation;
    private HorizontalLayout sample;
    private TopPanel top;

    public AboutWindow() {

        setMargin(new MarginInfo(false, false, false, false));

        top = new TopPanel();
        addComponent(top);
        top.setSizeFull();

        setSpacing(false);
        setMargin(false);
        setSizeFull();

        aboutInformation = new TextArea();
        aboutInformation.setValue("Human Layer");
        //addComponent(aboutInformation);

        sample = new HorizontalLayout();
        sample.addStyleName("outlined");
        sample.setSpacing(false);
        sample.setMargin(false);
        sample.setSizeFull();

        for (int i = 0; i < 3; i++) {
            final Button childComponent = new Button("kkk");
            childComponent.setSizeFull();
            sample.addComponent(childComponent);
        }

        addComponent(sample);

    }
}
