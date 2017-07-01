package pl.nowy.Temporary;

import java.util.List;

/**
 * Created by Kasia on 16.06.2017.
 */
public class Meaning {

    private List<Schema> schemas;

    public Meaning(List<Schema> schemas) {
        this.schemas = schemas;
    }

    public List<Schema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<Schema> schemas) {
        this.schemas = schemas;
    }
}
