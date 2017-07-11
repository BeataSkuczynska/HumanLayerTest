package pl.nowy.GraphicElements;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by kosss on 08.07.2017.
 */
public class EntryWindow extends VerticalLayout {

    public EntryWindow() {
        this.setStyleName("entry");
        setMargin(new MarginInfo(true, false, true, false));
    }

}
