/*
 *  Author: OneRCH Team
 *  Project: OneRCH Project
 *  School: RMIT - University
 */
package rmit.lybao.restserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path = "/test")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/small")
    public ResponseEntity<?> getSmallResponse () {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/medium")
    public ResponseEntity<?> getMediumResponse () throws IOException{
        return ResponseEntity.ok(service.readMediumFile());
    }

    @GetMapping("/large")
    public ResponseEntity<?> getLargeResponse () throws IOException {
        return ResponseEntity.ok(service.readLargeFile());
    }
}
