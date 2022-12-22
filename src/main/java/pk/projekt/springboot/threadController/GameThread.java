package pk.projekt.springboot.threadController;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.json.GsonJsonParser;
import pk.projekt.springboot.MODEL.Game;

import java.util.List;
import java.util.UUID;

public interface GameThread {

    String startGame(Boolean isCross);

    String joinGame(UUID gameID);

    void makeMove(UUID GameId, UUID UserId, Boolean isCross, int coordinatesNr);

    String getMove(UUID GameId, UUID UserId);

}
