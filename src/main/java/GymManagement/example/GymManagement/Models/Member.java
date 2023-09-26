package GymManagement.example.GymManagement.Models;

import java.util.List;

public class Member
{

    //Member: MemberId, List<Trainer>, Gym;
    private String memberId;
   private List<Trainer> trainerList;

   private  Gym gym;

    public Member() {
    }

    public Member(String memberId, List<Trainer> trainerList, Gym gym) {
        this.memberId = memberId;
        this.trainerList = trainerList;
        this.gym = gym;
    }

    public Member(String memberId, Gym gym) {
        this.memberId = memberId;
        this.gym = gym;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
