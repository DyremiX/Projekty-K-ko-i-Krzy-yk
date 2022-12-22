package pk.projekt.springboot.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pk.projekt.springboot.threadController.GameThread;

import java.util.UUID;

@Service
public class GameService {

    private final GameThread gameThread;

    @Autowired
    public GameService(@Qualifier("Fake") GameThread gameThread) {
        this.gameThread = gameThread;
    }

    public String startGame(Boolean isCross){
        return gameThread.startGame(isCross);
    }

    public String joinGame(UUID GameId){
        return gameThread.joinGame(GameId);
    }

    public String getMove(UUID GameId, UUID UserId){
        return gameThread.getMove(GameId, UserId);
    }

    public void postMove(UUID GameId, UUID UserId, Boolean isCross, int CordinatesNr){
        gameThread.makeMove(GameId, UserId, isCross, CordinatesNr);
    }
}
