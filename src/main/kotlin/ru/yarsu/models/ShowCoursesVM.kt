package ru.yarsu.models

import org.http4k.template.ViewModel
import ru.yarsu.domain.Course

data class ShowCoursesVM(val courses: List<Course>) : ViewModel