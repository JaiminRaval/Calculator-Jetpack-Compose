package com.jaiminraval.calc_kotlin

sealed class CalcOperation(val symbol: String) {
    object  Add: CalcOperation("+")
    object  Substract: CalcOperation("-")
    object  Multiply: CalcOperation("x")
    object  Divide: CalcOperation("/")

}