package com.definitelyscala.pdf

import scala.scalajs.js

// return type is string, typescript chokes
@js.native
trait PDFMetadata extends js.Object {
  def parse(): Unit = js.native
  def get(name: String): String = js.native
  def has(name: String): Boolean = js.native
}