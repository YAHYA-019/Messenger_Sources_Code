package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dyf.class */
public final class Dyf extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("FDSListHeaderWithActionButtonComponentSpec");
    public CharSequence A00;

    public Dyf() {
        super("FDSListHeaderWithActionButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{null, null, 1BK.A0d(), null, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A00;
        DfW A00 = EVZ.A00(r302);
        A00.A0g(charSequence);
        A00.A07 = true;
        A00.A0X(C26z.BOTTOM, 8.0f);
        A00.A0X(C26z.START, 12.0f);
        A00.A01 = EML.A02;
        1LI A0O = A00.A0O(A01);
        A0O.getClass();
        return A0O;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        if (r302.A01 != -1048037474) {
            return null;
        }
        1LI.A0J(r302, obj);
        return null;
    }
}
