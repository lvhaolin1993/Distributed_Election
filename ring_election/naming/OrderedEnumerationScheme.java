/*
 * Decompiled with CFR 0_118.
 */
package davis.naming;

import davis.naming.IdScheme;
import java.util.ArrayList;
import java.util.List;

public class OrderedEnumerationScheme
implements IdScheme {
    @Override
    public List<Integer> get(int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            arrayList.add(i);
        }
        return arrayList;
    }
}

