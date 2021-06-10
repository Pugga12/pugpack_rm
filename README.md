# Pugpack Remastered
The new version of pugpack
Pugpack is a mod featuring new food, among other things.
 Pugpack is only supported on 1.12.2
# That's all folks
The Pugpack project, including Pugpack 1.0 and Pugpack Remastered Beta, has now reached end of life. You will no longer recieve support for Pugpack.  Unofficial updates can still be made by forking the project on github, but everything is all on you. That being said, Pugpack is finally being rewrote from scratch for 1.16.5 compatibility, so stay tuned! Goodnight
## Updates (build failures)
It is apparent that the Pugpack build.gradle no longer resolves to the forge plugin, making builds fail
# Building
## Windows (command prompt)
gradlew setupDecompWorkspace\
gradlew genIntellijRuns\
gradlew buildDependents
 
## Unix/Linux/MacOS (terminal)
./gradlew setupDecompWorkspace\
./gradlew genIntellijRuns\
./gradlew buildDependents
