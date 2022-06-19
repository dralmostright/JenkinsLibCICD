#!/usr/bin/env groovy

def call(String name, String dayOfWeek) {
  sh "Hello, ${name}. Today is ${dayOfWeek}"
}
