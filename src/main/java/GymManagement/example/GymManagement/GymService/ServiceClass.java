package GymManagement.example.GymManagement.GymService;

import GymManagement.example.GymManagement.GymRepository.RepositoryClass;
import GymManagement.example.GymManagement.Models.Gym;
import GymManagement.example.GymManagement.Models.Member;
import GymManagement.example.GymManagement.Models.Trainer;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass
{
    private RepositoryClass repositoryClass;
    public  String addMember(Member member)
    {
       return  repositoryClass.addMember(member);
    }
    public String addGym(Gym gym){
        return repositoryClass.addGym(gym);
    }

    public String addTrainer(Trainer trainer)
    {
        return repositoryClass.addTrainer(trainer);
    }

    public Gym getGymWithMostMembers(){
        return repositoryClass.gymWithMostMember();
    }

    public Member  meberWhichIsTrainerdbyMostTrainers(){
        return repositoryClass.meberWhichIsTrainerdbyMostTrainers();
    }

    public Integer numberOfTrainersMorethan5()
    {
        return repositoryClass.numberOfTrainersMorethan5();
    }
}
