package com.greencatsoft.lobibox

import scala.scalajs.js
import scala.scalajs.js.{ UndefOr, | }

import com.greencatsoft.lobibox.NotificationOptions._

@js.native
trait NotificationOptions extends Options with StyleOptions {

  var size: UndefOr[String] = js.native

  var soundPath: UndefOr[String] = js.native

  var soundExt: UndefOr[String] = js.native

  var showClass: UndefOr[String] = js.native

  var hideClass: UndefOr[String] = js.native

  var msg: UndefOr[String] = js.native

  var img: UndefOr[String] = js.native

  var closable: UndefOr[Boolean] = js.native

  var delay: UndefOr[Int] = js.native

  var delayIndicator: UndefOr[Boolean] = js.native

  var closeOnClick: UndefOr[Boolean] = js.native

  var width: UndefOr[Int] = js.native

  var position: UndefOr[String] = js.native
}

object NotificationOptions {

  @js.native
  trait Reference extends OptionsReference[NotificationOptions, AvailableValues]

  @js.native
  trait AvailableValues extends OptionValues {

    var `class`: UndefOr[SizeOverrides] = js.native

    var mini: UndefOr[SizeOverrides] = js.native

    var large: UndefOr[js.Array[String]] = js.native

    var success: StyleOptions = js.native

    var error: StyleOptions = js.native

    var warning: StyleOptions = js.native

    var info: StyleOptions = js.native
  }

  @js.native
  trait StyleOptions extends js.Object {

    var `class`: UndefOr[Boolean | String] = js.native

    var title: UndefOr[String] = js.native

    var icon: UndefOr[String] = js.native

    var sound: UndefOr[Boolean | String] = js.native
  }

  @js.native
  trait SizeOverrides extends js.Object {

    var `class`: UndefOr[String] = js.native

    var width: UndefOr[Int] = js.native
  }
}
