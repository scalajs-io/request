package io.scalajs.npm.request

import io.scalajs.RawOptions
import io.scalajs.nodejs.events.IEventEmitter
import io.scalajs.nodejs.stream.{Readable, Writable}
import io.scalajs.npm.toughcookie.{Cookie, CookieJar, CookieStore}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * Simplified HTTP request client.
  * @version 2.79.0
  * @see https://github.com/request/request
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait Request extends IEventEmitter {

  def apply(form: RequestOptions | MultipartForm | RawOptions): Readable = js.native

  def apply(url: String): Readable = js.native

  def apply(url: String, callback: RequestCallBack): Unit = js.native

  /**
    * Function that creates a new cookie.
    * @param cookieString the given cookie string
    * @return the [[Cookie]]
    */
  def cookie(cookieString: String): Cookie = js.native

  /**
    * This method returns a wrapper around the normal request API that defaults
    * to whatever options you pass to it.
    * @param options the given [[RequestOptions default options]]
    * @return a self reference
    */
  def defaults(options: RequestOptions | RawOptions): this.type = js.native

  /**
    * Same as request(), but defaults to method: "DELETE".
    * @param url the requested URL
    * @return a [[Readable readable]]
    */
  def del(url: String): Readable = js.native

  /**
    * Same as request(), but defaults to method: "DELETE".
    * @param url      the requested URL
    * @param callback the callback function
    */
  def del(url: String, callback: RequestCallBack): Unit = js.native

  /**
    * Same as request(), but defaults to method: "DELETE".
    * @param url the requested URL
    * @return a [[Readable readable]]
    */
  def delete(url: String): Readable = js.native

  /**
    * Same as request(), but defaults to method: "DELETE".
    * @param url      the requested URL
    * @param callback the callback function
    */
  def delete(url: String, callback: RequestCallBack): Unit = js.native

  def get(form: RequestOptions | MultipartForm | RawOptions): Readable = js.native

  def get(url: String): Readable = js.native

  def get(url: String, callback: RequestCallBack): Unit = js.native

  /**
    * Same as request(), but defaults to method: "HEAD".
    * @param url the requested URL
    * @return a [[Readable readable]]
    */
  def head(url: String): Readable = js.native

  /**
    * Same as request(), but defaults to method: "HEAD".
    * @param url      the requested URL
    * @param callback the callback function
    */
  def head(url: String, callback: RequestCallBack): Unit = js.native

  /**
    * Function that creates a new cookie jar.
    * @param cookieStore the optional custom [[CookieStore]]
    * @return a [[CookieJar]]
    */
  def jar(cookieStore: CookieStore = js.native): CookieJar = js.native

  /**
    * Same as Request(), but defaults to method: "PATCH".
    * @param url the requested URL
    * @return a [[Writable writable]]
    */
  def patch(url: String): Writable = js.native

  /**
    * Same as Request(), but defaults to method: "PATCH".
    * @param url      the requested URL
    * @param callback the callback function
    */
  def patch(url: String, callback: RequestCallBack): Unit = js.native

  /**
    * POST a form with a callback
    * @param options  the given [[RequestOptions request options]]
    * @param callback the callback function
    */
  def post(options: RequestOptions | RawOptions, callback: RequestCallBack): Unit = js.native

  /**
    * Use Request as a Writable stream to easily POST Readable streams (like files, other HTTP requests, or otherwise).
    * @param url the requested URL
    * @return a [[Readable readable]]
    */
  def post(url: String): Readable = js.native

  /**
    * Use Request as a Writable stream to easily POST Readable streams (like files, other HTTP requests, or otherwise).
    * @param url the requested URL
    * @return
    */
  def post(url: String, callback: RequestCallBack): Unit = js.native

  /**
    * Same as Request(), but defaults to method: "PUT".
    * @param url the requested URL
    * @return
    */
  def put(url: String): Writable = js.native

  /**
    * Same as Request(), but defaults to method: "PUT".
    * @param url      the requested URL
    * @param callback the callback function
    */
  def put(url: String, callback: RequestCallBack): Unit = js.native

}

/**
  * Request Singleton
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSImport("request", JSImport.Namespace)
object Request extends Request