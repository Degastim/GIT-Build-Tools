package com.epam;

import com.epam.util.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        boolean result = true;
        for (String string : str) {
            result &= stringUtils.isPositiveNumber(string);
        }
        return result;
    }
}
