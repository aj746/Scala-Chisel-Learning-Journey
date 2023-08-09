package lab1
import chisel3 . _
import chisel3.util._

class exerc_1 ( counterBits : SInt ) extends Module {
val io = IO ( new Bundle {
val result = Output ( Bool () )
})

val max = (1.S << counterBits.asUInt) - 1.S
val count = RegInit (0.S (16.W ) )
io.result := false.B
when ( count === max ) {
    count := 0. S
    io.result := true.B
   // println ( s " counter created with max value $max " )
} .otherwise {
    count := count + 1.S
}
//io . result := count ( )

}