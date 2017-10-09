data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
   /* override fun compareTo(other: MyDate): Int {
        val yearCompare = this.year.compareTo(other.year)
        if (yearCompare != 0) {
            return yearCompare
        }
        val monthCompare = this.month.compareTo(other.month)
        if (month != 0) {
            return monthCompare
        }
        return this.dayOfMonth.compareTo(other.dayOfMonth)
    }*/
    /* if(year != other.year) return year - other.year
        if(month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth*/
   override fun compareTo(other: MyDate) = when {
       year != other.year -> year - other.year
       month != other.month -> month - other.month
       else -> dayOfMonth - other.dayOfMonth
   }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
