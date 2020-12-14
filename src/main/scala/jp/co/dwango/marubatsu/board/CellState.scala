// このpackage文以下が、そのパッケージに属する実装となる。
package jp.co.dwango.marubatsu.board

private[marubatsu] sealed abstract class CellState
private[marubatsu] case object Empty extends CellState
private[marubatsu] case object Maru extends  CellState
private[marubatsu] case object Batsu extends CellState

// private[marubatsu] で、marubatsuパッケージに含まれるパッケージからのみ利用できるように限定できる。
// [] の中は、パッケージ名だけでなく、クラス名を指定することもできる。

// private ではなく、 protected を指定することで、継承先の子クラスのみアクセス可能とすることもできる。