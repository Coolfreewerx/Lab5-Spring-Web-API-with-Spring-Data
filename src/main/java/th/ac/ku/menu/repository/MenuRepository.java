package th.ac.ku.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.menu.model.Menu;

import java.util.UUID;

@Repository // for connect database
public interface MenuRepository extends JpaRepository<Menu, UUID> { // jpa จะมี select delete insert or update ให้เลยอัตโนมัติ
}

