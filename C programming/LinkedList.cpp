#include <stdio.h>
#include <stdlib.h>

struct node1
{
    int value;
    struct node1 *next;
};

struct node2
{
    int value;
    struct node2 *next;
};

struct sum
{
	int value;
	struct sum *next;
};

void Addition(struct node1 *arrow, struct node2 *arrow2)
{
	struct sum *head = NULL;
	head = (struct sum*) malloc(sizeof(struct sum));
	int carry = 0;
	
	while(arrow != NULL)
	{
		head->value = arrow->value + arrow2->value;
		
		if(head->value >= 10)
		{
			carry = head->value;
			carry = carry%10;
		}
		
		head->next->value = carry;
		arrow = arrow->next;
		arrow2 = arrow2->next;
		head = head->next;
	}
}

int main() {
	struct node1 *head;
	struct node1 *one = NULL;
	struct node1 *two = NULL;
	struct node1 *three = NULL;
	
	//Allocation
	one = (struct node1*) malloc(sizeof(struct node1));
	two = (struct node1*) malloc(sizeof(struct node1));
	three = (struct node1*) malloc(sizeof(struct node1));
	
	//Assignment of values
	one->value = 2;
	two->value = 4;
	three->value = 3;
	
	//Connection of nodes
	one->next = two;
	two->next = three;
	three->next = NULL;
	
	struct node2 *head2;
	struct node2 *one2 = NULL;
	struct node2 *two2 = NULL;
	struct node2 *three2 = NULL;
	
	//Allocation
	one2 = (struct node2*) malloc(sizeof(struct node2));
	two2 = (struct node2*) malloc(sizeof(struct node2));
	three2 = (struct node2*) malloc(sizeof(struct node2));
	
	//Assignment of values
	one2->value = 5;
	two2->value = 6;
	three2->value = 4;
	
	//Connection of nodes
	one2->next = two2;
	two2->next = three2;
	three2->next = NULL;
	
	head2 = one2;
	head = one;
	Addition(head, head2);
	
    return 0;
}