//7. Find out how many images are in the given array:
//["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
package String_Manipulation;

import java.util.Arrays;
import java.util.HashMap;

public class ImageFileCount {
    public static void main(String[] args) {
        String []str={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        HashMap <String,String> hashMap=new HashMap<String,String>();
        for (String s:
             str) {
            //splitting the extension and filename by split()
            String []arr=s.split("\\.");
//            System.out.println(Arrays.toString(arr));
            //putting filenames as key and extensions as values inside hashmap
            hashMap.put(arr[0],arr[1]);
        }
        System.out.println("Hashmap "+hashMap);
        int count =0;
        //extracting only the extensions by looping over hashmap values().
        for (String extension:
             hashMap.values()) {
            if(extension.equals("jpg")||extension.equals("png")){
                count+=1;
            }

        }
        System.out.println("Number of image files: "+count);
    }
}
