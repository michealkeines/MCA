#include <stdlib.h>
#include <stdio.h>

int main(int argc, char ** argv) {
	printf("Running command %s\n",argv[1]);
	system(argv[1]);
	return 0;
}
