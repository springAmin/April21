package com.homework.week1.day5;

import java.util.List;
import java.util.stream.Collectors;

public class A3String {
    /**
     * Returns back strings which are exactly 3 chars long,
     * and begging with lowercase a
     * @param in - List of Strings
     * @return
     */
    public static List<String> findString(List<String> in) {
        return in.stream().filter((i) -> (i.length() == 3 && i.charAt(0) == 'a')).collect(Collectors.toList());
    }

}
