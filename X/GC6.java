package X;

import com.facebook.foa.session.FbMetaSessionImpl;
import com.facebook.litho.ComponentTree;
import kotlin.jvm.functions.Function2;

/* loaded from: GC6.class */
public final class GC6 extends C00q implements C0Bd {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GC6(int i, Object obj, Object obj2, Object obj3) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        0Be r309;
        C2lh c2lh;
        Object obj4;
        Integer valueOf;
        int i;
        switch (this.A00) {
            case 0:
                1BL.A1F(obj2, obj3);
                throw AnonymousClass001.A0Q("bloksContext");
            case 1:
                EvJ evJ = (EvJ) obj;
                4YV.A1N(evJ, obj3);
                Eqy eqy = evJ.A00;
                if (eqy == null) {
                    throw AnonymousClass001.A0T("Can't access the container owner outside the Screen's content callback");
                }
                7J5 r0 = new 7J5((1LI) ((C0Bd) this.A02).invoke(evJ, obj2, obj3), AbJ.A1b(FbMetaSessionImpl.class, evJ.A02, 1BK.A1G(ExC.class, eqy.A04), 1BK.A1G(Exp.class, evJ.A03)), (03Y[]) null);
                AKK akk = new AKK(evJ, 19);
                0BY r02 = new 0BY(1Iw.class);
                GBS gbs = GBS.A00;
                11T.A0F(1Iw.class, 1);
                C01i A00 = evJ.A00(r02, akk, gbs);
                GBR gbr = GBR.A00;
                G9M g9m = new G9M(6, r0, evJ, this.A01, A00);
                0BY r03 = new 0BY(ComponentTree.class);
                11T.A0F(ComponentTree.class, 1);
                return ((Function2) this.A03).invoke(evJ.A01, evJ.A00(r03, g9m, gbr).getValue());
            case 2:
                int A03 = AnonymousClass001.A03(obj3);
                11T.A0H(obj, obj2);
                r309 = ((C8i5) this.A03).A0F;
                if (r309 != null) {
                    c2lh = (C2lh) this.A02;
                    c2lh.A04(new GBn(obj, 39));
                    obj4 = this.A01;
                    valueOf = Integer.valueOf(A03);
                    i = 40;
                    break;
                }
                return 04S.A00;
            default:
                int A032 = AnonymousClass001.A03(obj3);
                11T.A0H(obj, obj2);
                r309 = ((C8i5) this.A03).A0F;
                if (r309 != null) {
                    c2lh = (C2lh) this.A02;
                    c2lh.A04(new GBn(obj, 40));
                    obj4 = this.A01;
                    valueOf = Integer.valueOf(A032);
                    i = 42;
                    break;
                }
                return 04S.A00;
        }
        r309.invoke(obj4, obj2, valueOf, new AKK(c2lh, i));
        return 04S.A00;
    }
}
