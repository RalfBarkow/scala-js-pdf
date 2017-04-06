package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFTreeNode extends js.Object {
  var title: String = js.native
  var bold: Boolean = js.native
  var italic: Boolean = js.native
  var color: js.Array[Double] = js.native
  // [r,g,b]
  var dest: js.Any = js.native
  var items: js.Array[PDFTreeNode] = js.native
}