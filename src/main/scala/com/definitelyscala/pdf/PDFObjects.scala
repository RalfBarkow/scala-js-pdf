package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFObjects extends js.Object {
  def get(objId: Double, callback: js.Any = js.native): js.Dynamic = js.native
  def resolve(objId: Double, data: js.Any): js.Dynamic = js.native
  def isResolved(objId: Double): Boolean = js.native
  def hasData(objId: Double): Boolean = js.native
  def getData(objId: Double): js.Dynamic = js.native
  def clear(): Unit = js.native
}