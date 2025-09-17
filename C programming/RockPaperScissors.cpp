#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main()
{
	char computerChoice[3][10] = {"rock", "paper", "scissors"};
	int index = 0;
	
	while(true)
	{
		int i = 0;
		char userChoice[] = "";
		
		index = rand() % 3 + 1;
		
		printf("\nEnter your choice: ");
		scanf("%s", &userChoice);
		
		while(userChoice[i] != '\0')
		{
			userChoice[i] = tolower(userChoice[i]);
			i++;
		}
		
		
		if(strcmp(userChoice, "quit") == 0)
		{
			break;
		}
		
		printf("The computer chose: %s", computerChoice[index - 1]);
		
		if(strcmp(userChoice, "rock") == 0 && strcmp(computerChoice[index - 1], "paper") == 0)
		{
			printf("\nYou Lose");
		}
		else if(strcmp(userChoice, "rock") == 0 && strcmp(computerChoice[index - 1], "scissors") == 0)
		{
			printf("\nYou Win");
		}
		else if(strcmp(userChoice, "paper") == 0 && strcmp(computerChoice[index - 1], "scissors") == 0)
		{
			printf("\nYou Lose");
		}
		else if(strcmp(userChoice, "paper") == 0 && strcmp(computerChoice[index - 1], "rock") == 0)
		{
			printf("\nYou Win");
		}
		else if(strcmp(userChoice, "scissors") == 0 && strcmp(computerChoice[index - 1], "rock") == 0)
		{
			printf("\nYou Lose");
		}
		else if(strcmp(userChoice, "scissors") == 0 && strcmp(computerChoice[index - 1], "paper") == 0)
		{
			printf("\nYou Win");
		}
		else if(strcmp(userChoice, computerChoice[index - 1]) == 0)
		{
			printf("\nIt's a draw");
		}
	}
	
	return 0;
}