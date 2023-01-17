public class MStacks <T>{
    Object[] stacks;
    int[] indexofTops;
    int stacksSize;
    int[] lenghtStack;

    public MStacks(int M) {
        this.stacksSize =3;
        this.stacks = new  Object[M*stacksSize];
        this.lenghtStack=new int[M+1];
        this.indexofTops = new int[M+1];
        for (int i=0;i<M+1;i++)
            indexofTops[i]=-1;

    }
    public boolean isFull(int stackNumber){
        return (this.lenghtStack[stackNumber]==this.stacksSize);
    }
    public boolean isEmpty(int stackNumber){
        return (this.lenghtStack[stackNumber]==-1);
    }

    public void push(T value,int stackNumber){
        if (this.isFull(stackNumber)){
            System.out.println("Stacks are overflow.");
        }else {
            if (this.indexofTops[stackNumber] == -1){
                this.indexofTops[stackNumber] = (stackNumber-1)*this.stacksSize;
                this.stacks[this.indexofTops[stackNumber]] = value;
                this.lenghtStack[stackNumber]=1;
            }else {
                this.indexofTops[stackNumber] +=1;
                this.stacks[this.indexofTops[stackNumber]] = value;
                this.lenghtStack[stackNumber]+=1;
            }
        }
    }
    public T pop(int  stackNumber){
        if (this.isEmpty(stackNumber)){
            System.out.println("Stack is empty.");
            return null;
        }else {
            T current = (T) this.stacks[this.indexofTops[stackNumber]];
            this.indexofTops[stackNumber]-=1;
            this.lenghtStack[stackNumber]-=1;
            return (T)current;
        }
    }
}
