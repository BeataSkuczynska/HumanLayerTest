package pl.nowy.Temporary;

import java.util.List;

/**
 * Created by Kasia on 16.06.2017.
 */
public class Schema {

    private List<Phrase> phrases;

    public Schema(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }
}
