#!/usr/bin/env groovy

def call(Map config = [:]) {
  sh "sqlplus ${config.username}/${config.password}@${config.dbtns} @${config.script}"
}

