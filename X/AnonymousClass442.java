package X;

import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;

/* renamed from: X.442, reason: invalid class name */
/* loaded from: 442.class */
public final class AnonymousClass442 implements C43c {
    public final 1Br A00 = 1Bq.A00(66191);
    public final 1Br A03 = 1Bq.A00(16634);
    public final 1Br A02 = 1Bq.A00(16504);
    public final 1Br A01 = 1Bq.A00(16687);
    public final 1Br A05 = 1Bq.A00(116294);
    public final 1BP A06 = FbInjector.A00;
    public final 1Br A04 = 1Bq.A00(16386);

    public static TelephonyManager A00(1UG r301, C00i c00i, String str, String str2) {
        r301.A7R(str, str2);
        return ((1qC) c00i.get()).A00;
    }

    private final String A01() {
        NetworkInfo A01 = FbNetworkManager.A01((FbNetworkManager) this.A01.A00.get(), null, false);
        if (A01 == null) {
            return "unknown";
        }
        int type = A01.getType();
        return type != 0 ? type != 1 ? type != 6 ? type != 7 ? type == 9 ? "ethernet" : "unknown" : "bluetooth" : "wimax" : "wifi" : 4YT.A00(276);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0244  */
    @Override // X.C43c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BbL(X.C43a r302) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass442.BbL(X.43a):void");
    }
}
