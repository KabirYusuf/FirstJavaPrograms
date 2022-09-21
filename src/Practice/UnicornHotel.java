package practice;

public class UnicornHotel {
    private String [] rooms;

    public UnicornHotel(int roomNumber){
        this.rooms = new String[roomNumber];
    }

    public String bookRoom(String name){
        for(int i = 0; i < rooms.length; i++){
            if (rooms[i] == null){
                rooms[i] = name;
                break;
            }
        }
        return name;
    }

    public String getRoomGuest(int roomNumber){
        return rooms[roomNumber - 1];
    }

    public void getAvailableRooms(){
        for(int i = 1; i < rooms.length; i++){
            if(rooms[i] == null){
                System.out.printf("Room %d%n",i);
            }
        }
    }
}
