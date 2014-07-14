Zenup
=====

A markup for writing poems and stories.

Inspired by [Jekyll blogs](http://jekyllrb.com/docs/home/), and composed of [YAML](http://en.wikipedia.org/wiki/YAML), [Markdown](http://daringfireball.net/projects/markdown/), or Plaintext.

## INTRODUCTION

Thousands of poems and stories in the public domain live buried in libraries, archaic websites, and journals gone out of print. Emerging poets and writers publish their literature online where magazines save them in content management systems, programs that strip and lock literature in complex software.

We don't have an open format to share literature on the web.

Zenup allows you to write poems and stories using an easy-to-read, easy-to-write, plain-text or markdown format, interchangeably. Scripts can then convert them to a [HTML5](http://en.wikipedia.org/wiki/HTML5) understood by modern browsers on desktop, mobile, and web. The goal is that poems and stories should be publishable and restored as-is, as plain-text, before being consumed by content management systems. 

Zenup is free software, available under a BSD-style open source license. 

## SYNTAX

The syntax is a combination of  YAML metadata and Content. 

### METADATA

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

### CONTENT

**Plaintext**

[Plain Text](http://en.wikipedia.org/wiki/Plain_text) is still an excellent format supported by default in all editors. Many times poems require whitespace to be preserved "as-is"—a necessity to illustrate a poem's visual semantics and line endings.

By default all Zenup content is plain-text.


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

Optionally, custom content types can be represented by specifying, `content_type` metadata.

```
---
content_type: markdown
title: The Idiots
author: Joseph Conrad
country: USA
year: 1896
publisher: The Savoy magazine
collection: Tales of Unrest
gender: male
tags:
	-  justice
	-  family
	-  suicide
	-  race
---

We were driving along the road from Treguier to Kervanda. We passed at a smart trot between the hedges topping an earth wall on each side of the road; then at the foot of the steep ascent before Ploumar the horse dropped into a walk, and the driver jumped down heavily from the box. He flicked his whip and climbed the incline, stepping clumsily uphill by the side of the carriage, one hand on the footboard, his eyes on the ground. After a while he lifted his head, pointed up the road with the end of the whip, and said—"The idiot!""

…

```

While support for other plain-text formats like [asciidoc](http://www.methods.co.nz/asciidoc/) or [docbook](http://www.docbook.org) is possible, Zenup aims to keep things simple.  For document conversions, check out [Pandoc](http://johnmacfarlane.net/pandoc/)—an excellent opensource library.

## RULES

For poems, filenames are saved as:

`first-name-last-name-first-six-words-of-title.txt` OR
`first-name-last-name-first-six-words-of-opening-line.txt`.

For stories, filenames are saved as:

`first-name-last-name-first-six-words-of-title.txt` 

Saving the file as .txt allows maximum compatibility across all editors.

Mandatory metadata include:
- title. If a title doesn't exist, the first or last line can be used as title.
- author's name (first, last, or both)

Thought tags are optional, a minimum of three tags are recommended.

## EDITORS

Plaintext format is supported by default in *all* major editors: notepad, textedit, [iAWriter](http://www.iawriter.com/mac/), MS Word, etc., However, there are two important steps:

1. Files must be saved with an extension ".txt"
2. Files must be saved in [UTF-8](http://en.wikipedia.org/wiki/UTF-8) 'encoding'--a setting available as options in the 'save as' file-dialog.

Saving a file in UTF-8 is a necessary, important step, to preserve foreign-language characters, accent quotes, across machines for humans to read.

## SCRIPTS

A default converter in Javascript will be provided.

Converting Zenup to HTML5 is trivial, given that YAML, Plaintext, and Markdown are currently backed by robust open libraries.

## STATUS

This is a working draft.

Currently, Zenup is being used by [Facjure](https://github.com/facjure/public-domain-poetry), to restore thousands of poems and stories.

## CREDITS

- [Ata Moharreri](https://twitter.com/AtaMoharreri), for your initial feedback
- [Sreeharsha Mudivarti](http://lexical.foobar.systems), for supporting early prototypes

## Copyright & License

Copyright © 2014, Priyatam Mudivarti.

Zenup is free software, available under a BSD-style open source license. See the License page for more information.
