# SCL-8279 Example

This is an example showing how `beEmpty` has a red underline in IntelliJ 
(see [this issue](https://youtrack.jetbrains.com/issue/SCL-8279) on YouTrack).

If you run:
```shell
sbt test
```

It will print:
```shell
[info] HomeControllerSpec
[info] The specification should
[info]   + not have a red underline for beEmpty
[info] Total for specification HomeControllerSpec
[info] Finished in 194 ms
[info] 1 example, 0 failure, 0 error
[info] Passed: Total 1, Failed 0, Errors 0, Passed 1
[success] Total time: 12 s, completed Jun 2, 2021, 3:48:34 PM
```

But if you open `HomeControllerSpec` in IntelliJ, you will see a red underline under beEmpty and the message:

```
No implicit arguments of type: T_ => Any { def isEmpty: Boolean }
```
