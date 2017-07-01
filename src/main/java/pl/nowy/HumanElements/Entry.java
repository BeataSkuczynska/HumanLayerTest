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

}
