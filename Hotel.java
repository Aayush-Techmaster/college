import java.util.*;
public class Hotel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Rooms[][] =new int [3][4];
        
while(true){
    System.out.println("1. Check Available Rooms");
    System.out.println("2. Book a Room");
    System.out.println("3. Exit");
    System.out.println();
    System.out.print("Enter choice:");
    int choice ;
    choice=sc.nextInt();
    
    switch(choice){
        case 1:
            System.out.println("Room Status : ");
            for(int i =0;i<Rooms.length;i++){
            for(int j =0 ;j<Rooms[i].length;j++){
                System.out.print(Rooms[i][j]+" ");
            }
            System.out.println();
        }
        break;


        case 2:
            int floor;
            int room;

            System.out.println("Enter floor number(0-2) : ");
            floor=sc.nextInt();
            System.out.println("Enter room number(0-3): ");
            room=sc.nextInt();

            if(Rooms[floor][room]==0){
                Rooms[floor][room]=1;
            System.out.println("Room Booked!");}
            else{
                System.out.println("Room Already Booked.");
            }

            
            break;

        case 3:
            System.out.println("Exiting");
            sc.close();
            return;
            
        default:
            System.out.print("Invalid choice.");


    }

    }
        

    }
}
