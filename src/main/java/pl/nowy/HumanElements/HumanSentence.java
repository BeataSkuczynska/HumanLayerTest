package pl.nowy.HumanElements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kasia on 22.06.2017.
 */
@XmlRootElement(name = "human_sentence")
@XmlAccessorType(XmlAccessType.FIELD)
public class HumanSentence {

    private Head head;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
