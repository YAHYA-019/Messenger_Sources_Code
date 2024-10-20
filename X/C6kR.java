package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.6kR, reason: invalid class name */
/* loaded from: 6kR.class */
public final class C6kR extends C1rj {
    public 5zD A00;
    public 62Q A01;
    public 63W A02;

    public C6kR() {
        super("TimestampDividerItemComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        62Q r0 = this.A01;
        5zD r02 = this.A00;
        11T.A0F(r302, 0);
        11T.A0F(r0, 1);
        11T.A0F(r02, 2);
        5B0 r03 = (5B0) 1Bn.A0A(67646);
        Context context = r302.A0D;
        11T.A0A(context);
        2oN r04 = (2oN) 1Hv.A02(context, 33246);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0j(1.0f);
        A01.A25(C26z.TOP, 20.0f);
        A01.A25(C26z.BOTTOM, 4.0f);
        3yF A0L = 2KZ.A0L(r302, 2132607575);
        A0L.A3C(false);
        try {
            ComponentsSystrace.A02("TimestampDividerItemComponent#getTransformation");
            CharSequence transformation = r03.getTransformation(2oN.A01(r04, r0.A00), (View) null);
            ComponentsSystrace.A01();
            A0L.A3A(transformation);
            A0L.A2x(r02.BKa());
            A0L.A34(r02.BHh());
            A0L.A24(C26z.LEFT, 5.0f);
            A0L.A24(C26z.RIGHT, 5.0f);
            A0L.A1y(C1ro.CENTER);
            A01.A2d(A0L);
            A01.A2T(1LI.A02(r302, C6kR.class, 0S2.A01, "TimestampDividerItemComponent", (Object[]) null, 2082071934));
            return A01.A00;
        } catch (Throwable th) {
            ComponentsSystrace.A01();
            throw th;
        }
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        63W r0;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 2082071934 || (r0 = ((C6kR) r302.A00.A01).A02) == null) {
            return null;
        }
        r0.A00();
        return null;
    }
}
