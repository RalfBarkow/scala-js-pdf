package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFPageViewport extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
  var fontScale: Double = js.native
  var transforms: js.Array[Double] = js.native
  def clone(options: PDFPageViewportOptions): PDFPageViewport = js.native
  def convertToViewportPoint(x: Double, y: Double): js.Array[Double] = js.native
  // [x, y]
  def convertToViewportRectangle(rect: js.Array[Double]): js.Array[Double] = js.native
  // [x1, y1, x2, y2]
  def convertToPdfPoint(x: Double, y: Double): js.Array[Double] = js.native
}