package X;

import android.database.Cursor;
import java.util.TreeMap;

/* renamed from: X.4K9, reason: invalid class name */
/* loaded from: 4K9.class */
public final class C4K9 implements 4JV {
    public final C4Il A00;
    public final 4KB A01;
    public final 4KB A02;
    public final 4KA A03;

    public C4K9(C4Il c4Il) {
        this.A00 = c4Il;
        this.A03 = new JRk(c4Il, this, 2);
        this.A01 = new C4P0(c4Il, this, 0);
        this.A02 = new C4P0(c4Il, this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.4Kj] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.4Kj] */
    public C4Kj BE5(C4Ki c4Ki) {
        String str = c4Ki.A01;
        int i = c4Ki.A00;
        TreeMap treeMap = 4KC.A08;
        4KE A00 = 4KF.A00("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        A00.ACG(1, str);
        A00.ACB(2, i);
        C4Il c4Il = this.A00;
        c4Il.A06();
        String str2 = null;
        Cursor A02 = c4Il.A02(A00);
        try {
            int A01 = 4KW.A01(A02, "work_spec_id");
            int A012 = 4KW.A01(A02, "generation");
            int A013 = 4KW.A01(A02, "system_id");
            if (A02.moveToFirst()) {
                if (!A02.isNull(A01)) {
                    str2 = A02.getString(A01);
                }
                str2 = new C4Kj(str2, A02.getInt(A012), A02.getInt(A013));
            }
            A02.close();
            A00.A00();
            return str2;
        } catch (Throwable th) {
            A02.close();
            A00.A00();
            throw th;
        }
    }

    public void BPi(C4Kj c4Kj) {
        C4Il c4Il = this.A00;
        c4Il.A06();
        c4Il.A07();
        try {
            this.A03.A04(c4Kj);
            c4Il.A08();
        } finally {
            C4Il.A01(c4Il);
        }
    }
}
