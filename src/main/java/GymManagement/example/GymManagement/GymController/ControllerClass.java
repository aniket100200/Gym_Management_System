package GymManagement.example.GymManagement.GymController;

import GymManagement.example.GymManagement.GymService.ServiceClass;
import GymManagement.example.GymManagement.Models.Gym;
import GymManagement.example.GymManagement.Models.Member;
import GymManagement.example.GymManagement.Models.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass
{
    @Autowired
    private ServiceClass serviceClass;

    @PostMapping("/add-member")

    public  String addMember(@RequestBody Member member)
    {
        return serviceClass.addMember(member);
    }

    @PostMapping("/add-Gym")
    public  String addGym(@RequestBody Gym gym)
    {
        return serviceClass.addGym(gym);
    }

    @PostMapping ("/add-Trainer")
    public String addTrainer(@RequestBody Trainer trainer)
    {
        return serviceClass.addTrainer(trainer);
    }

    //Find the gym with most number of members

    @GetMapping("/Gym-with-most-members")
    public Gym gymWithMostMember()
    {
        return serviceClass.getGymWithMostMembers();
    }

   // Find the member which is being trained by most number of trainers

    @GetMapping("/meberWhichIsTrainerdbyMostTrainers")
    public Member meberWhichIsTrainerdbyMostTrainers()
    {
        return serviceClass.meberWhichIsTrainerdbyMostTrainers();
    }

   // Find the number of trainers that work in more than 5 gyms.

    @GetMapping("/numberOfTrainersMorethan5")
    public Integer numberOfTrainersMorethan5()
    {
        return serviceClass.numberOfTrainersMorethan5();
    }
}
