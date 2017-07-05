package pl.nowy.HumanElements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "var")
@XmlAccessorType(XmlAccessType.FIELD)
public class Variant {

    @XmlAttribute(name="id")
    private String id;
    private String framenetID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFramenetID() {
        return framenetID;
    }

    public void setFramenetID(String framenetID) {
        this.framenetID = framenetID;
    }
}
