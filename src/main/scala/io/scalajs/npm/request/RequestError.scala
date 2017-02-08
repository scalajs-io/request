package io.scalajs.npm.request

import scala.scalajs.js

/**
  * Request Error
  * @param code    the error code
  * @param errno   the error number/code
  * @param syscall the system call that failed
  * @param address the address
  * @param port    the port
  */
@js.native
class RequestError(val code: String,
                   val errno: String,
                   val syscall: String,
                   val address: String,
                   val port: Int)
  extends js.Object