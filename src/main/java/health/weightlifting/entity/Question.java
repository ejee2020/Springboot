package health.weightlifting.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Question extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qno;
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
    private String title;
    private String content;
}
