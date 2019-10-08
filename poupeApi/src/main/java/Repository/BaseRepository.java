package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Base;

public interface BaseRepository extends JpaRepository<Base, Integer> {

}
