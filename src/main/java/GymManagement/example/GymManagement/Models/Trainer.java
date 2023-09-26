package GymManagement.example.GymManagement.Models;

import java.util.List;

public class Trainer
{

    //Trainer: TrainerId, List<Member>, List<Gym>
    private String trainerId;
   private  List<Member> memberList;
    private List<Gym>gymList;

    public Trainer() {
    }

    public Trainer(String trainerId, List<Member> memberList, List<Gym> gymList) {
        this.trainerId = trainerId;
        this.memberList = memberList;
        this.gymList = gymList;
    }

    public Trainer(String trainerId)
    {
        this.trainerId = trainerId;

    }

    public String getTrainerId()
    {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Gym> getGymList() {
        return gymList;
    }

    public void setGymList(List<Gym> gymList) {
        this.gymList = gymList;
    }
}
