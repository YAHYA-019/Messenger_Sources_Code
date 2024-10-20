package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8lm, reason: invalid class name */
/* loaded from: 8lm.class */
public final class C8lm extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("LandingPageCoverPhotoComponentSpec");
    public static final C06974ih A02 = 7zL.A0L(7zR.A0H());
    public 9tR A00;

    public C8lm() {
        super("LandingPageCoverPhotoComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        9tR r0 = this.A00;
        11T.A0H(r302, r0);
        String str = r0.A00;
        5BG r303 = null;
        if (!AnonymousClass001.A1O(str.length())) {
            5BH A012 = 5BG.A01(r302);
            A012.A2b(A01);
            7zN.A1A(A012, str);
            A012.A2Z(A02);
            A012.A1M(2132279643);
            r303 = 7zL.A0K(A012);
        }
        return r303;
    }
}
