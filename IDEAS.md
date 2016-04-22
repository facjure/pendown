#facjure/lang require [clojure.core] [cljs.core]

#plaintext@pendown

Pendown is an async communication language that compiles to Ion. Internally,
pendown transpiles to Edn, supporting hundreds of Clojure & Clojurescript
libraries run by Cider-REPL in Transit. Behind the scenes, OpenJDK's new
modular, runtime engines build a pool of distributed channels.
 
In them, we write in Pendown, a markup a language.

Pendown provides five workflows in an async REPL:

1. write
2. compose
3. edit
4. review
5. publish

Written in Clojurec, the common dialect of Clojure and Clojurescript, Pendown is
a homoiconic markup langauge, and relies on the spirit of Clojure's philosophy.

