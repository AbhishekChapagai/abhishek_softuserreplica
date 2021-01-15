package com.abhishek.softuserreplica.`object`

import com.abhishek.softuserreplica.model.student

object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent = arrayListOf();
        lstStudent.add(student(
            studentName ="Abhishek Chapagai",studentAge = "21",studentGender = "Male",
                studentAddress ="Bhaktapur", imageLink = "https://bulletinhours.com/wp-content/uploads/2020/08/Allu-Arjun-.jpg"
        ))

        lstStudent.add(student(
                studentName ="Brad Pitt",studentAge = "55",studentGender = "Male",
                studentAddress ="California", imageLink = "https://media.vanityfair.com/photos/5f4d3a7e1e10df7a77868a63/master/w_2560%2Cc_limit/BradPitt-GettyImages-1158782727.jpg"
        ))
    }
}