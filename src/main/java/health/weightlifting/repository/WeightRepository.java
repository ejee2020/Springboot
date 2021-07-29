package health.weightlifting.repository;

import health.weightlifting.entity.Member;
import health.weightlifting.entity.Weight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WeightRepository extends JpaRepository<Weight, Long>{
    List<Weight> findByMember(Member member);

    @Modifying
    @Query("delete from Weight w where w.member = :member")
    void deleteByMember(Member member);
}

