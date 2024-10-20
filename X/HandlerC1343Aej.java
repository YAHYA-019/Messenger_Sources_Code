package X;

import android.os.Handler;
import android.os.Message;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;

/* renamed from: X.Aej, reason: case insensitive filesystem */
/* loaded from: Aej.class */
public final class HandlerC1343Aej extends Handler {
    public final WeakReference A00;

    public HandlerC1343Aej(B9M b9m) {
        this.A00 = 7zL.A14(b9m);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        11T.A0F(message, 0);
        super.handleMessage(message);
        B9M b9m = (B9M) this.A00.get();
        if (b9m != null) {
            Object obj = message.obj;
            if (obj instanceof String) {
                11T.A0I(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                B9M.A08(b9m);
                Bv8 bv8 = b9m.A09;
                if (bv8 != null) {
                    b9m.A0F = true;
                    1G1 r0 = b9m.A05;
                    if (r0 == null) {
                        7zL.A1C();
                        throw 0Q8.createAndThrow();
                    }
                    BiQ biQ = new BiQ(b9m);
                    11T.A0F(str, 1);
                    ListenableFuture listenableFuture = bv8.A00;
                    if (listenableFuture != null) {
                        listenableFuture.cancel(true);
                    }
                    ListenableFuture A0Z = AbL.A0Z(7zM.A0K(((CCp) 1Br.A0B(bv8.A03)).A00), CCp.A00(str, r0.A02, false), 2971616476299527L);
                    bv8.A00 = A0Z;
                    1Br.A0D(bv8.A01, new D4I(biQ, bv8, str, 6), A0Z);
                }
            }
        }
    }
}
