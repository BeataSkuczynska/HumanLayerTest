package pl.nowy.Temporary;

/**
 * Created by Kasia on 16.06.2017.
 */
public class Phrase {

    private String syntaxInfo;
    private String semanticInfo;

    public Phrase(String semanticInfo, String syntaxInfo) {
        this.syntaxInfo = syntaxInfo;
        this.semanticInfo = semanticInfo;
    }

    public String getSemanticInfo() {
        return semanticInfo;
    }

    public void setSemanticInfo(String semanticInfo) {
        this.semanticInfo = semanticInfo;
    }

    public String getSyntaxInfo() {
        return syntaxInfo;
    }

    public void setSyntaxInfo(String syntaxInfo) {
        this.syntaxInfo = syntaxInfo;
    }
}
