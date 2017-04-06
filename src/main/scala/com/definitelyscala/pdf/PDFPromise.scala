package com.definitelyscala.pdf

import scala.scalajs.js

@js.native
trait PDFPromise[T] extends js.Object {
  def isResolved(): Boolean = js.native
  def isRejected(): Boolean = js.native
  def resolve(value: T): Unit = js.native
  def reject(reason: String): Unit = js.native
  def `then`[U](onResolve: js.Function1[T, U], onReject: js.Function1[String, Unit] = js.native): PDFPromise[U] = js.native
}