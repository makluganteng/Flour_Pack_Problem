package academy.learnprogramming;
/* Hey the explanation is pretty simple I hope you have understood the upper part until the bigCount, smallCount and goal.

So let's begin... let's assume goal = 9kg. It means you have to make a package that contains 9kg of flour. Now bigCount= 2 (means 10kg) and smallCount = 0.

How much flour you have (bigCount*5) + smallCount = 10kg do you have enough flour to make a package? Yes. Can you make a package of 9kg? No. Because you have two bags of 5kg each and you cannot take 1kg out from any bag.

Consider second scenario let's assume goal = 9kg. It means, you have to make a package that contains 9kg of flour.

Now bigCount= 1 (means 5kg) and smallCount = 5 (means 5kg).

Now you still have 10kg of flour but the question is, can you make a package without taking any flour from any bag? this time, Yes.

5kg + 1kg + 1kg + 1kg +1kg = 9kg and 1kg extra.

Simply telling you, you can have extra flour but you cannot take flour from bags just to reach the goal. */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigCountKilo = bigCount*5;
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(bigCountKilo+smallCount*1 == goal){
            return true;
        }else if((bigCountKilo>=goal && bigCountKilo%goal == 0)||(bigCountKilo>=goal && goal % 5 <= smallCount)){
            return true;
        }else if(smallCount>=goal){
            return true;
        }else if(bigCountKilo+smallCount>goal && goal % bigCountKilo <= smallCount){
            return true;
        }else{
            return false;
        }
    }

        /*int bigCountKg = bigCount * 5;
        int smallCountKg = smallCount;
        if(bigCountKg < 0 || smallCountKg < 0 || goal < 0){
            return false;
        }else{
            int total = bigCountKg+smallCountKg;
            if(total >= goal){
                if(bigCountKg >= goal && bigCountKg % goal == 0){
                    return true;
                }else if(bigCountKg % goal == 0 && bigCountKg + smallCountKg >= goal){
                    return true;
                }else if(bigCountKg < goal && bigCountKg + smallCountKg >= goal){
                    return true;
                }else{
                    return false;
                }
        }*/
        }


