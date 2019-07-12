package company.controller;

import company.dao.OrgRolesDao;
import company.entitiy.OrgRoles;

public class OrgRolesControllerImpl implements OrgRolesController {

    @Override
    public OrgRoles createNewOrgRoles(OrgRoles newOrgRoles) {

        OrgRolesDao orgRolesDao = new OrgRolesDao();
        orgRolesDao.save(newOrgRoles);
        return newOrgRoles;
    }

    @Override
    public void sessionAc() {

    }
}
