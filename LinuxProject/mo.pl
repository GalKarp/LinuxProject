#!/usr/bin/perl

open(MYINPUTFILE, "$ARGV[0]");
$num_of_lines = $ARGV[1];
$current_line=0;
while(<MYINPUTFILE>)
{
        my($line)=$_; 
        chomp($line);
        print "$line\n";

        if($num_of_lines==$current_line+1){
                last;
        }
        $current_line+=1;
}
