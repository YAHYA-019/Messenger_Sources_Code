package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;

/* loaded from: GwE.class */
public final class GwE extends CallManagerCallClientCallbacks {
    public final /* synthetic */ IZz A00;

    public GwE(IZz iZz) {
        this.A00 = iZz;
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks
    public CallClient createCallClient(String str, UserContext userContext, CallContext callContext) {
        DevXAgentCallApi devXAgentCallApi;
        DevXAgentCallApi devXAgentCallApi2;
        7zT.A1S(str, userContext, callContext);
        IZz iZz = this.A00;
        IZz iZz2 = IZz.$redex_init_class;
        Hbe hbe = iZz.A01;
        if (hbe != null) {
            C0Bd c0Bd = hbe.A01;
            CallManagerCallClient callManagerCallClient = iZz.A02;
            DevXAgentCallConfig devXAgentCallConfig = null;
            if (callManagerCallClient != null && (devXAgentCallApi2 = callManagerCallClient.getDevXAgentCallApi()) != null) {
                devXAgentCallConfig = devXAgentCallApi2.copyCallConfig(null);
            }
            CallClient callClient = (CallClient) c0Bd.invoke(str, callContext, devXAgentCallConfig);
            if (callClient != null) {
                return callClient;
            }
        }
        HkA hkA = (HkA) 1Br.A0B(iZz.A07);
        Handler handler = iZz.A03;
        FbUserSession fbUserSession = iZz.A04;
        CallManagerCallClient callManagerCallClient2 = hkA.A02;
        DevXAgentCallConfig devXAgentCallConfig2 = null;
        if (callManagerCallClient2 != null && (devXAgentCallApi = callManagerCallClient2.getDevXAgentCallApi()) != null) {
            devXAgentCallConfig2 = devXAgentCallApi.copyCallConfig(null);
        }
        C1F6 A0I = GOp.A0I(hkA.A07);
        Mailbox mailbox = hkA.A00;
        if (mailbox == null) {
            throw 1BK.A0h();
        }
        AudioModule audioModule = hkA.A01;
        Context A01 = FbInjector.A01();
        AbL.A0y(A0I);
        try {
            GwA gwA = new GwA(handler, fbUserSession, 7zQ.A0S(A0I), mailbox, audioModule, callContext, devXAgentCallConfig2, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            return gwA;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks
    public void onCallAdded(CallClient callClient) {
        11T.A0F(callClient, 0);
        IZz iZz = this.A00;
        IZz iZz2 = IZz.$redex_init_class;
        Hbe hbe = iZz.A01;
        if (hbe != null && 7zR.A1a(callClient, hbe.A00)) {
            iZz.A01 = null;
            return;
        }
        if (!(callClient instanceof GwA)) {
            throw 1BK.A0g();
        }
        synchronized (iZz) {
            java.util.Map map = iZz.A0C;
            GwA gwA = (GwA) callClient;
            map.put(gwA.A0N, new HeX(7zM.A0A(), gwA));
        }
        HrI hrI = iZz.A00;
        if (hrI != null) {
            hrI.A00((JOr) callClient);
        }
        ((I8i) 1Br.A0B(iZz.A06)).A03((JOr) callClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks
    public void onCallRemoved(CallClient callClient) {
        11T.A0F(callClient, 0);
        if (callClient instanceof GwA) {
            IZz iZz = this.A00;
            synchronized (iZz) {
                IZz iZz2 = IZz.$redex_init_class;
                iZz.A0C.remove(((GwA) callClient).A0N);
            }
            HrI hrI = iZz.A00;
            if (hrI != null) {
                hrI.A01((JOr) callClient);
            }
        }
    }
}
