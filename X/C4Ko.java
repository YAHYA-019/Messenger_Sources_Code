package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.4Ko, reason: invalid class name */
/* loaded from: 4Ko.class */
public final class C4Ko implements 4JU {
    public final 4KA A00;
    public final C4Il A01;
    public final 4KB A02;

    public C4Ko(C4Il c4Il) {
        this.A01 = c4Il;
        this.A00 = new JRk(c4Il, this, 5);
        this.A02 = new C4P0(c4Il, this, 20);
    }

    public ArrayList BEM(String str) {
        TreeMap treeMap = 4KC.A08;
        4KE A00 = 4KF.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A00.ACG(1, str);
        C4Il c4Il = this.A01;
        c4Il.A06();
        Cursor A02 = c4Il.A02(A00);
        try {
            ArrayList arrayList = new ArrayList(A02.getCount());
            while (A02.moveToNext()) {
                arrayList.add(A02.isNull(0) ? null : A02.getString(0));
            }
            return arrayList;
        } finally {
            A02.close();
            A00.A00();
        }
    }

    public void BPj(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            JRm jRm = new JRm((String) it.next(), str);
            C4Il c4Il = this.A01;
            c4Il.A06();
            c4Il.A07();
            try {
                this.A00.A04(jRm);
                c4Il.A08();
            } finally {
                C4Il.A01(c4Il);
            }
        }
    }
}
