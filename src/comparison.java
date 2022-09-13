public class comparison {
    public static void main(String[] args){
        System.out.println(1 == 2);
        int temp = 222;
        boolean isWarm = temp > 200 && temp < 300;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligable = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligable);

        //1:46.00 in https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
    }
}
