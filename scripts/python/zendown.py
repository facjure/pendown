#!/usr/bin/env python
"""
    Script to convert poems & stories written in Zenup to HTML

    usage:
        zendown.py <folder-to-zenup-files>

    copyright:
        (c) 2014 by Priyatam Mudivarti
    license:
        BSD-style License; see LICENSE for more details.
"""

import sys
import os
import yaml
import markdown as md
import argparse


def load(dir_loc):
    """Create a dictionary for retrieving content's raw body, metadata"""
    data = []
    for fname in os.listdir(dir_loc):
        if fname.endswith('.md') or fname.endswith('.txt'):
            try:
                meta, raw = read_contents(dir_loc, fname)
                content = {
                    "name": meta.get("_type", "contents") + "/" + fname,
                    "original": raw,
                    "html": md.markdown(post['body']),
                    "modified_date": format_date(dir_loc + os.sep + fname)
                }
                content.update(meta)
                data.append(content)
            except:
                logger.error("Error while reading contents: %s: %s" % (fname, sys.exc_info()[0]))
        else:
            logger.warning("Incorrect Extension: %s" % fname)
    return data


def read_contents(directory, fname):
    """Splits subdir/fname into a tuple of YAML and raw content"""
    with open(directory + os.sep + fname, "r", "utf-8") as fin:
        yaml_and_raw = fin.read().split('\n---\n')
        if len(yaml_and_raw) == 1:
            return {}, yaml_and_raw[0]
        else:
            return yaml.load(yaml_and_raw[0]), yaml_and_raw[1]


def format_date(fname):
    """Formats to internal date format"""
    return datetime.strptime(time.ctime(os.path.getmtime(fname)), "%a %b %d %H:%M:%S %Y").strftime("%m-%d-%y")


def parse_cmdline_args(args):
    """Parse command line args"""
    parser = argparse.ArgumentParser(description='Zenup: A minimalist static site generator and router.')
    parser.add_argument("root", type=str,
                        help='path to root project folder containing zenup files')
    return parser.parse_args(args[1:])

if __name__ == '__main__':
    args = parse_cmdline_args(sys.argv)
    if args.root:
        load(args)
