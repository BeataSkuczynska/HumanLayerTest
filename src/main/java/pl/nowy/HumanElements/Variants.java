package pl.nowy.HumanElements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Kasia on 05.07.2017.
 */
@XmlRootElement(name = "variants")
@XmlAccessorType(XmlAccessType.FIELD)
public class Variants {

    @XmlElement(name = "var")
    private List<Variant> variants = null;

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }
}
