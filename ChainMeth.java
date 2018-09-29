package lesson8;

public class ChainMeth {
    int[] keys;
    int[] head;
    int[] next;
    int headNum;
    int cnt = 1;

    ChainMeth(int headNum, int maxSize) {
        this.headNum = headNum;
        head = new int[headNum];
        next = new int[maxSize + 1];
        keys = new int[maxSize + 1];
    }

    int hash(int x) {
        return (x >> 15) ^ x;
    }

    int index(int hash) {
        return Math.abs(hash) % headNum;
    }

    boolean contains(int x) {
        int h = index(hash(x));
        for (int i = head[h]; i != 0; i = next[i]) {
            if (keys[i] == x)
                return true;

        }
        return false;
    }

    boolean insert(int x) {
        if (this.contains(x))
            return false;
        int h = index(hash(x));
        next[cnt] = head[h];
        keys[cnt] = x;
        head[h] = cnt++;
        return true;
    }
    
}
