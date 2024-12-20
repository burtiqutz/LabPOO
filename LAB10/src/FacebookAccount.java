import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FacebookAccount implements Comparable<FacebookAccount> {
    private String name;
    private int age;
    ArrayList<FacebookAccount> friends;
    private String location;

    public FacebookAccount(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
        friends = new ArrayList<>();
    }

    public FacebookAccount() {
        this(null, -1, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<FacebookAccount> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<FacebookAccount> friends) {
        this.friends = friends;
    }

    public void addFriend(FacebookAccount friend) {
        if (friend == null) {
            return;
        }
        friends.add(friend);
    }

    public void removeFriend(FacebookAccount friend) {
        if (friend == null) {
            return;
        }
        boolean removed = friends.remove(friend);
        if (!removed) {
            System.out.println("Friend not found");
        }
    }

    public void showFriends() {
        Collections.sort(friends);
        System.out.println("Friends(asc):");
        for (FacebookAccount friend : friends) {
            System.out.println(friend);
        }
        System.out.println("Friends(desc):");
        Comparator<FacebookAccount> descrescator = new Comparator<FacebookAccount>() {

            public int compare(FacebookAccount o1, FacebookAccount o2) {
                return o2.name.compareTo(o1.name);
            }
        };
        Collections.sort(friends, descrescator);
        for (FacebookAccount friend : friends) {
            System.out.println(friend);
        }
        System.out.println();
    }

    public void getFriendsByLocation(String location) {
        System.out.println("Searching for friends in: " + location);
        for (FacebookAccount friend : friends) {
            if (friend.getLocation().equals(location)) {
                System.out.println(friend.getName());
            }
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.location;
    }

    public boolean equals(FacebookAccount account) {
        return this.name.equals(account.name) && this.age == account.age && this.location.equals(account.location);
    }

    @Override
    public int compareTo(FacebookAccount o) {
        return this.name.compareTo(o.name);
    }

}
