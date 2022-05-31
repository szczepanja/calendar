import scala.collection.mutable.ArrayBuffer

class Calendar {

  var meetings: ArrayBuffer[Meeting] = ArrayBuffer.empty[Meeting]

  def addMeeting(newMeeting: Meeting) = newMeeting match {
    case meeting if (newMeeting == meetings) => println(s"Wrong, $meeting already exist")
    case _ => meetings += newMeeting
  }

  def removeMeeting(closeMeeting: Meeting) = meetings -= closeMeeting

}

object Calendar extends App {
  val calendar = new Calendar
}