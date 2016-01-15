package com.greencatsoft.lobibox

import scala.scalajs.js

import Options._
import MessageBoxOptions._

@js.native
trait MessageBoxDefaults extends js.Object {
  this: Lobibox =>

  def base: Reference = js.native

  def confirm: Defaults[ConfirmOptions] = js.native

  def alert: Defaults[AlertOptions] = js.native

  def prompt: Defaults[PromptOptions] = js.native

  def progress: Defaults[ProgressOptions] = js.native

  def window: Defaults[WindowOptions] = js.native
}
