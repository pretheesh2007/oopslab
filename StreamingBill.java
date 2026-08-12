import java.util.Scanner;
class Subscriber{
private int subscriberID;
private String subscriberName;
private boolean prevMonthStatus;
private boolean currMonthStatus;
private String subscriberType;
//constructor
public Subscriber(int id,String name,boolean prevStatus,boolean currStatus,String type){
this.subscriberID=id;
this.subscriberName=name;
this.prevMonthStatus=prevStatus;
this.currMonthStatus=currStatus;
this.subscriberType=type;
}
//method to calculate the bill
public int calculateBill(){
if(!currMonthStatus){
return 0;
//no charge if subbscription inactive
}
switch(subscriberType.toLowerCase()){
case"basic":
return 199;
case"standard":
return 499;
case"premium":
return 799;
default:
return 0;
}
}
//Method to display bill
public void displayBill(){
System.out.println("------Monthly Subscription Bill------");
System.out.println("subscriber ID:"+subscriberID);
System.out.println("subscriber Name:"+subscriberName);
System.out.println("previousStatus:"+(prevMonthStatus?"Active":"Inactive"));
System.out.println("currentStatus:"+(currMonthStatus?"Active":"Inactive"));
System.out.println("subscriberType:"+subscriberType);
System.out.println("Monthly Charge: Rs."+calculateBill());
System.out.println("-----------------------------------------------");
}
}
public class StreamingBill{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//input subscriber details
System.out.print("Enter Subscriber ID:");
int id=sc.nextInt();
sc.nextLine();
// consume newline
System.out.print("Enter Subscriber Name:");
String name=sc.nextLine();
System.out.print("was subscriber active last month?(true/false):");
boolean prevStatus=sc.nextBoolean();
System.out.print("Is subscription active this month?(true/false):");
boolean currStatus=sc.nextBoolean();
sc.nextLine();
//consume newline
System.out.print("Enter Subscription Type(Basic/Standard/premium):");
String type=sc.nextLine();
//create subscriber object
Subscriber sub= new Subscriber(id,name,prevStatus,currStatus,type);
//display bill
sub.displayBill();
sc.close();
}
}

