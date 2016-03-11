package entity;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by vmaksimov on 03.12.2014.
 */
@XmlRootElement(name = "OutgoingDocument")

public class OutgoingDocumentEntity extends NativeDocumentEntity {

    protected List<String> correspondents;


    protected List<String> correspondentsIds;

    @XmlElement(name = "LbDraftNumberCounterValue")
    protected Integer draftNumberCounterValue;

    public List<String> getCorrespondents() {
        return correspondents;
    }

    @XmlElement(name = "correspondent")
    @XmlElementWrapper(name = "correspondents")
    public void setCorrespondents(List<String> correspondents) {
        this.correspondents = correspondents;
    }

    @XmlElement(name = "correspondentId")
    @XmlElementWrapper(name = "correspondentIds")
    public List<String> getCorrespondentsIds() {
        return correspondentsIds;
    }

    public void setCorrespondentsIds(List<String> correspondentsIds) {
        this.correspondentsIds = correspondentsIds;
    }

    public Integer getDraftNumberCounterValue() {
        return draftNumberCounterValue;
    }

    public void setDraftNumberCounterValue(Integer draftNumberCounterValue) {
        this.draftNumberCounterValue = draftNumberCounterValue;
    }

    public void setDraftNumberCounterValue(String draftNumberCounterValue) {
        this.draftNumberCounterValue = Integer.parseInt(draftNumberCounterValue);
    }

}
