package pk.projekt.springboot.MODEL;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Game {
    private UUID id;
    private UUID Player1ID;
    private UUID Player2ID;
    private List<Integer> GameState;

    public Game(@JsonProperty("id") UUID id,@JsonProperty("Player1id") UUID player1ID,@JsonProperty("Player2id") UUID player2ID) {
        this.id = id;
        Player1ID = player1ID;
        Player2ID = player2ID;
        GameState = new ArrayList<Integer>(Collections.nCopies(10, null));
    }
}
