#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>


int main(int argc, char** argv) {
	if ( setuid(0) == -1 ) {
		printf("SUID error, unable to esculate privilage");
	} else {
		system(argv[1]);
	}
	return 0;
}
