package com.definitelyscala.pdf

import scala.scalajs.js
import scala.scalajs.js.typedarray._
import scala.scalajs.js.Promise

@js.native
trait PDFDocumentProxy extends js.Object {
  /**
   * Total number of pages the PDF contains.
   */
  var numPages: Double = js.native
  /**
   * A unique ID to identify a PDF.  Not guaranteed to be unique.  [jbaldwin: haha what]
   */
  var fingerprint: String = js.native
  /**
   * True if embedded document fonts are in use.  Will be set during rendering of the pages.
   */
  def embeddedFontsUsed(): Boolean = js.native
  /**
   * @param number The page number to get.  The first page is 1.
   * @return A promise that is resolved with a PDFPageProxy.
   */
  def getPage(number: Double): PDFPromise[PDFPageProxy] = js.native
  /**
   * TODO: return type of Promise<???>
   *  A promise that is resolved with a lookup table for mapping named destinations to reference numbers.
   */
  def getDestinations(): PDFPromise[js.Array[js.Any]] = js.native
  /**
   *  A promise that is resolved with an array of all the JavaScript strings in the name tree.
   */
  def getJavaScript(): PDFPromise[js.Array[String]] = js.native
  /**
   *  A promise that is resolved with an array that is a tree outline (if it has one) of the PDF.  @see PDFTreeNode
   */
  def getOutline(): PDFPromise[js.Array[PDFTreeNode]] = js.native
  /**
   * A promise that is resolved with the info and metadata of the PDF.
   */
  def getMetadata(): PDFPromise[js.Any] = js.native
  /**
   * Is the PDF encrypted?
   */
  def isEncrypted(): PDFPromise[Boolean] = js.native
  /**
   * A promise that is resolved with Uint8Array that has the raw PDF data.
   */
  def getData(): PDFPromise[Uint8Array] = js.native
  /**
   * TODO: return type of Promise<???>
   * A promise that is resolved when the document's data is loaded.
   */
  def dataLoaded(): PDFPromise[js.Array[js.Any]] = js.native
  /**
   *
   */
  def destroy(): Unit = js.native
}