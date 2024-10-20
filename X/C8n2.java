package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import com.facebook.common.callercontext.CallerContext;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8n2, reason: invalid class name */
/* loaded from: 8n2.class */
public final class C8n2 extends C1rj {
    public static final ColorDrawable A0C = 7zL.A0D(0);
    public static final List A0D = Collections.emptyList();
    public static final List A0E = Collections.emptyList();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CallerContext A07;
    public 1LI A08;
    public List A09;
    public List A0A;
    public boolean A0B;

    public C8n2() {
        super("Facepile");
        this.A00 = -1;
        this.A01 = (-1) << (-1);
        this.A03 = 4;
        this.A09 = A0E;
        this.A0A = A0D;
        this.A0B = true;
    }

    public final Object[] A0k() {
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf((-1) << (-1));
        Integer valueOf3 = Integer.valueOf(this.A01);
        CallerContext callerContext = this.A07;
        Integer valueOf4 = Integer.valueOf(this.A02);
        Integer valueOf5 = Integer.valueOf(this.A03);
        Integer valueOf6 = Integer.valueOf(this.A04);
        Integer valueOf7 = Integer.valueOf(this.A05);
        List list = this.A09;
        List list2 = this.A0A;
        Integer A0k = 4YU.A0k();
        return new Object[]{valueOf, valueOf2, valueOf3, callerContext, null, valueOf4, valueOf5, valueOf6, valueOf7, list, list2, A0k, A0k, null, null, this.A08, Integer.valueOf(this.A06), null, null, 1BK.A0d(), Boolean.valueOf(this.A0B), A0k};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8n2 c8n2 = (C8n2) super.A0l();
        c8n2.A08 = 4YV.A0J(c8n2.A08);
        return c8n2;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z;
        int size;
        C1rq c1rq;
        8OP r326;
        CallerContext callerContext = this.A07;
        List list = this.A0A;
        List list2 = this.A09;
        int i = this.A04;
        int i2 = this.A02;
        int i3 = this.A05;
        boolean z2 = this.A0B;
        1LI r0 = this.A08;
        int i4 = this.A03;
        int i5 = this.A00;
        int i6 = this.A01;
        int i7 = this.A06;
        C01s A0I = 1BL.A0I();
        if (i4 < 0) {
            throw AnonymousClass001.A0L("faceCount cannot be < 0");
        }
        if (list.size() > 0 && list2.size() > 0) {
            throw AnonymousClass001.A0L("only pass in faces or faceUris");
        }
        Resources A0E2 = 4YU.A0E(r302);
        if (i6 == ((-1) << (-1))) {
            i6 = A0E2.getDimensionPixelSize(2132279309);
        }
        int dimensionPixelSize = A0E2.getDimensionPixelSize(2132279325);
        if (list2.size() > list.size()) {
            z = true;
            size = list2.size();
        } else {
            z = false;
            size = list.size();
        }
        int max = Math.max(0, size);
        int i8 = (!z2 || (max <= i4 && 0 <= size)) ? 0 : 1;
        int min = Math.min(Math.min(max, i4) - i8, size);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A00.A05 = false;
        A01.A0S();
        C1ro c1ro = C1ro.FLEX_START;
        A01.A2Y(c1ro);
        if (i8 != 0) {
            if (r0 == null) {
                r326 = new 8OP(new 8jN(), r302);
                8jN r02 = r326.A00;
                r02.A01 = i;
                r326.A02.set(0);
                r02.A00 = max - min;
                r02.A02 = AnonymousClass001.A1O(i2);
            } else {
                r326 = null;
            }
            c1rq = C1rg.A01(r302, null, 0);
            c1rq.A2g(c1ro);
            c1rq.A2c();
            c1rq.A2b();
            c1rq.A0D(null);
            c1rq.A1L(i);
            c1rq.A1U(i);
            c1rq.A2f(r0);
            c1rq.A2f(r326 == null ? null : r326.A2V());
            if (i3 != 0) {
                c1rq.A2A(C26z.START, i3);
            }
        } else {
            c1rq = null;
        }
        for (int i9 = 0; i9 < min; i9++) {
            if (!z) {
                if (list.get(i9) != null) {
                    list.get(i9);
                    throw AnonymousClass001.A0Q("url");
                }
                0BS A012 = 0BR.A01("facepileSpec", "Null URL for Facepile!");
                A012.A00 = 1;
                A012.A05 = true;
                A0I.D0u(new 0BR(A012));
            }
            C1rq A013 = C1rg.A01(r302, null, 0);
            C6nh c6nh = new C6nh(r302);
            C26z c26z = C26z.ALL;
            c6nh.A08(c26z, 0);
            c6nh.A0A(c26z, 0);
            c6nh.A04(i / 2);
            A013.A1h(c6nh.A01());
            8T2 A00 = 8mG.A00(r302);
            A00.A2X(callerContext);
            if (!z) {
                list.get(i9);
                throw AnonymousClass001.A0Q("accessibilityLabel");
            }
            A00.A2S(null);
            A00.A2Y(list2.get(i9).toString());
            ColorDrawable colorDrawable = A0C;
            8mG r03 = A00.A00;
            r03.A06 = colorDrawable;
            r03.A05 = i;
            r03.A03 = i2;
            r03.A00 = i5;
            r03.A02 = i6;
            r03.A01 = dimensionPixelSize;
            A00.A1e(null);
            A00.A2T(null);
            r03.A04 = i7;
            A013.A2e(A00);
            if (i9 > 0 && i3 != 0) {
                A013.A2A(C26z.START, i3);
            }
            A01.A2W(A013);
        }
        if (c1rq != null) {
            A01.A2X(c1rq.A00);
        }
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1828344308) {
            return null;
        }
        4YV.A1G(r302, obj, i);
        return null;
    }
}
