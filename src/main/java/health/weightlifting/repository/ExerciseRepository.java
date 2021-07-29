package health.weightlifting.repository;

import health.weightlifting.entity.Exercise;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
    @Query("select e.name from Exercise e")
    Page<Object[]> getListPage(Pageable pageable);
}
