#include<stdio.h>
#include<string.h>


int main(void){

    char buff[15];
    int pass = 0;
    printf("\n Enter the password: \n");
    gets(buff);

    if(strcmp(buff, "thegreekstuff")){
        printf("\n Wrong Password \n");
    }

    else{
        printf("\n Correct Password \n");
        pass = 1;
    }
    if(pass){
        /* Now give root or admin rights the users */
        printf("\n Root Privilages given to the value \n");
    }
    return 0;
}