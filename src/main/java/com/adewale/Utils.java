package com.adewale;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <ul>
 * <li><b>ifUrlIsValid/IsBlank</b>
 * - checks if a String contains text</li>
 * </ul>
 * <p>#ThreadSafe#</p>
 * @author Adewale.Adeleye
 * @author <a href="mailto:adewagold@gmail.com">Adewale Adeleye</a>
 * Created by adewale adeleye on 19/05/2019
 **/
public class Utils {
    public static final String PATTERN = "((http[s]?)(:\\/\\/)((([a-z]*[A-Z]*[0-9]*)([.][a-z]{2,}){1,3})|(([0-9]{3}.[0-9]{3}.[0-9]{3}.[0-9]{3})))([:]([0-9]{1,5}))?)";

    /**
     *  <p>Checks if a String is not empty (""), not null and not whitespace and if it's a correct url format.</p>
     * it validates urls with or without www and also gives room to add optional port numbers
     * <pre>
     * ifUrlIsValid("http://122.345.567.121")           = true
     * ifUrlIsValid("http://122.345.567.121:8080")      = true
     * ifUrlIsValid("http://122.3425.567.121")          = false
     * ifUrlIsValid("http://www.google.com.ng:")        = false
     * ifUrlIsValid("https://www.google.com.eu:8080")   = true
     * </pre>
     * @param str the String to validate if it's in the right format.
     * @return <code>true</code> if it matches the normal url pattern
     * and is not null or empty
     */
    public static Boolean ifUrlIsValid(String str){
        if(str==null || str.length()==0)
            return false;
        Pattern p =Pattern.compile(PATTERN);
        Matcher matcher = p.matcher(str);
        return matcher.matches();
    }

}
