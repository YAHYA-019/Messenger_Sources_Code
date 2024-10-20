package com.facebook.wearable.common.comms.hera.shared.host;

import X.0DE;
import X.11T;
import X.2aG;
import X.2aK;
import X.2aN;
import X.7zL;
import com.meta.wearable.comms.calling.hera.engine.video.FeatureVideoProxy;
import java.util.Set;

/* loaded from: HeraHostSharedImpl$videoProxyImpl$1.class */
public final class HeraHostSharedImpl$videoProxyImpl$1 extends FeatureVideoProxy {
    public final Set participantsWithActiveVideo = 7zL.A15();
    public final /* synthetic */ HeraHostSharedImpl this$0;

    public HeraHostSharedImpl$videoProxyImpl$1(HeraHostSharedImpl heraHostSharedImpl) {
        this.this$0 = heraHostSharedImpl;
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.video.FeatureVideoProxy
    public void onParticipantVideoUpdated(String str, String str2, boolean z) {
        11T.A0F(str2, 1);
        HeraHostSharedImpl heraHostSharedImpl = this.this$0;
        2aK.A03((Integer) null, (0DE) null, new HeraHostSharedImpl$videoProxyImpl$1$onParticipantVideoUpdated$$inlined$runOnQueue$1(heraHostSharedImpl, null, z, this, str2, heraHostSharedImpl), 2aG.A02(2aN.A01), 3);
    }
}
