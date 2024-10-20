package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callintent.gen.CallIntentFactoryListener;

/* loaded from: Gw9.class */
public final class Gw9 extends CallIntentFactoryListener {
    public final /* synthetic */ HqZ A00;

    public Gw9(HqZ hqZ) {
        this.A00 = hqZ;
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public void onCallIntentDismissed(CallIntent callIntent) {
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public void onIncomingCallIntent(CallIntent callIntent) {
        11T.A0F(callIntent, 0);
        HqZ hqZ = this.A00;
        hqZ.A04.execute(new GxD(callIntent, hqZ), 0L);
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public void onIncomingCollision(CallIntent callIntent) {
    }

    @Override // com.facebook.rsys.callintent.gen.CallIntentFactoryListener
    public void onMessageError(int i, McfReference mcfReference, String str) {
    }
}
