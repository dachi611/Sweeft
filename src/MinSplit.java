public class MinSplit {
    public static void main(String[] args) {
        System.out.print(minSplit(116));
    }
    static int minSplit(int amount){
        int[] change={50,20,10,5,1};
        int quantity=0;
        for(int coin : change){
            if(amount<coin){
                continue;
            }
            quantity+=amount/coin;
            amount%=coin;
            if(amount==0) break;
        }
        return quantity;
    }
}
