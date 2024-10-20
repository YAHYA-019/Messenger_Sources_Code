package X;

import android.content.Intent;
import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;

/* loaded from: FuI.class */
public final class FuI implements 5Y3 {
    public final int A00;
    public final Object A01;

    public FuI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, X.FtV] */
    public /* bridge */ /* synthetic */ void CKJ(Object obj) {
        40Y r308;
        boolean z;
        switch (this.A00) {
            case 0:
                FJ7.A06((FJ7) this.A01);
                return;
            case 1:
                ((GGm) this.A01).CHa((ETV) obj, true);
                return;
            case 2:
                boolean A1V = AnonymousClass001.A1V(obj);
                Fud fud = (Fud) this.A01;
                if (!A1V) {
                    r308 = (40Y) fud.A01.get();
                    z = false;
                } else {
                    if (Fud.A01(fud)) {
                        return;
                    }
                    r308 = (40Y) fud.A01.get();
                    z = true;
                }
                r308.A01(z);
                return;
            default:
                String str = (String) obj;
                Fud fud2 = (Fud) this.A01;
                0fH.A0A(Fud.class, 1BJ.A00(659));
                C00i c00i = fud2.A02;
                ((1I7) c00i.get()).CkT(1BJ.A00(87));
                3oH r0 = ((ZeroSDKServiceProvider) fud2.A05.get()).A00;
                3oF A00 = r0 == null ? 3oF.A0L : new Object().A00((Eqk) r0.getState());
                String str2 = A00.A0H;
                if (str2 == null) {
                    str2 = "unknown";
                }
                String str3 = A00.A0K;
                String str4 = str3 != null ? str3 : "unavailable";
                if (!DKE.A1Y(fud2.A03) || Fud.A01(fud2)) {
                    return;
                }
                if ((1BK.A0N(fud2.A04).AZr(1GD.A05, 2342157601946542148L) && str.equals("unknown")) || str4.equals("unavailable")) {
                    return;
                }
                0fH.A07(Fud.class, Boolean.valueOf(Fud.A01(fud2)), "zero rating available over wifi: %b");
                0fH.A07(Fud.class, str, "zero rating status: %s");
                0fH.A07(Fud.class, str2, "registration status: %s");
                0fH.A07(Fud.class, str4, "unregistered reason: %s");
                Intent A0A = 4YU.A0A("com.facebook.zero.ZERO_RATING_STATE_UNREGISTERED_REASON");
                A0A.putExtra("unregistered_reason", str4);
                ((1I7) c00i.get()).CkS(A0A);
                return;
        }
    }
}
