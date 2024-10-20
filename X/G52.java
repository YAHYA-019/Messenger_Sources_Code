package X;

import android.content.Context;

/* loaded from: G52.class */
public final class G52 implements Runnable {
    public static final String __redex_internal_original_name = "DeleteFriendRequestIntentHandler$deleteFriendRequest$1$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ C4Ss A02;
    public final /* synthetic */ boolean A03;

    public G52(Context context, 1Iw r303, C4Ss c4Ss, boolean z) {
        this.A02 = c4Ss;
        this.A01 = r303;
        this.A03 = z;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1Iw r0 = this.A01;
        boolean z = this.A03;
        Context context = this.A00;
        int i = 2131964368;
        if (z) {
            i = 2131964369;
        }
        FFJ.A01(FFJ.A00(r0, AbG.A16(context, i)), AbstractC00603o4.A00(343));
    }
}
