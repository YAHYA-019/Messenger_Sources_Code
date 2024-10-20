package X;

import androidx.compose.foundation.ClickableElement;

/* loaded from: M8t.class */
public final class M8t extends C00q implements C0Bd {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C00m $onClick;
    public final /* synthetic */ String $onClickLabel = null;
    public final /* synthetic */ ExZ $role = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8t(C00m c00m, boolean z) {
        super(3);
        this.$enabled = z;
        this.$onClick = c00m;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MMs mMs;
        Object c2948JeH;
        MMr mMr;
        LNS A0N = JQz.A0N(obj2, obj3);
        A0N.D2A(-756081143);
        LNS lns = A0N;
        ME2 me2 = (ME2) LNS.A08(lns, Kwq.A00);
        boolean z = me2 instanceof MMr;
        if (z) {
            A0N.D2A(617140216);
            LNS.A0P(lns, false);
            mMs = null;
        } else {
            A0N.D2A(617248189);
            Object CdA = A0N.CdA();
            if (CdA == Ky6.A00) {
                CdA = new 9qP();
                LNS.A0N(lns, CdA);
            }
            mMs = (MMs) CdA;
            LNS.A0P(lns, false);
        }
        LOD lod = MLj.A00;
        boolean z2 = this.$enabled;
        String str = this.$onClickLabel;
        ExZ exZ = this.$role;
        C00m c00m = this.$onClick;
        if (z) {
            mMr = (MMr) me2;
        } else {
            if (me2 != null) {
                if (mMs != null) {
                    c2948JeH = Kwq.A00(me2, mMs, lod).D4B(new ClickableElement(null, mMs, exZ, str, c00m, z2));
                } else {
                    c2948JeH = new C2948JeH(KZo.A00, new M8x(me2, exZ, c00m, str, 0, z2));
                }
                LNS.A0P(lns, false);
                return c2948JeH;
            }
            mMr = null;
        }
        c2948JeH = new ClickableElement(mMr, mMs, exZ, str, c00m, z2);
        LNS.A0P(lns, false);
        return c2948JeH;
    }
}
