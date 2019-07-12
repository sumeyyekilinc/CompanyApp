package company.controller;

import company.dao.OrgStructureDao;
import company.entitiy.OrgStructure;

public class OrgStructureControllerImpl implements OrgStructureController {
    @Override
    public OrgStructure createNewOrgStructure(OrgStructure newOrgStructure) {

        OrgStructureDao orgStructureDao = new OrgStructureDao();
        orgStructureDao.save(newOrgStructure);
        return newOrgStructure;
    }

    @Override
    public void sessionAc() {

    }
}
