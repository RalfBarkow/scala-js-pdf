package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFRenderTask extends PDFPromise[PDFPageProxy] {
  /**
   * Cancel the rendering task.  If the task is currently rendering it will not be cancelled until graphics pauses with a timeout.  The promise that this object extends will resolve when cancelled.
   */
  def cancel(): Unit = js.native
}