package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmaksimov on 02.12.2014.
 */
@XmlRootElement(name="documents")
@XmlAccessorType(XmlAccessType.FIELD)

public class DocumentsEntity implements Serializable {

    @XmlElement(name = "IncomingDocument")
    private List<IncomingDocumentEntity> incomingDocumentEntityList;

    @XmlElement(name = "ConfidentialIncomingDocument")
    private List<ConfidentialIncomingDocumentEntity> confidentialIncomingDocumentEntityList;

    @XmlElement(name = "OutgoingDocument")
    private List<OutgoingDocumentEntity> outgoingDocumentEntityList;

    @XmlElement(name = "ConfidentialOutgoingDocument")
    private List<ConfidentialOutgoingDocumentEntity> confidentialOutgoingDocumentEntityList;

    @XmlElement(name = "InnerDocument")
    private List<InnerDocumentEntity> innerDocumentEntityList;

    @XmlElement(name = "CitizenDocument")
    private List<CitizenDocumentEntity> citizenDocumentEntityList;

    public List<IncomingDocumentEntity> getIncomingDocumentEntityList() {
        if (incomingDocumentEntityList == null) {
            incomingDocumentEntityList = new ArrayList<IncomingDocumentEntity>();
        }
        return incomingDocumentEntityList;
    }

    public void setIncomingDocumentEntityList(List<IncomingDocumentEntity> incomingDocumentEntityList) {
        this.incomingDocumentEntityList = incomingDocumentEntityList;
    }

    public List<OutgoingDocumentEntity> getOutgoingDocumentEntityList() {
        if (outgoingDocumentEntityList == null) {
            outgoingDocumentEntityList = new ArrayList<OutgoingDocumentEntity>();
        }
        return outgoingDocumentEntityList;
    }

    public void setOutgoingDocumentEntityList(List<OutgoingDocumentEntity> outgoingDocumentEntityList) {
        this.outgoingDocumentEntityList = outgoingDocumentEntityList;
    }

    public List<InnerDocumentEntity> getInnerDocumentEntityList() {
        if (innerDocumentEntityList == null) {
            innerDocumentEntityList = new ArrayList<InnerDocumentEntity>();
        }
        return innerDocumentEntityList;
    }


    public void setInnerDocumentEntityList(List<InnerDocumentEntity> innerDocumentEntityList) {
        this.innerDocumentEntityList = innerDocumentEntityList;
    }

    public List<CitizenDocumentEntity> getCitizenDocumentEntityList() {
        if (citizenDocumentEntityList == null) {
            citizenDocumentEntityList = new ArrayList<CitizenDocumentEntity>();
        }
        return citizenDocumentEntityList;
    }

    public void setCitizenDocumentEntityList(List<CitizenDocumentEntity> citizenDocumentEntityList) {
        this.citizenDocumentEntityList = citizenDocumentEntityList;
    }

    public List<ConfidentialIncomingDocumentEntity> getConfidentialIncomingDocumentEntityList() {
        if (confidentialIncomingDocumentEntityList == null) {
            confidentialIncomingDocumentEntityList = new ArrayList<ConfidentialIncomingDocumentEntity>();
        }
        return confidentialIncomingDocumentEntityList;
    }

    public void setConfidentialIncomingDocumentEntityList(List<ConfidentialIncomingDocumentEntity> confidentialIncomingDocumentEntityList) {
        this.confidentialIncomingDocumentEntityList = confidentialIncomingDocumentEntityList;
    }

    public List<ConfidentialOutgoingDocumentEntity> getConfidentialOutgoingDocumentEntityList() {
        if (confidentialOutgoingDocumentEntityList == null) {
            confidentialOutgoingDocumentEntityList = new ArrayList<ConfidentialOutgoingDocumentEntity>();
        }
        return confidentialOutgoingDocumentEntityList;
    }


    public void setConfidentialOutgoingDocumentEntityList(List<ConfidentialOutgoingDocumentEntity> confidentialOutgoingDocumentEntityList) {
        this.confidentialOutgoingDocumentEntityList = confidentialOutgoingDocumentEntityList;
    }

    @Override
    public String toString() {
        return "DocumentsEntity{" +
                "incomingDocumentEntityList=" + incomingDocumentEntityList +
                "confidentialIncomingDocumentEntityList=" + confidentialIncomingDocumentEntityList +
                ", outgoingDocumentEntityList=" + outgoingDocumentEntityList +
                ", confidentialOutgoingDocumentEntityList=" + confidentialOutgoingDocumentEntityList +
                ", innerDocumentEntityList=" + innerDocumentEntityList +
                ", citizenDocumentEntityList=" + citizenDocumentEntityList +
                '}';
    }
}
