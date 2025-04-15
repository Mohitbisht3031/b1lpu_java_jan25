package Day31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ths = new TreeSet<>();
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        System.out.println(s.size());
    }
}
