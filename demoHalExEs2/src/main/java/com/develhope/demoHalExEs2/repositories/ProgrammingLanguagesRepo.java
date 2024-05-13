package com.develhope.demoHalExEs2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "/repo-prog-languages")
public interface ProgrammingLanguagesRepo extends JpaRepository<ProgrammingLanguagesRepo, Integer> {
}
