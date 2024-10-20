package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4L5, reason: invalid class name */
/* loaded from: 4L5.class */
public final class C4L5 {
    public final 1Br A00 = 1Bq.A00(33013);
    public final 1Br A01 = 1Bq.A00(65997);

    public final boolean A00() {
        boolean z = false;
        if (((FbSharedPreferences) this.A00.A00.get()).AZn(1NK.A4w, false)) {
            C1ud c1ud = (C1ud) this.A01.A00.get();
            0fH.A0j("EncryptedBackupsGatingUtil", "exposed shouldShowHighFrictionRestoreFlow");
            if (C1ud.A00(c1ud).AZr(c1ud.A02, 36316426688669670L)) {
                z = true;
            }
        }
        return z;
    }
}
