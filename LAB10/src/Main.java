import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FacebookAccount acc1 = new FacebookAccount("Alex", 20, "Cluj");
        FacebookAccount acc2 = new FacebookAccount("Patricia", 21, "Brasov");
        FacebookAccount acc3 = new FacebookAccount("Mike", 22, "Cluj");
        FacebookAccount acc4 = new FacebookAccount("Bianca", 23, "Cluj");
        FacebookAccount acc5 = new FacebookAccount("George", 22, "Cluj");
        FacebookAccount acc6 = new FacebookAccount("Ema", 25, "Brasov");

        acc1.addFriend(acc2);
        acc1.addFriend(acc3);
        acc1.addFriend(acc4);
        acc1.addFriend(acc5);
        acc1.addFriend(acc6);
        acc1.showFriends();
        acc1.getFriendsByLocation("Cluj");
        acc1.getFriendsByLocation("Brasov");
        System.out.println();
        acc1.removeFriend(acc2);
        acc1.showFriends();
        acc1.removeFriend(acc2);


        PetHotel hotel = new PetHotel();
        hotel.addGuest("bob", 5);
        hotel.addGuest("alice", 2);
        hotel.addGuest("abba", 3);
        hotel.showGuests();


    }
}
