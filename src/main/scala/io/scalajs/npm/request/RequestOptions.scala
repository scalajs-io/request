package io.scalajs.npm.request

import io.scalajs.npm.toughcookie.CookieJar

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Request Options
  * @author lawrence.daniels@gmail.com
  */
@ScalaJSDefined
class RequestOptions(val url: js.UndefOr[String] = js.undefined,
                     val uri: js.UndefOr[String] = js.undefined,
                     val form: js.Any = js.undefined,
                     val formData: js.Any = js.undefined,
                     val jar: js.UndefOr[CookieJar] = js.undefined,
                     val gzip: js.UndefOr[Boolean] = js.undefined,
                     val method: js.UndefOr[String] = js.undefined,
                     val oauth: js.Any = js.undefined,
                     val proxy: js.UndefOr[String] = js.undefined,
                     val qs: js.Any = js.undefined)
  extends js.Object
