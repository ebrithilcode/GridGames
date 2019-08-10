package com.ebrithil.gridgames


import org.assertj.core.api.Assertions.*
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AppTest {


    @Test
    fun `test App Has A Greeting`() {
        println("Instance here is $this")
        assertThat(0.05).isCloseTo(0.03, Offset.offset(0.03))
        //assertNotNull("Hallo", "app should have a greeting")
        val nullable : String? = "NotANull"
        assertThat(nullable).isNotNull()
    }

    @Test fun `check for instant count`() {
        println("Instance is $this")
        assertThat(0.03).isCloseTo(0.04, Percentage.withPercentage(30.0))
    }
}
