package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.lifecycle.OnCreate;
import com.facebook.xapp.messaging.events.common.lifecycle.OnSaveInstanceState;

/* renamed from: X.6t0, reason: invalid class name */
/* loaded from: 6t0.class */
public final class C6t0 implements 1Vf {
    public final Context A00;
    public final Bundle A01;
    public final LifecycleOwner A02;
    public final 1Br A03 = 1Bu.A00(84233);
    public final ThreadKey A04;

    public C6t0(Context context, Bundle bundle, LifecycleOwner lifecycleOwner, ThreadKey threadKey) {
        this.A00 = context;
        this.A04 = threadKey;
        this.A02 = lifecycleOwner;
        this.A01 = bundle;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnSaveInstanceState")) {
                throw 4YV.A0f(str);
            }
            OnSaveInstanceState onSaveInstanceState = (OnSaveInstanceState) r302;
            11T.A0F(onSaveInstanceState, 0);
            C6t1 c6t1 = (C6t1) this.A03.A00.get();
            Bundle bundle = onSaveInstanceState.A00;
            bundle.putBoolean("has_been_dismissed_key", c6t1.A03);
            bundle.putBoolean("is_dialog_showing_key", c6t1.A04);
            return;
        }
        OnCreate onCreate = (OnCreate) r302;
        11T.A0F(onCreate, 0);
        C6t1 c6t12 = (C6t1) this.A03.A00.get();
        Context context = this.A00;
        ThreadKey threadKey = this.A04;
        LifecycleOwner lifecycleOwner = this.A02;
        Bundle bundle2 = this.A01;
        Bundle bundle3 = onCreate.A00;
        boolean z = false;
        c6t12.A03 = bundle3 != null ? bundle3.getBoolean("has_been_dismissed_key") : false;
        if (bundle3 != null) {
            z = bundle3.getBoolean("is_dialog_showing_key");
        }
        c6t12.A04 = z;
        c6t12.A00 = bundle2;
        if (c6t12.A03 || !bundle2.getBoolean("EXTRA_VOIP_START_CALL_WITH_CONFIRMATION")) {
            return;
        }
        LiveData ASY = ((C5xl) c6t12.A06.A00.get()).ASY(threadKey);
        c6t12.A01 = ASY;
        CZw cZw = new CZw(context, c6t12, 3);
        c6t12.A02 = cZw;
        if (ASY != null) {
            ASY.observe(lifecycleOwner, cZw);
        }
    }
}
