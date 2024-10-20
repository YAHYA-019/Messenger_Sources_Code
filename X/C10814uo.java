package X;

import android.database.Cursor;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.4uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uo.class */
public final class C10814uo implements InterfaceC10724uf {
    public static final String[] A04 = (String[]) 1Dz.A02(C10734ug.A1Y, C10824up.A0B);
    public final Cursor A00;
    public final C10734ug A01;
    public final CDt A02;
    public final C10824up A03;

    public C10814uo(Cursor cursor) {
        AbR abR = (AbR) 1Bn.A0B(325);
        AbR abR2 = (AbR) 1Bn.A0B(328);
        AbR abR3 = (AbR) 1Bn.A0B(326);
        this.A00 = cursor;
        this.A01 = abR.A0N(cursor, "timestamp_in_folder_ms");
        this.A03 = abR2.A0Q(cursor);
        this.A02 = abR3.A0O(cursor, "thread_key");
    }

    @Override // X.InterfaceC10724uf
    public ThreadSummary BfR() {
        if (!this.A00.moveToNext()) {
            return null;
        }
        C10734ug c10734ug = this.A01;
        CDt cDt = this.A02;
        C1zm A01 = c10734ug.A01(cDt);
        c10734ug.A02(cDt, A01);
        this.A03.A00(cDt, A01);
        ThreadSummary threadSummary = new ThreadSummary(A01);
        cDt.A00.getLong(c10734ug.A0L);
        return threadSummary;
    }

    @Override // X.InterfaceC10724uf, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
