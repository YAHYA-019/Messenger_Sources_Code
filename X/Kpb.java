package X;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: Kpb.class */
public final class Kpb {
    public static Kpb A02;
    public final ArrayList A00 = AnonymousClass001.A0t(8);
    public final LDF A01 = LDF.A00();

    public final void A00(Bundle bundle) {
        LDF ldf = this.A01;
        if (ldf.A01 == null) {
            return;
        }
        ArrayList arrayList = this.A00;
        4YU.A1W(arrayList, System.currentTimeMillis());
        if (arrayList.size() < 8) {
            return;
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                arrayList.clear();
                LDF.A02(new C3203Jme(bundle, ldf, jArr), ldf);
                return;
            } else {
                Object obj = arrayList.get(i2);
                11T.A0A(obj);
                jArr[i2] = AnonymousClass001.A05(obj);
                i = i2 + 1;
            }
        }
    }
}
