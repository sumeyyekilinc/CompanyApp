package company.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "ORG_ROLES")
public class OrgRoles extends BaseEntity  {

    private String title;

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
