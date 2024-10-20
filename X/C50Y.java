package X;

import android.net.Uri;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.50Y, reason: invalid class name */
/* loaded from: 50Y.class */
public final class C50Y implements 50Z {
    public final C00i A01 = new 1BQ(99390);
    public final C00i A00 = new 1BV(49442);
    public final C00i A02 = new 1BQ(33013);
    public final C00i A03 = new 1BV(49445);
    public final Comparator A04 = new AHU(this, 4);

    public void AF8(java.util.Map map) {
        int size = map.size();
        C00i c00i = this.A00;
        if (size >= ((50W) c00i.get()).A00()) {
            TreeMap treeMap = new TreeMap(this.A04);
            long now = ((C0dp) this.A01.get()).now();
            for (Map.Entry entry : map.entrySet()) {
                C50c c50c = (C50c) entry.getValue();
                if (now - c50c.A00 > ((50W) c00i.get()).A01()) {
                    treeMap.put(c50c, entry.getKey());
                }
            }
            int size2 = (map.size() - ((50W) c00i.get()).A00()) + ((int) ((2yD) ((50W) c00i.get()).A00.get()).Auy(36592339680428737L));
            1Ql edit = ((2yD) ((50W) c00i.get()).A00.get()).AZk(36310864702277026L) ? ((FbSharedPreferences) this.A02.get()).edit() : null;
            for (String str : treeMap.values()) {
                if (size2 <= 0) {
                    break;
                }
                if (map.remove(str) != null) {
                    size2--;
                }
                if (edit != null) {
                    edit.CfI(C50b.A04.A0D(Uri.encode(str)));
                }
            }
            if (edit != null) {
                edit.commit();
            }
        }
    }

    public void BPL(java.util.Map map) {
        this.A03.get();
        HashMap A00 = C50a.A00((FbSharedPreferences) this.A02.get());
        AF8(A00);
        for (Map.Entry entry : A00.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }
}
