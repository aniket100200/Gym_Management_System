package GymManagement.example.GymManagement.Models;

import javax.xml.stream.Location;
import java.util.List;

public class Gym
{
    //Gym: GymId, Location, List<Members>, List<Trainers>;
    private Location location;
    private String gymId;
    private List<Member> memberList;

    public Gym(Location location, String gymId, List<Member> memberList)
    {
        this.location = location;
        this.gymId = gymId;
        this.memberList = memberList;
    }

    public Gym(Location location, String gymId)
    {
        this.location = location;
        this.gymId = gymId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
