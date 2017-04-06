package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFRenderImageLayer extends js.Object {
  def beginLayout(): Unit = js.native
  def endLayout(): Unit = js.native
  def appendImage(): Unit = js.native
}