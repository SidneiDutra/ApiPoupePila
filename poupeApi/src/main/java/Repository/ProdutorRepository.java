package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Produto;

public interface ProdutorRepository extends JpaRepository<Produto, Integer> {

}
