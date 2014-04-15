Zendown
=======

A markup for writing poetry on the browser.

Inspired by [Markdown](http://daringfireball.net/projects/markdown/) and [YAML](http://en.wikipedia.org/wiki/YAML).

## INTRODUCTION

Thousands of poems in the public domain live buried in libraries, archaic websites, and journals gone out of print. Emerging poets publish poetry online or print magazines where publishers save them in content management systems, programs that strip and lock poems in complex software.

We don't have an open format to share poetry on the web.

Zendown allows you to write poetry using an easy-to-read, easy-to-write, plain-text format. You can convert it to a [HTML5](http://en.wikipedia.org/wiki/HTML5) understood by modern browsers on desktop, mobile, and web.

Zendown is free software, available under a BSD-style open source license. It comprises of two things: 1) a plain text formatting syntax and 2) a tool written in Javascript-the language of the web, that converts the plain text formatting to HTML5. The goal is that poems should be publishable and restored as-is, as plain-text, before being consumed by content management systems. The best way to get a feel for the formatting syntax is simply to look at a Zenup-formatted poem, below.


```
---
title: You May Forget
author: Sappho
country: Greece
year: 600/500 bc
gender: female
tags:
-  time
-  love
-  lyric
-  memory
---
You may forget but
let me tell you
this: someone in
some future time
will think of us.

```

## SYNTAX

The syntax is inspired from Markdown and YAML. Unlike Markdown, Zenup preserves whitespace "as-is", a necessity to preserve the poem's visual semantics.

There are two parts to the syntax: poem and metadata.

**POEM**

[Plain Text](http://en.wikipedia.org/wiki/Plain_text) is still an excellent format supported by default in all editors.

```
Every time I say "joy," joyous thing,
you will know that I am talking about you,
for you are the joy of all joyous beauty
and the joy of all joyous and beautiful pleasures,
```

**METADATA**

YAML, a humanly readable format, supports storing metadata.

Metadata will be curated inline for describing the poem, informing humans and machines of the poem's semantic data for further analysis.

```
---
title: You May Forget
author: Sappho
country: Greece
year: 600/500 bc
gender: female
tags:
-  time
-  love
-  lyric
-  memory
---
```

Note the "space" after ":" and "-", `---` before and after the metadata.

Filenames are saved as:

`first-name-last-name-first-six-words-of-title.txt` OR
`first-name-last-name-first-six-words-of-opening-line.txt`.

Saving the file as .txt allows maximum compatibility across all editors.

**FORMATTING**

- `*italics*`
- `**bold**`
- `emdash--`

**RULES**

- A poem should have a title. If a title doesn't exist, the first or last line can be used as title.
- A poem should have an author's name (first, last, or both)
- Tags are optional, though a minimum of three tags are recommended.

## EDITORS

Plaintext format is supported by default in *all* major editors: notepad, textedit, [iAWriter](http://www.iawriter.com/mac/), MS Word, etc., However, there are two important steps:

1. Files must be saved with an extension ".txt"
2. Files must be saved in [UTF-8](http://en.wikipedia.org/wiki/UTF-8) 'encoding'--a setting available as options in the 'save as' file-dialog.

Saving a file in UTF-8 is a necessary, important step, to preserve foreign-language characters, accent quotes, across machines for humans to read.

## SCRIPTS

Zendown comes with free tools written in Javascript and Clojurescript, to convert poems from Zendown format to HTML5. A sample CSS is also provided for proofing. Writing tools in other languages is straight-forward, given that YAML and Plaintext are well-known formats.

## STATUS

This is a working draft.

Currently, Zendown is being used by [Poetroid](https://github.com/poetroid), an open platform to disover poetry together.

## ACKNOWLEDGEMENTS

Thank you, [Ata Moharreri](https://twitter.com/AtaMoharreri), for your feedback.

Thank you, Sreeharsha Mudivarti, for implementing the early prototypes.

## Copyright & License

Copyright © 2014, Priyatam Mudivarti.

Zendown is free software, available under a BSD-style open source license. See the License page for more information.
