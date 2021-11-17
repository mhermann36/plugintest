package com.github.mhermann36.plugintest.services

import com.intellij.openapi.project.Project
import com.github.mhermann36.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
