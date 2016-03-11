package entity;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * @author Dmitry Golubev
 */
@XmlRootElement(name = "link")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class LinkEntity implements Serializable {

    @XmlTransient
    private DocumentEntity document;

    @XmlElement(name = "doc")
    private String docExternalId;

    @XmlElement(name = "replica")
    private String replicaId;

    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "backType")
    private String backType;

    @XmlAttribute(name = "direction")
    private int direction;

    /*
     * Used by JAXB
     */
    void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        document = (DocumentEntity) parent;
    }

    public DocumentEntity getDocument() {
        return document;
    }

    public void setDocument(DocumentEntity document) {
        this.document = document;
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getDocExternalId() {
        return docExternalId;
    }

    public void setDocExternalId(String docExternalId) {
        this.docExternalId = docExternalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackType() {
        return backType;
    }

    public void setBackType(String backType) {
        this.backType = backType;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getCompleteDocId() {
        return docExternalId + "@" + replicaId;
    }

    @Override
    public String toString() {
        return "LinkEntity{" +
                ", docExternalId='" + docExternalId + '\'' +
                ", replicaId='" + replicaId + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", backType='" + backType + '\'' +
                ", direction=" + direction +
                '}';
    }
}
