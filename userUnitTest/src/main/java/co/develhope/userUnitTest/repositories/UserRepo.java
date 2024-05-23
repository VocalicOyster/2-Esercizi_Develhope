package co.develhope.userUnitTest.repositories;

import co.develhope.userUnitTest.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
