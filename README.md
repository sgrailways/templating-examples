templating-examples
===================

[![Build Status](https://drone.io/github.com/sgrailways/templating-examples/status.png)](https://drone.io/github.com/sgrailways/templating-examples/latest)

Simple Java template processing examples with a train theme. It's a spike,
perhaps even a [golden spike][gs].

This project shows how to solve a simple Java templating problem with many
different templating engines. Each module features a different engine and aims
to provide a direct comparison between engines.

[gs]: http://en.wikipedia.org/wiki/Golden_spike

problem
-------
Given:

* an object with `type`, `name`, and `configuration` Strings
* XML template on the classpath

Produce the following XML as a String:

```xml
<engine type="Steam">
    <name>Best Friend of Charleston</name>
    <configuration>0-4-0</configuration>
</engine>
```
