package com.greencatsoft.lobibox

import scala.scalajs.js

import MessageBox._
import MessageBoxOptions._

@js.native
trait MessageBoxOperations extends js.Object {
  this: Lobibox =>

  def confirm(options: ConfirmOptions): ConfirmMessageBox = js.native

  def alert(messageType: String, options: AlertOptions): AlertMessageBox = js.native

  def prompt(inputType: String, options: PromptOptions): PromptMessageBox = js.native

  def progress(options: ProgressOptions): ProgressMessageBox = js.native

  def window(options: WindowOptions): WindowMessageBox = js.native
}
