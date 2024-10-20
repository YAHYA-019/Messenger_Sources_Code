package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A4m.class */
public final class A4m implements AYh {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ C9d4 A02;
    public final /* synthetic */ 7Nc A03;
    public final /* synthetic */ ThreadKey A04;

    public A4m(Context context, 06Z r303, C9d4 c9d4, 7Nc r305, ThreadKey threadKey) {
        this.A02 = c9d4;
        this.A00 = context;
        this.A01 = r303;
        this.A03 = r305;
        this.A04 = threadKey;
    }

    @Override // X.AYh
    public final void BkS(8O0 r302, String str, boolean z) {
        if (r302 != null) {
            C9d4.A00(this.A01, this.A03, this.A04, r302);
        }
    }
}
