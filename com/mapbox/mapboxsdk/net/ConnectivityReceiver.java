package com.mapbox.mapboxsdk.net;

import X.0FI;
import X.JQx;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.mapbox.mapboxsdk.log.Logger;
import java.util.Iterator;
import java.util.List;

/* loaded from: ConnectivityReceiver.class */
public class ConnectivityReceiver extends BroadcastReceiver {
    public static ConnectivityReceiver INSTANCE;
    public static final String LOG_CONNECTED = "connected - true";
    public static final String LOG_NOT_CONNECTED = "connected - false";
    public static final String TAG = "Mbgl-ConnectivityReceiver";
    public int activationCounter;
    public Boolean connected;
    public Context context;
    public List listeners = JQx.A14();

    public ConnectivityReceiver(Context context) {
        this.context = context;
    }

    public static ConnectivityReceiver instance(Context context) {
        ConnectivityReceiver connectivityReceiver;
        synchronized (ConnectivityReceiver.class) {
            if (INSTANCE == null) {
                ConnectivityReceiver connectivityReceiver2 = new ConnectivityReceiver(context.getApplicationContext());
                INSTANCE = connectivityReceiver2;
                connectivityReceiver2.addListener(new NativeConnectivityListener());
            }
            connectivityReceiver = INSTANCE;
        }
        return connectivityReceiver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isNetworkActive() {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = r0.context
            r302 = r0
            r0 = r302
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r303
            boolean r0 = r0.isConnected()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L27
        L22:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.net.ConnectivityReceiver.isNetworkActive():boolean");
    }

    private void notifyListeners(boolean z) {
        Logger.v(TAG, z ? LOG_CONNECTED : LOG_NOT_CONNECTED);
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ConnectivityListener) it.next()).onNetworkStateChanged(z);
        }
    }

    public void activate() {
        if (this.activationCounter == 0) {
            this.context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.activationCounter++;
    }

    public void addListener(ConnectivityListener connectivityListener) {
        this.listeners.add(connectivityListener);
    }

    public void deactivate() {
        int i = this.activationCounter - 1;
        this.activationCounter = i;
        if (i == 0) {
            this.context.unregisterReceiver(INSTANCE);
        }
    }

    public boolean isConnected() {
        Boolean bool = this.connected;
        return bool != null ? bool.booleanValue() : isNetworkActive();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-1216919898);
        if (this.connected != null) {
            i = -1183049179;
        } else {
            notifyListeners(isNetworkActive());
            i = 183214010;
        }
        0FI.A0D(i, A01, intent);
    }

    public void removeListener(ConnectivityListener connectivityListener) {
        this.listeners.remove(connectivityListener);
    }

    public void setConnected(Boolean bool) {
        this.connected = bool;
        notifyListeners(bool != null ? bool.booleanValue() : isNetworkActive());
    }
}
