package Enum;

public class Enumjava
{
    enum Direction{ NORTH,SOUTH,EAST,WEST}

    public static void main(String args[]){
        Direction a=Direction.EAST;

        switch(a){
            case NORTH:
                System.out.println("NORTH");
                break;
            case SOUTH:
                System.out.println("SOUTH");
                break;
            case EAST:
                System.out.println("EAST");
                break;
            case WEST:
                System.out.println("WEST");
                break;

            default:
                System.out.println("other");
        }
    }

}
