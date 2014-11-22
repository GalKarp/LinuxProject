#!/usr/bin/perl

$path = $ARGV[0];
@files = glob("$path/*");
for($i=0; $i<@files; $i++) {
	print $files[$i]."\n";
}

print "\n";
