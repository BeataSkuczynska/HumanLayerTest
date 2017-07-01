package pl.nowy.HumanElements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Kasia on 21.06.2017.
 */
@XmlRootElement(name = "dictionary")
@XmlAccessorType (XmlAccessType.FIELD)
public class Dictionary {

    @XmlElement(name = "entry")
    private List<Entry> entries = null;

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
