import java.util.*;
class NewClass
{
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Welcome to Siena's Secret Streams, type: open , to open a file or type: hide , to hide one or type: quit , to end this program");
        String command = sc.next();
        String file1, file2, prog;
        while(!command.equals("quit")){
            if(command.equals("hide")){
                System.out.println("Type in the full name of the host file:");
                file1 = sc.next();
                System.out.println("Type in the full name of the file that is to be hidden:");
                file2 = sc.next();        
                try
                { 
                    //runs commands on cmd
                    Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && type " + file2 + " > " + file1+":"+file2+" && del /f "+file2+"\"");

                }
                catch (Exception e)
                {
                    System.out.println("error");
                    e.printStackTrace();
                }
                System.out.println("Done");
            }
            else if(command.equals("open")){
                System.out.println("Type in the name of the program that will be used to open the file (.exe files must be in same folder):");
                prog = sc.next();
                System.out.println("Type in the full name of the host file:");
                file1 = sc.next();
                System.out.println("Type in the full name of the file that was hidden:");
                file2 = sc.next(); 
                try
                { 
                    //runs commands on cmd
                    Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir &&" + prog + " " + file1 + ":" + file2 +"\"");

                }
                catch (Exception e)
                {
                    System.out.println("error");
                    e.printStackTrace();
                }
                System.out.println("Done");
                
            }
            else if(command.equals("quit")){
                System.exit(0);}
            else{
                System.out.println("Command not recognized,type: open , to open a file or type: hide , to hide one or type: quit , to end this program");
        
        }
    }
}
}