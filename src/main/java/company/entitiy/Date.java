package company.entitiy;

import javax.persistence.*;

@MappedSuperclass
public  class Date extends BaseEntity {
    public String startDate;
    public String endDate;

    public Date() {
    }


    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
