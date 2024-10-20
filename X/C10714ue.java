package X;

import android.database.Cursor;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.4ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ue.class */
public final class C10714ue implements InterfaceC10724uf {
    public static final String[] A04 = (String[]) 1Dz.A02(C10734ug.A1Y, C10804un.A1A);
    public final Cursor A00;
    public final C10734ug A01;
    public final CDt A02;
    public final C10804un A03;

    public C10714ue(Cursor cursor, String str) {
        AbR abR = (AbR) 1Bn.A0B(325);
        AbR abR2 = (AbR) 1Bn.A0B(327);
        AbR abR3 = (AbR) 1Bn.A0B(326);
        this.A00 = cursor;
        this.A01 = abR.A0N(cursor, str);
        this.A03 = abR2.A0P(cursor);
        this.A02 = abR3.A0O(cursor, "thread_key");
    }

    public C7pQ A00() {
        if (!this.A00.moveToNext()) {
            return null;
        }
        C10734ug c10734ug = this.A01;
        CDt cDt = this.A02;
        C1zm A01 = c10734ug.A01(cDt);
        c10734ug.A02(cDt, A01);
        this.A03.A00(cDt, A01);
        return new C7pQ(new ThreadSummary(A01), cDt.A00.getLong(c10734ug.A0L));
    }

    @Override // X.InterfaceC10724uf
    public ThreadSummary BfR() {
        C7pQ A00 = A00();
        if (A00 != null) {
            return A00.A01;
        }
        return null;
    }

    @Override // X.InterfaceC10724uf, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
