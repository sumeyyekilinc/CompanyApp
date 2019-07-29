package company.controller;

import company.entitiy.OrgRoles;

import java.util.List;

public interface OrgRolesController extends  BaseController {

    OrgRoles createNewOrgRoles (OrgRoles newOrgRoles);

    void deleteEmployee(OrgRoles orgRoles);
    List<OrgRoles> getOrgRolesList(int limit);
    OrgRoles updateOrgRoles (OrgRoles updateOrgRoles);
}
