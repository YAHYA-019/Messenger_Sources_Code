package X;

import android.content.Context;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent;
import com.facebook.rsys.callmanager.callintentcommon.gen.CallManagerCallIntentCallbacks;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallConfig;
import com.facebook.rsys.callmanager.gen.AppInfo;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.corefeature.gen.CoreFeatureFactory;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function2;
import org.webrtc.ContextUtils;

/* loaded from: HqZ.class */
public final class HqZ {
    public final Context A00;
    public final CallManagerCallIntentCallbacks A01;
    public final CallManagerClient A02;
    public final EnvironmentVariablesProxy A03;
    public final TaskExecutor A04;
    public final If1 A05;
    public final java.util.Map A06;
    public final java.util.Map A07;
    public final CopyOnWriteArraySet A08;
    public final C01i A09;
    public final C01i A0A;
    public final C01i A0B;

    public HqZ(Context context, CallManagerCallIntentCallbacks callManagerCallIntentCallbacks, CallManagerClient callManagerClient, TaskExecutor taskExecutor, Function2 function2) {
        11T.A0F(taskExecutor, 4);
        this.A00 = context;
        this.A02 = callManagerClient;
        this.A01 = callManagerCallIntentCallbacks;
        this.A04 = taskExecutor;
        this.A06 = Collections.synchronizedMap(1BK.A1C());
        this.A07 = Collections.synchronizedMap(1BK.A1C());
        this.A08 = GOn.A1J();
        this.A0A = C01g.A01(new AQe(function2, this, 40));
        this.A03 = this.A02.getEnvironmentVariables();
        this.A05 = new If1(this);
        this.A09 = J9p.A00(this, 2);
        this.A0B = J9p.A00(this, 3);
        ContextUtils.initialize(context.getApplicationContext());
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture A00(C2635Gjn c2635Gjn) {
        CallIntent callIntent = (CallIntent) c2635Gjn.A02;
        String str = callIntent.getCallContext().selfId;
        String appId = callIntent.getAppId();
        11T.A0A(appId);
        Hbv hbv = (Hbv) this.A07.get(1BK.A1G(str, appId));
        if (hbv == null) {
            11T.A0D(str);
            return new 1hM(new QT1(str));
        }
        1FV A0j = 4YU.A0j();
        OutgoingCallConfig outgoingCallConfig = callIntent.getOutgoingCallConfig();
        if (outgoingCallConfig != null) {
            Qq0 qq0 = outgoingCallConfig.startWithVideo ? Qq0.A04 : Qq0.A03;
            String[] strArr = qq0.permissions;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = strArr[i];
                if (this.A00.checkSelfPermission(str2) != -1) {
                    i++;
                } else if (str2 != null) {
                    A0j.set(new QT0(qq0));
                    return A0j;
                }
            }
        }
        11T.A09(callIntent.getCallContext().selfId);
        if (!hbv.A00) {
            C2636Gjo c2636Gjo = hbv.A01;
            CallManagerCallIntent callManagerCallIntent = (CallManagerCallIntent) this.A0A.getValue();
            2JQ r0 = UserContext.CONVERTER;
            String str3 = c2636Gjo.A03;
            AppInfo appInfo = (AppInfo) c2636Gjo.A01;
            Hj2 hj2 = (Hj2) c2636Gjo.A02;
            CryptoContextHolder cryptoContextHolder = (CryptoContextHolder) hj2.A00.getValue();
            LogPersistenceProxy logPersistenceProxy = (LogPersistenceProxy) hj2.A02.getValue();
            LargeLogUploadProxy largeLogUploadProxy = (LargeLogUploadProxy) hj2.A01.getValue();
            Hk5 hk5 = hj2.A06;
            callManagerCallIntent.registerUser(new UserContext(str3, null, appInfo, cryptoContextHolder, null, null, logPersistenceProxy, largeLogUploadProxy, hk5.A0A, (OverlayConfigManagerHolder) hj2.A03.getValue(), (TurnAllocationProxy) hj2.A05.getValue(), null, null, hk5.A04, null));
            hbv.A00 = true;
        }
        ?? A0j2 = 4YU.A0j();
        ((CallManagerCallIntent) this.A0A.getValue()).initCall(new InitCallConfig(CoreFeatureFactory.CProxy.create((AudioProxy) c2635Gjn.A01, (CameraProxy) c2635Gjn.A03, null, (GroupExpansionProxy) c2635Gjn.A05, null, null, null), callIntent, 1BK.A17((Collection) c2635Gjn.A04), c2635Gjn.A06), new GwI(c2635Gjn, this, A0j2));
        A0j.setFuture((ListenableFuture) A0j2);
        return A0j;
    }
}
