package com.syboo.shopping.member.command.domain.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
/**
 * packageName  : com.syboo.shopping.member.command.domain.repository
 * fileName     : Member
 * author       : 부시연
 * date         : 2023-08-20
 * description  : 회원 도메인
 * ===========================================================
 * DATE             AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-20       부시연             최초 생성
 */
@Builder
@Getter
@Setter
@Entity
@Table(name = "t_member")
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_no", nullable = false, updatable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long memberNo;

}