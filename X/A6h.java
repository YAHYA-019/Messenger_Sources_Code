package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6h.class */
public final class A6h implements 6xM {
    public boolean A01;
    public final ThreadKey A02;
    public final boolean A04;
    public final boolean A05;
    public final C6xN A03 = new C6xN();
    public HashSet A00 = null;

    public A6h(ThreadKey threadKey, boolean z, boolean z2) {
        this.A05 = 7zO.A1Y(z2);
        this.A02 = threadKey;
        this.A04 = 7zO.A1Y(z);
    }

    public static void A00(A6h a6h) {
        if (a6h.A01) {
            return;
        }
        a6h.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{7AO.class, A5x.class, A5v.class, A5s.class, A5w.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "QuickReplyPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bd, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01af, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v230, types: [X.5fq, X.5qu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BLY(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C77n r303, X.6RU r304, X.6Sh r305) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6h.BLY(com.facebook.xapp.messaging.capability.vector.Capabilities, X.77n, X.6RU, X.6Sh):void");
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(this);
    }
}
