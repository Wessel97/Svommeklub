import java.text.*;
import java.util.*;
import java.io.*;

public class Member
{
    private int id = -99;
    private String gender = "andet";
    private String firstName = "John";
    private String surname = "Dillermand";
    private int age = -99;
    private int subscription = -99;
    // medlemmet kan være 3 forskellige membertypes: Competitor, Excerciser og Passiv
    private String memberType = "Prut";
    // Hvis medlemmets membership status er false, er medlemmet en Passiv memeberType
    private boolean membershipActive = true;
    private int debt = 0;

    public Member()
    {
    }

    // Constructors
    public Member(int id, String gender, String firstName, String surname, int age, int subscription, String memberType, boolean membershipActive, int debt)
    {
        this.id = id;
        this.gender = gender;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.subscription = subscription;
        this.memberType = memberType;
        this.membershipActive = membershipActive;
        this.debt = debt;
    }


    // Getters

    public int getId()
    {
        return id;
    }

    public int getSubscription()
    {
        return subscription;
    }

    public String getGender()
    {
        return gender;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFullName()
    {
        return firstName + " " + surname;
    }

    public int getAge()
    {
        return age;
    }

    public String getMemberType()
    {
        return memberType;
    }

    public boolean getMembershipActive()
    {
        return membershipActive;
    }

    public int getDebt()
    {
        return debt;
    }

    // Setters

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setMembertype(String memberType)
    {
        this.memberType = memberType;
    }

    public void setMembership(boolean membership)
    {
        this.membershipActive = membership;
    }

    public void setSubscription(int subscription)
    {
        this.subscription = subscription;
    }

    public void setDebt(int debt)
    {
        this.debt = debt;
    }

    public String toString()
    {
        if ( getMembershipActive() )
        {
            String subs = "dummy";
            if ( getDebt() == 0 )
            {
                subs = ", Kontingent: [Betalt]";
            } else if ( getDebt() > 0 )
            {
                subs = ", Kontingent: [Ikke Betalt]";
            }
            return "ID: " + id + ", Navn: " + firstName + " " + surname + ", Køn: " + gender +
                    ", Alder: " + age + ", Medlemskab: [Aktiv]" + ", Kontingent: " + subscription + ", " + subs;

        } else
        {
            String subs = "dummy";
            if ( getDebt() == 0 )
            {
                subs = ", Kontingent: [Betalt]";
            } else if ( getDebt() > 0 )
            {
                subs = ", Kontingent: [Ikke Betalt]";
            }
            return "ID: " + id + ", Navn: " + firstName + " " + surname + ", Køn: " + gender +
                    ", Alder: " + age + ", Medlemskab: [Passiv]" + ", Kontingent: " + subscription + ", " + subs;


        }

    }

    public void whatSubcription(Member member)
    {
        /*if (membershipActive == true)
        {
            if (age < 18)
            {
                subscription = 1000;
                System.out.println("Junior medlemsskab (pris: " + subscription + "kr.)");
            }
            else if (age > 18 && age < 60)
            {
                subscription = 1600;
              System.out.println("Senior medlemsskab (pris: " + subscription + "kr.)");
            }
            else if (age > 60)
            {
                subscription = 1200;
                System.out.println("Pensionist medlemsskab (pris: " + subscription + "kr.)");
            }
        }
        else if (membershipActive == false)
        {
            subscription = 500;
            System.out.println("Passivt medlemsskab (pris: " + subscription + "kr.)");
        }*/

    }

    public void sleep()
    {
        try
        {
            Thread.sleep(900);
        } catch (InterruptedException d)
        {
            System.out.println("Fejl: " + d);
        }
    }



}
