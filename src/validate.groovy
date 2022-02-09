import java.text.SimpleDateFormat
import java.util.concurrent.TimeUnit

//String startdateStr = "05.08.2017 21:20:00"
//String tzStr = "GMT"

//gettime()

//printTimestamp("05.08.2017 21:20:00", "GMT")
//printTimestamp("06.08.2017 01:30:00", "GMT")

// def printTimestamp(String dateStr, String tzStr){
//    SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
//    def tz = TimeZone.getTimeZone(tzStr)
//    fmt.setTimeZone(tz)

//    def date = fmt.parse(dateStr)
//    println "$dateStr -> ${TimeUnit.MILLISECONDS.toSeconds(date.time)} secs"
// }

def Date getEpochTime(String dateStr,String timeStr){
    //yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    def tz = TimeZone.getTimeZone("GMT")
    fmt.setTimeZone(tz)
    def timestamp = dateStr + " " + timeStr
    def date = fmt.parse(timestamp)
    return date
    //return ${TimeUnit.MILLISECONDS.toSeconds(date.time)}


}
def validateTime(){
    def startDate = "${params.START_DATE}" 
    def startTime = "${params.START_TIME}"
    println( startTime)
    println(startDate)

    println("${params.START_DATE}" + " "  + "${params.START_TIME}")

    def epochTime = getEpochTime( startDate,startTime)
    println(epochTime)
    println("${TimeUnit.MILLISECONDS.toSeconds(epochTime.time)}")
    
    //def epochTimestr = "${TimeUnit.MILLISECONDS.toSeconds(epochTime.time)}"
    //println(epochTimestr)
    //echo "start time is : ${TimeUnit.MILLISECONDS.toSeconds(epochTime.time)}"
    //echo "validating time , start time: ${params.START_TIME} , end_time: ${params.END_TIME}"
    // this is new comment
}

return this
