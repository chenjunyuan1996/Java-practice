/*
66. 加一
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

链接: https://leetcode-cn.com/problems/plus-one/
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
