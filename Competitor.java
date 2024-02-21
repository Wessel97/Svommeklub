import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Competitor extends Member
{
    private int trainingResult;
    private String swimmingDisciplines;
    private String tournament = "Ingen";
    private int placement = 0;
    private int tournamentTime = 0;

    Teams teams;

    public Competitor(int id, String gender, String firstName, String surname, int age, int subscription, String memberType, boolean membershipActive, int debt, int trainingResult, String swimmingDisciplines, String tournament, int placement, int tournamentTime)
    {
        super(id, gender, firstName, surname, age, subscription, memberType, membershipActive, debt);
        this.trainingResult = trainingResult;
        this.swimmingDisciplines = swimmingDisciplines;
        this.tournament = tournament;
        this.placement = placement;
        this.tournamentTime = tournamentTime;
    }

    // Setters

    public void setTrainingResult(int trainingResult)
    {
        this.trainingResult = trainingResult;
    }

    public void setSwimmingDisciplines(String swimmingDisciplines)
    {
        this.swimmingDisciplines = swimmingDisciplines;
    }

    public void setTournament(String tournament)
    {
        this.tournament = tournament;
    }

    public void setPlacement(int placement)
    {
        this.placement = placement;
    }

    public void setTournamentTime(int tournamentTime)
    {
        this.tournamentTime = tournamentTime;
    }

    // Getters

    public int getTrainingResult()
    {
        return trainingResult;
    }

    public String getSwimmingDisciplines(String swimmingDisciplines)
    {
        return swimmingDisciplines;
    }

    public String getTournament(String tournament)
    {
        return tournament;
    }

    public int getPlacement(int placement)
    {
        return placement;
    }

    public int getTournamentTime(int tournamentTime)
    {
        return tournamentTime;
    }


    // Override
    public String toString()
    {
        if ( getMembershipActive() )
        {
            String subs = "dummy";
            if ( getSubscription() == 0 )
            {
                subs = ", Kontingent: [Betalt]";
            } else if ( getSubscription() > 0 )
            {
                subs = ", Kontingent: [Ikke Betalt]";
            }
        }
        return "ID: " + getId() + ", Navn: " + getFullName() + ", Køn: " + getGender() +
                ", Alder: " + getAge() + ", Medlemskab: [Aktiv]" + ", Disciplin: " + swimmingDisciplines + ", Træningstid: " + trainingResult + ", Stævne: " + tournament + ", Placering: " + placement + ", Konkurrencetid: " + tournamentTime;
    }
}
