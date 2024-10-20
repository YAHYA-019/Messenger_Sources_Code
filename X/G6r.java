package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.Callable;

/* loaded from: G6r.class */
public final class G6r implements Callable {
    public final /* synthetic */ Fck A00;
    public final /* synthetic */ CallerContext A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public G6r(Fck fck, CallerContext callerContext, String str, String str2, String str3, boolean z) {
        this.A00 = fck;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = callerContext;
        this.A04 = str3;
        this.A05 = z;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        C00i c00i;
        CgO cgO;
        C00i c00i2;
        Fck fck = this.A00;
        1Rl A0Y = DKE.A0Y(fck);
        try {
            String str = this.A02;
            if (str != null) {
                String str2 = this.A03;
                if (str2 != null) {
                    c00i2 = fck.A0O;
                    A0Y.A08(this.A01, DKC.A0S(c00i2), new RHt(str, str2));
                    return AnonymousClass001.A0K();
                }
            }
            cgO = fck.A0A;
            A0Y.A08(this.A01, cgO, new Bjc(this.A04, this.A05));
            return AnonymousClass001.A0K();
        } catch (Exception e) {
            c00i = fck.A0a;
            1BK.A09(c00i).softReport("AuthExpireSession failure", e);
            return 1BK.A0d();
        }
    }
}
