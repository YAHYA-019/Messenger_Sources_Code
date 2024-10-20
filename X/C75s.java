package X;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.75s, reason: invalid class name */
/* loaded from: 75s.class */
public final class C75s implements 6xM {
    public C00i A00;
    public C00i A01;
    public HashSet A02;
    public boolean A03;
    public final int A04;
    public final 5oY A05;
    public final C75p A06;
    public final C6wl A07;
    public final 6xD A08;
    public final C75q A09;
    public final C6xN A0A = new C6xN();
    public final C6xN A0B;
    public final 4kB A0C;
    public final 6wJ A0D;
    public final String A0E;
    public final C15h A0F;
    public final boolean A0G;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.6xN] */
    public C75s(C75m c75m) {
        ?? obj = new Object();
        obj.A00 = 0;
        this.A0B = obj;
        this.A0C = c75m.A06;
        this.A05 = c75m.A01;
        C15h c15h = c75m.A0A;
        c15h.getClass();
        this.A0F = c15h;
        C75q c75q = c75m.A05;
        c75q.getClass();
        this.A09 = c75q;
        this.A06 = c75m.A02;
        this.A0G = c75m.A0B;
        this.A0E = c75m.A08;
        this.A07 = c75m.A03;
        6xD r0 = c75m.A04;
        r0.getClass();
        this.A08 = r0;
        this.A0D = c75m.A07;
        this.A04 = c75m.A00;
        this.A02 = c75m.A09;
    }

    private void A00(6RU r302) {
        if (this.A03) {
            return;
        }
        Context context = r302.A00;
        this.A00 = 1Bn.A06(context, 7FR.class, (Class) null);
        this.A01 = 1Bn.A06(context, 7FS.class, (Class) null);
        C6wl c6wl = this.A07;
        C6xN c6xN = this.A0A;
        C6xN c6xN2 = this.A0B;
        11T.A0F(c6xN, 1);
        11T.A0F(c6xN2, 2);
        if (c6wl == null) {
            final Function1[] function1Arr = new Function1[0];
            c6wl = new C6wl(function1Arr) { // from class: X.6wk
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r301 = this;
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r303 = r0
                        r0 = r303
                        r1 = 2
                        r0.<init>(r1)
                        kotlin.jvm.functions.Function1 r0 = X.C6wm.A01
                        r304 = r0
                        r0 = r303
                        r1 = r304
                        boolean r0 = r0.add(r1)
                        r0 = r302
                        r1 = r303
                        X.0KN.A00(r0, r1)
                        r0 = r303
                        int r0 = r0.size()
                        kotlin.jvm.functions.Function1[] r0 = new kotlin.jvm.functions.Function1[r0]
                        r304 = r0
                        r0 = r303
                        r1 = r304
                        java.lang.Object[] r0 = r0.toArray(r1)
                        kotlin.jvm.functions.Function1[] r0 = (kotlin.jvm.functions.Function1[]) r0
                        r304 = r0
                        r0 = r301
                        r1 = r304
                        r0.<init>(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C6wk.<init>(kotlin.jvm.functions.Function1[]):void");
                }
            };
        }
        c6xN.A00 = c6wl;
        c6xN2.A00 = 0;
        this.A03 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A02;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Be.class, 7Ch.class, 7Ci.class, 7Cj.class, 7Ck.class, 7An.class, 70D.class, 7B5.class, C6zq.class, 6rE.class, 6Sg.class, 7Cl.class, 7Cm.class, 7Cn.class));
            this.A02 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "GalleryPlugin";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BLY(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C77n r303, X.6RU r304, X.6Sh r305) {
        /*
            Method dump skipped, instructions count: 2199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75s.BLY(com.facebook.xapp.messaging.capability.vector.Capabilities, X.77n, X.6RU, X.6Sh):void");
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
