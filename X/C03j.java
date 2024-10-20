package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.profilo.ipc.IProfiloMultiProcessTraceService;
import com.facebook.profilo.multiprocess.ProfiloIPCParcelable;
import com.facebook.profilo.multiprocess.ProfiloMultiProcessTraceListenerImpl;

/* renamed from: X.03j, reason: invalid class name */
/* loaded from: 03j.class */
public final class C03j extends C03k {
    public IProfiloMultiProcessTraceService A00;

    @Override // X.C03k
    public ProfiloIPCParcelable A00() {
        return null;
    }

    @Override // X.C03k
    public String A01() {
        return "com.facebook.profilo.NON_MAIN_PROCESS_STARTED_V5";
    }

    @Override // X.C03k
    public String A02() {
        return "com.facebook.profilo.MAIN_PROCESS_STARTED_V5";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        IBinder iBinder;
        String str;
        String str2;
        int A01 = 0FI.A01(1071571908);
        if (!intent.getAction().equals("com.facebook.profilo.NON_MAIN_PROCESS_STARTED_V5")) {
            i = -752075508;
        } else if (intent.getIntExtra("pid", -1) == -1) {
            i = 1008543834;
        } else {
            ProfiloIPCParcelable profiloIPCParcelable = (ProfiloIPCParcelable) intent.getParcelableExtra("parcel");
            if (profiloIPCParcelable == null || (iBinder = profiloIPCParcelable.A00) == null) {
                i = 1124539031;
            } else {
                try {
                    ProfiloMultiProcessTraceListenerImpl.A00(iBinder).CFc(this.A00);
                } catch (RemoteException e) {
                    e = e;
                    str = "ProfiloMainBroadcastReceiver";
                    str2 = "Failed to call method onReceive on listener.  Listener's process is dead";
                    android.util.Log.e(str, str2, e);
                    i = -1756626895;
                    0FI.A0D(i, A01, intent);
                } catch (Exception e2) {
                    e = e2;
                    str = "ProfiloMainBroadcastReceiver";
                    str2 = "Failed to retrieve listener from parcel";
                    android.util.Log.e(str, str2, e);
                    i = -1756626895;
                    0FI.A0D(i, A01, intent);
                }
                i = -1756626895;
            }
        }
        0FI.A0D(i, A01, intent);
    }
}
