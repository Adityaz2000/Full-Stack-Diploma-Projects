#include<stdio.h>
#include<string.h>
typedef struct Player
{
	int jerseyNumber;
	char name[30];
	int playedMatch;
	int run;
	int wicket;
	
}Player;

extern int ctr ;
void store(Player*,int);
void storeHard(Player*,int);
void addPlayer(Player*,int);
void deletePlayer(Player*,int);
void display(Player*,int);
int  searchByJerseyNo(Player*);                 //declearation
int  searchByName(Player*);
void sortingPlayerByMatches(Player*);
void sortingPlayerByRuns(Player*);
void sortingPlayerByWickets(Player*);
void updateByMatch(Player*,int);
void updateByRun(Player*,int);
void updateBywicket(Player*,int);