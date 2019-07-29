package company.controller;

import company.entitiy.Projects;

import java.util.List;

public interface ProjectController extends BaseController {

    Projects createNewProjects (Projects newProjects);

    void deleteProject(Projects projects);
    List<Projects> getProjectList(int limit);
    Projects updateProject (Projects updateProject);
}
