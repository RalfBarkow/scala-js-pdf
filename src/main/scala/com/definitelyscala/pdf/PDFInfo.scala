package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFInfo extends js.Object {
  var PDFFormatVersion: String = js.native
  var IsAcroFormPresent: Boolean = js.native
  var IsXFAPresent: Boolean = js.native
  @js.annotation.JSBracketAccess
  def apply(key: String): js.Any = js.native
  @js.annotation.JSBracketAccess
  def update(key: String, v: js.Any): Unit = js.native
}