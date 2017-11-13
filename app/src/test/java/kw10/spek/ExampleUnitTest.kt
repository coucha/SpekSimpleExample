package kw10.spek

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.context
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals

class ExampleUnitTest : Spek({

    context("a calculator") {

        val calculator = ExampleCalculator()

        // 足し算
        describe("plus") {

            val result = calculator.plus(2, 4)
            it("足し算の結果") {
                assertEquals(6, result)
            }
        }

        // 引き算
        describe("minus") {

            val result = calculator.minus(2, 4)
            it("引き算の結果") {
                assertEquals(2, result)
            }
        }

        // 掛け算
        describe("multi") {

            val result = calculator.multi(2, 4)
            it("掛け算の結果") {
                assertEquals(8, result)
            }
        }

        // 割り算
        describe("division") {

            val result = calculator.division(2, 4)
            it("割り算の結果") {
                assertEquals(2, result)
            }
        }

        // SUM
        describe("sum") {

            val result = calculator.sum(listOf(1, 2, 3, 4, 5))
            it("sumの結果") {
                assertEquals(15, result)
            }
        }
    }

})

