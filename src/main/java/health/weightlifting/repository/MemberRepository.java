package health.weightlifting.repository;

import health.weightlifting.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Long>{
    @Query("select m, mi " + "from Member m left outer join MemberImage mi on mi.member = m " + "left outer join MemberImage "
    + " where m.mno = :mno")
    Page<Object[]> getMemberWithAll(Long mno);
}
