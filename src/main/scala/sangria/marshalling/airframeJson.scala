package sangria.marshalling

import sangria.marshalling.airframeJson.AirframeJsonFromInput.marshaller
import sangria.marshalling.airframeJson.AirframeJsonResultMarshaller
import wvlet.airframe.json._
import wvlet.airframe.codec._

object airframeJson {

  implicit object AirframeJsonResultMarshaller extends ResultMarshaller {
    override type Node = this.type
    override type MapBuilder = this.type

    override def emptyMapNode(keys: Seq[String]): AirframeJsonResultMarshaller = ???

    override def addMapNodeElem(builder: AirframeJsonResultMarshaller, key: String, value: AirframeJsonResultMarshaller, optional: Boolean): AirframeJsonResultMarshaller = ???

    override def mapNode(builder: AirframeJsonResultMarshaller): AirframeJsonResultMarshaller = ???

    override def mapNode(keyValues: Seq[(String, airframeJson.AirframeJsonResultMarshaller.type)]): AirframeJsonResultMarshaller = ???

    override def arrayNode(values: Vector[airframeJson.AirframeJsonResultMarshaller.type]): AirframeJsonResultMarshaller = ???

    override def optionalArrayNodeValue(value: Option[airframeJson.AirframeJsonResultMarshaller.type]): AirframeJsonResultMarshaller = ???

    override def scalarNode(value: Any, typeName: String, info: Set[ScalarValueInfo]): AirframeJsonResultMarshaller = ???

    override def enumNode(value: String, typeName: String): AirframeJsonResultMarshaller = ???

    override def nullNode: AirframeJsonResultMarshaller = ???

    override def renderCompact(node: AirframeJsonResultMarshaller): String = ???

    override def renderPretty(node: AirframeJsonResultMarshaller): String = ???
  }

  implicit object AirframeJsonMarshallerForType extends ResultMarshallerForType[Json] {
    override def marshaller: ResultMarshaller = ???
  }

  implicit object AirframeJsonUnmarshaller extends InputUnmarshaller[Json] {
    override def getRootMapValue(node: Json, key: String): Option[Json] = ???

    override def isMapNode(node: Json): Boolean = ???

    override def getMapValue(node: Json, key: String): Option[Json] = ???

    override def getMapKeys(node: Json): Traversable[String] = ???

    override def isListNode(node: Json): Boolean = ???

    override def getListValue(node: Json): Seq[Json] = ???

    override def isDefined(node: Json): Boolean = ???

    override def isScalarNode(node: Json): Boolean = ???

    override def isEnumNode(node: Json): Boolean = ???

    override def isVariableNode(node: Json): Boolean = ???

    override def getScalarValue(node: Json): Any = ???

    override def getScalaScalarValue(node: Json): Any = ???

    override def getVariableName(node: Json): String = ???

    override def render(node: Json): String = ???
  }

  implicit object AirframeJsonToInput extends ToInput[Json, Json] {
    override def toInput(value: Json): (Json, InputUnmarshaller[Json]) = ???
  }

  implicit object AirframeJsonFromInput extends FromInput[Json] {
    override val marshaller: ResultMarshaller = _

    override def fromResult(node: marshaller.Node): Json = ???
  }
}
