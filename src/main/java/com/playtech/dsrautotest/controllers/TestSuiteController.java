package com.playtech.dsrautotest.controllers;

import com.playtech.dsrautotest.model.TestSuite;
import com.playtech.dsrautotest.services.TestSuiteService;
import lombok.RequiredArgsConstructor;
import org.junit.runner.notification.RunListener;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestSuiteController extends RunListener {

    private final TestSuiteService testSuiteService;

    @PostMapping(value = "/suite")
    public Long insertSuite(@RequestBody TestSuite testSuite) {
        return testSuiteService.save(testSuite);
    }

    @DeleteMapping(value = "/suite/{id}")
    public Long deleteSuite(@PathVariable Long id) {
        return testSuiteService.delete(id);
    }
//
//    @PatchMapping(value = "/suite/{testSuiteId}")
//    public Long update(@PathVariable Long testSuiteId, @RequestBody TestSuite testSuite) {
//        return testSuiteService.update(testSuiteId, testSuite);
//    }
}
