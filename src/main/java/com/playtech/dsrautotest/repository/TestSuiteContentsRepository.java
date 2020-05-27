package com.playtech.dsrautotest.repository;

import com.playtech.dsrautotest.model.TestSuiteContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestSuiteContentsRepository extends JpaRepository<TestSuiteContent, Long> {

}
