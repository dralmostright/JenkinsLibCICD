#!/bin/bash
message=`openssl rand -hex 10`
git add .
git commit -m "$message"
git push origin main

