package pl.nowy.HumanElements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Kasia on 22.06.2017.
 */
@XmlRootElement(name = "human_layer")
@XmlAccessorType(XmlAccessType.FIELD)
public class HumanLayer {

    @XmlElement(name = "human_sentence")
    private List<HumanSentence> humanSentences = null;

    public List<HumanSentence> getHumanSentences() {
        return humanSentences;
    }

    public void setHumanSentences(List<HumanSentence> humanSentences) {
        this.humanSentences = humanSentences;
    }

    @Override
    public String toString() {
        return "Number of human sentences" + humanSentences.size();
    }
}
