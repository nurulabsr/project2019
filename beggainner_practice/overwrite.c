#include<stdio.h>
int main(){
    char buffer[12];
    int mod = 0;
    printf("mod= %08x \n", mod);
    gets(buffer);
    printf("mod = %08x \n", mod);
    if(mod !=0){
        printf("Successfully Changed");
    }

    else{
        printf("Not Changed");
    }
}




