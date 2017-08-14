package pl.nowy.dictionary;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import pl.nowy.HumanElements.Dictionary;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Kasia on 14.08.2017.
 */
public class DictionaryService {

    private static Dictionary WalentyHumanLayer;

    static {
        try {
            WalentyHumanLayer = populateDictionary();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Dictionary populateDictionary() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Dictionary.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
        FileResource data = new FileResource(new File(basepath + "/WEB-INF/data.xml"));
        Dictionary ret = (Dictionary) unmarshaller.unmarshal(data.getSourceFile());
        return ret;
    }

    public static Dictionary getWalentyHumanLayer() {
        return WalentyHumanLayer;
    }
}
