package com.example.creatorboard.user.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "creators")
@NoArgsConstructor(access = AccessLevel.PROTECTED) //외부 객체생성 방지
@AllArgsConstructor
@Builder

public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    //은행이름
    @Column(length = 100)
    private String bank_name;

    //예금주명
    @Column(length = 100)
    private String name;
}
