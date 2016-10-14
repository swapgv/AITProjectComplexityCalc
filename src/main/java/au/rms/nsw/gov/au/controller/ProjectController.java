package au.rms.nsw.gov.au.controller;

import au.rms.nsw.gov.au.dao.ProjectRepo;
import au.rms.nsw.gov.au.model.hibernate.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by gopalakv on 14/10/2016.
 */
@Controller
public class ProjectController {

    @Autowired
    private ProjectRepo projectRepo;

    @RequestMapping(value = "/project/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createProject(@RequestBody Project project, UriComponentsBuilder ucBuilder) {
        try {
            projectRepo.attachDirty(project);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}


