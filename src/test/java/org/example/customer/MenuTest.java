package org.example.customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @DisplayName("메뉴판에서 메뉴이름에 해당하는 메뉴를 반환")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("냉면", 8000), new MenuItem("만두", 7000), new MenuItem("돈까스", 10000)));

        MenuItem menuItem =  menu.choose("돈까스");

        assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 10000));
    }

    @DisplayName("없는 메뉴 선택 시 오류 발생")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("냉면", 8000), new MenuItem("만두", 7000), new MenuItem("돈까스", 10000)));

        assertThatCode(() -> menu.choose("치킨"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("해당하는 메뉴가 없습니다.");
    }
}
