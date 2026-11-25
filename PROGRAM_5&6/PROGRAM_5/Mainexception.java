import java.util.Scanner;
class SeatAlreadyBookedException extends Exception
{
SeatAlreadyBookedException(String msg)
{super(msg);
}
}
class Reservation 
{
boolean seats[]=new boolean [10];
void reserveseats(int seatno)
throws SeatAlreadyBookedException
{
if (seatno<1||seatno>10)
{throw new IllegalArgumentException("enter valid n");
}
if (seats[seatno-1])
{throw new SeatAlreadyBookedException("seat already booked");
}
seats[seatno-1]=true;
System.out.println("reservation complete");
}
}
class Mainexception
{
public static void main (String[] args)
{
Scanner sc=new Scanner (System.in);
Reservation r =new Reservation();
r.seats[2]=true;
try
{
System.out.println("enter the seatno");
int seatno=sc.nextInt();
r.reserveseats(seatno);
}
catch(SeatAlreadyBookedException e)
{
System.out.println(e.getMessage());
}
catch(IllegalArgumentException e)
{
System.out.println(e.getMessage());
}

catch(java.util.InputMismatchException e)
{
System.out.println("invalid");
}
finally
{
System.out.println("transaction complete");
sc.close();
}
}
}



