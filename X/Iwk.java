package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: Iwk.class */
public final class Iwk implements Runnable {
    public static final String __redex_internal_original_name = "RsysConferenceCall$join$1";
    public final /* synthetic */ IXv A00;
    public final /* synthetic */ ListenableFuture A01;

    public Iwk(IXv iXv, ListenableFuture listenableFuture) {
        this.A01 = listenableFuture;
        this.A00 = iXv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I3M i3m;
        Object A0C;
        try {
            A0C = 1Kd.A0C(this.A01);
        } catch (ExecutionException e) {
            i3m = new I3M(0Pz.A1B("Unexpected error: ", e));
        }
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        i3m = (I3M) A0C;
        String str = i3m.A01;
        if (str != null) {
            4zI.A03.A06("RsysConferenceCall", str, AnonymousClass001.A1Z());
            return;
        }
        IXv iXv = this.A00;
        JOr jOr = i3m.A00;
        if (jOr == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JOr jOr2 = iXv.A00;
        if (jOr != jOr2) {
            jOr2.A8m(jOr);
            iXv.A00 = jOr;
        }
    }
}
