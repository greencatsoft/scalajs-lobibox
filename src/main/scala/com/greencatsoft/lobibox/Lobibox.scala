package com.greencatsoft.lobibox

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobalScope

@js.native
trait Lobibox extends js.Object
  with MessageBoxDefaults with MessageBoxOperations
  with NotificationDefaults with NotificationOperations

@js.native
@JSGlobalScope
object Lobibox extends js.Object {

  val Lobibox: Lobibox = js.native
}
