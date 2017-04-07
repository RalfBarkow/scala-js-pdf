package com.definitelyscala.pdf

import scala.scalajs.js

  // [x, y]
@js.native
trait PDFAnnotationData extends js.Object {
  var subtype: String = js.native
  var rect: js.Array[Double] = js.native
  // [x1, y1, x2, y2]
  var annotationFlags: js.Any = js.native
  // todo
  var color: js.Array[Double] = js.native
  // [r,g,b]
  var borderWidth: Double = js.native
  var hasAppearance: Boolean = js.native
}