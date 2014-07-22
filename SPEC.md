# Zenup Spec

Zenup's  syntax is a combination of  YAML metadata and Content.

## METADATA

YAML, a humanly readable format, supports storing Metadata inline for describing the poem, informing humans and machines of the poem's semantic data for further analysis.

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

## CONTENT

**Plaintext**

By default all Zenup content is [Plain Text](http://en.wikipedia.org/wiki/Plain_text), still an excellent format supported by default in all editors. 

Many times poems require whitespace to be preserved "as-is"—a necessity to illustrate a poem's visual semantics and line endings. 

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

**Markdown**

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

We were driving along the road from Treguier to Kervanda. We passed at a smart trot between the hedges topping an earth wall on each side of the road; then at the foot of the steep ascent before Ploumar the horse dropped into a walk, and the driver jumped down heavily from the box. He flicked his whip and climbed the incline, stepping clumsily uphill by the side of the carriage, one hand on the footboard, his eyes on the ground. After a while he lifted his head, pointed up the road with the end of the whip, and said—_"The idiot!"_

…
```

## Edn

Coming soon.

## Other formats

While support for other plain-text formats like [asciidoc](http://www.methods.co.nz/asciidoc/) or [docbook](http://www.docbook.org) is possible, Zenup aims to keep things simple. 

For document conversions from popular formats, check out [Pandoc](http://johnmacfarlane.net/pandoc/)—an excellent opensource library.

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

Though tags are optional, a minimum of three tags are recommended.
