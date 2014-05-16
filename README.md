# kasyaar-http-kit

A Leiningen template for creating web services based on http-kit and compojure

## Usage

```sh
lein new kasyaar-http-kit newproj
cd newproj
lein run 3000
```
You'll see a Hello world! message on localhost:3000

## Build distribution package
```sh
lein uberjar
java -jar target/newproj.jar 3000
```
Also you can easily deploy it to heroku - Procfile is already there


## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
