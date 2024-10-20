package X;

import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback;
import com.facebook.rsys.callmanager.gen.Call;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;

/* loaded from: GwI.class */
public final class GwI extends InitCallCallback {
    public final /* synthetic */ C2635Gjn A00;
    public final /* synthetic */ HqZ A01;
    public final /* synthetic */ SettableFuture A02;

    public GwI(C2635Gjn c2635Gjn, HqZ hqZ, SettableFuture settableFuture) {
        this.A00 = c2635Gjn;
        this.A01 = hqZ;
        this.A02 = settableFuture;
    }

    @Override // com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback
    public void onCall(Call call) {
        11T.A0F(call, 0);
        C2635Gjn c2635Gjn = this.A00;
        CallIntent callIntent = (CallIntent) c2635Gjn.A02;
        String localCallId = callIntent.getLocalCallId();
        11T.A0A(localCallId);
        CallContext callContext = callIntent.getCallContext();
        11T.A0A(callContext);
        Gw1 gw1 = (Gw1) c2635Gjn.A01;
        GwV gwV = (GwV) c2635Gjn.A03;
        HqZ hqZ = this.A01;
        RwL rwL = new RwL(hqZ.A00, gw1, callContext, call, gwV, hqZ.A04, localCallId);
        java.util.Map map = hqZ.A06;
        11T.A0A(map);
        map.put(rwL.A02, rwL);
        rwL.A66(hqZ.A05);
        Iterator it = hqZ.A08.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.A02.set(new Gy5(rwL));
    }
}
