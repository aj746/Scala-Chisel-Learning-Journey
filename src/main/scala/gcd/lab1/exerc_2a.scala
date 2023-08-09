package lab1
import chisel3 . _
import chisel3.util._

class exerc_2a ( counterBits : SInt ) extends Module {
val io = IO ( new Bundle {
val result = Output ( Bool () )
})

val max = (1.S << counterBits.asUInt) - 1.S
val count = RegInit (0.U (4.W ) )
io.result := false.B
when ( count === 16.U) {
    count := 0. U
    io.result := true.B
   // println ( s " counter created with max value $max " )
} .otherwise {
    count := count + 1.U
}
//io . result := count ( )

}