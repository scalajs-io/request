package io.scalajs.npm

import io.scalajs.RawOptions
import io.scalajs.nodejs.http.IncomingMessage
import io.scalajs.nodejs.{SystemError, stream}
import io.scalajs.util.PromiseHelper._

import scala.concurrent.Promise
import scala.scalajs.js
import scala.scalajs.js.|

/**
  * request package object
  * @author lawrence.daniels@gmail.com
  */
package object request {

  type RequestBody = js.Any

  type RequestCallBack = js.Function3[RequestError, IncomingMessage, RequestBody, Any]

  type RequestError = SystemError

  /**
    * Request Extensions
    * @author lawrence.daniels@gmail.com
    */
  implicit class RequestExtensions(val client: Request) extends AnyVal {

    @inline
    def deleteAsync(options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.del(options, _))
    }

    @inline
    def deleteAsync(url: String): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.del(url, _))
    }

    @inline
    def getAsync(options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.get(options, _))
    }

    @inline
    def getAsync(url: String): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.get(url, _))
    }

    @inline
    def headAsync(options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.head(options, _))
    }

    @inline
    def headAsync(url: String): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.head(url, _))
    }

    @inline
    def patchAsync(options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.patch(options, _))
    }

    @inline
    def patchAsync(url: String): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.patch(url, _))
    }

    @inline
    def postAsync(options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.post(options, _))
    }

    @inline
    def postAsync(url: String): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.post(url, _))
    }

    @inline
    def postAsync(url: String, options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.post(url, options, _))
    }

    @inline
    def putAsync(options: RequestOptions | RawOptions): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.put(options, _))
    }

    @inline
    def putAsync(url: String): Promise[(IncomingMessage, RequestBody)] = {
      promiseWithError2[RequestError, IncomingMessage, RequestBody](client.put(url, _))
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
