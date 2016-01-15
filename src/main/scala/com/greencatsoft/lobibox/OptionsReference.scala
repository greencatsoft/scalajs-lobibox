package com.greencatsoft.lobibox

import scala.scalajs.js

@js.native
trait OptionsReference[A <: Options, B <: OptionValues]
  extends Options.Defaults[A] with OptionValues.Defaults[B]
