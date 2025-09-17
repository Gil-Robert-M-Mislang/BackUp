#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>


int main()
{
    int w;
    int h;
    scanf("%d%d", &w, &h); fgetc(stdin);
    for (int i = 0; i < h; i++) {
        char ROW[256] = "";
        scanf("%[^\n]", ROW); fgetc(stdin);
    }
    for (int i = 0; i < h; i++) {
        
	   	if(strcmp(ROW, "S") == 0)
		{
			strcpy(ROW, "0");		
		}
		else if(strcmp(ROW, ".") == 0)
		{	
			for(int j = 0; j<2; j++)
	        {
	        	for(int k = 0; k<2; k++)
	        	{
	        		if(strcmp(ROW,))
				}	
			}
		}
		
		printf(ROW);
    }

    return 0;
}