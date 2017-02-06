Request API for Scala.js
=======================
This is a Scala.js type-safe binding for [request](https://www.npmjs.com/package/request)

A Simplified HTTP request client.

#### Build Dependencies

* [ScalaJs.io v0.3.x](https://github.com/ldaniels528/scalajs.io)
* [SBT v0.13.13](http://www.scala-sbt.org/download.html)

#### Build/publish the SDK locally

```bash
$ sbt clean publish-local
```

#### Run the tests

```bash
$ sbt test
```

#### Examples

`Request` can perform HTTP requests via callbacks:

```scala
  Request("http://www.google.com", (error: String, response: ServerResponse, body: String) => {
    assert(error == null)
    assert(response.statusCode == 200)
  })
```

`Request` can perform streaming HTTP requests:

```scala
  Request
    .get("http://google.com/img.png")
    .on("response", (response: ServerResponse) => {
      assert(response.statusCode == 200)
      assert(response.headers.get("content-type").contains("image/png"))
    })
    .pipe(Request.put("http://mysite.com/img.png"))
```

#### Artifacts and Resolvers

To add the Request binding to your project, add the following to your build.sbt:  

```sbt
libraryDependencies += "io.scalajs.npm" %%% "request" % "0.3.0.3"
```

Optionally, you may add the Sonatype Repository resolver:

```sbt   
resolvers += Resolver.sonatypeRepo("releases") 
```