#include "Player.h"

void store(Player *p,int n)
{
	int i;
	for(i=0;i<n;i++)
   {
	printf("enter the Jersey number: ");
	scanf("%d",&p[i].jerseyNumber);
	printf("enter name of player: ");
	scanf("%s",&p[i].name);
	printf("enter total no of match played:");
	scanf("%d",&p[i].playedMatch);
	printf("enter the run:");
	scanf("%d",&p[i].run);
	printf("enter the wicket: ");
	scanf("%d",&p[i].wicket);
    }
}


//hardcode
void storeHard(Player*p,int n )
{
	
	
	p[0].jerseyNumber=1;
	strcpy(p[0].name,"Madhav");
	p[0].playedMatch=10;
	p[0].run=200;
	p[0].wicket=10;
	ctr++;
	
	p[1].jerseyNumber=2;
	strcpy(p[1].name,"Ramesh");
	p[1].playedMatch=15;
	p[1].run=400; 
	p[1].wicket=5;
	ctr++;
	
	p[2].jerseyNumber=3;
	strcpy(p[2].name,"Kunal");
	p[2].playedMatch=7;
	p[2].run=150;
	p[2].wicket=15;
	ctr++;
	
}


//update
void addPlayer(Player*p,int n)
{
	
	if(ctr!=n)
   {
	printf(" Add Besic Information As Follow  ");
	printf("\nenter the Jersey number: ");
	scanf("%d",&p[ctr].jerseyNumber);
	printf("enter name of player: ");
	scanf("%s",&p[ctr].name);
	printf("enter total no of match played:");
	scanf("%d",&p[ctr].playedMatch);                                                      //Definations
	printf("enter the run:");
	scanf("%d",&p[ctr].run);
	printf("enter the wicket: ");
	scanf("%d",&p[ctr].wicket);
	ctr++;
	
   }
    else
    {
    	printf("team full");
	}
	
}


//remove
void deletePlayer(Player*p,int index)
{
	
    while(index<(ctr-1))
	{
		p[index]=p[index+1];
		index++;
		
	}ctr--;
    
}


//display
void display(Player*p,int n)
{
	printf("Team Name: Black Python ");
	for(int i=0;i<ctr;i++)
	{
		printf("\nJersey Number: %d,  player Name: %s,   Played Match: %d,   Number of Run: %d,   number of wicket: %d",p[i].jerseyNumber,p[i].name,p[i].playedMatch,p[i].run,p[i].run,p[i].wicket);
	}
	
	
}
//search
int searchByJerseyNo(Player*p)
{
	
	int search;
	printf("Enter jersey no wh ich you want to search: ");
	scanf("%d",&search);

	for(int i=0;i<ctr;i++)
	{
		if(p[i].jerseyNumber==search)
		{
			return i;
		}
	}
	return -1;	
}


int searchByName(Player*p)
{
	char search[20];
	printf("Enter name of player which you want to search: ");
	scanf("%s",&search);
	
	for(int i=0;i<ctr;i++)
	{
		if(strcmp(p[i].name,search)==0)
		{                            
			return i;
		}
	}
	return -1;
}

void sortingPlayerByMatches(Player* p)
{
    for(int i=0;i<ctr;i++)
    {
        for(int j=i+1;j<ctr;j++)
        {
            if(p[i].playedMatch>p[j].playedMatch)
            {
                Player temp=p[i];
                p[i]=p[j];
                p[j]=temp;
            }
        }
    }
}

void sortingPlayerByRuns(Player* p)
{
    for(int i=0;i<ctr;i++)
    {
        for(int j=i+1;j<ctr;j++)
        {
            if(p[i].run>p[j].run)
            {
                Player temp=p[i];
                p[i]=p[j];
                p[j]=temp;
                
            }
        }
    }
}

void sortingPlayerByWickets(Player*p)
{
    for(int i=0;i<ctr;i++)
    {
        for(int j=i+1;j<ctr;j++)
        {
            if(p[i].wicket>p[j].wicket)
            {
                Player temp=p[i];
                p[i]=p[j];
                p[j]=temp;
            }
        }
    }
}

void updateByMatch(Player*p,int index)
{
	int updatedMatch;
	printf("\n enter the updated played match: ");
	scanf("%d",&updatedMatch);
	p[index].playedMatch=updatedMatch+p[index].playedMatch;
}
void updateByRun(Player*p,int index)
{
	int updatedRun;
	printf("\n enter the updated Runs: ");
	scanf("%d",&updatedRun);
	p[index].run=updatedRun+p[index].run;
}

void updateBywicket(Player*p,int index)
{
	int updatedwicket;
	printf("\n enter the updated wicket: ");
	scanf("%d",&updatedwicket);
	p[index].wicket=updatedwicket+p[index].wicket;
}

