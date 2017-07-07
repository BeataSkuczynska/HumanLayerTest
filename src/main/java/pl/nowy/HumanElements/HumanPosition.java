package pl.nowy.HumanElements;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "position")
@XmlAccessorType(XmlAccessType.FIELD)
public class HumanPosition {

    @XmlElementWrapper(name="human_phrases")
    @XmlElement(name="human_phrase")
    private List<HumanPhrase> phrases;

    public List<HumanPhrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<HumanPhrase> phrases) {
        this.phrases = phrases;
    }
}
