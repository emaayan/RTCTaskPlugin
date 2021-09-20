package com.github.emaayan.rtctaskplugin.services

import com.intellij.openapi.project.Project
import com.github.emaayan.rtctaskplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
