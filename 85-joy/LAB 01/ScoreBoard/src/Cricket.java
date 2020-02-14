import java.util.List;

public class Cricket implements IScoreBoard {
    public String MatchType;

    public Cricket(String MatchType)
    {
        this.MatchType = MatchType;
    }
    @Override
    public void Teaminfo(String teamA, String teamB) {
        System.out.println(teamA+" vs "+teamB);
        System.out.println("== == ==");
    }

    @Override
    public void TeamScore(String ScoreA, String ScoreB) {
        System.out.println(ScoreA +" - "+ScoreB);
        System.out.println("== == ==");
    }

    @Override
    public void TopPlayers(String[] playerName) {
        for (String x : playerName)
        {
            System.out.println(x);
        }
    }
}