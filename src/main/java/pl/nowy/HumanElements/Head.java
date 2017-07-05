package pl.nowy.HumanElements;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "head")
@XmlAccessorType(XmlAccessType.FIELD)
public class Head {

    @XmlElement(name = "text_rep")
    private String textRepresentation;

    @XmlElementWrapper(name="variants")
    @XmlElement(name="var")
    private List<Variant> variants;



    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public void setTextRepresentation(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }


}
