
import java.util.Scanner;

class Emailoperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the email id:");
        String e1 = sc.nextLine();

        System.out.println("Length of email id: " + e1.length());

        int pos = e1.indexOf('@');

        String usn1 = e1.substring(0, pos);
        System.out.println("Username is: " + usn1);

        String d = e1.substring(pos + 1);

        if (d.equals("bmsce.ac.in"))
        {
            System.out.println("Correct domain");
        }
        else
        {
            System.out.println("Incorrect domain");
        }

        System.out.println("Lowercase: " + e1.toLowerCase());

        System.out.println("Enter prefix:");
        String pre = sc.nextLine();

        if (e1.startsWith(pre))
        {
            System.out.println("Correct prefix");
        }
        else
        {
            System.out.println("Incorrect prefix");
        }

        if (e1.endsWith("bmsce.ac.in"))
        {
            System.out.println("Correct suffix");
        }
        else
        {
            System.out.println("Incorrect suffix");
        }

        String up = e1.replace("bmsce.ac.in", "cse.bmsce.ac.in");
        System.out.println("String after replacing is: " + up);

        if (e1.contains("cse"))
        {
            System.out.println("Contains cse");
        }
        else
        {
            System.out.println("Does not contain CSE");
        }

        System.out.println("After trim: " + e1.trim());

        System.out.println("Enter the other email id:");
        String e2 = sc.nextLine();

        if (e1.equals(e2))
        {
            System.out.println("Both the emails are equal");
        }
        else
        {
            System.out.println("Both the emails are not equal");
        }

        sc.close();
    }
}
