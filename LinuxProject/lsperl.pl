#!/usr/bin/perl

my $dir = $ARGV[0];

opendir(openedDirectory, $dir);

while (my $currentFIle = readdir(openedDirectory)) {

next if ($currentFIle =~ m/^\./);
print "$currentFIle\n";
}
closedir(DIR);
exit 0;