package pl.nowy.HumanElements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "head")
@XmlAccessorType(XmlAccessType.FIELD)
public class Head {

    @XmlElement(name = "text_rep")
    private String textRepresentation;
    private Variants variants;

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public void setTextRepresentation(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }
}
