package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;
import java.util.Set;

/* loaded from: A6c.class */
public final class A6c implements 6xM {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public HashSet A03;
    public boolean A04;
    public final C6xN A05;
    public final int A06;
    public final FbUserSession A07;
    public final ThreadKey A08;
    public final 6xC A09;
    public final 5oY A0A;
    public final 4kB A0B;
    public final 6wV A0C;
    public final C15h A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.6xN] */
    public A6c(FbUserSession fbUserSession, ThreadKey threadKey, 6xC r304, 5oY r305, 4kB r306, 6wV r307, C15h c15h, int i, boolean z, boolean z2) {
        Boolean A0d = 1BK.A0d();
        ?? obj = new Object();
        obj.A00 = A0d;
        this.A05 = obj;
        this.A0B = r306;
        this.A0A = r305;
        this.A0C = r307;
        this.A0E = z;
        this.A08 = threadKey;
        this.A06 = i;
        this.A0F = z2;
        this.A0D = c15h;
        this.A07 = fbUserSession;
        this.A09 = r304;
        this.A03 = null;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A03;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{7DE.class, 8Ne.class, 7Ch.class, C7vu.class, 6rE.class, 7DG.class, 7Cl.class, 8Nd.class, 8Nc.class});
            this.A03 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AttachmentPreviewPlugin";
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05bf, code lost:
    
        if (r0.isEmpty() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x052d, code lost:
    
        if (r332 == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BLY(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C77n r303, X.6RU r304, X.6Sh r305) {
        /*
            Method dump skipped, instructions count: 1981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6c.BLY(com.facebook.xapp.messaging.capability.vector.Capabilities, X.77n, X.6RU, X.6Sh):void");
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (this.A04) {
            return;
        }
        Context context = r303.A00;
        this.A00 = 1Bn.A06(context, 7FR.class, (Class) null);
        this.A01 = 1Bn.A06(context, 7FS.class, (Class) null);
        this.A02 = 1Bn.A06(context, 6QV.class, (Class) null);
        C6xN c6xN = this.A05;
        11T.A0F(c6xN, 0);
        c6xN.A00 = false;
        this.A04 = true;
    }
}
