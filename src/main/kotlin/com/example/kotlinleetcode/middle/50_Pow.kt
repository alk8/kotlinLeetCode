package com.example.kotlinleetcode.middle


fun main() {

   // SOLVEDDDDDDDDDDDD

  // println(myPow(2.00000,10))
   println(myPow(2.00000,-2))

}

fun myPow(x: Double, n: Int): Double {

   var multiple = x
   var multiplicator = n

   val isMinus = multiplicator < 0

   var result = 1.0000

   while (multiplicator != 0) {

      if (multiplicator % 2 == 1 || multiplicator % 2 == -1) {

         result *= multiple
         if (isMinus) multiplicator++ else multiplicator--

      } else {

         multiple *= multiple
         multiplicator /= 2

      }
   }
   return if (isMinus) 1 / result else result

}
