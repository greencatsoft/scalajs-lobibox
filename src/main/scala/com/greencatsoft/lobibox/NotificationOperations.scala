package com.greencatsoft.lobibox

import scala.scalajs.js

@js.native
trait NotificationOperations extends js.Object {
  this: Lobibox =>

  def notify(notificationType: String, options: NotificationOptions): Notification = js.native
}
