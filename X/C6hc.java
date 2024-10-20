package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6hc, reason: invalid class name */
/* loaded from: 6hc.class */
public final class C6hc {
    public final C00i A00 = 1Bq.A00(16511);
    public final C6hd A01;
    public final 1De A02;

    public C6hc(1De r302) {
        this.A02 = r302;
        this.A01 = (C6hd) 1Bn.A0E((Context) null, r302.A00, 65861);
    }

    public static final C6he A00(Lifecycle lifecycle, C6hc c6hc, ThreadKey threadKey) {
        11T.A0F(lifecycle, 4);
        return new C6he(lifecycle, c6hc.A00, c6hc.A01, threadKey, 4);
    }
}
