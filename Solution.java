package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        FileInputStream input = new FileInputStream(string);

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        while(input.available() > 0)
        {
            int num = input.read();
            list.add(num);
        }
        input.close();
        for (int i = 0; i < list.size(); i++)
        {
            int sum = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    sum++;
                }map.put(list.get(i), sum);

            }
        }
        if(!map.isEmpty()){
            int max = Collections.max(map.values());
            for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
                if(pair.getValue() == max)
                    System.out.print(pair.getKey() + " ");
            }}

    }
}
