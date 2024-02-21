import java.util.*;

public class Teams
{
    private ArrayList<Competitor> juniorTeam = new ArrayList<>();
    private ArrayList<Competitor> seniorTeam = new ArrayList<>();

    public void addJuniorCompetitor(Competitor competitor)
    {
        juniorTeam.add(competitor);
    }

    public void addSeniorCompetitor(Competitor competitor)
    {
        seniorTeam.add(competitor);
    }

    public ArrayList<Competitor> getSeniorTeam()
    {
        return seniorTeam;
    }

    public ArrayList<Competitor> getJuniorTeam()
    {
        return juniorTeam;
    }

    public void newTeams()
    {
        juniorTeam.add(new Competitor(26188398, "Mand", "Ulrik", "Lehun", 15, 1600, "Competitor", true, 0, 13, "Crawl", "KBH", 3, 10));
        juniorTeam.add(new Competitor(34563456, "kvind", "Ulrik", "jaja", 13, 1600, "Competitor", true, 0, 7, "Crawl", "KBH", 1, 5));
        juniorTeam.add(new Competitor(26188398, "Mand", "Ulrik", "Lehun", 10, 1600, "Competitor", true, 0, 10, "Crawl", "KBH", 5, 10));
        seniorTeam.add(new Competitor(74542398, "Mand", "Ulrik", "Lehun", 10, 1600, "Competitor", true, 0, 10, "Crawl", "KBH", 5, 10));
        seniorTeam.add(new Competitor(26398, "Mand", "Ulrik", "Lehun", 10, 1600, "Competitor", true, 0, 10, "Crawl", "KBH", 5, 10));
        seniorTeam.add(new Competitor(22328398, "Mand", "Ulrik", "Lehun", 10, 1600, "Competitor", true, 0, 10, "Crawl", "KBH", 5, 10));
    }

    public void seeListJunior()
    {
        for ( Competitor value : getJuniorTeam() )
        {
            System.out.println(value);

        }

    }
    public void seeListSenior()
    {
        for ( Competitor value : getSeniorTeam() )
        {
            System.out.println(value);

        }

    }


    public String selectDiscipline()
    {
        boolean sentinel = true;
        Scanner scan = new Scanner(System.in);

        while ( sentinel )
        {
            System.out.println("Vælg en disciplin fra 1-4");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 1 | [Crawl]");
            System.out.println("| 2 | [Rygcrawl]");
            System.out.println("| 3 | [Butterfly]");
            System.out.println("| 4 | [Brystsvømning]");
            System.out.println("----------------------------------------------------------");
            try
            {
                int tal = scan.nextInt();
                if ( tal == 1 )
                {
                    sentinel = false;
                    return "Crawl";
                } else if ( tal == 2 )
                {
                    sentinel = false;
                    return "Rygcrawl";
                } else if ( tal == 3 )
                {
                    sentinel = false;
                    return "Butterfly";
                } else if ( tal == 4 )
                {
                    sentinel = false;
                    return "Brystsvømning";
                } else
                {
                    System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                }
            } catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et tal fra 0 - 9");
                scan.next();
            }

        }
        return "svømmer";
    }

    public void sortJuniorTime()
    {
       Collections.sort(juniorTeam, Comparator.comparingDouble(Competitor::getTrainingResult));
    }

    public void sortSeniorTime()
    {
        Collections.sort(seniorTeam, Comparator.comparingDouble(Competitor::getTrainingResult));
    }
}

