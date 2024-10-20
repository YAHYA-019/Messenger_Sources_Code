package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4DJ, reason: invalid class name */
/* loaded from: 4DJ.class */
public final class C4DJ {
    public final /* synthetic */ 4DH A00;

    public C4DJ(4DH r302) {
        this.A00 = r302;
    }

    public long A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis + 86400000;
        1Ql A0V = 1BL.A0V(this.A00.A05);
        A0V.CaH(4DH.A07, currentTimeMillis);
        A0V.CaH(4DH.A08, j);
        A0V.commit();
        return 86400000L;
    }

    public long A01() {
        long currentTimeMillis = System.currentTimeMillis() - ((FbSharedPreferences) this.A00.A05.get()).Av1(4DH.A07, 0L);
        if (86400000 >= currentTimeMillis) {
            return 86400000 - currentTimeMillis;
        }
        return 0L;
    }
}
