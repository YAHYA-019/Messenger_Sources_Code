package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.secure.secrettypes.SecretString;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9n0, reason: invalid class name */
/* loaded from: 9n0.class */
public final class C9n0 {
    public final Handler A00;
    public final 1Br A01;
    public final 9Po A02;
    public final 9M6 A03;
    public final RHa A04;
    public final RRT A05;
    public final 72W A06;
    public final 6RU A07;
    public final 6wV A08;
    public final AtomicBoolean A09;
    public final C01i A0A;
    public final C00m A0B;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.9M6, java.lang.Object] */
    public C9n0(FbUserSession fbUserSession, 9UT r303, 72W r304, 6RU r305, 6wV r306) {
        this.A07 = r305;
        this.A06 = r304;
        this.A08 = r306;
        RRT rrt = new RRT(r303, r305);
        this.A05 = rrt;
        this.A04 = new RHa();
        Context context = r305.A00;
        this.A02 = new 9Po();
        this.A03 = new Object();
        this.A09 = 7zO.A15();
        this.A00 = AnonymousClass001.A07();
        this.A01 = 1Bu.A01(context, 67831);
        rrt.A06.add(new RHZ(this));
        this.A0A = C01g.A01(new AQf(fbUserSession, this, 3));
        this.A0B = new AQf(fbUserSession, this, 4);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.6Sh, java.lang.Object] */
    public static final void A00(FbUserSession fbUserSession, C9n0 c9n0) {
        6wV r0 = c9n0.A08;
        int spanStart = r0.getSpanStart(c9n0.A0A.getValue());
        if (spanStart != -1) {
            9EC.A00(c9n0.A09, new AKU(spanStart, 7, c9n0));
            6RU r02 = c9n0.A07;
            11T.A0F(r0.getText().toString(), 0);
            7FI.A02(r02, (6Sh) new Object());
            A01(fbUserSession, c9n0, r0.getText().toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public static final void A01(FbUserSession fbUserSession, C9n0 c9n0, String str) {
        ThreadKey BF7;
        8Lu r0;
        List list;
        C87v c87v;
        SecretString secretString;
        72W r02 = c9n0.A06;
        String str2 = null;
        if (r02 != null && (BF7 = r02.BF7()) != null && (r0 = (8Lu) ((9MN) 1Lm.A05(c9n0.A07.A00, fbUserSession, 67764)).A00.get()) != null && BF7.equals(r0.A01) && (list = (List) r0.A00) != null && (c87v = (C87v) 0QD.A0E(list)) != null && (secretString = (SecretString) c87v.A00) != null) {
            str2 = secretString.A00;
        }
        RRT rrt = c9n0.A05;
        11T.A0F(str, 0);
        if (rrt.A00.A01(str)) {
            return;
        }
        9UT r03 = rrt.A04;
        ?? A0j = 4YU.A0j();
        boolean AZk = 1Br.A07(r03.A03).AZk(36321954307523553L);
        if (r03.A00 == 0) {
            C0il.A0C(AnonymousClass000.A00(56), 16);
            C0il.A0C(AnonymousClass000.A00(36), 16);
            C0il.A0C(AnonymousClass000.A00(59), 16);
            r03.A00 = 1;
        }
        1Br.A0D(r03.A02, new InN(r03, (SettableFuture) A0j, str, str2, AZk), ((7US) 4YU.A0n(1Br.A03(r03.A04), r03.A01, 67830)).A00());
        if (!11T.A0O(rrt.A03, str2)) {
            rrt.A00 = new 0Yl(TimeUnit.SECONDS, 30, 30);
            rrt.A03 = null;
            rrt.A01 = null;
            rrt.A03 = str2;
        }
        7zO.A1X(rrt.A02);
        C06854i4 c06854i4 = C06854i4.A00;
        rrt.A02 = 47H.A00(new ABe(rrt, 18), 2FP.A02(new FvU(str, rrt, 3), (ListenableFuture) A0j, c06854i4), ExecutionException.class, c06854i4);
    }

    public static final void A02(C9n0 c9n0) {
        9EC.A00(c9n0.A09, new AKU(c9n0.A08.getSpanStart(c9n0.A0A.getValue()), 8, c9n0));
    }

    public static final void A03(C9n0 c9n0) {
        6wV r0 = c9n0.A08;
        int spanStart = r0.getSpanStart(c9n0.A0A.getValue());
        if (spanStart == -1) {
            spanStart = 7zN.A04(r0);
        }
        String A00 = c9n0.A05.A00(7zO.A0u(r0.getText(), 0, spanStart));
        if (A00 != null) {
            A04(c9n0, A00, spanStart);
        }
    }

    public static final void A04(C9n0 c9n0, String str, int i) {
        if (!0CV.A0b(str, " ", false)) {
            str = 0Pz.A0K(str, (char) 8203);
        }
        6wV r0 = c9n0.A08;
        if (11T.A0O(7zO.A0u(r0.getText(), i, 7zN.A04(r0)), str) || c9n0.A06()) {
            return;
        }
        9EC.A00(c9n0.A09, new AKe(c9n0, str, i, 1));
    }

    public static final boolean A05(C9n0 c9n0) {
        6wV r0 = c9n0.A08;
        boolean z = false;
        if (7zN.A04(r0) >= 3 && 4YU.A19(r0.getText(), " ", 0).size() > 1) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r301.A03.A00 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if ((X.1Br.A00(r0.A01) - r0.longValue()) < 250) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r309 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        return r309;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06() {
        /*
            r301 = this;
            r0 = r301
            X.9Po r0 = r0.A02
            r302 = r0
            r0 = r302
            java.lang.Long r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r303
            long r0 = r0.longValue()
            r304 = r0
            r0 = r302
            X.1Br r0 = r0.A01
            r303 = r0
            r0 = r303
            long r0 = X.1Br.A00(r0)
            r1 = r304
            long r0 = r0 - r1
            r306 = r0
            r0 = 250(0xfa, double:1.235E-321)
            r304 = r0
            r0 = r306
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 >= 0) goto L35
        L2f:
            r0 = 1
            r309 = r0
        L32:
            r0 = r309
            return r0
        L35:
            r0 = r301
            X.9M6 r0 = r0.A03
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L32
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9n0.A06():boolean");
    }
}
