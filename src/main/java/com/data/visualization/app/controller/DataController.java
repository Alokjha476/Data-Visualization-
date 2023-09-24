package com.data.visualization.app.controller;
import com.data.visualization.app.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController
public class DataController {
    @Autowired
    public DataService dataService;

    @GetMapping("data")
    public ResponseEntity<Object> getData(@RequestParam(required = false) Map<String, String> requestParam) {
        return new ResponseEntity<>(dataService.getData(requestParam), HttpStatus.ACCEPTED);
    }

}
