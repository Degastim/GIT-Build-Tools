package com.epam.util;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        return isNumeric(str);
    }
}
