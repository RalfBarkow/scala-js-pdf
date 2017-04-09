package com.definitelyscala.pdf

import scala.scalajs.js

// ... todo
@js.native
trait PDFRenderTextLayer extends js.Object {
  def beginLayout(): Unit = js.native
  def endLayout(): Unit = js.native
  def appendText(): Unit = js.native
}