Adaptor:
---------
Examples:
- java.io.InputStreamReader and java.io.OutputStreamWriter 
- These classes adapt existing InputStream/OutputStream Object to a Reader/Writer interface.
- WeatherUI(zipCode)->WeatherAdaptor(findTemp(zipCode))->WeatherFinder(find(city))
- 