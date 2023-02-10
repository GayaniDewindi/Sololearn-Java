import java.util.Scanner;

public class Demo_2 {

        public static void clearConsole(){
            try{
                final String os=System.getProperty("os.name");
                if(os.contains("Windows")){
                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                }else{
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                }
            }catch(final Exception e){
                e.printStackTrace();
                //Handle any exceptions.
            }

        }
        //--------------- ID CHECK DUPLICATE-----------------------
        public static boolean checkDuplicate(String check,String[][] sidn){
            for (int i = 0; i < 100; i++){
                if(check.equals(sidn[i][0])){
                    return true;
                }
            }return false;
        }
        //================================ BEST IN PROGRAMING FUNDAMENTALS====================
        public static char bestInProgramingFundamentals(String[][] sidn, int[][] subm){
            Scanner input=new Scanner(System.in);
            char c = 'y';

            do{
                printLine();
                System.out.println("|\t\t\t\t BEST IN DATABASE MANAGEMENT SYSTEM \t\t\t\t\t\t|");
                printLine();
                System.out.println("+-----+-----------------+---------------+-----------+");
                System.out.println("|ID   |Name             |   PF Marks    |DBMS Marks |");
                System.out.println("+-----+-----------------+---------------+-----------+");
                int i = 0;
                do{
                    int index = subm[i][2];
                    System.out.println("|"+sidn[index][0]+" |"+sidn[index][1]+"\t\t|"+subm[i][0]+"\t\t|"+subm[i][1]+"\t    |");
                    i++;
                }while(subm[i][0] != 0);
                System.out.println("+-----+-----------------+---------------+-----------+");
                System.out.print("\nDo you went to back to main menu ? (y/n) : ");
                c = input.next().charAt(0);
                clearConsole();
            }while(c == 'n');
            c = 'n';
            return c;
        }
        //============= BEST IN DATASE MANAGEMENT =======================================
        public static char bestInDatabaseManagementSystem(String[][] sidn, int[][] subm){
            Scanner input=new Scanner(System.in);
            char c = 'y';

            do{
                printLine();
                System.out.println("|\t\t\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t\t\t|");
                printLine();
                System.out.println("+-----+-----------------+---------------+-----------+");
                System.out.println("|ID   |Name             | DBMS Marks    |  PF Marks |");
                System.out.println("+-----+-----------------+---------------+-----------+");
                int i = 0;
                do{
                    int index = (int)subm[i][2];
                    System.out.println("|"+sidn[index][0]+" |"+sidn[index][1]+"\t\t|"+subm[i][1]+"\t\t|"+subm[i][0]+"\t    |");
                    i++;
                }while(subm[i][0] != 0);
                System.out.println("+-----+-----------------+---------------+-----------+");
                System.out.print("\nDo you went to back to main menu ? (y/n) : ");
                c = input.next().charAt(0);
                clearConsole();
            }while(c == 'n');
            c = 'n';
            return c;
        }
        //-------------------- Sort ------------------------------
        public static int[][] sortDBMS(int[][] subm){
            for (int i = 0; i < subm.length; i++){
                for (int j = 0; j < subm.length-1; j++){
                    if(subm[j][1]<subm[j+1][1]){
                        int temp = subm[j][0];
                        int temp2= subm[j][1];
                        int temp3= subm[j][2];
                        subm[j][0]=subm[j+1][0];
                        subm[j][1]=subm[j+1][1];
                        subm[j][2]=subm[j+1][2];
                        subm[j+1][0]=temp;
                        subm[j+1][1]=temp2;
                        subm[j+1][2]=temp3;
                    }
                }
            }
            return subm;
        }
        //--------------- SORT --------------------------------
        public static int[][] sortPF (int[][] subm){
            for (int i = 0; i < subm.length; i++){
                for (int j = 0; j < subm.length-1; j++){
                    if(subm[j][0]<subm[j+1][0]){
                        int temp = subm[j][0];
                        int temp2= subm[j][1];
                        int temp3= subm[j][2];
                        subm[j][0]=subm[j+1][0];
                        subm[j][1]=subm[j+1][1];
                        subm[j][2]=subm[j+1][2];
                        subm[j+1][0]=temp;
                        subm[j+1][1]=temp2;
                        subm[j+1][2]=temp3;
                    }
                }
            }
            return subm;
        }
        //-------------- Total -----------------------
        public static int[][] sortTotal(int[][] subm){
            int[][] tot = new int[100][2];
            for (int i = 0; i < 100; i++){
                tot[i][0] = (subm [i][0] +subm[i][1]);
                tot[i][1] = subm [i][2];
            }
            for(int i=0; i<tot.length; i++){
                for(int j=0; j<tot.length-1; j++){
                    if(tot[j][0]<tot[j+1][0]){
                        int temp=tot[j][0];
                        int temp2=tot[j][1];
                        tot[j][0]=tot[j+1][0];
                        tot[j][1]=tot[j+1][1];
                        tot[j+1][0]=temp;
                        tot[j+1][1]=temp2;
                    }
                }
            }
            return tot;
        }

        //==================== PRINT STUDENDE RANKS ======================
        public static char printStudentRanks(String[][]sidn, int[][]tot){
            Scanner input=new Scanner(System.in);
            char c = 'y';

            while(c == 'y'){
                printLine();
                System.out.println("|\t\t\t\t\t\tPRINT STUDENT RANKS\t\t\t\t\t\t|");
                printLine();
                System.out.println();
                System.out.println("+-----+-----+-------------------+---------------+-----------+");
                System.out.println("|Rank |ID   |Name               |Total Marks    |Avg. Marks |");
                System.out.println("+-----+-----+-------------------+---------------+-----------+");
                int i = 0;
                do{
                    int index = (int)tot[i][1];
                    System.out.println("| "+(i+1)+"   |"+sidn[index][0]+" |"+sidn[index][1]+"\t\t|"+tot[i][0]+"\t\t|"+(tot[i][0]/2)+"\t    |");
                    i++;
                }while(tot[i][0] != 0);
                System.out.println("+-----+-----+-------------------+---------------+-----------+");
                System.out.print("\nDo you went to back to main menu ? (y/n) : ");
                c = input.next().charAt(0);
                clearConsole();
            }
            c = 'n';
            return c;
        }

        //=================== CHECKINDE ============================
        public static int checkIndex(int[][] tot, int check){
            for (int i = 0; i < 100; i++){
                if(check == tot[i][1]){
                    return i;
                }
            }
            return 0 ;
        }

        //===================== RANK  chak method ============================
        public static String rank(int[][] tot,int x){

            int count=0;
            for (int i = 0; i < tot.length; i++){
                if(tot[i][0] > 0 ){
                    count++;
                }
            }
            String rank = count==100 ? "last" : x==1 ? "first" : x==2 ? "second" : x==3 ? "third" : x==21 ? (x+"st") : x==22 ? (x+"nd") : x==23 ? (x+"rd") : x==31 ? (x+"st") : x==32 ? (x+"nd") : x==33 ? (x+"rd") : x==41 ? (x+"st") : x==42 ? (x+"nd") : x==43 ? (x+"rd") : x==51 ? (x+"st") : x==52 ? (x+"nd") : x==53 ? (x+"rd") : x==61 ? (x+"st") : x==62 ? (x+"nd") : x==63 ? (x+"rd") : x==71 ? (x+"st") : x==72 ? (x+"nd") : x==73 ? (x+"rd") : x==81 ? (x+"st") : x==82 ? (x+"nd") : x==83 ? (x+"rd") : x==91 ? (x+"st") : x==92 ? (x+"nd") : x==93 ? (x+"rd") :(x+"th") ;
            return rank;
        }

        //======================== PRINT STUDENT DETAILS================================================
        public static char printStudentDetails(String[][] sidn, int[][] subm,int[][] tot){
            Scanner input = new Scanner(System.in);
            char c = 'y';
            int i = 0;
            while(c == 'y'){
                printLine();
                System.out.println("|\t\t\t\t\t\tPRINT STUDENT DETAILS\t\t\t\t\t\t|");
                printLine();
                System.out.println("");
                System.out.print("Enter Student ID     : ");
                String tid = input.next();
                boolean b = false;
                for (i = 0; i < 100; i++){
                    if(tid.equals(sidn[i][0])){
                        b = true;
                        break;
                    }
                }
                if(b){
                    System.out.println("Student name         : "+sidn[i][1]+"\n");
                    int j = 0;
                    for (j = 0; j < subm.length; j++){
                        if(subm[j][2] == i){
                            break;
                        }
                    }
                    if(subm[j][0] > 0 | subm[j][1] > 0){
                        int x = checkIndex(tot,i);
                        x++;
                        String R = rank(tot,x);

                        double total = subm[j][0]+subm[j][1];
                        System.out.println("*-----------------------------------+---------------+");
                        System.out.println("|Programming Fundamentals Marks     |\t\t"+subm[j][0]+"|");
                        System.out.println("|Database Management System Marks   |\t\t"+subm[j][1]+"|");
                        System.out.println("|Total Marks                        |\t\t"+total+"|");
                        System.out.println("|Avg. Marks                         |\t\t"+total/2+"|");
                        System.out.println("|Rank                               |\t\t"+x+"("+R+")"+"|");
                        System.out.println("+-----------------------------------+---------------+\n\nDo you went to search another student deatails ? (y/n) : ");

                        c = input.next().charAt(0);
                        System.out.println("");
                        clearConsole();
                    }else{
                        System.out.print("Marks yet to be added \nDo you went to search another student ? (y/n) : ");
                        c = input.next().charAt(0);
                        System.out.println("");
                        clearConsole();
                    }
                }else{
                    System.out.print("Invalid Student ID. Do you want to search again ? (y/n) : ");
                    c = input.next().charAt(0);
                    System.out.println("");
                    clearConsole();
                }
            }
            return c;
        }

        //====================== DELETE STUDENT=========================================
        public static char deleteStudent(String [][]sidn,int[][]subm){
            Scanner input=new Scanner(System.in);
            char c='y';
            int i=0;

            while(c=='y' | c=='Y'){
                printLine();
                System.out.println("|\t\t\t\t\t\tDELETE STUDENT\t\t\t\t\t\t\t|");
                printLine();
                System.out.print("Enter Student ID : ");
                String tid=input.next();
                boolean b = false;
                for (i = 0; i < 100; i++){
                    if(tid.equals(sidn[i][0])){
                        b = true;break;
                    }
                }
                if(b){
                    sidn[i][0] = null;
                    sidn[i][1] = null;
                    subm[i][0] = 0;
                    subm[i][1] = 0;
                    subm[i][2] = 0;
                    System.out.print("Student has been deleted successfully.\nDo you want to delete another student? (y/n) : ");
                    c = input.next().charAt(0);
                    System.out.println("");
                    clearConsole();
                }else{
                    System.out.print("Invalid Student ID. Do you want to search again ? (y/n) : ");
                    c = input.next().charAt(0);
                    System.out.println("");
                    clearConsole();
                }
            }
            return c;

        }
        //====================== UPDATE MARKS =================================================
        public static char updateMarks(int[][]subm,String[][]sidn){
            Scanner input=new Scanner(System.in);
            char c='y';
            while(c=='y' | c=='Y'){
                printLine();
                System.out.println("|\t\t\t\t\t\t UPDATE MARKS \t\t\t\t\t|");
                printLine();
                System.out.print("Enter Student ID : ");
                String tid=input.next();
                boolean b=checkDuplicate(tid,sidn);
                int i = 0;
                for (i=0; i < sidn.length; i++){
                    if(tid.equals(sidn[i][0])){
                        break;
                    }
                }
                if(b){
                    System.out.println("Student name         : "+sidn[i][1]+"\n");
                    int j = 0;
                    for (j = 0; j < subm.length; j++){
                        if(subm[j][2] == i){
                            break;
                        }
                    }
                    if(subm[j][0] > 0 | subm[j][1] > 0){
                        System.out.println("Programming Fundamentals Marks      : "+subm[j][0]);
                        System.out.println("Database Management Systems Marks   : "+subm[j][1]+"\n");
                        boolean bm=true;
                        L11:while(bm){
                            System.out.print("Enter new Programming Fundamentals Marks      : ");
                            int pm=input.nextInt();
                            if(pm>=0 && pm<=100){
                                subm[j][0] = pm;
                                b=false;
                                break L11;
                            }else{
                                System.out.println("Invalid marks, please enter correct marks.");
                            }
                        }
                        bm=true;
                        L22:while(bm){
                            System.out.print("Enter new Database Management Systems Marks   : ");
                            int dm=input.nextInt();
                            if(dm>=0 && dm<=100){
                                subm[j][1] = dm;
                                b=false;
                                break L22;
                            }else{
                                System.out.println("Invalid marks, please enter correct marks.");
                            }
                        }
                        System.out.print("Marks have benn added.\n Do you went to add marks for another student ? (y/n) : ");
                        c = input.next().charAt(0);
                        System.out.println("");
                        clearConsole();
                    }else{
                        System.out.print("This Student's marks yet to be added \nDo you went to add marks for another student ? (y/n) : ");
                        c = input.next().charAt(0);
                        System.out.println("");
                        clearConsole();
                    }
                }else{
                    System.out.print("Invalid Student ID. Do you want to search again ? (y/n) : ");
                    c = input.next().charAt(0);
                    System.out.println("");
                    clearConsole();
                }
            }


            return c;
        }
        //================ UPDATE STUDENT DETAILS================================================
        public static char updateStudentDetails(String[][] sidn){
            Scanner input=new Scanner(System.in);
            char c='y';
            while(c=='y' | c=='Y'){
                printLine();
                System.out.println("|\t\t\t\t\t\tUPDATE STUDENT DETAILS\t\t\t\t\t\t|");
                printLine();
                System.out.println();
                System.out.print("Enter Student ID : ");
                String tid=input.next();
                boolean b=checkDuplicate(tid,sidn);
                int i = 0;
                for (i=0; i < sidn.length; i++){
                    if(tid.equals(sidn[i][0])){
                        break;
                    }
                }
                if(b){
                    System.out.println("Student name         : "+sidn[i][1]+"\n");
                    System.out.print("Enter the new Student Name   : ");
                    sidn[i][1] =input.next();
                    System.out.print("Student details has been updated succesfully.\nDo you went to update another student details? : (y/n) : ");
                    c= input.next().charAt(0);
                    System.out.println("");
                    clearConsole();
                }else{
                    System.out.print("Invalid Student ID. Do you want to search again ? (y/n) : ");
                    c= input.next().charAt(0);
                    System.out.println("");
                    clearConsole();
                }

            }return c;
        }
        //========================= ADD MARKS ======================================================
        public static int[][] addMarks(String[][] sidn,int[][] subm){
            Scanner input=new Scanner(System.in);
            char yes='Y';
            while(yes=='Y'|yes=='y'){
                printLine();
                System.out.println("|\t\t\t\t\t\t ADD  MARKS \t\t\t\t\t\t\t|");
                printLine();
                System.out.println();
                System.out.print("Enter Student ID : ");
                String tempid=input.next();
                boolean h=true;

                int i=0;
                for (i = 0; i < 100; i++){
                    if(tempid.equals(sidn[i][0])){
                        h=false;
                        break;
                    }
                }
                if(h){
                    System.out.print("Invalied Student ID. Do you want to Search again ? [Y/N] : ");
                    yes=input.next().charAt(0);
                }else{
                    if(subm[i][0]==0 && subm[i][1]==0){
                        System.out.print("Student name	: "+sidn[i][1]+"\n");
                        boolean o=true;
                        while(o){
                            System.out.print("Programing Fundamentals marks : ");
                            int pm =input.nextInt();
                            if(pm>=0 && pm<=100){
                                subm[i][0]=pm;
                                o=false;
                            }else{
                                System.out.println("Invalied marks! Please enter correct marks.");
                            }
                        }
                        System.out.print("Database Managment System marks : ");
                        int db =input.nextInt();
                        if(db>=0 && db<=100){
                            subm[i][1]=db;
                            System.out.print("Marks have benn added. Do you went to add marks for another student ? (y/n) : ");
                            yes=input.next().charAt(0);
                        }else{
                            System.out.println("Invalied marks! Please enter correct marks.");
                        }

                    }else{
                        System.out.print("This student's marks have been already added.\nIf you went to update the marks, please use [4] update marks option. \n\nDo you went to add marks for another Student ? (y/n) : ");
                        yes=input.next().charAt(0);
                    }
                }
                clearConsole();
            }return subm;

        }

        //================== ADD NEW STUDENT WITH MARKS ===================================================
        public static int addNewStudentWithMarks(String[][] sidn,int subm[][],int i){
            Scanner input=new Scanner(System.in);
            char loop='Y';
            String check;
            while(loop=='Y'|loop=='y'){
                printLine();
                System.out.println("|\t\t\t\t\t ADD  Student With Marks \t\t\t\t\t\t|");
                printLine();
                System.out.println();
                System.out.print("Enter Student ID : ");
                check=input.next();
                boolean b=checkDuplicate(check,sidn);
                while(b){

                    System.out.println("Already inserted ID");
                    System.out.println("");
                    System.out.print("Enter Student ID : ");
                    check=input.next();
                    b=checkDuplicate(check,sidn);

                }

                sidn[i][0]=check;
                System.out.print("Enter Student Name : ");
                sidn[i][1]=input.next();
                System.out.print("Enter Programing Fundamentals marks : ");
                int pf=input.nextInt();

                while(pf<0|pf>100){
                    System.out.print("Invalid marks. Please enter correct marks");
                    System.out.print("Enter Programing Fundamentals marks : ");
                    pf=input.nextInt();
                }
                subm[i][0]=pf;
                System.out.print("Enter Database Managment marks : ");
                int db=input.nextInt();

                while(db<0|db>100){
                    System.out.print("Invalid marks. Please enter correct marks");
                    System.out.print("Enter Database Managment marks : ");
                    db=input.nextInt();
                }
                subm[i][1]=db;
                System.out.print("Student has been added succesfully. Do you want to add a new student (Y/N)");
                subm[i][2]=i;
                i++;
                loop=input.next().charAt(0);
                clearConsole();
            }return i;

        }
        //==================== ADD NEW STUDENT =====================================================
        public static int addNewStudent(String[][]sidn,int i,int[][]subm){
            Scanner input=new Scanner(System.in);
            char loop='Y';
            String check;
            while(loop=='Y'|loop=='y'){
                printLine();
                System.out.println("|\t\t\t\t\t\t ADD  NEW STUDENT \t\t\t\t\t\t|");
                printLine();
                System.out.println();
                System.out.print("Enter Student ID : ");
                check=input.next();
                boolean b=checkDuplicate(check,sidn);
                while(b){
                    System.out.println("Already inserted ID");
                    System.out.println("");
                    System.out.print("Enter Student ID : ");
                    check=input.next();
                    b=checkDuplicate(check,sidn);

                }
                sidn[i][0]=check;
                System.out.print("Enter Student Name : ");
                sidn[i][1]=input.next();
                subm[i][2]=i;
                i++;
                System.out.print("Student has been added succesfully. Do you want to add a new student (Y/N)");
                loop=input.next().charAt(0);
                clearConsole();
            }return i;
        }

        //===================== Hadline Print Topic Lines=================================//
        public static void printLine(){
            for(int i=0; i<115;i++){
                System.out.print("-");
            }
            System.out.println();
        }

        //================== Main Method =============================
        public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            String[][] sidn=new String[100][2];
            int[][] subm=new int[100][3];
            int[][] tot=new int[100][2];
            char loop='N';
            int i=0;
            do{
                printLine();
                System.out.println("|\t\t\t\t WELCOME TO GDSE MARKS MANAGEMENT SYSTEM  \t\t\t\t\t|");
                printLine();
                System.out.println(" [1] Add New Student                     [2] Add New Student With Marks ");
                System.out.println(" [3] Add Marks                           [4] Update Student Details");
                System.out.println(" [5] Update Marks                        [6] Delete Student");
                System.out.println(" [7] Print Student Details               [8] Print Student Ranks");
                System.out.println(" [9] Best in Programming Fundamentals    [10] Best in Database Management System");
                System.out.println();
                System.out.print(" Enter an option to continue: ");
                int option = input.nextInt();
                switch(option){
                    case 1:
                        clearConsole();
                        i=addNewStudent(sidn,i,subm); break;
                    case 2:
                        clearConsole();
                        i=addNewStudentWithMarks(sidn,subm,i);break;
                    case 3:
                        clearConsole();
                        subm=addMarks(sidn,subm);break;
                    case 4:
                        clearConsole();
                        loop=updateStudentDetails(sidn);break;
                    case 5:
                        clearConsole();
                        loop=updateMarks(subm,sidn);break;
                    case 6:
                        clearConsole();
                        loop=deleteStudent(sidn,subm);break;
                    case 7:
                        clearConsole();
                        tot = sortTotal(subm);
                        printStudentDetails(sidn,subm,tot);break;
                    case 8:
                        clearConsole();
                        tot = sortTotal(subm);
                        printStudentRanks(sidn,tot);break;
                    case 9:
                        clearConsole();
                        subm = sortPF(subm);
                        loop=bestInProgramingFundamentals(sidn,subm);break;
                    case 10:
                        clearConsole();
                        subm = sortDBMS(subm);
                        loop=bestInDatabaseManagementSystem(sidn,subm);


                }
            }while(loop=='N'|loop=='n');
        }



}
