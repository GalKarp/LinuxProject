#!/usr/bin/perl
my $filename = $ARGV[0];
chmod 0444, $filename or die "Couldn't change the permission to $filename: $!";

exit 0;

