package org.example;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char character : text.toCharArray()) {
            countMap.put(character, countMap.getOrDefault(character, 0) + 1);
        }

        int result = 0;
        while (true) {
            if (countMap.getOrDefault('b', 0) >= 1 &&
                    countMap.getOrDefault('a', 0) >= 1 &&
                    countMap.getOrDefault('l', 0) >= 2 &&
                    countMap.getOrDefault('o', 0) >= 2 &&
                    countMap.getOrDefault('n', 0) >= 1) {
                result++;
                countMap.put('b', countMap.get('b') - 1);
                countMap.put('a', countMap.get('a') - 1);
                countMap.put('l', countMap.get('l') - 2);
                countMap.put('o', countMap.get('o') - 2);
                countMap.put('n', countMap.get('n') - 1);
            } else {
                break;
            }
        }

        return result;
    }
}
