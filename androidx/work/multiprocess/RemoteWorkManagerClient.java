package androidx.work.multiprocess;

import X.0FI;
import X.4IS;
import X.4IU;
import X.AnonymousClass001;
import X.C3o5;
import X.C4Ih;
import X.C4Ks;
import X.LFo;
import X.LqJ;
import X.LrS;
import X.MEf;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: RemoteWorkManagerClient.class */
public class RemoteWorkManagerClient {
    public static final String A09 = 4IS.A01("RemoteWorkManagerClient");
    public LFo A00;
    public final long A01;
    public final Context A02;
    public final Handler A03;
    public final 4IU A04;
    public final LrS A05;
    public final Object A06;
    public final Executor A07;
    public volatile long A08;

    /* loaded from: RemoteWorkManagerClient$SessionRemoteCallback.class */
    public final class SessionRemoteCallback extends RemoteCallback {
        public final RemoteWorkManagerClient A00;

        public SessionRemoteCallback(RemoteWorkManagerClient remoteWorkManagerClient) {
            int A03 = 0FI.A03(1989645921);
            this.A00 = remoteWorkManagerClient;
            0FI.A09(-83883303, A03);
        }

        @Override // androidx.work.multiprocess.RemoteCallback
        public void A02() {
            int A03 = 0FI.A03(-1871653961);
            super.A02();
            RemoteWorkManagerClient remoteWorkManagerClient = this.A00;
            remoteWorkManagerClient.A03.postDelayed(remoteWorkManagerClient.A05, remoteWorkManagerClient.A01);
            0FI.A09(1986197800, A03);
        }
    }

    public RemoteWorkManagerClient() {
    }

    public RemoteWorkManagerClient(Context context, 4IU r303) {
        this(context, r303, 60000L);
    }

    public RemoteWorkManagerClient(Context context, 4IU r303, long j) {
        this.A02 = context.getApplicationContext();
        this.A04 = r303;
        this.A07 = ((C4Ih) r303.A06).A01;
        this.A06 = AnonymousClass001.A0R();
        this.A00 = null;
        this.A05 = new LrS(this);
        this.A01 = j;
        this.A03 = Handler.createAsync(Looper.getMainLooper());
    }

    public static C4Ks A00(MEf mEf, RemoteWorkManagerClient remoteWorkManagerClient) {
        C4Ks c4Ks;
        Context context = remoteWorkManagerClient.A02;
        Intent A0D = C3o5.A0D(context, RemoteWorkManagerService.class);
        synchronized (remoteWorkManagerClient.A06) {
            remoteWorkManagerClient.A08++;
            if (remoteWorkManagerClient.A00 == null) {
                4IS A00 = 4IS.A00();
                String str = A09;
                A00.A02(str, "Creating a new session");
                LFo lFo = new LFo(remoteWorkManagerClient);
                remoteWorkManagerClient.A00 = lFo;
                try {
                    if (!context.bindService(A0D, (ServiceConnection) lFo, 1)) {
                        LFo lFo2 = remoteWorkManagerClient.A00;
                        RuntimeException A0T = AnonymousClass001.A0T("Unable to bind to service");
                        4IS.A00();
                        Log.e(str, "Unable to bind to service", A0T);
                        lFo2.A00.A07(A0T);
                    }
                } catch (Throwable th) {
                    LFo lFo3 = remoteWorkManagerClient.A00;
                    4IS.A00();
                    Log.e(str, "Unable to bind to service", th);
                    lFo3.A00.A07(th);
                }
            }
            remoteWorkManagerClient.A03.removeCallbacks(remoteWorkManagerClient.A05);
            c4Ks = remoteWorkManagerClient.A00.A00;
        }
        SessionRemoteCallback sessionRemoteCallback = new SessionRemoteCallback(remoteWorkManagerClient);
        c4Ks.addListener(new LqJ(sessionRemoteCallback, mEf, remoteWorkManagerClient, c4Ks), remoteWorkManagerClient.A07);
        int A03 = 0FI.A03(-764495376);
        C4Ks c4Ks2 = sessionRemoteCallback.A02;
        0FI.A09(1363793704, A03);
        return c4Ks2;
    }

    public static RemoteWorkManagerClient A01(Context context) {
        4IU A00 = 4IU.A00(context);
        if (A00.A0A == null) {
            synchronized (4IU.A0D) {
                if (A00.A0A == null) {
                    try {
                        A00.A0A = (RemoteWorkManagerClient) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, 4IU.class).newInstance(A00.A01, A00);
                    } catch (Throwable th) {
                        4IS A002 = 4IS.A00();
                        String str = 4IU.A0E;
                        if (A002.A00 <= 3) {
                            Log.d(str, "Unable to initialize multi-process support", th);
                        }
                    }
                    if (A00.A0A == null && !TextUtils.isEmpty(A00.A02.A06)) {
                        throw AnonymousClass001.A0N("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        RemoteWorkManagerClient remoteWorkManagerClient = A00.A0A;
        if (remoteWorkManagerClient != null) {
            return remoteWorkManagerClient;
        }
        throw AnonymousClass001.A0N("Unable to initialize RemoteWorkManager");
    }

    public void A02() {
        synchronized (this.A06) {
            4IS.A00().A02(A09, "Cleaning up.");
            this.A00 = null;
        }
    }
}
