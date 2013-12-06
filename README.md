Zenup
=====

A markup for writing poetry on the browser.

Inspired by [Markdown](http://daringfireball.net/projects/markdown/) and [YAML](http://en.wikipedia.org/wiki/YAML).

## INTRODUCTION

Thousands of public domain poems live buried in libraries, archaic websites, and journals gone out of print. Emerging poets publish poems online and publishers save them in content management systems, programs that strip poems and lock them in complex software. We don't have an open format to publish poetry on the web.

Zenup allows you to write poetry using an easy-to-read, easy-to-write plain text format, and then convert it to a [language](http://en.wikipedia.org/wiki/HTML5) understood by modern browsers on desktop, mobile, and web.

Zenup is free software, available under a BSD-style open source license. It is made of two things: 1) a plain text formatting syntax and 2) a tool written in Javascript (the language of the web) to convert plain text format to HTML5. The goal is that poems should be publishable as-is, as plain text, without looking like it’s been consumed by content management systems. 

The best way to get a feel for the  formatting syntax is simply to look at a Zenup-formatted poem, below.


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

[Plain Text](http://en.wikipedia.org/wiki/Plain_text) is still an excellent format supported by all editors by default.

```
Every time I say "joy," joyous thing,
you will know that I am talking about you,
for you are the joy of all joyous beauty
and the joy of all joyous and beautiful pleasures,
```

**METADATA**

YAML, a humanly readable format, supports storing metadata inline.

Metadata will be curated *inline* for describing the poem,  to inform humans and machines of semantic data for further analysis.

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

Note the "space" after ":" and "-". Note the `---` before and after the metadata. 

Filenames are saved as `first-name-last-name-first-six-words-of-title.txt` OR `first-name-last-name-first-six-words-of-opening-line.txt`. 

An optional `.zenup` file extension can be used for tools that understands this format.

**FORMATTING**

- `*italics*`
- `**bold**`
- `emdash--`

**RULES**

- A poem should have a title. If a title doesn't exist, the first or last line can be used as title.
- A poem should have an author's name (first, last, or both)
- Tags are optional, though a minimum of three tags are recommended.

## EDITORS

Plaintext format is supported by default in *all* major editors: notepad, textedit, [iAWriter](http://www.iawriter.com/mac/), MS Word, etc., However, there are two important steps

1. Files must be saved with an extension ".txt" or ".zenup"
1. Files must be saved in [UTF-8](http://en.wikipedia.org/wiki/UTF-8) 'encoding'-- a setting available as options in the 'save as' file-dialog. 

Saving a file in UTF-8 is a necessary, important step to preserve foreign-language characters, accent quotes, across machines so humands can read.

## SCRIPTS

Zenup comes with free tools written in Python and Javascript, to convert poems from Zenup format to HTML5 with CSS3, or a printer-friendly page.

Writing a tool in other languages should be trivial, given that YAML and Plaintext are standard formats.

## STATUS

This is a working draft.

Currently, Zenup is being used by [Poetroid](https://github.com/poetroid), an open platform to disover poetry together. **35,000 poems** were restored from the public domain using this format.

## ACKNOWLEDGEMENTS

Thank you, [Ata Moharreri](https://twitter.com/AtaMoharreri), for your feedback in moving poetry forward.

Thank you, Sreeharsha Mudivarti, for implementing the early prototypes.

## Copyright & License

Copyright © 2013, Priyatam Mudivarti.

Zenup is free software, available under a BSD-style open source license. See the License page for more information.
