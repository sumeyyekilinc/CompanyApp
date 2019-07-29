package company.controller;

import company.dao.ProjectDao;
import company.entitiy.Projects;

import java.util.List;

public class ProjectControllerImpl implements ProjectController {
    @Override
    public Projects createNewProjects(Projects newProjects) {

        ProjectDao projectDao = new ProjectDao();
        projectDao.save(newProjects);
        return  newProjects;
    }

    @Override
    public void deleteProject(Projects projects) {

    }

    @Override
    public List<Projects> getProjectList(int limit) {
        return null;
    }

    @Override
    public Projects updateProject(Projects updateProject) {
        return null;
    }

    @Override
    public void sessionAc() {

    }
}
