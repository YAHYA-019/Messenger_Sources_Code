package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.Ac1, reason: case insensitive filesystem */
/* loaded from: Ac1.class */
public final class C1259Ac1 implements 1Xc {
    public 1BY A00;
    public final C00i A05 = 1BQ.A02(83604);
    public final C00i A02 = AbH.A0S();
    public final C00i A04 = 1BQ.A02(65755);
    public final C00i A01 = 1BQ.A01();
    public final C15h A03 = new DBS(1Bn.A0B(16428), this, 8);

    public C1259Ac1(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public String BB2() {
        return "ServerMutedUntilPostUpgradeInit";
    }

    public void init() {
        int i;
        int A03 = 0FI.A03(1527189207);
        if (this.A05.get() == C0et.A0U || !((1Ex) this.A04.get()).BTw()) {
            i = -1913727259;
        } else {
            C00i c00i = this.A02;
            FbSharedPreferences A0R = 1BK.A0R(c00i);
            1G2 r0 = 1NK.A3l;
            if (A0R.BNM(r0)) {
                i = -515358057;
            } else {
                SQLiteDatabase A01 = C10654u8.A01(this.A03);
                2Uy A0G = AbF.A0G("key", "server_muted_until");
                Cursor cursor = null;
                long j = 0;
                try {
                    try {
                        cursor = A01.query("properties", new String[]{"value"}, A0G.A02(), A0G.A03(), null, null, null);
                        if (cursor.moveToFirst()) {
                            j = cursor.getLong(0);
                            4YW.A0C(A01, A0G, "properties");
                        }
                    } catch (IllegalStateException e) {
                        1BK.A09(this.A01).softReport("ServerMutedUntilPostUpgradeInit", 0Pz.A0U("Caught exception when migrating server mute settings. Migrating with: ", j), e);
                    }
                    1Ql A0V = 1BL.A0V(c00i);
                    A0V.CaH(r0, j);
                    A0V.commit();
                    if (cursor != null) {
                        cursor.close();
                    }
                    i = 1982219464;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        }
        0FI.A09(i, A03);
    }
}
