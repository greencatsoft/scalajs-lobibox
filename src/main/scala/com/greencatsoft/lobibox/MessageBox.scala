package com.greencatsoft.lobibox

import scala.scalajs.js
import scala.scalajs.js.{ Dictionary, GlobalScope }

@js.native
trait MessageBox[A <: MessageBox[A]] extends js.Object {

  def show(): A = js.native

  def hide(): A = js.native

  def destroy(): A = js.native

  def setWidth(width: Int): A = js.native

  def setHeight(height: Int): A = js.native

  def setSize(width: Int, height: Int): A = js.native

  def setPosition(left: Int, top: Int): A = js.native

  def getTitle(): String = js.native

  def setTitle(title: String): A = js.native
}

object MessageBox {

  @js.native
  trait BaseMessageBox extends MessageBox[BaseMessageBox]

  @js.native
  trait AlertMessageBox extends MessageBox[AlertMessageBox]

  @js.native
  trait ConfirmMessageBox extends MessageBox[ConfirmMessageBox]

  @js.native
  trait PromptMessageBox extends MessageBox[PromptMessageBox]

  @js.native
  trait ProgressMessageBox extends MessageBox[ProgressMessageBox] {

    def getProgress(): Int = js.native

    def setProgress(progress: Int): ProgressMessageBox = js.native
  }

  @js.native
  trait WindowMessageBox extends MessageBox[WindowMessageBox] {

    def getParams(): Dictionary[String] = js.native

    def setParams(params: Dictionary[String]): WindowMessageBox = js.native

    def getLoadMethod(): String = js.native

    def setLoadMethod(method: String): WindowMessageBox = js.native

    def getContent(): String = js.native

    def setContent(content: String): WindowMessageBox = js.native

    def getUrl(): String = js.native

    def setUrl(url: String): WindowMessageBox = js.native

    def load(callback: js.Function0[Unit]): WindowMessageBox = js.native
  }
}
