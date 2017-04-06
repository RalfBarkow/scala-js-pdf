package com.definitelyscala.pdf

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait PDFAnnotations extends js.Object {
  def getData(): PDFAnnotationData = js.native
  def hasHtml(): Boolean = js.native
  // always false
  def getHtmlElement(commonOjbs: js.Any): HTMLElement = js.native
  // throw new NotImplementedException()
  def getEmptyContainer(tagName: String, rect: js.Array[Double]): HTMLElement = js.native
  // deprecated
  def isViewable(): Boolean = js.native
  def loadResources(keys: js.Any): PDFPromise[js.Any] = js.native
  def getOperatorList(evaluator: js.Any): PDFPromise[js.Any] = js.native
}