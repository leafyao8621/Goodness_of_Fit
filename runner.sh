echo "break points file"
read bk
echo "data file"
read dt
echo "output file"
read opt
java Bin $bk $dt > "output/$opt"
