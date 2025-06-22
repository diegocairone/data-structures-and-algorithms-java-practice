Array: Find Longest String ( ** Interview Question)
Write a method that, given an array of strings, finds and returns the longest string in the array.

If there are multiple strings with the same maximum length, return the first one encountered.



Method Signature

public static String findLongestString(String[] stringList)


This method takes an array of strings stringList as input and returns a string.



Input

An array of strings stringList





Output

Returns a string that is the longest string in the input array. If multiple strings have the same length, it returns the first string encountered.



Example

For example, if the input array is {"apple", "banana", "kiwi", "pear"}, the method should return "banana" since "banana" is the longest string in the array.



Additional Notes

The implementation needs to consider the case where the string is empty "" as in test case 5. In this case, the empty string has the least length. If all the strings in the array are of the same length, the method will return the first string in the array.



Please ensure your solution handles these cases correctly.
