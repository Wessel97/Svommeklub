import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;

public class Coach
{
/*Indsætte scanner og alle valgmulighederne træneren skal kunne  ()
Et juniorhold (u. 18) og seniorhold (18+)
For hver svømmedisciplin:
    Liste over træningsresultat & dato
    Liste over konkurrencec-aktive: registreres stævne, placering og tid
Oversigt, der kan vise klubbens top 5 svømmere inden for hver svømmedisciplin konkurrence/træning.
 */


    boolean sentinel = true;
    Scanner scan = new Scanner(System.in);
    Member member;
    Menu menu;
    Teams teams;
    Competitor competitor;

    public Coach(Teams team)
    {
        this.teams = team;
    }

    public void coachMenu()
    {
        while ( sentinel )
        {
            System.out.println("Vælg et tal fra 0-9 for at å4bne funktioner:");
            System.out.println("----------------------------------------------------------");
            System.out.println("| 1 | Indtast Trænings Resultater Junior");
            System.out.println("| 2 | Indtast Trænings Resultater Senior");
            System.out.println("| 3 | Indtast Konkurrence Resultater Junior");
            System.out.println("| 4 | Indtast Konkurrence Resultater Senior");
            System.out.println("| 5 | Se Junior");
            System.out.println("| 6 | Se Senior");
            System.out.println("| 0 | Gå Tilbage");
            System.out.println("----------------------------------------------------------");

            try
            {
                int tal = scan.nextInt();
                if ( tal == 1 )
                {
                    assignTrainingResultsJunior();
                    sentinel = false;
                    System.out.println("Åbner 1");
                    System.out.println("Indtast Trænings Resultater for Junior medlem: ");
                } else if ( tal == 2 )
                {
                    assignTrainingResultsSenior();
                    sentinel = false;
                    System.out.println("Åbner 2");
                    System.out.println("Indtast Trænings Resultater for Senior medlem: ");

                } else if ( tal == 3 )
                {
                    assignTournamentJunior();
                    sentinel = false;
                    System.out.println("Åbner 3");
                    System.out.println("Indtast Konkurrence Resultater for Junior medlemmer");

                } else if ( tal == 4 )
                {
                    assignTournamentSenior();
                    sentinel = false;
                    System.out.println("Åbner 4");
                    System.out.println("Indtast Konkurrence Resultater for Senior medlemmer");

                } else if ( tal == 5 )
                {
                    System.out.println("Her kan du se en oversigt over Junior medlemmer");
                    teams.sortJuniorTime();
                    teams.seeListJunior();

                } else if ( tal == 6 )
                {
                    System.out.println("Her kan du se en oversigt over Senior medlemmer");
                    teams.sortSeniorTime();
                    teams.seeListSenior();

                } else if ( tal == 0 )
                {
                    System.out.println("Går Tilbage...");
                    sentinel = false;
                    Menu.menuLoop();

                } else
                {
                    System.out.println("Ugyldigt tal, prov igen med et tal fra 0 - 6");
                    member.sleep();
                }
            } catch (Exception e)
            {
                System.out.println("Fejl, prøv igen");
                member.sleep();
                scan.next();
            }

        }
    }


            public void assignTrainingResultsJunior()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens telefonnummer: ");
            int choice = scan.nextInt();
            System.out.print("Svømmerens tid: ");
            int time = scan.nextInt();
            for ( int i = 0; i < teams.getJuniorTeam().size(); i++ )
            {
                if ( teams.getJuniorTeam().get(i).getId() == choice )
                {
                    teams.getJuniorTeam().get(i).setTrainingResult(time);
                    System.out.println("Tilføjet trænings tid til medlem: " + teams.getJuniorTeam().get(i).getFullName());
                } else
                {
                    System.out.println("Intet medlem fundet med id'et indtastet");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ugyldigt input, prov igen med et nummer");
            member.sleep();
            scan.next();
        }
    }



    public void assignTrainingResultsSenior()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens telefonnummer: ");
            int choice = scan.nextInt();
            System.out.print("Svømmerens tid: ");
            int time = scan.nextInt();
            for ( int i = 0; i < teams.getSeniorTeam().size(); i++ )
            {
                if ( teams.getSeniorTeam().get(i).getId() == choice )
                {
                    teams.getSeniorTeam().get(i).setTrainingResult(time);
                    System.out.println("Tilføjet trænings tid til medlem: " + teams.getSeniorTeam().get(i).getFullName());
                } else
                {
                    System.out.println("Intet medlem fundet med id'et indtastet");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ugyldigt input, prov igen med et nummer");
            member.sleep();
            scan.next();
        }

    }


    public void assignTournamentJunior()
    {
        boolean sentinel = true;
            try
            {
                Scanner scan = new Scanner(System.in);
                System.out.print("Svømmerens telefonnummer: ");
                int choice = scan.nextInt();
                System.out.println("Stævne: ");
                String tourney = scan.next();
                System.out.println("Placering: ");
                int place = scan.nextInt();
                System.out.print("Konkurrencetid: ");
                int ktid = scan.nextInt();
                for ( int i = 0; i < teams.getJuniorTeam().size(); i++ )
                {
                    if ( teams.getJuniorTeam().get(i).getId() == choice )
                    {
                        teams.getJuniorTeam().get(i).setTournament(tourney);
                        System.out.println();
                        teams.getJuniorTeam().get(i).setPlacement(place);
                        System.out.println();
                        teams.getJuniorTeam().get(i).setTournamentTime(ktid);
                        System.out.println("Tilføjet stævne, placering og tid til medlem: " + teams.getJuniorTeam().get(i).getFullName());
                        sentinel = false;
                    } else
                    {
                        System.out.println("Intet medlem fundet med id'et indtastet");
                    }
                }
            } catch (Exception e)
            {
                System.out.println("Ugyldigt input, prov igen med et nummer");
                member.sleep();
                scan.next();
            }

    }



    public void assignTournamentSenior()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Svømmerens telefonnummer: ");
            int choice = scan.nextInt();
            System.out.print("Stævne: ");
            String tourney = scan.next();
            System.out.print("Placering: ");
            int place = scan.nextInt();
            System.out.print("Konkurrencetid: ");
            int ktid = scan.nextInt();
            for ( int i = 0; i < teams.getSeniorTeam().size(); i++ )
            {
                if ( teams.getSeniorTeam().get(i).getId() == choice )
                {
                    teams.getSeniorTeam().get(i).setTournament(tourney);
                    teams.getSeniorTeam().get(i).setPlacement(place);
                    teams.getSeniorTeam().get(i).setTournamentTime(ktid);
                    System.out.println("Tilføjet stævne, placering og tid til medlem: " + teams.getSeniorTeam().get(i).getFullName());
                } else
                {
                    System.out.println("Intet medlem fundet med id'et indtastet");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Ugyldigt input, prov igen med et nummer");
            member.sleep();
            scan.next();
        }

    }

  /*
  //Disse metoder kunne vi ikke nå at få til at virke...
  public void udtagSvømmereTilKonkurrence(Hold hold) {
    int minimumsKrav = 10; //hard coded adgangskrav til vores egen hjemmelavede konkurrence.
    for (int i = 0; i < hold.getJuniorKonkurrencesvømmere().size(); i++) {
      if (hold.getJuniorKonkurrencesvømmere().get(i).getTræningsResultat() < minimumsKrav) {
        hold.getKonkurrenceDeltagelse().add(hold.getJuniorKonkurrencesvømmere().get(i));
      }
    }
  }
  //
  public void udskrivUdvalgteKonkurrencedeltagere(Hold hold) {
    for (int i = 0; i < hold.getKonkurrenceDeltagelse().size(); i++) {
      System.out.println(hold.getKonkurrenceDeltagelse().get(i));
    }
  } */

}
