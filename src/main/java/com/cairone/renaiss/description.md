Any word that exactly reproduces the letters in another order is an anagram. In other words, X and Y are anagrams if by rearranging the letters of X, we can get Y using all the original letters of X exactly once. For example: SILENT and LISTEN are anagrams.

Your task is to write a code to determine whether two strings are anagrams or not.
Then use it to determine which of the word pairs in each line of the file 'Target_anagrams.txt' are anagrams and which are not.

Requirements:

1. The program should prompt the user to enter the filename of the text file they want to analyze.
2. The program must handle gracefully the cases for File Not Found and Empty File.
3. Display the result for each pair of words X,Y: Anagram or NotAnagram.
4. Display the total amount of anagrams found.

A simple solution would be to sort given strings. If the strings become equal after sorting, they are anagrams. This solution is far from being computationally optimal, you are expected  to provide a better solution.

The expected result is to find 25 anagrams in the file 'Target_anagrams.txt'
