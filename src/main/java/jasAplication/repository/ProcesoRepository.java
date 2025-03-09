package jasAplication.repository;

import jasAplication.model.documents.Proceso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcesoRepository extends MongoRepository<Proceso, String> {
}
