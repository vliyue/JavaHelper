package com.github.vliyue.javahelper.services

import com.github.vliyue.javahelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
