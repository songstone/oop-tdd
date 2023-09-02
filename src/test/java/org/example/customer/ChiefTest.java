package org.example.customer;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChiefTest {

    @Test
    void makeCookTest() {
        Chief chief = new Chief();
        MenuItem menuItem = new MenuItem("냉면", 8000);

        Cook cook = chief.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("냉면", 8000));
    }
}
