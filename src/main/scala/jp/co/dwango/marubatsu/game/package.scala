// このファイルは、"パッケージオブジェクト"と言う。
package jp.co.dwango.marubatsu

import jp.co.dwango.marubatsu.board.{CellState, Empty, Maru => MaruState, Batsu => BatsuState} // ....board._  てきなワイルドカードで表現することもできる
// ちなみにimport文は、ファイルの先頭で書かなければいけない、みたいなルールなんてありましぇん。

package object game { // 上位層である'パッケージ'と同じ名前を持つobject だから "パッケージオブジェクト"
 // この中に実装したメソッドは、同じ”パッケージ内”であれば、import文なしで定義したメソッドを呼び出して利用することができる。

  def toWinner(cellState:CellState): Winner = cellState match {
    case MaruState => game.Maru
    case BatsuState => game.Batsu
    case board.Empty => game.NoWinner
  }
}
