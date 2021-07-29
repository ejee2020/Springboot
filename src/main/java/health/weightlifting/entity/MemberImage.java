package health.weightlifting.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = "Member")
public class MemberImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ino;
    private String uuid;
    private String imgName;
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
}
