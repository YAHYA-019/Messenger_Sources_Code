package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C51.class */
public final class C51 {
    public 1BY A00;
    public final 82O A01 = (82O) 1Bn.A0B(324);
    public final C15h A02;
    public final C15h A03;
    public volatile boolean A04;

    public C51(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A03 = new DBS(fbUserSession, this, 4);
        this.A02 = new DBS(fbUserSession, this, 5);
    }

    public ThreadSummary A00(ThreadKey threadKey) {
        Cursor A07;
        SQLiteDatabase A01 = C10654u8.A01(this.A02);
        if (!A01.isOpen() || (A07 = ((C7d2) this.A03.get()).A07(A01, "thread_key=?", null, CkD.A05, new String[]{threadKey.toString()})) == null) {
            return null;
        }
        C10714ue A0A = this.A01.A0A(A07, (String) null);
        try {
            ThreadSummary BfR = A0A.BfR();
            A0A.close();
            return BfR;
        } catch (Throwable th) {
            try {
                A0A.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }
}
