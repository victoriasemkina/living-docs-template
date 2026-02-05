package com.example.qa;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SampleUnitTest {
    @Test
    void shouldDemonstrateWorkingTestSetup() {
        // Простая проверка, что JUnit + AssertJ работают
        int result = 2 + 2;
        assertThat(result).isEqualTo(4);
    }
}
