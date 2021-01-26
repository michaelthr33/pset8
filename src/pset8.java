public class pset8 {

    // exercise 1
    public boolean common(int[] a, int[] b){
        int afinalindex = a.length - 1;
        int bfinalindex = b.length - 1;
        if(a == null||b==null||a.length == 0 || b.length == 0){
            return false;
    }
        else if(a[afinalindex]==b[bfinalindex]||a[0]==b[0]){
            return true;
        }
        else{
            return false;
        }
}
// exercise 2
    public int[] middleMan(int[] a, int[] b){
        int afinalindex = a.length-1;
        int bfinalindex = b.length-1;
        int amiddle = afinalindex/2;
        int bmiddle = bfinalindex/2;
        int[] middle = new int[2];
        if(a == null||b==null||a.length == 0 || b.length == 0||a.length%2 == 0||b.length%2 == 0){
            return null;
    }
        else if(a[amiddle]==b[bmiddle]){
            middle[0]=a[amiddle];
            middle[1]=b[bmiddle];
            return middle;
        }
        else{
            return null;
        }

    }
    //exercise 3
    public int[] bigger(int[] a,int[] b){
        int afinalindex = a.length-1;
        int bfinalindex = b.length-1;
        int asum = a[afinalindex];
        int bsum = b[bfinalindex];
        while(afinalindex > 0){
            asum = asum + a[afinalindex-1];
            afinalindex = afinalindex-1;
        }
        while(bfinalindex >0){
            bsum = bsum+b[bfinalindex-1];
            bfinalindex = bfinalindex-1;
        }
        if (a == null||b == null){
            return null;
        }
        else if(asum>=bsum){
            return a;
        }
        else if(bsum> asum){
            return b;
        }
        else{
            return null;
        }


    }
    // exercise 4
    public int[] doubleMiddle(int[] a, int[] b){
        int afinalindex = a.length -1;
        int bfinalindex = b.length -1;
        int auppermiddle = a.length/2;
        int alowermiddle = auppermiddle -1;
        int buppermiddle = b.length/2;
        int blowermiddle = buppermiddle-1;
        int[] combo = new int[4];
        if(a== null||b==null||a.length ==0 || b.length == 0 || a.length%2 != 0 || b.length%2 !=0){
            return null;
        }
        else{
            combo[0] = a[alowermiddle];
            combo[1] = a[auppermiddle];
            combo[2] = b[blowermiddle];
            combo[3] = b[buppermiddle];
            return combo;
        }
    }
    //exercise 5
    public int[] swapMe(int[] a){
        int afinalindex = a.length-1;
        if(a == null){
            return null;
        }
        else{
            int afinalvalue = a[afinalindex];
            a[afinalindex] = a[0];
            a[0] = afinalvalue;
            return a;
        }
    }
    //exercise 6
    public int[] threeProng(int[] a){
        int afinalindex = a.length -1;
        int amiddle = afinalindex/2;
        int[] firstmidlast = new int[3];
        if(a == null|| a.length == 0|| a.length%2 == 0){
            return null;
        }
        else{
            firstmidlast[0] = a[0];
            firstmidlast[1] = a[amiddle];
            firstmidlast[3] = a[afinalindex];
            return firstmidlast;
        }
    }
    //exercise 7
    public int headHoncho(int[] a){
        int afinalindex = a.length-1;
        int counter = afinalindex;
        int test = 0;
        int max = -1;
        while(counter>=0){
            if(a[counter]<0){
                test = -1;
            }
            counter = counter -1;
        }
        if(a == null || a.length == 0 ||test ==-1){
            return -1;
        }
        else{
            while(afinalindex>=0){
                if(a[afinalindex]>max){
                    a[afinalindex] = max;
                }
                afinalindex = afinalindex-1;
            }
            return max;
        }
    }
    // exercise 8
    public boolean tippingPoint(int[] a,int threshold){
        int afinalindex = a.length-1;
        int asum = afinalindex;
        while(afinalindex > 0){
            asum = asum + a[afinalindex-1];
            afinalindex = afinalindex-1;
        }
        if(a == null){
            return false;
        }
        else if(asum> threshold){
            return true;
        }
        else{
            return false;
        }
    }
    // exercise 9
    public static String halfway(int[] a){
        int afinalindex = a.length-1;
        int auppermin = a.length/2;
        int alowermax = auppermin - 1;
        int aleft = 0;
        int aright = 0;
        int counterleft = 0;
        int counterright = auppermin;

        while(counterleft <= alowermax){
            aleft = a[counterleft]+aleft;
            counterleft= counterleft+1;
        }
        while(counterright <= afinalindex){
            aright = a[counterright]+aright;
            counterright = counterright+1;
        }
        if(a == null || a.length == 0 || a.length%2 != 0){
            return null;
        }
        else if(aleft>aright){
            return "LEFT";
        }
        else if(aright>=aleft){
            return "RIGHT";
        }
        else{
            return null;
        }
    }
    // exercise 10
    public int[] sequential(int[] a, int[] b){
        int[] sequence = new int[3];
        if(a==null||b==null||b.length+a.length > 3){
            return null;
        }
        else if(a.length >=3){
            sequence[0] = a[0];
            sequence[1] = a[1];
            sequence[2] = a[2];
            return sequence;
        }
        else if(a.length == 2){
            sequence[0] = a[0];
            sequence[1] = a[1];
            sequence[2] = b[0];
            return sequence;
        }
        else if(a.length ==1){
            sequence[0] = a[0];
            sequence[1] = b[0];
            sequence[2] = b[1];
            return sequence;
        }
        else if(a.length ==0){
            sequence[0] = b[0];
            sequence[1] = b[1];
            sequence[2] = b[2];
            return sequence;
        }
        else{
            return null;
        }
    }
}
