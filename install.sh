mkdir seminar
cd seminar
gradle init --type java-application \
  --dsl groovy \
  --test-framework junit \
  --project-name seminar \
  --package com.example.seminar
