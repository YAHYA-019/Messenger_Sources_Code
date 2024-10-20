package X;

import com.facebook.rsys.callintent.gen.CallIntentCreationResult;
import com.facebook.rsys.callmanager.callintentcommon.gen.CallManagerCallIntentCallbacks;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;

/* loaded from: GwH.class */
public final class GwH extends CallManagerCallIntentCallbacks {
    @Override // com.facebook.rsys.callmanager.callintentcommon.gen.CallManagerCallIntentCallbacks
    public CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig) {
        throw AnonymousClass001.A0q("CallManagerClient.createCallIntent() calls are unsupported in Stark API");
    }
}
