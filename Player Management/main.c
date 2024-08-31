#include<stdio.h>
#include "Player.h"
int ctr=0;
void main()
{
	int n;
	int choice;
	int i;
	int index;
	
	printf ("\n<<<<<<<<<<<<<<<<<<< Player Managment >>>>>>>>>>>>>>>>>>>>>>>>>\n");
	printf("\nEnter the no of player you want Add in Team:");
	scanf("%d",& n);
	Player p[n];
	//store(p,n);
	storeHard(p,n);
	do {
		printf ("\n<<<<<<<<<<<<<<<<<<<           >>>>>>>>>>>>>>>>>>>>>>>>>\n");
		
        printf("\n1. Add Player\n2. Remove Player\n3. Search Player\n4. Update Player Data\n");                //call
        printf("5. Display Sorted Players\n6. Display All Players\n7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
    	
		
		switch (choice)
		{
			//Add
		    case 1:
			  	addPlayer(p,n);
			  	break;
			//Remove
			 case 2:
			 	index=searchByJerseyNo(p);
				deletePlayer(p, index);
                break;
			//search
	        case 3:
	            printf("1. Search by Jersey Number\n2. Search by Player Name\n");
	            printf("Enter your choice: ");
			    scanf("%d",&choice);
			    
                switch (choice)
		      	{
				case 1:
					
					index= searchByJerseyNo(p);
					if(index==-1)
						{
							printf("\nPlayer not found");
						}
					else
						{
							printf("\nJersey Number: %d,  player Name: %s,   Played Match: %d,   Number of Run: %d,   number of wicket: %d",p[index].jerseyNumber,p[index].name,p[index].playedMatch,p[index].run,p[index].wicket);
						}
					break;
			
			    case 2:
				    searchByName(p);
					index= searchByName(p);
					if(index==-1)
						{
							printf("\nPlayer is not present");
						}
					else
						{
							printf("\nJersey Number: %d,  player Name: %s,   Played Match: %d,   Number of Run: %d,   number of wicket: %d",p[index].jerseyNumber,p[index].name,p[index].playedMatch,p[index].run,p[index].wicket);
						}
					
			   }
			break;
            //update
			case 4:
			printf("1. update Player by Matches Played\n");
			printf("2. update Player by runs scored\n");
			printf("3. update Player by Wickets taken\n");
			printf("Enter your choice: ");
			scanf("%d",&choice);
			switch(choice)
			{
				case 1:
					index=searchByJerseyNo(p);
				    updateByMatch(p,index);
					break;
					
				case 2:
					index=searchByJerseyNo(p);
				    updateByRun(p,index);
					break;
				
				case 3:
				    index=searchByJerseyNo(p);
				    updateBywicket(p,index);
					break;
			}
			    
			    break;
		    //sort
			case 5:
			printf("1. Sort Player by Matches Played\n");
			printf("2. Sort Player by runs scored\n");
			printf("3. Sort Player by Wickets taken\n");
			printf("Enter your choice: ");
			scanf("%d",&choice);
			switch (choice)
			{
				case 1:
					sortingPlayerByMatches(p);
					printf("\nThe sorted player list: %d\n");
					break;
				
				case 2:
					sortingPlayerByRuns(p);
					printf("\nThe sorted player list: %d\n");
					break;
					
				case 3:
					sortingPlayerByWickets(p);
					printf("\nThe sorted player list: %d\n");
					break;
			}
			//display
			case 6:	
			    display(p,n);
			    break;
			// exit
		    case 7:
		    	printf("Thankyou");
	    }
	}while(choice != 3);	
}
