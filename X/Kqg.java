package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Kqg.class */
public final class Kqg {
    public 1BY A00;
    public final C00i A04 = AbH.A0S();
    public final C00i A05 = 1BQ.A02(16563);
    public final C00i A06 = 1BQ.A02(16617);
    public final C00i A02 = AbH.A0K();
    public final C00i A07 = 1BQ.A02(16431);
    public final Context A01 = 7zP.A0J();
    public final C00i A03 = AbH.A0a();

    public Kqg(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public ListenableFuture A00(String str) {
        return ((1ED) this.A07.get()).D3C(new Ltd(str, this, 3));
    }
}
