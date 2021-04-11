package spring.restapi.files.model;

/**
 * Class data model class corresponds to entity and table universities.
 */

import javax.persistence.*;

@Entity
@Table(name = "university")
public class University {
    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "state")
    private String state;

    @Column(name = "name")
    private String name;

    @Column(name = "institution_type")
    private String institutionType;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "website")
    private String website;

    public University(){

    }

    public University(String state, String name, String institutionType, String phoneNumber, String website){
        this.state = state;
        this.name = name;
        this.institutionType = institutionType;
        this.phoneNumber = phoneNumber;
        this.website = website;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        institutionType = institutionType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        website = website;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", institutionType='" + institutionType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
