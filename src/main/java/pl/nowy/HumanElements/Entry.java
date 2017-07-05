package pl.nowy.HumanElements;

import javax.xml.bind.annotation.*;

/**
 * Created by Kasia on 21.06.2017.
 */
@XmlRootElement(name = "entry")
@XmlAccessorType (XmlAccessType.FIELD)
public class Entry {

    private String orth;
    private String pos;

    @XmlElement(name = "human_layer")
    private HumanLayer humanLayer;

    public Entry() {}


    public String getOrth() {
        return orth;
    }

    public void setOrth(String orth) {
        this.orth = orth;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public HumanLayer getHumanLayer() {
        return humanLayer;
    }

    public void setHumanLayer(HumanLayer humanLayer) {
        this.humanLayer = humanLayer;
    }

    @Override
    public String toString() {
        return "Entry [orth=" + orth
                + ", pos=" + pos + "]";
    }

    public String prettyPrint(){
        String out = "";
        out += "Entry [orth=" + orth + ", pos=" + pos + "]";
        out += "\n";
        out += "Nr of sentences: " + getHumanLayer().getHumanSentences().size() + "\n";
        int i = 1;
        for (HumanSentence sent : getHumanLayer().getHumanSentences()){
            Head head = sent.getHead();
            out += "S" + i + ": " + head.getTextRepresentation();
            for (Variant var : head.getVariants().getVariants()){
                out += " " + var.getId();
            }
            out += "\n";
            i++;
        }
        return out;
    }

}
