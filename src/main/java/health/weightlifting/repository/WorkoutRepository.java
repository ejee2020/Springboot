package health.weightlifting.repository;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.Weight;
import health.weightlifting.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
public interface WorkoutRepository extends JpaRepository<Workout, Long>{
}
