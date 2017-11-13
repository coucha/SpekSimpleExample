package kw10.spek

class ExampleCalculator {

    // 足し算
    fun plus(x: Int, y: Int): Int {
        return x + y
    }

    // 引き算
    fun minus(x: Int, y: Int): Int {
        if (x >= y) {
            return x - y
        }
        return y - x
    }

    // 掛け算
    fun multi(x: Int, y: Int): Int {
        return x * y
    }

    // 割り算
    fun division(x: Int, y: Int): Int {
        if (x >= y) {
            return x / y
        }

        return y / x
    }

    // SUM
    fun sum(arr : List<Int>): Int {
        val y: Int = arr.sum()
        return y
    }
}