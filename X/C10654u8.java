package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4u8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4u8.class */
public final class C10654u8 {
    public final 4uA A00;

    public C10654u8(FbUserSession fbUserSession) {
        this.A00 = (4uA) 1Lo.A06(fbUserSession, 1Bi.A03(83604) == C0et.A0C ? 131231 : 49347);
    }

    public static SQLiteDatabase A00(C00i c00i) {
        return ((C10654u8) c00i.get()).A00.AUF();
    }

    public static SQLiteDatabase A01(C15h c15h) {
        return ((C10654u8) c15h.get()).A00.AUF();
    }
}
