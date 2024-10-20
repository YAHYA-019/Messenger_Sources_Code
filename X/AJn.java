package X;

import java.util.List;

/* loaded from: AJn.class */
public final class AJn extends 0DO implements C0Bd {
    public Object A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJn(int i, 0DR r303) {
        super(3, r303);
        this.A02 = i;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AJn aJn;
        boolean A1V;
        0DR r304;
        int i;
        switch (this.A02) {
            case 0:
                boolean A1V2 = AnonymousClass001.A1V(obj);
                aJn = new AJn(0, (0DR) obj3);
                aJn.A01 = A1V2;
                aJn.A00 = obj2;
                break;
            case 1:
                A1V = AnonymousClass001.A1V(obj2);
                r304 = (0DR) obj3;
                i = 1;
                aJn = new AJn(i, r304);
                aJn.A00 = obj;
                aJn.A01 = A1V;
                break;
            default:
                A1V = AnonymousClass001.A1V(obj2);
                r304 = (0DR) obj3;
                i = 2;
                aJn = new AJn(i, r304);
                aJn.A00 = obj;
                aJn.A01 = A1V;
                break;
        }
        return aJn.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                0Dt.A00(obj);
                return new 8Lr(this.A01, (List) this.A00, 1);
            case 1:
                0Dt.A00(obj);
                return 7zP.A0y(this.A00, this.A01);
            default:
                0Dt.A00(obj);
                return new 9PX((List) this.A00, this.A01);
        }
    }
}
