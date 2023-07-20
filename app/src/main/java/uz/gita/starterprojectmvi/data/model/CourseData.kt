package uz.gita.starterprojectmvi.data.model

import uz.gita.starterprojectmvi.data.local.entity.CourseEntity

data class CourseData(
    val id: Long,
    val name: String,
    val title: String,
    val description: String,
    val imageUrl: String,
    val duration: String,
    val price: String
) {
    val idNum = "$name$id".hashCode().toLong()
    fun toCourseEntity():CourseEntity = CourseEntity(id= idNum, name = name, title = title,description = description, imageUrl = imageUrl, duration = duration, price = price)
}
