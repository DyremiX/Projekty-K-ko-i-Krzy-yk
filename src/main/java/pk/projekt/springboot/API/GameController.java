package pk.projekt.springboot.API;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pk.projekt.springboot.MODEL.JsonHelp;
import pk.projekt.springboot.SERVICE.GameService;

import java.util.List;
import java.util.UUID;

@RequestMapping("tictactoe")
@RestController
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    @RequestMapping("startGame")
    @GetMapping
    public String startGame(@RequestBody JsonHelp jsonHelp){
        return jsonHelp.getCross().toString();
    }
    @RequestMapping("joinGame")
    @GetMapping
    public String joinGame(@RequestBody JsonHelp jsonHelp){
        return gameService.joinGame(jsonHelp.getGameId());
    }
    @RequestMapping("getMove")
    @GetMapping
    public String getMove(@RequestBody JsonHelp jsonHelp){
        return gameService.getMove(jsonHelp.getGameId(), jsonHelp.getUserId());
    }
    @RequestMapping("postMove")
    @GetMapping
    public void postMove(@RequestBody JsonHelp jsonHelp){
        gameService.postMove(jsonHelp.getGameId(), jsonHelp.getUserId(), jsonHelp.getCross(), jsonHelp.getCordinatesNr());
    }
//    @PostMapping
//    public void addPerson(@RequestBody Person person){
//        personService.addPerson(person);
//    }
//
//    @GetMapping
//    public List<Person> getAllPeople(){
//        return personService.getAllPeople();
//    }
}