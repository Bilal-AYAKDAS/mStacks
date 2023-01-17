public class Main {

    public static void main(String[] args) {

        MStacks mStacks=new MStacks(3);


        mStacks.push(11,1);
        mStacks.push(12,1);
        mStacks.push(13,1);
        mStacks.push(13,1);

        mStacks.push(21,2);
        mStacks.push(22,2);
        mStacks.push(23,2);


            System.out.print(mStacks.pop(1));
            System.out.print(mStacks.pop(1));
            System.out.print(mStacks.pop(1));
            System.out.println("-----------------------------");
            System.out.print(mStacks.pop(2));
            System.out.print(mStacks.pop(2));
            System.out.print(mStacks.pop(2));
    }
}
