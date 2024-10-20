package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8n6, reason: invalid class name */
/* loaded from: 8n6.class */
public final class C8n6 extends C1rj {
    public int A00;
    public int A01;
    public Uri A02;
    public static final CallerContext A04 = CallerContext.A0B("VideoThumbnailComponentSpec");
    public static final TypedValue A03 = new TypedValue();

    public C8n6() {
        super("VideoThumbnailComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Uri uri = this.A02;
        final String A0C = r302.A0C();
        final int i = this.A00;
        final int i2 = this.A01;
        final C62j c62j = 4YU.A0P(r302).A00;
        Object obj = new Object(c62j, A0C, i, i2) { // from class: X.9bo
            public final int A00;
            public final int A01;
            public final C62j A02;
            public final String A03;

            {
                this.A03 = A0C;
                this.A00 = i;
                this.A01 = i2;
                this.A02 = c62j;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9bo)) {
                        return false;
                    }
                    C9bo c9bo = (C9bo) obj2;
                    if (!11T.A0O(this.A03, c9bo.A03) || this.A00 != c9bo.A00 || this.A01 != c9bo.A01) {
                        return false;
                    }
                    C62j c62j2 = this.A02;
                    C62j c62j3 = c9bo.A02;
                    if (c62j2 != null) {
                        if (!c62j2.equals(c62j3)) {
                            return false;
                        }
                    } else if (c62j3 != null) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A05(this, this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
            }
        };
        C06974ih c06974ih = (C06974ih) r302.A0B(obj, A0C, 1);
        if (c06974ih == null) {
            int i3 = this.A00;
            int i4 = this.A01;
            C62j c62j2 = 4YU.A0P(r302).A00;
            11T.A0F(c62j2, 3);
            C07004ik A00 = C06984ii.A00();
            A00.A06(7zL.A0D(i3));
            7K6 r0 = new 7K6(7zL.A0A(r302), c62j2);
            ((7K7) r0).A01 = false;
            ((7K7) r0).A00 = i4;
            r0.invalidateSelf();
            A00.A0C = r0;
            c06974ih = 7zO.A0Q(InterfaceC07034in.A01, A00);
            r302.A0I(obj, c06974ih, A0C, 1);
        }
        String A0C2 = r302.A0C();
        9aX r02 = new 9aX(A0C2);
        Drawable A0E = 7zL.A0E(r302, r02, A0C2, 0);
        if (A0E == null) {
            float f = 0.0f / 0.0f;
            A0E = ((C1uu) 1Bi.A03(66388)).A02(2132344836, -1);
            r302.A0I(r02, A0E, A0C2, 0);
        }
        11T.A0F(uri, 1);
        2cM A002 = 2cK.A00(r302);
        C1ro c1ro = C1ro.CENTER;
        A002.A2g(c1ro);
        5BH A01 = 5BG.A01(r302);
        TypedValue typedValue = A03;
        if (typedValue.data == 0) {
            4YU.A0E(r302).getValue(2132279581, typedValue, true);
        }
        A01.A0B(typedValue.getFloat());
        A01.A2b(A04);
        A01.A2W(1.0f);
        A01.A2Z(c06974ih);
        A01.A1R(2132279596);
        A01.A2X(uri);
        A002.A2e(7zL.A0K(A01));
        2cM A003 = 2cK.A00(r302);
        A003.A2f(c1ro);
        A003.A1I(2132411608);
        7zN.A1B(A003, 7zM.A0u(A0E, r302, 0));
        A003.A2c();
        A003.A1W(2132279342);
        A003.A1M(2132279342);
        A003.A0c();
        7zL.A1G(A003, A002);
        A002.A2c();
        return A002.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((8pF) r303).A00 = (C62j) 1Bn.A0A(49939);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
