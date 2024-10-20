package X;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.20l, reason: invalid class name */
/* loaded from: 20l.class */
public final class C20l {
    public 1PA A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Set A04;
    public final Context A05;
    public final 1De A06;
    public final C02l A07;
    public final C02l A08;

    public C20l(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 17006);
        Context context = (Context) 1Bn.A0E((Context) null, r0, 83719);
        this.A05 = context;
        this.A02 = 1HG.A00(context, 65728);
        this.A01 = 1Bq.A00(66265);
        this.A04 = new LinkedHashSet();
        this.A07 = new 3cM(this, 15);
        this.A08 = new 3cM(this, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (com.facebook.messaging.model.threadkey.ThreadKey.A0k(r301) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (com.facebook.messaging.model.threadkey.ThreadKey.A0a(r301) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (com.facebook.messaging.model.threadkey.ThreadKey.A0S(r301) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(com.facebook.messaging.model.threadkey.ThreadKey r301, X.C20l r302) {
        /*
            r0 = r302
            java.util.Set r0 = r0.A04
            r303 = r0
            X.20n r0 = X.C20n.A02
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L28
            r0 = r301
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0S(r0)
            r305 = r0
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 != 0) goto L2b
        L28:
            r0 = 0
            r307 = r0
        L2b:
            r0 = r302
            X.1Br r0 = r0.A01
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1PG r0 = (X.1PG) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A05()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L66
            X.20n r0 = X.C20n.A04
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L66
            r0 = r301
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0k(r0)
            r305 = r0
            r0 = 1
            r308 = r0
            r0 = r305
            if (r0 != 0) goto L69
        L66:
            r0 = 0
            r308 = r0
        L69:
            X.20n r0 = X.C20n.A03
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L89
            r0 = r301
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0a(r0)
            r309 = r0
            r0 = 1
            r305 = r0
            r0 = r309
            if (r0 != 0) goto L8e
        L89:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L8e:
            r0 = r307
            if (r0 != 0) goto La0
            r0 = r308
            if (r0 != 0) goto La0
            r0 = r305
            if (r0 != 0) goto La0
            r0 = 0
            r306 = r0
        La0:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20l.A00(com.facebook.messaging.model.threadkey.ThreadKey, X.20l):boolean");
    }

    public final void A01(C20n c20n) {
        1PA r303;
        this.A04.add(c20n);
        1PA r0 = this.A00;
        if (r0 == null) {
            1P9 r02 = new 1P9((1I7) this.A02.A00.get());
            r02.A05(this.A07, "com.facebook.orca.ACTION_MULTIPLE_THREADS_READ_FOR_UI");
            r02.A05(this.A08, "com.facebook.orca.ACTION_MULTIPLE_THREADS_REMOVED_FOR_UI");
            r303 = r02.A02();
            this.A00 = r303;
        } else {
            if (r0.A03()) {
                return;
            }
            r303 = this.A00;
            if (r303 == null) {
                return;
            }
        }
        r303.A00();
    }

    public final void A02(C20n c20n) {
        1PA r0;
        Set set = this.A04;
        set.remove(c20n);
        if (set.isEmpty() && (r0 = this.A00) != null && r0.A03()) {
            r0.A01();
        }
    }
}
