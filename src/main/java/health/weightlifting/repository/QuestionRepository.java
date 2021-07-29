package health.weightlifting.repository;
import health.weightlifting.entity.Info;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.MemberImage;
import health.weightlifting.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface QuestionRepository extends JpaRepository<Question, Long>{
}
