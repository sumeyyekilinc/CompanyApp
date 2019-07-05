package company.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ORG_STRUCTURE")
public class OrgStructure extends BaseEntity  {

    private String unitName;
    private String unitHead;

    @Column(name = "UNIT_NAME")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Column(name = "UNIT_HEAD")
    public String getUnitHead() {
        return unitHead;
    }

    public void setUnitHead(String unitHead) {
        this.unitHead = unitHead;
    }
}
