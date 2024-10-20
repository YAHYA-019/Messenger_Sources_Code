package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8lk, reason: invalid class name */
/* loaded from: 8lk.class */
public final class C8lk extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("SavedRepliesListItemLayoutSpec");
    public AnonymousClass572 A00;

    public C8lk() {
        super("SavedRepliesListItemLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        AnonymousClass572 anonymousClass572 = this.A00;
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        C26z c26z = C26z.RIGHT;
        2RH r0 = 2RH.A03;
        4YU.A1O(A012, r0, c26z);
        A012.A0R();
        String str = anonymousClass572.A04;
        if (!1JF.A0B(str)) {
            2KD A00 = 2K3.A00(r302);
            A00.A2x(anonymousClass572.A01);
            A00.A2k();
            A00.A2d();
            A00.A2z(str);
            4YU.A1K(A012, A00);
            A012.A2C(C26z.TOP, 7zM.A01());
        }
        2KD A002 = 2K3.A00(r302);
        A002.A2x(anonymousClass572.A01);
        A002.A2l();
        A002.A2b();
        A002.A2z(anonymousClass572.A03);
        A002.A2q(4);
        4YU.A1K(A012, A002);
        C1rq A0Q = 7zN.A0Q(r302, 0);
        A0Q.A2b();
        4YU.A1L(A0Q, 2RH.A06);
        4YU.A1N(A0Q, r0);
        4YU.A1M(A0Q, r0);
        7zL.A1H(A012, A0Q);
        String str2 = anonymousClass572.A02;
        if (!1JF.A0B(str2)) {
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            7zO.A1I(A013, 2RH.A04);
            5BH A014 = 5BG.A01(r302);
            C07004ik A003 = C06984ii.A00();
            A003.A00(InterfaceC07034in.A03);
            7zM.A1K(A003, 10.0f);
            C06984ii.A01(A014, A003);
            7zN.A1A(A014, str2);
            A014.A2b(A01);
            A014.A0z(62.0f);
            A014.A0l(62.0f);
            A013.A2d(A014);
            A0Q.A2e(A013);
        }
        return A0Q.A00;
    }
}
