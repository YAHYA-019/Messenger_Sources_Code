package X;

/* loaded from: Lzz.class */
public final class Lzz extends 0Ml implements C0Bd {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LA4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzz(0DR r302, LA4 la4) {
        super(3, r302);
        this.this$0 = la4;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Lzz lzz = new Lzz((0DR) obj3, this.this$0);
        lzz.L$0 = obj;
        return lzz.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            0rY r02 = (0rY) this.L$0;
            byte A05 = this.this$0.A01.A05();
            if (A05 == 1) {
                return LA4.A02(this.this$0, true);
            }
            if (A05 == 0) {
                return LA4.A02(this.this$0, false);
            }
            if (A05 != 6) {
                LA4 la4 = this.this$0;
                if (A05 == 8) {
                    return LA4.A01(la4);
                }
                5Z1.A02("Can't begin reading element, unexpected token", la4.A01);
                throw 0Q8.createAndThrow();
            }
            LA4 la42 = this.this$0;
            this.label = 1;
            obj = LA4.A00(r02, this, la42);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return obj;
    }
}
