package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.Ordre;
import immobi.tec.immobitec.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdreRepo extends JpaRepository<Ordre, Integer> {
}
