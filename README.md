Scala.js wrapper API for Lobibox
================================

## Introduction

**scalajs-lobibox** is Scala.js wrapper API for Lobibox library (http://lobianijs.com/site/lobibox). You can use it to add notification and message box support for your Scala.js applications.

### How to Use

### SBT Settings

Add the following lines to your ```sbt``` build definition:

```scala
libraryDependencies += "com.greencatsoft" %%% "scalajs-lobibox" % "0.1-SNAPSHOT"
```

And add Sonatype snapshot repository to the resolver list as follows: 

```scala
resolvers += Resolver.sonatypeRepo("snapshots")
```

### API Reference

There is no Scaladoc available for now. But as the API is a pretty straightforward port of the original library, you can refer to the documentation from the [official Lobibox site](http://lobianijs.com/site/lobibox).

### License

This project is provided under the terms of _Apache License, Version 2.0_. 
