You will be creating a program that merges two arrays of positive (greater than 0) integers. 
Your program will accept each array as input from the keyboard. 
You do not know how many values will be entered, but you can assume each array will have a maximum length of 10,000 elements. 
To stop entering values enter zero or a negative number. 

You should disregard any non-positive numbers input and not store these in the array.

The elements of the two input arrays should be in increasing order, but the user doesn't know that; You will need to sort it. 
Each array element must have a value that is greater than or equal to the previous element value. 
An array may contain repeated elements.

AFTER the two arrays have been input and sorted, 
your task is to merge the two input arrays into a new array with all elements in order (lowest to highest). 
Print out each of the original arrays entered, followed by the merged array.

For legibility reasons, your program must output the arrays with exactly one space between each of the numbers.

Sample Run 1:

    Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit
    3
    3
    5
    6
    8
    9
    -1

Enter the values for the second array, up to 10000 values, enter zero or a negative number to quit
    3
    4
    5
    6
    -5

    First Array:
    3 3 5 6 8 9

    Second Array:
    3 4 5 6

    Merged Array:
    3 3 3 4 5 5 6 6 8 9

Sample Run 2:

    Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit
    4
    5
    7
    2
    -1

    Enter the values for the second array, up to 10000 values, enter zero or a negative number to quit
    3
    3
    3
    3
    3
    3
    0


    First Array:
    4 5 7 2

    Second Array:
    3 3 3 3 3 3

    Merged Array:
    2 3 3 3 3 3 3 4 5 7
