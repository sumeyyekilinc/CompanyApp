package company.controller;

import company.dao.OrgStructureDao;
import company.entitiy.OrgStructure;

import java.util.List;

public class OrgStructureControllerImpl implements OrgStructureController {
    @Override
    public OrgStructure createNewOrgStructure(OrgStructure newOrgStructure) {

        OrgStructureDao orgStructureDao = new OrgStructureDao();
        orgStructureDao.save(newOrgStructure);
        return newOrgStructure;
    }

    @Override
    public void deleteOrgStructure(OrgStructure orgStructure) {
        OrgStructureDao orgStructureDao= new OrgStructureDao();
        OrgStructureController orgStructureController= new OrgStructureControllerImpl();


    }

    @Override
    public List<OrgStructure> getOrgStructureList(int limit) {
        return null;
    }

    @Override
    public OrgStructure updateOrgStructure(OrgStructure updateOrgStructure) {
        return null;
    }

    @Override
    public void sessionAc() {

    }
}
