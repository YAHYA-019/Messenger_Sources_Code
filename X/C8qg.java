package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.8qg, reason: invalid class name */
/* loaded from: 8qg.class */
public final class C8qg extends 2Yf {
    public 1Im A00;
    public C9gQ A01;
    public C6wc A02;
    public String A03;

    public C8qg() {
        super("AlbumDataServiceSection");
    }

    public Object A0M(2Yf r302) {
        return ((C8qg) r302).A01;
    }

    public void A0N(2Yf r302, 2Yf r303, C1qb c1qb) {
        ((C8qg) r303).A01 = ((C8qg) r302).A01;
    }

    public void A0O(C1qb c1qb) {
        boolean z;
        9Xi r0;
        C9gQ c9gQ = this.A01;
        9Xi r02 = new 9Xi(c1qb);
        synchronized (c9gQ) {
            c9gQ.A01 = r02;
            ImmutableList immutableList = c9gQ.A02;
            if (immutableList != null) {
                r02.A00(immutableList);
                c9gQ.A02 = null;
            }
        }
        synchronized (c9gQ) {
            z = !c9gQ.A03;
        }
        if (z) {
            2Yg.A0H(c1qb, 0S2.A00, (Throwable) null, false);
            synchronized (c9gQ) {
                if (c9gQ.A03) {
                    return;
                }
                c9gQ.A03 = true;
                ListenableFuture D3C = ((1ED) c9gQ.A06.get()).D3C(c9gQ.A07);
                synchronized (c9gQ) {
                    r0 = c9gQ.A01;
                }
                if (r0 != null) {
                    C1qb c1qb2 = r0.A00;
                    ELK elk = ELK.A01;
                    if (c1qb2.A0J() != null) {
                        c1qb2.A0H(7zL.A0f(new Object[]{elk, null, null}, 0), "updateState:AlbumDataServiceSection.updateState");
                    }
                    2Yg.A0H(c1qb2, 0S2.A01, (Throwable) null, false);
                }
                AC8.A02(D3C, c9gQ, 63);
            }
        }
    }

    public void A0P(C1qb c1qb) {
        C6wc c6wc = this.A02;
        String str = this.A03;
        C1F6 c1f6 = (C1F6) 1Bn.A0E(((1Iw) c1qb).A0D, (1BY) null, 1150);
        Context A00 = 1Bf.A00(c1f6);
        try {
            C9gQ c9gQ = new C9gQ(c1f6, c6wc, str);
            1Bn.A0K();
            FbInjector.A04(A00);
            this.A01 = c9gQ;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public void A0R(C1qb c1qb) {
        C9gQ c9gQ = this.A01;
        synchronized (c9gQ) {
            c9gQ.A01 = null;
        }
    }

    public void A0X(2Yv r302, 2Yv r303) {
        C8pl c8pl = (C8pl) r302;
        C8pl c8pl2 = (C8pl) r303;
        c8pl2.A02 = c8pl.A02;
        c8pl2.A00 = c8pl.A00;
        c8pl2.A01 = c8pl.A01;
    }

    public void A0a(C1qb c1qb) {
        ((C8pl) ((2Yf) this).A03).A00 = ELK.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.9TF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.2Ys A0d(X.C1qb r302) {
        /*
            r301 = this;
            r0 = r301
            X.2Yv r0 = r0.A03
            X.8pl r0 = (X.C8pl) r0
            r303 = r0
            r0 = r303
            X.ELK r0 = r0.A00
            r304 = r0
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A01
            r305 = r0
            r0 = r303
            java.lang.Throwable r0 = r0.A02
            r306 = r0
            X.ELK r0 = X.ELK.A03
            r303 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L30
            r0 = 0
            r309 = r0
            r0 = r305
            if (r0 == 0) goto L33
        L30:
            r0 = 1
            r309 = r0
        L33:
            r0 = r309
            java.lang.String r1 = "Fetch state is IDLE but response model is not properly set."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            X.ELK r0 = X.ELK.A02
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L48
            r0 = r305
            if (r0 != 0) goto L4b
        L48:
            r0 = 1
            r307 = r0
        L4b:
            r0 = r307
            java.lang.String r1 = "Fetch state is DOWNLOAD_ERROR but response model is not properly set."
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            r0 = r302
            X.2Yf r0 = r0.A0J()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L8e
            r0 = 0
            r307 = r0
            r0 = 0
            r308 = r0
        L61:
            X.9TF r0 = new X.9TF
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r303
            r1 = r305
            r0.A03 = r1
            r0 = r303
            r1 = 0
            r0.A02 = r1
            r0 = r303
            r1 = r304
            r0.A01 = r1
            r0 = r303
            r1 = r306
            r0.A04 = r1
            r0 = r303
            r1 = 0
            r0.A00 = r1
            r0 = r308
            r1 = r303
            java.lang.Object r0 = r0.A00(r1)
            X.2Ys r0 = (X.2Ys) r0
            return r0
        L8e:
            r0 = r302
            X.2Yf r0 = r0.A0J()
            X.8qg r0 = (X.C8qg) r0
            r303 = r0
            r0 = r303
            X.1Im r0 = r0.A00
            r308 = r0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qg.A0d(X.1qb):X.2Ys");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yf A0g(boolean z) {
        2Yf A0g = super.A0g(z);
        if (!z) {
            A0g.A03 = new Object();
        }
        return A0g;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qg c8qg = (C8qg) r302;
            String str = this.A03;
            String str2 = c8qg.A03;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            C6wc c6wc = this.A02;
            C6wc c6wc2 = c8qg.A02;
            if (c6wc != null) {
                if (!c6wc.equals(c6wc2)) {
                    return false;
                }
            } else if (c6wc2 != null) {
                return false;
            }
        }
        return true;
    }
}
