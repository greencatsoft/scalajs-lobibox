package com.greencatsoft.lobibox

import scala.scalajs.js
import scala.scalajs.js.GlobalScope

@js.native
trait Lobibox extends js.Object
  with MessageBoxDefaults with MessageBoxOperations
  with NotificationDefaults with NotificationOperations

@js.native
object Lobibox extends GlobalScope {

  val Lobibox: Lobibox = js.native
}
