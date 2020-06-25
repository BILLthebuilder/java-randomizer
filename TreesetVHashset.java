import java.util.TreeSet;
import java.util.HashSet;

public class TreesetVHashset {
    static TreeSet<Integer> tree = new TreeSet<>();
    static HashSet<Integer> hash = new HashSet<>();

    public static long startTime() {
        final long startTime = System.nanoTime();
        return startTime;
    }
    
    public static long endTime() {
        final long endTime = System.nanoTime();
        return endTime;
    }
    
   public static void hashsetTime() {
       final long starthash = startTime();
       hash.add(5000000);
       final long endhash = endTime();

       final long startHashremove = startTime();
       hash.remove(5000000);
       final long endHashremove = endTime();
       System.out.println(
               "The hashset has taken" + " " + (endhash - starthash) + " " + "nanoseconds to add the elements");
       System.out.println(
               "The hashset has taken" + " " + (endHashremove - startHashremove) + " " + "nanoseconds to remove the elements");
       
    }

    public static void treesetTime() {
        final long startTree = startTime();
        tree.add(5000000);
        final long endTree = endTime();

        final long startTreeremove = startTime();
        tree.remove(5000000);
        final long endTreeremove = endTime();

        System.out.println(
                "The treeset has taken" + " " + (endTree - startTree) + " " + "nanoseconds to add the elements");
        System.out.println(
                "The treeset has taken" + " " + (endTreeremove - startTreeremove) + " " + "nanoseconds to remove the elements");
    }

    public static void main(String args[]) {
        treesetTime();
       System.out.println();
        hashsetTime();
    }
}
