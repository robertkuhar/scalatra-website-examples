package org.scalatra.example

import org.scalatra._
import scalate.ScalateSupport

class HerokuApp extends HerokuExampleStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
