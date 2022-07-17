//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456
package String_Manipulation;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingTransactionId {
    public static void main(String[] args) {
        String str="<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        //first matched the "TXN" into capturing group 1-([A-Z]{3})
        //Then matched the remaining digits into capturing group 2- ([\d]+)
        String pattern="([A-Z]{3})([\\d]+)";
        // Created a Pattern object
        Pattern r = Pattern.compile(pattern);
        // Created Matcher object
        Matcher m = r.matcher(str);
        // if pattern matched
        if (m.find( )) {
            System.out.println("Transaction ID: " + m.group(1)+m.group(2) );
        }
//        alternativeSolutionUsingReplaceAll(str);
//        naiveSolution(str);

    }
    public static void alternativeSolutionUsingReplaceAll(String str){
        //finding only digit by replaceAll
        String onlyDigit=str.replaceAll("[^\\d]"," ").trim();
        //        System.out.println(onlyDigit);
        String regex="[A-Z]{3}";
        Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(str);
        if(match.find()) {
            System.out.println("Transaction ID: "+match.group()+onlyDigit);
        }
    }
    public static void naiveSolution(String str){
        int index=str.indexOf("TXN");
        int index2=str.indexOf("</body>");
        System.out.println("Transaction ID: "+str.substring(index,index2-1));
    }

}
