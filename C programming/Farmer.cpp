#include <stdio.h>
#include <math.h>

int main()
{
	//INITIALIZE
	int land[6][5] = {
		{0, 1, 1, 1, 1},
		{1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1},
		{1, 1, 1, 1, 1},
		{0, 0, 0, 0, 0}
	};
<<<<<<< HEAD
	
=======
>>>>>>> refs/remotes/origin/main
	int i, j, count, sum, row, column, k, l, max = 0, flag = 0; 
	
	//TRAVERSE
	for(i = 0; i<6; i++)
	{
		for(j = 0; j<5; j++)
		{
			count = 0;
			sum = 0;
			row = 0;
			column = 0;
			printf("i = %d : j = %d\n", i, j);
			
			if(land[i][j] == 1)
			{
				row = i;
				column = j;
				
				while(land[row][column] != 0 && row < 6 && column < 5)
				{
					count += 1;
					row += 1;
					column += 1;
					
					printf("%d %d %d\n", count, row, column);
				}
				
				row = i;
				
				printf("Termination\n");
				
				if(count >= 1)
				{
					k = 0;
					while(k < count)
					{
						flag = 0;
						l = 0;
						column = j;
						while(l < count)
						{
							if(land[row][column] == 0)
							{
								flag = 1;
								break;
							}
							else
							{
								sum += 1;
								printf("Sum: %d\n", sum);
							}
							
							column++;
							l++;
						}
						
						if(flag == 1)
						{
							break;
						}
						
						row++;
						k++;
					}
				}
			}
		
			if(sum > max)
			{
				max = sum;
			}
		}
	}
	
	int sides = sqrt(max);
	
	printf("Area: %d\nSize: %d x %d", max, sides, sides);
	
	return 0;
}
