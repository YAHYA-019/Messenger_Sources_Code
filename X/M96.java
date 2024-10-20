package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: M96.class */
public final class M96 extends C00q implements C0Bd {
    public static final M96 A00 = new M96();

    public M96() {
        super(3);
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        LMU lmu = (MBA) obj;
        LNS A0N = JQz.A0N(obj2, obj3);
        11T.A0F(lmu, 0);
        A0N.D2A(-1582964912);
        Boolean bool = false;
        Boolean bool2 = true;
        LMU lmu2 = lmu;
        LMN lmn = (bool.equals(lmu2.A00) && bool2.equals(lmu2.A01)) ? new LMN(Kck.A02, ActionId.VIDEO_SET_RENDERER_CONTEXT, 0) : new LMN(Kck.A00, 1, 74);
        LNS.A0P(A0N, false);
        return lmn;
    }
}
