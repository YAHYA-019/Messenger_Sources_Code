package X;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6zl, reason: invalid class name */
/* loaded from: 6zl.class */
public final class C6zl implements 6xM {
    public C00i A00;
    public C00i A01;
    public HashSet A02;
    public boolean A03;
    public final int A04;
    public final 5oY A05;
    public final 6zT A06;
    public final C6yg A07;
    public final String A08;

    public C6zl(5oY r302, 6zT r303, C6yg c6yg, String str, int i) {
        this.A08 = str;
        this.A04 = i;
        this.A05 = r302;
        r303.getClass();
        this.A06 = r303;
        c6yg.getClass();
        this.A07 = c6yg;
        this.A02 = null;
    }

    private void A00(6RU r302) {
        if (this.A03) {
            return;
        }
        Context context = r302.A00;
        this.A00 = 1Bn.A06(context, 7FR.class, (Class) null);
        this.A01 = 1Bn.A06(context, 7FS.class, (Class) null);
        this.A03 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A02;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7B2.class, 70G.class, 7BI.class));
            this.A02 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "CameraPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        if (r306 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BLY(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C77n r303, X.6RU r304, X.6Sh r305) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6zl.BLY(com.facebook.xapp.messaging.capability.vector.Capabilities, X.77n, X.6RU, X.6Sh):void");
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
