package com.definitelyscala.pdf

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait PDFRenderParams extends js.Object {
  var canvasContext: CanvasRenderingContext2D = js.native
  var viewport: PDFPageViewport = js.native
  var textLayer: PDFRenderTextLayer = js.native
  var imageLayer: PDFRenderImageLayer = js.native
  var continueCallback: js.Function1[js.Function0[Unit], Unit] = js.native
}