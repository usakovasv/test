package com.playtech.dsrautotest.services;

import com.playtech.dsrautotest.model.TestSuite;
import com.playtech.dsrautotest.repository.TestSuiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestSuiteService {

    private final TestSuiteRepository testSuiteRepository;
//    private final TestSuiteContentsRepository testSuiteContentsRepository;

    public Long save(TestSuite testSuite) {
        TestSuite savedTestSuite = testSuiteRepository.save(testSuite);
        return savedTestSuite.getSuiteId();
    }

    public Long delete(Long id) {
        testSuiteRepository.deleteById(id);
        return id;
    }

//    public Long update(Long testSuiteId, TestSuite testSuite) {
//        testSuite.setSuiteId(testSuiteId);
//        TestSuite updated = testSuiteRepository.save(testSuite);
//        return updated.getSuiteId();
//    }
}
