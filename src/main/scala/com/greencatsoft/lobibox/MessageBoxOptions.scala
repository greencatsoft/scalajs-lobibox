package com.greencatsoft.lobibox

import scala.scalajs.js
import scala.scalajs.js.{ Dictionary, UndefOr, | }

import com.greencatsoft.lobibox.MessageBox._
import com.greencatsoft.lobibox.MessageBoxOptions._

@js.native
trait MessageBoxOptions[A <: MessageBox[A]] extends Options {

  var horizontalOffset: UndefOr[Int] = js.native

  var height: UndefOr[Int | String] = js.native

  var closeButton: UndefOr[Boolean] = js.native

  var draggable: UndefOr[Boolean] = js.native

  var customBtnClass: UndefOr[String] = js.native

  var modal: UndefOr[Boolean] = js.native

  var debug: UndefOr[Boolean] = js.native

  var buttons: UndefOr[Dictionary[ButtonOptions]] = js.native

  var buttonsAlign: UndefOr[String] = js.native

  var closeOnEsc: UndefOr[Boolean] = js.native

  var onShow: UndefOr[js.Function1[A, Unit]] = js.native

  var shown: UndefOr[js.Function1[A, Unit]] = js.native

  var beforeClose: UndefOr[js.Function1[A, Unit]] = js.native

  var hidden: UndefOr[js.Function1[A, Unit]] = js.native

  var callback: UndefOr[js.Function2[A, String, Unit]] = js.native
}

object MessageBoxOptions {

  @js.native
  trait Reference extends OptionsReference[MessageBoxOptions[_], AvailableValues]

  @js.native
  trait AvailableValues extends OptionValues {

    def bodyClass: UndefOr[String] = js.native

    def modalClasses: UndefOr[Dictionary[String]] = js.native

    var buttonsAlign: UndefOr[js.Array[String]] = js.native

    var buttons: UndefOr[Dictionary[ButtonOptions]] = js.native
  }

  @js.native
  trait ConfirmOptions extends MessageBoxOptions[ConfirmMessageBox]
    with DialogOptions {

    var msg: UndefOr[String] = js.native
  }

  @js.native
  trait PromptOptions extends MessageBoxOptions[PromptMessageBox]
    with DialogOptions {

    var attrs: UndefOr[Dictionary[String]] = js.native

    var value: UndefOr[String] = js.native

    var multiline: UndefOr[Boolean] = js.native

    var lines: UndefOr[Int] = js.native

    var `type`: UndefOr[String] = js.native

    var label: UndefOr[String] = js.native

    var progressUpdated: UndefOr[js.Function1[PromptMessageBox, Unit]] = js.native

    var progressCompleted: UndefOr[js.Function1[PromptMessageBox, Unit]] = js.native
  }

  @js.native
  trait AlertOptions extends MessageBoxOptions[AlertMessageBox]
    with DialogOptions {

    var msg: UndefOr[String] = js.native

    var warning: UndefOr[DialogOptions] = js.native

    var info: UndefOr[DialogOptions] = js.native

    var success: UndefOr[DialogOptions] = js.native

    var error: UndefOr[DialogOptions] = js.native
  }

  @js.native
  trait ProgressOptions extends MessageBoxOptions[ProgressMessageBox]
    with DialogOptions {

    var showProgressLabel: UndefOr[Boolean] = js.native

    var label: UndefOr[String] = js.native

    var progressTpl: UndefOr[Boolean] = js.native
  }

  @js.native
  trait WindowOptions extends MessageBoxOptions[WindowMessageBox]
    with DialogOptions {

    var content: UndefOr[String] = js.native

    var url: UndefOr[String] = js.native

    var autoload: UndefOr[Boolean] = js.native

    var loadMethod: UndefOr[String] = js.native

    var showAfterLoad: UndefOr[Boolean] = js.native

    var params: UndefOr[Dictionary[String]] = js.native
  }

  @js.native
  trait DialogOptions extends js.Object {

    var title: UndefOr[String] = js.native

    var iconClass: UndefOr[String] = js.native
  }

  @js.native
  trait ButtonOptions extends js.Object {

    var `class`: UndefOr[String] = js.native

    var text: UndefOr[String] = js.native

    var closeOnClick: UndefOr[Boolean] = js.native
  }
}
