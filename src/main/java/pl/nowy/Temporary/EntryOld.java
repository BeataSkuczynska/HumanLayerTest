package pl.nowy.Temporary;

import java.util.List;

/**
 * Created by Kasia on 16.06.2017.
 */
public class EntryOld {

    private String representation;
    private String aspect;
    private String transitivity;

    private List<Meaning> meanings;

    public EntryOld(String representation, String aspect, String transitivity, List<Meaning> meanings) {
        this.representation = representation;
        this.aspect = aspect;
        this.transitivity = transitivity;
        this.meanings = meanings;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public String getTransitivity() {
        return transitivity;
    }

    public void setTransitivity(String transitivity) {
        this.transitivity = transitivity;
    }

    public List<Meaning> getMeanings() {
        return meanings;
    }

    public void setMeanings(List<Meaning> meanings) {
        this.meanings = meanings;
    }
}
