class DateRange(val start: MyDate, val endInclusive: MyDate) {
    /*operator fun contains(d: MyDate): Boolean {
 //        start >= d && endInclusive <= d
        return d in start..endInclusive
     }*/
    operator fun contains(d: MyDate): Boolean = d in start..endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
