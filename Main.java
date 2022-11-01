import java.io.PrintWriter;
import java.util.*;

public class Main {

    final public static long MOD = 1791791791;

    public static int get_hash(String word) {
        long hash = 0, pow = 1;
        for (int i = 0; i < word.length(); ++i) {
            hash = (hash + word.charAt(i) * pow) % MOD;
            pow = (pow * 179) % MOD;
        }
        return (int) hash;
    }

    public static class HashTable {

        private static final int size = 1024;
        private ArrayList< Integer >[] table;

        public HashTable() {
            table = new ArrayList[size];
            for (int i = 0; i < size; ++i) {
                table[i] = new ArrayList<>();
            }
        }

        public void add(int hash) {
            table[hash % size].add(hash);
        }

        public void remove(int hash) {
            int index = hash % size;
            int id = table[index].indexOf(hash);
            if (id >= 0 && id < table[index].size()) {
                table[index].remove(id);
            }
        }

        public boolean contatins(int hash) {
            int index = hash % size;
            for (Integer number : table[index]) {
                if (number.equals(hash)) {
                    return true;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashTable hashTable = new HashTable();
        while (true) {
            String line = in.nextLine();
            if (line.charAt(0) == '#') {
                break;
            } else {
                String word = line.split(" ")[1];
                if (line.charAt(0) == '+') {
                    hashTable.add(get_hash(word));
                } else if (line.charAt(0) == '?') {
                    if (hashTable.contatins(get_hash(word))) {
                        out.println("YES");
                    } else {
                        out.println("NO");
                    }
                } else {
                    hashTable.remove(get_hash(word));
                }
            }

        }
        out.close();
        in.close();
    }
}
