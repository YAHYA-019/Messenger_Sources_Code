package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A7J.class */
public final class A7J implements 1Vf {
    public final Context A00;
    public final LifecycleOwner A01;
    public final ThreadKey A02;

    public A7J(Context context, LifecycleOwner lifecycleOwner, ThreadKey threadKey) {
        this.A00 = context;
        this.A02 = threadKey;
        this.A01 = lifecycleOwner;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreateView")) {
            throw 4YV.A0f(str);
        }
        1Br A00 = 1Bq.A00(66802);
        LiveData ASY = ((C5xl) 1Bi.A03(67528)).ASY(this.A02);
        11T.A0A(ASY);
        C9qn.A00(this.A01, ASY, A00, this, 0);
    }
}
