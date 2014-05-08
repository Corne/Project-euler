/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.four;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Corne
 */
public class AssignmentFour {

    public Long findLargestPalindrome(int digits){
        return PalinDromeUtil.findFactorPalinDromes(digits).last();
    }
}
