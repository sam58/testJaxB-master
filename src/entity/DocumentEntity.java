package entity;

import model.Entity;
import model.Key;
import model.MultiValuedKey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vmaksimov on 02.12.2014.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class DocumentEntity extends Entity implements Serializable {
  //  @XmlElement(name= "importUid")
    protected String importUid;

 //   @XmlElement(name= "incomingNumber")
    protected String incomingNumber;

 //   @XmlElement(name= "pageCount")
    protected String pageCount;

  //  @XmlElement(name= "instanceQuantity")
    protected String instanceQuantity;

 //   @XmlElement(name= "copyQuantity")
    protected String copyQuantity;

 //   @XmlElement(name= "appQuantity")
    protected String appQuantity;

 //   @XmlElement(name= "correspondent")
    protected String correspondent;

 //   @XmlElement(name= "firmId")
    protected String firmId;

 //   @XmlElement(name= "author")
    protected String author;

 //   @XmlElement(name="fromAddress")
    protected String fromAddress;

  //  @XmlElement(name= "executor")
    protected String executor;

 //   @XmlAttribute(name = "type")
    protected String type;

//    @XmlElement(name = "title")
    protected String title;

//    @XmlElement(name = "dateCreate")
    protected Date dateCreate;

//    @XmlElement(name = "dateModified")
    protected Date dateModified;

//    @XmlElement(name = "docKind")
    protected String kind;

 //   @XmlElement(name = "registrationPlace")
    protected String registrationPlace;

//    @XmlElement(name = "registrationPerson")
    protected String registrationPerson;

//    @XmlElement(name = "registrationDate")
    protected Date registrationDate;

//    @XmlElement(name = "outDate")
    protected Date outDate;

//    @XmlElement(name = "documentNumber")
    protected String number;

//    @XmlElement(name = "externalId")
    protected String externalId;

//    @XmlElement(name = "externalUri")
    protected String externalUri;

//    @XmlElement(name = "importComplete")
    protected boolean importComplete;

//    @XmlElement(name = "specialNotes")
    protected String specialNotes;

//    @XmlElement(name = "regNumber")
    protected String regNumber;

//    @XmlElement(name = "regNumberCounterValue")
    protected Integer regNumberCounterValue;

//    @XmlElement(name = "replicaId")
    protected String replicaId;

    @XmlElement(name = "resolution")
    @XmlElementWrapper(name = "resolutions")
    protected List<ResolutionEntity> resolutionList;

 //   @XmlElement(name = "attachment")
 //   @XmlElementWrapper(name = "attachments")
    protected List<AttachmentEntity> attachmentList;

    @XmlElement(name = "link")
    @XmlElementWrapper(name = "links")
    protected List<LinkEntity> links;

//    @XmlElement(name = "security")
    protected SecurityEntity security;

    public Integer getRegNumberCounterValue() {
        return regNumberCounterValue;
    }

    public void setRegNumberCounterValue(Integer regNumberCounterValue) {
        this.regNumberCounterValue = regNumberCounterValue;
    }

    public String getImportUid() {
        return importUid;
    }

    public void setImportUid(String importUid) {
        this.importUid = importUid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getRegistrationPlace() {
        return registrationPlace;
    }

    public void setRegistrationPlace(String registrationPlace) {
        this.registrationPlace = registrationPlace;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

//    public List<String> getAddresseeList() {
//        return addresseeList;
//    }
//
//    public void setAddresseeList(List<String> addresseeList) {
//        this.addresseeList = addresseeList;
//    }

    public List<ResolutionEntity> getResolutionList() {
        return resolutionList;
    }


    public void setResolutionList(List<ResolutionEntity> resolutionList) {
        this.resolutionList = resolutionList;
    }

    public List<AttachmentEntity> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<AttachmentEntity> attachmentList) {
        this.attachmentList = attachmentList;
    }

    public String getIncomingNumber() {
        return incomingNumber;
    }

    public void setIncomingNumber(String incomingNumber) {
        this.incomingNumber = incomingNumber;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getInstanceQuantity() {
        return instanceQuantity;
    }

    public void setInstanceQuantity(String instanceQuantity) {
        this.instanceQuantity = instanceQuantity;
    }

    public String getAppQuantity() {
        return appQuantity;
    }

    public void setAppQuantity(String appQuantity) {
        this.appQuantity = appQuantity;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getFirmId() {
        return firmId;
    }

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getCopyQuantity() {
        return copyQuantity;
    }

    public void setCopyQuantity(String copyQuantity) {
        this.copyQuantity = copyQuantity;
    }

    public String getRegistrationPerson() {
        return registrationPerson;
    }

    public void setRegistrationPerson(String registrationPerson) {
        this.registrationPerson = registrationPerson;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getExternalUri() {
        return externalUri;
    }

    public void setExternalUri(String externalUri) {
        this.externalUri = externalUri;
    }

    public boolean isImportComplete() {
        return importComplete;
    }

    public void setImportComplete(boolean importComplete) {
        this.importComplete = importComplete;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public List<LinkEntity> getLinks() {
        if (links == null) {
            links = new ArrayList<LinkEntity>();
        }
        return links;
    }

    public SecurityEntity getSecurity() {
        return security;
    }

    public void setSecurity(SecurityEntity security) {
        this.security = security;
    }

   // @XmlElement(name = "link")
   // @XmlElementWrapper(name = "links")
    public void setLinks(List<LinkEntity> links) {
        this.links = links;
    }

    public String getCompleteDocId() {
        return externalId + "@" + replicaId;
    }

    @Override
    public Key getKey() {
        return new MultiValuedKey(type, title, dateCreate, kind, registrationPlace, registrationDate, number);
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    @Override
    public String toString() {
        return "DocumentEntity{" +
                "importUid='" + importUid + '\'' +
                "regNumberCounterValue ='" + regNumberCounterValue + '\'' +
                ", incomingNumber='" + incomingNumber + '\'' +
                ", pageCount='" + pageCount + '\'' +
                ", instanceQuantity='" + instanceQuantity + '\'' +
                ", copyQuantity='" + copyQuantity + '\'' +
                ", appQuantity='" + appQuantity + '\'' +
                ", correspondent='" + correspondent + '\'' +
                ", firmId='" + firmId + '\'' +
                ", author='" + author + '\'' +
                ", fromAddress='"+ fromAddress+ '\'' +
                ", executor='" + executor + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateModified=" + dateModified +
                ", kind='" + kind + '\'' +
                ", registrationPlace='" + registrationPlace + '\'' +
                ", registrationPerson='" + registrationPerson + '\'' +
                ", registrationDate=" + registrationDate +
                ", outDate=" + outDate +
                ", number='" + number + '\'' +
                ", externalId='" + externalId + '\'' +
                ", externalUri='" + externalUri + '\'' +
                ", importComplete=" + importComplete +
                ", specialNotes='" + specialNotes + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", replicaId='" + replicaId + '\'' +
             //   ", addresseeList=" + addresseeList +
                ", resolutionList=" + resolutionList +
                ", attachmentList=" + attachmentList +
                ", links=" + links +
                ", security=" + security +
                '}';
    }
}
