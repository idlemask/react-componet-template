package com.github.idlemask.reactcomponettemplate.services

import com.intellij.openapi.project.Project
import com.github.idlemask.reactcomponettemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
