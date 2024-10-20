package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8o9, reason: invalid class name */
/* loaded from: 8o9.class */
public final class C8o9 extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("ImageShareAttachmentComponentSpec");
    public static final C06974ih A02 = 7zL.A0L(7zR.A0I());
    public 6Az A00;

    public C8o9() {
        super("ImageShareAttachmentComponent");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(11:5|(8:7|8|9|(5:20|(2:22|(2:26|(1:30)))|31|16|17)(1:13)|14|15|16|17)|33|8|9|(1:11)|20|(0)|31|16|17))(1:35)|34|33|8|9|(0)|20|(0)|31|16|17) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.9RU A00(X.6Az r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L2f
            r0 = r301
            X.7Zr r0 = r0.Avv()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L31
            r0 = r303
            X.4t7 r0 = r0.A0w()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L33
            r0 = r304
            java.lang.String r0 = r0.getUri()
            r305 = r0
        L20:
            r0 = -1
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L45
            r0 = r305
            if (r0 == 0) goto L45
            goto L3c
        L2f:
            r0 = 0
            r303 = r0
        L31:
            r0 = 0
            r304 = r0
        L33:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
            goto L20
        L3c:
            r0 = r305
            android.net.Uri r0 = X.C0A2.A03(r0)     // Catch: java.lang.SecurityException -> L88
            r302 = r0
            goto L89
        L45:
            r0 = r301
            boolean r0 = r0 instanceof X.6Ay
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L82
            r0 = r301
            X.6Ay r0 = (X.6Ay) r0
            r301 = r0
            r0 = r301
            X.7Zr r0 = r0.A0u()
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L82
            r0 = r305
            if (r0 == 0) goto L82
            r0 = r305
            X.4t7 r0 = r0.A0v()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L82
            r0 = r304
            java.lang.String r0 = r0.getUri()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L82
            r0 = r305
            android.net.Uri r0 = X.C0A2.A03(r0)     // Catch: java.lang.SecurityException -> L88
            r302 = r0
            goto L89
        L82:
            r0 = -1
            r307 = r0
            goto L99
        L88:
        L89:
            r0 = r304
            r1 = 113126854(0x6be2dc6, float:7.1537315E-35)
            int r0 = r0.getIntValue(r1)
            r306 = r0
            r0 = r304
            r1 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            int r0 = r0.getIntValue(r1)
            r307 = r0
        L99:
            X.9RU r0 = new X.9RU
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r306
            r3 = r307
            r0.<init>(r1, r2, r3)
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8o9.A00(X.6Az):X.9RU");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rh c1rh;
        String A0o;
        String A0m;
        float f;
        float f2;
        C8pv c8pv = (C8pv) 4YU.A0P(r302);
        6Az r0 = this.A00;
        Uri uri = c8pv.A04;
        int i = c8pv.A03;
        int i2 = c8pv.A02;
        int i3 = c8pv.A01;
        int i4 = c8pv.A00;
        9RU A00 = A00(r0);
        if ((!Objects.equal(A00.A02, uri) || A00.A01 != i || A00.A00 != i2) && r302.A02 != null) {
            r302.A0H(7zQ.A0V(A00, 1), "updateState:ImageShareAttachmentComponent.onUpdateDraweeControllerState");
        }
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        5BG r303 = null;
        7zN.A1C(A012, r302, C8o9.class, "ImageShareAttachmentComponent");
        if (uri != null) {
            5BH A0B = 7zN.A0B(uri, r302);
            A0B.A2b(A01);
            A0B.A2Z(A02);
            A0B.A2Y(new 8I0(r302, 6));
            if (i3 <= 0 || i4 <= 0) {
                if (i > 0 && i2 > 0) {
                    f = i;
                    f2 = i2;
                }
                r303 = 7zL.A0K(A0B);
            } else {
                f = i3;
                f2 = i4;
            }
            float f3 = f / f2;
            A0B.A2W(f3);
            A0B.A0f(f3);
            r303 = 7zL.A0K(A0B);
        }
        A012.A2e(r303);
        ImmutableList AVK = r0.AVK();
        11T.A0F(AVK, 0);
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = AVK.iterator();
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            if (A0P != null && (A0o = A0P.A0o()) != null && A0o.length() != 0 && (A0m = A0P.A0m()) != null && A0m.length() != 0) {
                builder.m11011add((Object) A0P);
            }
        }
        ImmutableList A013 = 1Fj.A01(builder);
        if (A013.isEmpty()) {
            c1rh = null;
        } else {
            C1rq A014 = C1rg.A01(r302, null, 0);
            A014.A2i(C1rp.FLEX_END);
            float f4 = 0.0f / 0.0f;
            A014.A1H(-1);
            1Du it2 = A013.iterator();
            while (it2.hasNext()) {
                A014.A2f(new 8Uq((8ID) it2.next()));
            }
            c1rh = A014.A00;
        }
        return 7zL.A0V(A012, c1rh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        2JY r04 = ((C8o9) r02).A00;
        C68t c68t = (C68t) 1Bi.A03(49965);
        if (r04 == null) {
            return null;
        }
        String A0m = r04.A0m();
        if (1JF.A0B(A0m)) {
            return null;
        }
        try {
            Uri A03 = C0A2.A03(A0m);
            if (A03 == null) {
                return null;
            }
            c68t.A0E(r03.A0D, A03);
            return null;
        } catch (SecurityException unused) {
            return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C8pv c8pv = (C8pv) r303;
        9RU A00 = A00(this.A00);
        Uri uri = A00.A02;
        int i = A00.A01;
        int i2 = A00.A00;
        c8pv.A04 = uri;
        c8pv.A03 = i;
        c8pv.A02 = i2;
        c8pv.A01 = 0;
        c8pv.A00 = 0;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
