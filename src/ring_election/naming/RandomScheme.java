/*
 * Decompiled with CFR 0_118.
 */
package davis.naming;

import davis.naming.IdScheme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomScheme
implements IdScheme {
    @Override
    public List<Integer> get(int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 2 * n; ++i) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        return arrayList;
    }
}

