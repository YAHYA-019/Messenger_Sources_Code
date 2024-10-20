package X;

import android.content.Context;

/* loaded from: D8w.class */
public final class D8w implements Runnable {
    public static final String __redex_internal_original_name = "CommunityMessagingReceiver$showDeclineToast$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ boolean A02;

    public D8w(Context context, 1Br r303, boolean z) {
        this.A02 = z;
        this.A00 = context;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A02;
        Context context = this.A00;
        int i = 2131954438;
        if (z) {
            i = 2131954439;
        }
        7zU.A1X(AbJ.A0k(this.A01), AbG.A16(context, i));
    }
}
