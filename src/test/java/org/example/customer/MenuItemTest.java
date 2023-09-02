package org.example.customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴항목을 생성")
    @Test
    void creatTest() {
        assertThatCode(() -> new MenuItem("돈까스", 10000))
            .doesNotThrowAnyException();
    }
}
