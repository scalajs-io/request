package io.scalajs.npm

import io.scalajs.RawOptions
import io.scalajs.nodejs.http.IncomingMessage
import io.scalajs.nodejs.stream
import io.scalajs.util.PromiseHelper._

import scala.concurrent.Promise
import scala.scalajs.js
import scala.scalajs.js.|

/**
  * request package object
  * @author lawrence.daniels@gmail.com
  */
package object request {

  type RequestCallBack = js.Function3[RequestError, IncomingMessage, String, Any]

  /**
    * Request Extensions
    * @author lawrence.daniels@gmail.com
    */
  implicit class RequestExtensions(val client: Request) extends AnyVal {

    @inline
    def getFuture(url: String): Promise[(IncomingMessage, String)] = {
      promiseWithError2[RequestError, IncomingMessage, String](client.get(url, _))
    }

    @inline
    def postFuture(url: String): Promise[(IncomingMessage, String)] = {
      promiseWithError2[RequestError, IncomingMessage, String](client.post(url, _))
    }

    @inline
    def postFuture(options: RequestOptions | RawOptions): Promise[(IncomingMessage, String)] = {
      promiseWithError2[RequestError, IncomingMessage, String](client.post(options, _))
    }

  }

  /**
    * Request Events
    * @author lawrence.daniels@gmail.com
    */
  implicit class RequestEvents(val readable: stream.Readable) extends AnyVal {

    @inline
    def onResponse(handler: IncomingMessage => Any): readable.type = readable.on("response", handler)

  }

}
