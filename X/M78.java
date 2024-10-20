package X;

import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.functions.Function2;

/* loaded from: M78.class */
public final class M78 extends C00q implements Function2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M78(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = i;
        this.A04 = obj3;
        this.A01 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                MLv A0N = JQz.A0N(obj, obj2);
                KU9.A00((MJL) this.A03, A0N, this.A05, this.A04, this.A02, Kv9.A00(this.A01));
                break;
            case 1:
                KUB.A00((Lsv) this.A05, JQz.A0N(obj, obj2), this.A04, (Function2) this.A03, this.A02, Kv9.A00(this.A01));
                break;
            case 2:
                Kx2.A00(JQz.A0N(obj, obj2), (MLj) this.A04, (L0R) this.A05, (Function2) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            case 3:
                KWY.A00(JQz.A0N(obj, obj2), (MLj) this.A04, (C00m) this.A05, (MRN) this.A03, Kv9.A00(this.A01), this.A02);
                break;
            default:
                L62.A00(JQz.A0N(obj, obj2), (FbUserSession) this.A05, (Kme) this.A03, (Function2) this.A04, Kv9.A00(this.A01), this.A02);
                break;
        }
        return 04S.A00;
    }
}
