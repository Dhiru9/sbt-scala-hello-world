package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class HelloSpec extends AnyFlatSpec {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}
