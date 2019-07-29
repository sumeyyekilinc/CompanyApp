package company.controller;

import company.dao.OrgRolesDao;
import company.entitiy.OrgRoles;

import java.util.List;

public class OrgRolesControllerImpl implements OrgRolesController {

    @Override
    public OrgRoles createNewOrgRoles(OrgRoles newOrgRoles) {

        OrgRolesDao orgRolesDao = new OrgRolesDao();
        orgRolesDao.save(newOrgRoles);
        return newOrgRoles;
    }

    @Override
    public void deleteEmployee(OrgRoles orgRoles) {
        OrgRolesDao orgRolesDao = new OrgRolesDao();
        OrgRolesController orgRolesController = new OrgRolesControllerImpl();

    }

    @Override
    public List<OrgRoles> getOrgRolesList(int limit) {
        return null;
    }

    @Override
    public OrgRoles updateOrgRoles(OrgRoles updateOrgRoles) {
        return null;
    }

    @Override
    public void sessionAc() {

    }
}
