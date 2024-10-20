package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cjq.class */
public final class Cjq implements C2sd {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public Cjq(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.C2sd
    public ListenableFuture ARv(ImmutableList immutableList) {
        1Kh A0y = AbF.A0y();
        A0y.A05(this.A01);
        String str = this.A00;
        A0y.A0O = str != null ? 1Kq.A04 : 1Kq.A02;
        A0y.A1L = str;
        ListenableFuture A0A = 1Kd.A0A(ImmutableList.of((Object) AbF.A0w(A0y)));
        11T.A0A(A0A);
        return A0A;
    }
}
