package yash.services;

import com.yash.bean.Project;
import com.yash.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
	
    @Autowired(required=true)
    ProjectRepository projectRepository;

    public List<Project> getAllProject() {
        List<Project> projects = new ArrayList<Project>();
        projectRepository.findAll().forEach(project -> projects.add(project));
        return projects;
    }

    public Project getProjectById(int id) {
        return projectRepository.findById(id).get();
    }

    public void saveOrUpdate(Project project) {
    	projectRepository.save(project);
    }

    public void delete(int id) {
    	projectRepository.deleteById(id);
    }
    
    public Project updateById(int id,Project project)
    {
    	Project project1 = projectRepository.findById(id).get();

        project1.setDescription(project.getDescription());
        project1.setName(project.getName());
        project1.setStartDate(project.getSrartDate());
        project1.setEndDate(project.getEndDate());
        return projectRepository.save(project1);
      
    }


}
