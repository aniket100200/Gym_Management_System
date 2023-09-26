package GymManagement.example.GymManagement.GymRepository;

import GymManagement.example.GymManagement.Models.Gym;
import GymManagement.example.GymManagement.Models.Member;
import GymManagement.example.GymManagement.Models.Trainer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryClass
{
    Map<String,Member> memberDb=new HashMap<>();
    Map<String,Gym>gymDb=new HashMap<>();
    Map<String, List<Member>>gymMemberDb=new HashMap<>();
    Map<String, Trainer> trainerDb=new HashMap<>();

    public String addMember(Member member)
    {
        memberDb.put(member.getMemberId(),member);
        List<Member>list=gymMemberDb.getOrDefault(member.getGym().getGymId(),new ArrayList<>());
        list.add(member);
        gymMemberDb.put(member.getGym().getGymId(),list);

               return "added";
    }
    public String addGym(Gym gym)
    {
        gymDb.put(gym.getGymId(),gym);
        return "added";
    }

    public String addTrainer(Trainer trainer)
    {
        trainerDb.put(trainer.getTrainerId(),trainer);

        return "added";
    }
    public Gym gymWithMostMember()
    {
        int count=0;
        String gym="";
        for(String str:gymMemberDb.keySet())
        {
            if(gymMemberDb.get(str).size()>count){
                count= gymMemberDb.get(str).size();
                gym=str;
            }
        }
        return gymDb.get(gym);
    }

    public Member meberWhichIsTrainerdbyMostTrainers()
    {
        Member member=null;
        int max=0;
        for(Member m:memberDb.values()){
            if(m.getTrainerList().size()>0){
                member=m;
                max=m.getTrainerList().size();
            }
        }
        return member;
    }

    public Integer numberOfTrainersMorethan5()
    {
        int count=0;
        for(Trainer t:trainerDb.values()){
            if(t.getGymList().size()>5)count++;
        }
        return count;
    }
}
