// Online C compiler to run C program online
#include <stdio.h>
#include <time.h>

int main() {
    clock_t start_time, end_time;
    double actual_time;
	start_time = clock();
    
    int n = 36;
    int sum = 0; 
	for(int i = 0; i < n; ++i ) 
		for(int j = 0; j < n * n; ++j ) 
			++sum; 
    	
    end_time = clock(); 
	actual_time = ((double) (end_time - start_time)) * 1000/ CLOCKS_PER_SEC;
	printf("For n = %d \n", n);
	printf("The time it takes is %.3f milliseconds", actual_time);
	
    return 0;
}