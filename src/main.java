public class main {

    public static void main(String args[]){


        Theatre savoy=new Theatre("Savoy MAX",23,15);
       // savoy.getSeats();

        if(savoy.reserveSeat("H12")){
            System.out.println("please pay for seat");
        }else {
            System.out.println("sorry it is already taken");
        }


        if(savoy.reserveSeat("H12")){
            System.out.println("please pay for seat");
        }else {
            System.out.println("sorry it is already taken");
        }
    }
}
