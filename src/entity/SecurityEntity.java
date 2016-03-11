package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Golubev
 */
@XmlRootElement(name = "security")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SecurityEntity implements Serializable {

    @XmlElementWrapper(name = "readers")
    @XmlElement(name = "value")
    private List<String> readers;

    @XmlElementWrapper(name = "authors")
    @XmlElement(name = "value")
    private List<String> authors;

    public List<String> getReaders() {
        if (readers == null) {
            readers = new ArrayList<String>();
        }
        return readers;
    }

    public void setReaders(List<String> readers) {
        this.readers = readers;
    }

    public List<String> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<String>();
        }
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
