package pl.nowy.HumanElements;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Kasia on 22.06.2017.
 */
@XmlRootElement(name = "human_sentence")
@XmlAccessorType(XmlAccessType.FIELD)
public class HumanSentence {

    private Head head;

    @XmlElementWrapper(name="positions")
    @XmlElement(name="human_position")
    private List<HumanPosition> positions;

    public Head getHead() {
        return head;
    }


    public void setHead(Head head) {
        this.head = head;
    }

    public List<HumanPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<HumanPosition> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Head: " + head.getTextRepresentation() + "\n";
        int i = 1;
        for (HumanPosition position : positions){
            out += "Postition" + i + ": ";
            for (HumanInstance phrase : position.getPhrases()){
                out += phrase.getTextRepresentation();
            }
            i++;
            out += "\n";
        }
        return out;
    }

    public String makeSentence(){
        String out = "";
        out += positions.get(0).getPhrases().get(0).getTextRepresentation();
        out += head.getTextRepresentation();
        return out;
    }
}
