package com.definitelyscala.pdf

import scala.scalajs.js
import scala.scalajs.js.typedarray._

@js.native
trait PDFSource extends js.Object {
  var url: String = js.native
  var data: Uint8Array = js.native
  var httpHeaders: js.Any = js.native
  var password: String = js.native
}