# engch_java
methods that I edited/found useful and want to keep for easy reusing
# How to use: 
```
import Engch.Library;
Library ec = new Library();
```
### public double NanoTimeSeedSecureRandom(double range)
using system time in nano second as seed for SecureRandom();\
return a random double from 0 to range
```
System.out.println(ec.NanoTimeSeedSecureRandom(100));
```
### public ImageIcon ImageIconScales(String imagePath, int width, int length) throws IOException
return a rescaled imageIcon 
```
```
