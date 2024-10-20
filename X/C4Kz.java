package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: X.4Kz, reason: invalid class name */
/* loaded from: 4Kz.class */
public final class C4Kz implements 4JT {
    public final 4KA A00;
    public final C4Il A01;

    public C4Kz(C4Il c4Il) {
        this.A01 = c4Il;
        this.A00 = new JRk(c4Il, this, 0);
    }

    public ArrayList AhM(String str) {
        TreeMap treeMap = 4KC.A08;
        4KE A00 = 4KF.A00("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            A00.ACC(1);
        } else {
            A00.ACG(1, str);
        }
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
}
