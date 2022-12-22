package pk.projekt.springboot.MODEL;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class JsonHelp {
    private UUID GameId, UserId;
    private Boolean isCross;

    private int CordinatesNr;

    public int getCordinatesNr() {
        return CordinatesNr;
    }
    public UUID getGameId() {
        return GameId;
    }

    public UUID getUserId() {
        return UserId;
    }

    public Boolean getCross() {
        return isCross;
    }

    public JsonHelp(@JsonProperty("GameId") UUID gameId, @JsonProperty("UserId") UUID userId, @JsonProperty("isCross") String isCross, @JsonProperty("isCross") int CordinatesNr) {
        GameId = gameId;
        UserId = userId;
        this.isCross = Boolean.parseBoolean(isCross);
        this.CordinatesNr = CordinatesNr;
    }
}
