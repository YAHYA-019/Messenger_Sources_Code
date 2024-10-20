package X;

import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;

/* loaded from: B07.class */
public final class B07 extends C1rj {
    public static final CallerContext A03 = CallerContext.A0B("ServicesAppointmentDetailHeaderComponentSpec");
    public String A00;
    public String A01;
    public String A02;

    public B07() {
        super("AppointmentDetailContactInfoComponent");
    }

    public final Object[] A0k() {
        String str = this.A00;
        String str2 = this.A01;
        Boolean A0d = 1BK.A0d();
        return new Object[]{str, str2, A0d, null, null, null, this.A02, null, A0d};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A00;
        11T.A0F(r302, 0);
        AtU A00 = B0s.A00(r302);
        if (str != null && str.length() != 0) {
            A00.A2a(7zM.A0v(r302, str, 2132608182).A2V());
        }
        if (str3 != null && str3.length() != 0) {
            3yF A0L = 2KZ.A0L(r302, 2132608210);
            A0L.A1Z(R.dimen.mapbox_four_dp);
            A0L.A3A(str3);
            A00.A2a(A0L.A2V());
        }
        if (str2 != null && str2.length() != 0) {
            C1rq A01 = C1rg.A01(r302, null, 0);
            A01.A1Z(R.dimen.mapbox_four_dp);
            3yF A0L2 = 2KZ.A0L(r302, 2132608210);
            A0L2.A32(2132279390);
            A0L2.A30(2131952836);
            A0L2.A2D(C26z.RIGHT, R.dimen.mapbox_four_dp);
            A01.A2e(A0L2);
            3yF A0v = 7zM.A0v(r302, str2, 2132608207);
            A0v.A32(2132279390);
            A0v.A2z(2132214111);
            A0v.A33(1);
            7zN.A1D(A0v, r302, B07.class, "AppointmentDetailContactInfoComponent", -447042192);
            A01.A2e(A0v);
            A00.A2a(A01.A2V());
        }
        A00.A0J();
        B0s b0s = A00.A00;
        11T.A0A(b0s);
        return b0s;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        if (-1048037474 != r302.A01) {
            return null;
        }
        1LI.A0J(r302, obj);
        return null;
    }
}
