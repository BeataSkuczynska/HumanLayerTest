package pl.nowy.HumanElements;

import javax.xml.bind.annotation.*;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "human_phrase")
@XmlAccessorType(XmlAccessType.FIELD)
public class HumanPhrase {

    @XmlElement(name = "text_rep")
    private String textRepresentation;

    @XmlAttribute(name="nr")
    private String nr;


    public String getTextRepresentation() {
        return textRepresentation;
    }

    public void setTextRepresentation(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }
}
