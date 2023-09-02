package org.example.password;

import org.example.password.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //when
        user.initPassword(() -> "songtest");

        //then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드 요구사항 미부합으로 인한 초기화 x")
    @Test
    void passwordTest2() {
        //given
        User user = new User();

        //when
        user.initPassword(() -> "song");

        //then
        assertThat(user.getPassword()).isNull();
    }
}