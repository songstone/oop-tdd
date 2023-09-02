package org.example.password;

import org.example.password.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
 */
public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하 일 경우 예외발생 x")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serversong"))
            .doesNotThrowAnyException();
    }

    @DisplayName("비밀전호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 발생")
    @ParameterizedTest
    @ValueSource(strings = {"songaaa", "devsong123456"})
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("비밀번호는 최소 8자 이상, 12자 이하여야 한다.");
    }
}
