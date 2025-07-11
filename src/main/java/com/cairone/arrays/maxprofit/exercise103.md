Array: Max Profit ( ** Interview Question)
You are tasked with implementing a method, maxProfit that takes an array of integers representing the price of a given stock on different days.

The method should determine the maximum profit that can be made by buying and selling the stock once. Note that you must buy before you can sell.



Method Signature

public static int maxProfit(int[] prices)


This method takes as input an array of integers prices and returns an integer.



Input

An array of integers prices where each element in the array is an integer representing the price of the stock for a specific day, and where the element's index corresponds to the day number.



Output

Returns an integer that is the maximum profit possible. If no profit can be made, the method should return 0.



Example

For example, if the input array is {7, 1, 5, 3, 6, 4}, the method should return 5. The maximum profit can be achieved by buying the stock on day 2 when the price is 1 and selling on day 5 when the price is 6. Hence, the maximum profit is 6 - 1 = 5.



Constraints

You may not engage in multiple transactions (i.e., you must sell the stock before you can buy again).

You may not buy and sell on the same day.
