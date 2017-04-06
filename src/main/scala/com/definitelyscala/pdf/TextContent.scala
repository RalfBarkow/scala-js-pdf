package com.definitelyscala.pdf

import scala.scalajs.js

// A lookup into the styles map of the owning TextContent
@js.native
trait TextContent extends js.Object {
  var items: js.Array[TextContentItem] = js.native
  var styles: js.Any = js.native
}