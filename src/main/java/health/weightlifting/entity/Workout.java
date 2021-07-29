package health.weightlifting.entity;

import javax.persistence.*;

public class Workout extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kno;
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
    private String date;

    @ManyToOne(fetch = FetchType.LAZY)
    private Weight weight;

}
