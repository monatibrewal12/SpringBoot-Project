package lk.ijse.greenshowspringbootbackend.repo;

import lk.ijse.greenshowspringbootbackend.entity.impl.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, String> {

}
