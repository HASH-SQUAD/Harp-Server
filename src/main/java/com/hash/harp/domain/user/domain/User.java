package com.hash.harp.domain.user.domain;

import com.hash.harp.domain.user.controller.dto.UserRequestDto;
import com.hash.harp.domain.user.domain.type.Authority;
import com.hash.harp.domain.user.domain.type.Gender;
import com.hash.harp.domain.user.domain.type.OauthType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    private String username;

    private String email;

    private String birthday;

    private String nickname;

    private Boolean isFirst;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Enumerated(EnumType.STRING)
    private OauthType oauthType;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    @Builder
    public User(String username, String email, String nickname, Gender gender, Authority authority, Boolean isFirst, OauthType oauthType) {
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.nickname = nickname;
        this.authority = authority;
        this.isFirst = isFirst;
        this.oauthType = oauthType;
    }

    public User update() {
        this.isFirst = Boolean.FALSE;
        return this;
    }

    public void updateUserInfo(UserRequestDto userRequestDto){
        this.nickname = userRequestDto.nickname();
        this.birthday = userRequestDto.birthday();
        this.gender = userRequestDto.gender();
    }
}