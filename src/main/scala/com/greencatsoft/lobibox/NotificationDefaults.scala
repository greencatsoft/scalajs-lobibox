package com.greencatsoft.lobibox

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import NotificationOptions._

@js.native
trait NotificationDefaults extends js.Object {
  this: Lobibox =>

  @JSName("notify")
  def notification: Reference = js.native
}
