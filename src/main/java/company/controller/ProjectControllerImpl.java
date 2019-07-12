package company.controller;

import company.dao.ProjectDao;
import company.entitiy.Projects;

public class ProjectControllerImpl implements ProjectController {
    @Override
    public Projects createNewProjects(Projects newProjects) {

        ProjectDao projectDao = new ProjectDao();
        projectDao.save(newProjects);
        return  newProjects;
    }

    @Override
    public void sessionAc() {

    }
}
