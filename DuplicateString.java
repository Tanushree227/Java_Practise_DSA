import java.util.*;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        boolean notDuplicate = false;
        for(int i = 0; i < ch.length; i++)
        {
            boolean isDuplicate = false;
            for(int j = i + 1; j < ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate)
            {
                System.out.println(ch[i]);
                notDuplicate = true;
            }
        }
        if(!notDuplicate)
        {
            System.out.println("No duplicate characters found.");
        }
    }
}
