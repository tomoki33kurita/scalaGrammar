package jp.co.dwango.marubatsu.game

sealed  abstract class Winner
case object NoWinner extends Winner
case object Maru extends Winner // packageがCellStateとは異なるので、object名が被っていてもコンパイルエラーにはならない
case object Batsu extends Winner // 同上
