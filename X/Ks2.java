package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: Ks2.class */
public final class Ks2 {
    public final Context A00;
    public final Intent A01;
    public final Bundle A02;
    public final JgX A03;
    public final JgX A04;
    public final MLg A06;
    public final String A07;
    public final KeJ A09;
    public final java.util.Map A0A;
    public final LDF A05 = LDF.A00();
    public final C01i A08 = C01g.A00(C03i.A02, new J8q(this, 7));

    public Ks2(Context context, Intent intent, Bundle bundle, JgX jgX, JgX jgX2, MLg mLg, String str) {
        this.A00 = context;
        this.A06 = mLg;
        this.A03 = jgX;
        this.A04 = jgX2;
        this.A01 = intent;
        this.A02 = bundle;
        this.A07 = str;
        if (intent.getExtras() == null) {
            new Bundle();
        }
        this.A09 = new KeJ();
        this.A0A = new EnumMap(KNQ.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x04a4, code lost:
    
        if (r0.isEmpty() != false) goto L45;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002f. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v192, types: [X.LBw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.MLq A00(X.KNQ r302) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ks2.A00(X.KNQ):X.MLq");
    }

    public final ArrayList A01(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(A00((KNQ) it.next()));
        }
        return A0s;
    }
}
