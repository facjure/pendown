## Zendown

A parser for [Zendown](https://github.com/priyatam/zendown.git).

## Usage

Leiningen dependency information:

    [facjure/zendown "0.3.0"]

There's only one api, `readany`. This can read any plaintext or markdown source from a variety of sources:

    (ns my.program
      (:require [zendown.core :as zen]))

    (zen/readany :resource "poem.txt")

    (zen/readany :file "resources/poem.txt")

    (zen/readany :url "https://s3.amazonaws.com/poetroid-public-domain/Sappho-You-May-Forget.txt")

## License

Copyright © 2014 Facjure LLC

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
