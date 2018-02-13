import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Example {
  val roof = Image.Triangle(70, 60).fillColor(Color.brown).lineWidth(3)
  var door = Image.Rectangle(15,40).fillColor(Color.red).lineColor(Color.red) above Image.Rectangle(15, 30).fillColor(Color.black)
  val body = door on Image.Rectangle(70, 70).fillColor(Color.red).lineWidth(3)
  val canopy = Image.Circle(40).fillColor(Color.green)
  val trunk = Image.Rectangle(15, 55).fillColor(Color.brown)

  val tree = canopy above trunk
  val house = roof above body

  val tar = Image.Rectangle(200, 10).fillColor(Color.black)
  var yellowMarking = Image.Rectangle(45, 3).fillColor(Color.yellow).lineColor(Color.yellow)
  var blackMarking = Image.Rectangle(20, 3).fillColor(Color.black)
  var streetMarking = yellowMarking beside blackMarking beside yellowMarking beside blackMarking beside yellowMarking beside blackMarking
  var street = streetMarking above tar

  var property = house beside tree above street
  var rowOfHouses = property beside property beside property
}
