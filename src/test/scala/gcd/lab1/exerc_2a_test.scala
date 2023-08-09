package lab1

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec

import chisel3.experimental.BundleLiterals._

class exerc_2a_test extends FreeSpec with ChiselScalatestTester{
"Chisel Tester File lab1 Exercise 2a" in {
    test(new exerc_2a(2.S)){  a=>
    a.clock.step(16)
    a.io.result.expect(true.B)
    }
}
}