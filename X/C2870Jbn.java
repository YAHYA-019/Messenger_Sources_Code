package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jbn, reason: case insensitive filesystem */
/* loaded from: Jbn.class */
public final class C2870Jbn extends C2874Jbr {
    public Function1 A00;
    public Function1 A01;
    public final long A02;
    public final boolean A03;
    public final C2874Jbr A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (r312 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r309 == null) goto L9;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2870Jbn(X.C2874Jbr r302, kotlin.jvm.functions.Function1 r303, kotlin.jvm.functions.Function1 r304, boolean r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2870Jbn.<init>(X.Jbr, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    public static final C2874Jbr A00(C2870Jbn c2870Jbn) {
        C2874Jbr c2874Jbr = c2870Jbn.A04;
        if (c2874Jbr == null) {
            c2874Jbr = (C2874Jbr) LEY.A08.get();
        }
        return c2874Jbr;
    }

    @Override // X.C2874Jbr, androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        C2874Jbr c2874Jbr;
        ((Snapshot) this).A02 = true;
        if (!this.A05 || (c2874Jbr = this.A04) == null) {
            return;
        }
        c2874Jbr.A0B();
    }
}
