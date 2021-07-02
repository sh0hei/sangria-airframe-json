package sangria.marshalling

import wvlet.airframe.json._
import wvlet.airframe.codec._
import sangria.marshalling.airframeJson._
import sangria.marshalling.testkit._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class AirframeJsonSupportSpec
  extends AnyWordSpec
    with Matchers
    with MarshallingBehaviour
    with InputHandlingBehaviour
    with ParsingBehaviour {

  "AirframeJson integration" should {

  }

  "InputUnmarshaller" should {
    "throw an exception on invalid scalar values" in {

    }

    "throw an exception on variable names" in {

    }

    "render JSON values" in {

    }
  }

  "ResultMarshaller" should {
    "render pretty JSON values" in {

    }

    "render compact JSON values" in {

    }
  }
}
