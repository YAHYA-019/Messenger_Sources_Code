package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bo.class */
public final class C04684bo {
    public final 2V0 A00;
    public final C00i A01 = new 1BQ(16511);
    public final C00i A02 = new 1BQ(16520);
    public final C04724bs A03;
    public final String A04;

    public C04684bo(FbUserSession fbUserSession, String str) {
        this.A03 = (C04724bs) 1Lo.A06(fbUserSession, 49178);
        this.A04 = str;
        this.A00 = 4cM.A00(new 2V0[]{new 2Uy("service_type", str), new 2Uy("service_subkey", ""), new 2Uy("service_tertiary_key", "")});
    }

    public void A00() {
        SQLiteDatabase AUF = this.A03.AUF();
        2V0 r0 = this.A00;
        AUF.delete("units", r0.A02(), r0.A03());
    }
}
