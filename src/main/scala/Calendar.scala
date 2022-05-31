import scala.collection.mutable.ArrayBuffer

class Calendar {

  var meetings: ArrayBuffer[Meeting] = ArrayBuffer.empty[Meeting]

  def addMeeting(newMeeting: Meeting) = meetings += newMeeting

  def removeMeeting(closeMeeting: Meeting) = meetings -= closeMeeting

}
