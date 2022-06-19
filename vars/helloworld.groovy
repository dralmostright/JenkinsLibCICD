#!/usr/bin/env groovy

def call(Map config = [:]) {
  sh "Hello ${config.name}. Today is ${config.dayOfWeek}."
}
