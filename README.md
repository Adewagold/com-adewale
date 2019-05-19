# Java Utils class 
This class will contain different utils methods that will make development faster and ensure that your don't skip some important things while developing your software.

# Url Validator
<p>Checks if a String is not empty (""), not null and not whitespace and if it's a correct url format.</p>
it validates urls with or without www and also gives room to add optional port numbers
* <pre>
* ifUrlIsValid("http://122.345.567.121")           = true
* ifUrlIsValid("http://122.345.567.121:8080")      = true
* ifUrlIsValid("http://122.3425.567.121")          = false
* ifUrlIsValid("http://www.google.com.ng:")        = false
* ifUrlIsValid("https://www.google.com.eu:8080")   = true
* </pre>

@return <code>true</code> if it matches the normal url pattern and is not null or empty
