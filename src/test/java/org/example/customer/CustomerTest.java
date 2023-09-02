package org.example.customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 식당에서 음식 주문 과정
 * 구체적 실물 (손님, 메뉴판, 돈까스, 냉면, 만두, 요리사)
 * 관계(손님 -- 메뉴판, 손님 -- 요리사, 요리사 -- 요리)
 * 도메인(손님, 요리, 메뉴판, 메뉴)
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("냉면", 8000), new MenuItem("만두", 7000), new MenuItem("돈까스", 10000)));
        Chief chief = new Chief();

        assertThatCode(() -> customer.order("돈까스", menu, chief))
            .doesNotThrowAnyException();
    }
}
