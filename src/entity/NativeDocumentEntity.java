package entity;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Date;
import java.util.List;

/**
 * Created by DSolyanoy on 31.08.2015.
 */
@XmlAccessorType(XmlAccessType.NONE)
public class NativeDocumentEntity extends DocumentEntity {
    @XmlElement(name= "signer")
    protected String signer;

    @XmlElement(name = "othersigner")
    @XmlElementWrapper(name = "othersigners")
    protected List<String> otherSigners;

    @XmlElement(name = "executor")
    @XmlElementWrapper(name = "executors")
    protected List<String> executorList;

    @XmlElement(name= "draftNumber")
    protected String draftNumber;

    /**
     * Значение счетчика в номере проекта документа
     */

    @XmlElement(name = "LbDraftNumberCounterValue")
    protected  Integer draftNumberCounterValue;

    @XmlElement(name= "signDate")
    protected Date signDate;

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public List<String> getOtherSigners() {
        return otherSigners;
    }

    public void setOtherSigners(List<String> otherSigners) {
        this.otherSigners = otherSigners;
    }

    public List<String> getExecutorList() {
        return executorList;
    }

    public void setExecutorList(List<String> executorList) {
        this.executorList = executorList;
    }

    public String getDraftNumber() {
        return draftNumber;
    }

    public void setDraftNumber(String draftNumber) {
        this.draftNumber = draftNumber;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Integer getDraftNumberCounterValue() {
        return draftNumberCounterValue;
    }

    public void setDraftNumberCounterValue(Integer draftNumberCounterValue) {
        this.draftNumberCounterValue = draftNumberCounterValue;
    }
}
