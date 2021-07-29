package health.weightlifting.repository;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.MemberImage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberImageRepository extends JpaRepository<MemberImage, Long>{
}
