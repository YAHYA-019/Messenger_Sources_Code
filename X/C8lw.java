package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8lw, reason: invalid class name */
/* loaded from: 8lw.class */
public final class C8lw extends C1rj {
    public static final CallerContext A02 = CallerContext.A0C("HotLikePreviewItemComponentSpec", "sticker_thread_view");
    public C62h A00;
    public 6kC A01;

    public C8lw() {
        super("HotLikePreviewItemComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        Drawable drawable;
        6kC r0 = this.A01;
        C62h c62h = this.A00;
        1Bn.A0A(67859);
        89O r02 = new 89O();
        C1rs c1rs = new C1rs(r02, r302, 0, 0);
        ((8O5) c1rs).A01 = r02;
        ((8O5) c1rs).A00 = r302;
        r02.A04 = InterfaceC07034in.A04;
        r02.A06 = r0;
        r02.A05 = c62h;
        C9bx c9bx = r0.A00;
        if (c9bx == null || (drawable = c9bx.A01) == null) {
            str = "369239383222810";
            String str2 = (String) C7a0.A00.get(str);
            str = str2 != null ? str2 : "369239383222810";
            boolean z = false;
            CallerContext callerContext = A02;
            if (c9bx != null && c9bx.A05) {
                z = true;
            }
            C6qc c6qc = new C6qc(callerContext, null, null, null, null, str, null, 255, 0, false, z, true, false, true, false);
            89O r03 = ((8O5) c1rs).A01;
            r03.A08 = c6qc;
            if (c9bx != null) {
                r03.A02 = c9bx.A00;
            }
        } else {
            r02.A03 = drawable;
            r02.A09 = c9bx.A03;
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1D(0.0f);
        A01.A2C(C26z.TOP, A01.A02.A05(2130971123));
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2D(C26z.LEFT, 2132279345);
        C1rp c1rp = C1rp.FLEX_END;
        A012.A2i(c1rp);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A2B(C26z.RIGHT, R.dimen.mapbox_eight_dp);
        A013.A1V(2132279321);
        A013.A1T(2132279321);
        A013.A2h(c1rp);
        C1ro c1ro = C1ro.FLEX_END;
        A013.A2g(c1ro);
        c1rs.A1y(c1ro);
        c1rs.A1C(7.0f);
        A013.A2d(c1rs);
        A012.A2e(A013);
        return 7zL.A0U(A01, A012);
    }
}
