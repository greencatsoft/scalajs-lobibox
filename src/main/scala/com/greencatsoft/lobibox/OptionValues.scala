package com.greencatsoft.lobibox

import scala.scalajs.js

@js.native
trait OptionValues extends js.Object

object OptionValues {

  @js.native
  trait Defaults[A <: OptionValues] extends js.Object {

    var OPTIONS: A
  }

  def empty[A <: OptionValues]: A = (new js.Object).asInstanceOf[A]
}
