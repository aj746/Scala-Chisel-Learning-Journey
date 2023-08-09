package lab1

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

import chisel3.experimental.BundleLiterals._

class exerc_1_test extends FreeSpec with ChiselScalatestTester{
"Chisel Tester File lab1 Exercise 1" in {
    test(new exerc_1(2.S)){  a=>
    a.clock.step(3)
    a.io.result.expect(true.B)
    }
}
}