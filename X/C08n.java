package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.08n, reason: invalid class name */
/* loaded from: 08n.class */
public final class C08n extends C08b {
    @Override // X.C08b
    public Intent A0D(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        return intent;
    }

    @Override // X.C08b
    public Intent A0E(Context context, Intent intent, String str) {
        this.A01.Cg0("AnyIntentScope", 0Pz.A0W("Any_UNSAFE scope used for launching activity: ", C08b.A02(intent)), null);
        return intent;
    }

    @Override // X.C08b
    public Intent A0F(Context context, Intent intent, String str) {
        this.A01.Cg0("AnyIntentScope", 0Pz.A0W("Any_UNSAFE scope used for launching service: ", C08b.A02(intent)), null);
        return intent;
    }

    @Override // X.C08b
    public Integer A0G() {
        return 0S2.A15;
    }

    @Override // X.C08b
    public List A0H(Context context, Intent intent, String str) {
        this.A01.Cg0("AnyIntentScope", 0Pz.A0W("Any_UNSAFE scope used for sending a broadcast: ", C08b.A02(intent)), null);
        return Collections.singletonList(intent);
    }

    @Override // X.C08b
    public boolean A0I() {
        return false;
    }

    @Override // X.C08b
    public boolean A0J(Context context, C08h c08h) {
        throw AnonymousClass001.A0p();
    }
}
