package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: In6.class */
public final /* synthetic */ class In6 implements 2eF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ In6(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final ListenableFuture A8b(Object obj) {
        int i = this.A00;
        String str = this.A01;
        IFQ ifq = (IFQ) obj;
        if (ifq == null) {
            return null;
        }
        return ifq.A0C(str, i);
    }
}
