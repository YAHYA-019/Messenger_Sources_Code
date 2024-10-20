package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: E1D.class */
public final class E1D extends DSE {
    public final 1Br A00;
    public final Context A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1D(Context context, C1x1 c1x1, ThreadKey threadKey) {
        super(c1x1, threadKey);
        1BL.A1F(context, c1x1);
        this.A01 = context;
        this.A00 = 1Bu.A01(context, 98881);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(boolean z) {
        ThreadKey threadKey;
        FjR fjR = (FjR) getValue();
        if (fjR == null || !11T.A0O(fjR.A01, "LOADING")) {
            Et4 et4 = new Et4(fjR, this);
            C00i c00i = this.A00.A00;
            ((F8V) c00i.get()).A00 = et4;
            F8V f8v = (F8V) c00i.get();
            if (z) {
                threadKey = (ThreadKey) ((DSE) this).A00;
            } else {
                boolean z2 = f8v.A05;
                f8v = (F8V) c00i.get();
                threadKey = (ThreadKey) ((DSE) this).A00;
                if (!z2) {
                    if (f8v.A00 != null && !f8v.A03.build().isEmpty()) {
                        f8v.A00.A00(f8v.A03.build());
                        return;
                    }
                    f8v.A04 = "";
                }
            }
            f8v.A01(threadKey);
        }
    }

    public void onActive() {
        A01(false);
    }
}
