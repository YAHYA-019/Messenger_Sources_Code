package X;

import java.util.ArrayList;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AHd.class */
public final class AHd implements Function {
    public final /* synthetic */ String A00;

    public AHd(String str) {
        this.A00 = str;
    }

    @Override // java.util.function.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Function1 function1;
        IDO ido = IDO.A00;
        String str = this.A00;
        ido.A03("RpStores", 0Pz.A0W("Creating store for ", str), (Throwable) null);
        AVK avk = new AVK(new Function2[]{AKF.A00, AKG.A00});
        8LW r0 = new 8LW((2JS) null, 7zM.A1F());
        int[] iArr = {0, 1, 2};
        ArrayList A0t = AnonymousClass001.A0t(3);
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 == 0) {
                function1 = new C9fw().A03;
            } else if (i2 == 1) {
                function1 = 9FY.A00;
            } else {
                if (i2 != 2) {
                    throw AnonymousClass001.A0L(String.format(DKB.A00(0), AnonymousClass001.A1a(i2)));
                }
                function1 = 9Fa.A00;
            }
            A0t.add(function1);
            i++;
        } while (i < 3);
        5Vs A00 = C9dr.A00(r0, new GAk(A0t, C9lt.A03, str, 1, !C9lt.A00.A00), avk);
        11T.A0I(A00, "null cannot be cast to non-null type com.facebook.rp.platform.statemanagement.RpStore");
        return A00;
    }
}
