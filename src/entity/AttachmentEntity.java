package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by vmaksimov on 02.12.2014.
 */
@XmlRootElement(name = "attachment")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class AttachmentEntity implements Serializable {

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String token;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
