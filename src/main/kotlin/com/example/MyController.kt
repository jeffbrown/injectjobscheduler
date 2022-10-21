package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.jobrunr.scheduling.JobScheduler

@Controller("/return")
class MyController(private val jobScheduler: JobScheduler) {

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun index(): String {
        return jobScheduler.javaClass.name
    }
}