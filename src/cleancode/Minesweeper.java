/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleancode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Minesweeper {
   public List<int[]> getThem() {
   List<int[]> list1 = new ArrayList<int[]>();
       Iterable<int[]> theList = null;
   for (int[] x : theList)
   if (x[0] == 4)
   list1.add(x);
   return list1;
   } 
}
