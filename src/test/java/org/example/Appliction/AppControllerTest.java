package org.example.Appliction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class AppControllerTest {

    @Test
    @DisplayName("스케너에 키보드 입력이 아닌 문자열을 입력으로 설정")
    void t1() {
        Scanner sc = TestUtil.getScanner("안녕");

        String cmd = sc.nextLine().trim();

        assertThat(cmd).isEqualTo("안녕");
    }


}