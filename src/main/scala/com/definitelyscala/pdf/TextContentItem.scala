package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait TextContentItem extends js.Object {
  var str: String = js.native
  var transform: js.Array[Double] = js.native
  // [0..5]   4=x, 5=y
  var width: Double = js.native
  var height: Double = js.native
  var dir: String = js.native
  // Left-to-right (ltr), etc
  var fontName: String = js.native
}