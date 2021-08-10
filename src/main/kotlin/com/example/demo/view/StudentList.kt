package com.example.demo.view

import com.example.demo.controller.StudentListController
import com.example.demo.model.Student
import com.example.demo.model.StudentModel
import tornadofx.*

class StudentList: View("Knight University - Students") {
    val studentListController: StudentListController by inject()
    val model: StudentModel by inject()

    override val root = tableview(studentListController.students) {
        column("Full Name", Student::fullNameProperty)
        column("ID Number", Student::idNumberProperty)
        column("Credits", Student::creditsProperty)
        column("Subjects", Student::subjectsProperty)
        column("Funds", Student::feesProperty)
        column("Type", Student::eduTypeProperty)

        columnResizePolicy = SmartResize.POLICY

        bindSelected(model)

    }

//    override val root = datagrid(studentListController.students) {
//        cellFormat {
//            graphic = stackpane {
//                label(Student::fullNameProperty.toString())
//            }
//        }
//    }

}