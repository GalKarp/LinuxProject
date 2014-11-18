#!/usr/bin/perl

$original_file = $ARGV[0];
$new_link_location = $ARGV[1];
$status = symlink($original_file, $new_link_location) ;
if( $status == 1 ){
  print"Symbolic Link created successfully\n";
}else{
  print"Error in creating symbolic link $!\n";
}

