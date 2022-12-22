package pk.projekt.springboot.threadController;

import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("Fake")
public class FakeGameThread implements GameThread {
    @Override
    public String startGame(Boolean isCross) {
        Gson gson = new Gson();
        String Json = gson.toJson(isCross);
        return Json;
    }

    @Override
    public String joinGame(UUID gameID) {
        return gameID.toString();
    }

    @Override
    public void makeMove(UUID GameId, UUID UserId, Boolean isCross, int coordinatesNr) {

    }

    @Override
    public String getMove(UUID GameId, UUID UserId) {
        Gson gson = new Gson();
        String Json = gson.toJson(GameId.toString() + UserId.toString());
        return Json;
    }
}
