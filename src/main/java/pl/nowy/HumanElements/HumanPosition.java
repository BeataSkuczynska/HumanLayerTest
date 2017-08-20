package pl.nowy.HumanElements;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "human_position")
@XmlAccessorType(XmlAccessType.FIELD)
public class HumanPosition {

    @XmlElementWrapper(name="human_instances")
    @XmlElement(name="human_instance")
    private List<HumanInstance> phrases;

    public List<HumanInstance> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<HumanInstance> phrases) {
        this.phrases = phrases;
    }
}
