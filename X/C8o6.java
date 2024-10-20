package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8o6, reason: invalid class name */
/* loaded from: 8o6.class */
public final class C8o6 extends C1rj {
    public static final MigColorScheme A04 = LightColorScheme.A00();
    public static final 2KE A05 = 2KE.A03;
    public 2JX A00;
    public 1Im A01;
    public MigColorScheme A02;
    public 6Il[] A03;

    public C8o6() {
        super("MarketplaceBannerActionBarComponent");
        this.A02 = A04;
    }

    public static C1rq A00(1Iw r301, 6Il r302, MigColorScheme migColorScheme, int i) {
        2KD A0Y = 7zN.A0Y(r301, false);
        A0Y.A2y(A05);
        A0Y.A2b();
        Context context = r301.A0D;
        A0Y.A2z(r302.BG7(context));
        A0Y.A2x(migColorScheme);
        C1rq A0O = 7zN.A0O(7zN.A0a(A0Y, 1), r301);
        A0O.A1w(null);
        A0O.A0D(7zR.A0C(migColorScheme, 7zL.A01(context.getResources(), 2132279298)));
        A0O.A2T(1LI.A0C(r301, C8o6.class, "MarketplaceBannerActionBarComponent", new Object[]{Integer.valueOf(i), r302}, -40421984));
        A0O.A1v(null);
        A0O.A2c();
        A0O.A1c(2132279298);
        A0O.A17(10.0f);
        return A0O;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        r302.A06();
        6Il[] r0 = this.A03;
        MigColorScheme migColorScheme = this.A02;
        1Bi.A03(98768);
        Context context = r302.A0D;
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(2132279298);
        int i = (int) ((resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density) + 0.5f);
        int length = r0.length;
        int i2 = 0;
        while (i2 < length) {
            int A052 = (7zQ.A05(r0[i2].BG7(context)) * ((int) (C0A8.A04(resources, 7zN.A00(A05)) * 0.75d))) + (dimension * 2);
            i2++;
            if (A052 > i / 2) {
                2cM A01 = 2cK.A01(r302, (String) null, 0);
                A01.A2g(C1ro.STRETCH);
                for (int i3 = 0; i3 < length; i3++) {
                    A01.A2d(A00(r302, r0[i3], migColorScheme, i3));
                }
                return A01.A00;
            }
        }
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2h(C1ro.STRETCH);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= length) {
                return A012.A00;
            }
            C1rq A00 = A00(r302, r0[i5], migColorScheme, i5);
            int i6 = 2132279306;
            if (i5 >= length - 1) {
                i6 = 0;
            }
            A00.A2B(C26z.RIGHT, i6);
            A00.A10(100.0f / length);
            A012.A2e(A00);
            i4 = i5 + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [X.RJ5, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        int i;
        int i2 = r302.A01;
        if (i2 == -1954158930) {
            r302.A00.A00.A06();
            1Bi.A03(98768);
            1Bi.A03(16385);
            throw AnonymousClass001.A0Q("canShowTooltip");
        }
        if (i2 == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i2 != -40421984) {
            return null;
        }
        1Iw r02 = r302.A00.A00;
        Object[] objArr = r302.A03;
        int A08 = 7zO.A08(objArr, 0);
        6Il r03 = (6Il) objArr[1];
        1LI r04 = r02.A02;
        if (r04 == null || (r0 = ((C8o6) r04).A01) == null) {
            return null;
        }
        String str = null;
        if (A08 != 0) {
            if (A08 == 1) {
                i = 679;
            }
            ?? obj2 = new Object();
            ((RJ5) obj2).A00 = r03;
            ((RJ5) obj2).A01 = str;
            r0.A00((Object) obj2);
            return null;
        }
        i = 678;
        str = 4YT.A00(i);
        ?? obj22 = new Object();
        ((RJ5) obj22).A00 = r03;
        ((RJ5) obj22).A01 = str;
        r0.A00((Object) obj22);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C8on) r303).A00 = 7zL.A0Z();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
