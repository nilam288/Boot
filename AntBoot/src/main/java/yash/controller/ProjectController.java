package yash.controller;


import yash.bean.Project;
import yash.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)

public class ProjectController {

	@Autowired(required=true)
    ProjectService projectService;

    @GetMapping("/project/all")
    private List<Project> getAllProject() {
    	 System.out.println("Hi");
        return projectService.getAllProject();
    }

    @GetMapping("/project/{id}")
    private Project getProject(@PathVariable("id") int id) {
        return projectService.getProjectById(id);
    }

    @DeleteMapping("/project/{id}")
    private void deleteProject(@PathVariable("id") int id) {
    	projectService.delete(id);
    }

    @PostMapping("/project")
    private int saveProject(@RequestBody Project project) {
    	projectService.saveOrUpdate(project);
        return project.getId();
    }
    
    @PutMapping("/project/{id}")
    public int updateProject(@PathVariable(value = "id") int id,
            @Valid @RequestBody Project project)
    {
    	 if (projectService.getProjectById(id)==null) {
             //log.error("Id " + id + " is not existed");
             ResponseEntity.badRequest().build();
         }
    	projectService.updateById(id, project);
		return project.getId();
            
    }
}
