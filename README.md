Zendown
=======

A markup for writing poems and stories.

Inspired by [Jekyll blogs](http://jekyllrb.com/docs/home/), and composed of [YAML](http://en.wikipedia.org/wiki/YAML), Plaintext, or [Markdown](http://daringfireball.net/projects/markdown/).

## Introduction

Thousands of poems and stories in the public domain live buried in libraries, archaic websites, and journals gone out of print. Emerging writers publish their literature online where magazines save them in content management systems, programs that strip and lock literature in complex, proprietary software. We don't have an open format to share literature on the web.

Zendown allows you to write poems and stories using an easy-to-read, easy-to-write, plain-text or markdown format, interchangeably. Scripts can convert them to a [HTML5](http://en.wikipedia.org/wiki/HTML5) understood by modern browsers on desktop, mobile, and web. The goal is that poems and stories should be publishable and restored as-is, as plain-text, before being consumed by content management systems.

Zendown is free software, available under a BSD-style open source license.

## SPEC

See [SPEC.md](/SPEC.md) for more details.

## Editors

Markdown content can be opened in any Markdown-supported Editor.

Plaintext is supported by default in *all* major editors: notepad, textedit, [iAWriter](http://www.iawriter.com/mac/), MS Word, etc., However, there are two important steps:

1. Files must be saved with an extension ".txt"
2. Files must be saved in [UTF-8](http://en.wikipedia.org/wiki/UTF-8) 'encoding'--a setting available as options in the 'save as' file-dialog.

Saving a file in UTF-8 is a necessary, important step, to preserve foreign-language characters, accent quotes, across machines for humans to read.

## Scripts

Clojure & Python scripts are available under `/scripts`.

Writing scripts in other languagse is trivial, given that YAML and Markdown are widely used and backed by robust parsers, in a language of your choice.

## Status

This is a working draft.

Currently, Zendown is being used by [Facjure](https://github.com/facjure/public-domain-poetry), to restore thousands of poems and stories.

## Acknowledgements

- [Ata Moharreri](https://twitter.com/AtaMoharreri), for curating 1600 poems in [Zendown]()
- [Sreeharsha Mudivarti](http://lexical.foobar.systems), for research

## Copyright & License

Copyright © 2014, Priyatam Mudivarti.

Zenup is free software, available under a BSD-style open source license. See the License page for more information.
