package com.greencatsoft.lobibox

import scala.scalajs.js

@js.native
trait Options extends js.Object

object Options {

  @js.native
  trait Defaults[A <: Options] extends js.Object {

    var DEFAULTS: A
  }

  def empty[A <: Options]: A = (new js.Object).asInstanceOf[A]
}
