package company.controller;

import company.entitiy.OrgStructure;

import java.util.List;

public interface OrgStructureController extends BaseController {

    OrgStructure createNewOrgStructure(OrgStructure newOrgStructure);

    void deleteOrgStructure(OrgStructure orgStructure);
    List<OrgStructure> getOrgStructureList(int limit);
    OrgStructure updateOrgStructure (OrgStructure updateOrgStructure);
}
