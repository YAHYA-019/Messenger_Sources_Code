package org.webrtc;

import X.0Pz;
import X.1BK;
import X.4YU;
import X.AnonymousClass001;
import X.JQx;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NetworkChangeDetector;

/* loaded from: NetworkMonitor.class */
public class NetworkMonitor {
    public static final String TAG = "NetworkMonitor";
    public volatile NetworkChangeDetector.ConnectionType currentConnectionType;
    public final ArrayList nativeNetworkObservers;
    public NetworkChangeDetector networkChangeDetector;
    public NetworkChangeDetectorFactory networkChangeDetectorFactory;
    public final Object networkChangeDetectorLock;
    public final ArrayList networkObservers;
    public int numObservers;

    /* renamed from: org.webrtc.NetworkMonitor$2, reason: invalid class name */
    /* loaded from: NetworkMonitor$2.class */
    public class AnonymousClass2 extends NetworkChangeDetector.Observer {
        public final /* synthetic */ String val$fieldTrialsString;

        public AnonymousClass2(String str) {
            this.val$fieldTrialsString = str;
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public String getFieldTrialsString() {
            return this.val$fieldTrialsString;
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
            NetworkMonitor.this.updateCurrentConnectionType(connectionType);
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
            NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onNetworkDisconnect(long j) {
            NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j);
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onNetworkPreference(List list, int i) {
            NetworkMonitor.this.notifyObserversOfNetworkPreference(list, i);
        }
    }

    /* loaded from: NetworkMonitor$InstanceHolder.class */
    public class InstanceHolder {
        public static final NetworkMonitor instance = new NetworkMonitor();
    }

    /* loaded from: NetworkMonitor$NetworkObserver.class */
    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    public NetworkMonitor() {
        this.networkChangeDetectorFactory = new NetworkChangeDetectorFactory() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.webrtc.NetworkChangeDetectorFactory
            public NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context) {
                return new NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = AnonymousClass001.A0R();
        this.nativeNetworkObservers = AnonymousClass001.A0s();
        this.networkObservers = AnonymousClass001.A0s();
        this.numObservers = 0;
        this.currentConnectionType = NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    public static void addNetworkObserver(NetworkObserver networkObserver) {
        InstanceHolder.instance.addObserver(networkObserver);
    }

    public static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static void assertIsTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected to be true");
        }
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = InstanceHolder.instance;
        NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, String str) {
        return this.networkChangeDetectorFactory.create(new AnonymousClass2(str), context);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    public static void init(Context context) {
    }

    public static boolean isOnline() {
        return 1BK.A1V(InstanceHolder.instance.currentConnectionType, NetworkChangeDetector.ConnectionType.CONNECTION_NONE);
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.supportNetworkCallback() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean networkBindingSupported() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r301
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L28
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r303
            boolean r0 = r0.supportNetworkCallback()     // Catch: java.lang.Throwable -> L28
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L23
        L1e:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L23:
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            r0 = r305
            return r0
        L28:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitor.networkBindingSupported():boolean");
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        ArrayList A17;
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyConnectionTypeChanged(JQx.A0R(it.next()));
            }
        }
        synchronized (this.networkObservers) {
            A17 = 1BK.A17(this.networkObservers);
        }
        Iterator it2 = A17.iterator();
        while (it2.hasNext()) {
            ((NetworkObserver) it2.next()).onConnectionTypeChanged(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkConnect(JQx.A0R(it.next()), networkInformation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkDisconnect(JQx.A0R(it.next()), j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkPreference(List list, int i) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NetworkChangeDetector.ConnectionType connectionType = (NetworkChangeDetector.ConnectionType) it.next();
                Iterator it2 = this.nativeNetworkObservers.iterator();
                while (it2.hasNext()) {
                    nativeNotifyOfNetworkPreference(JQx.A0R(it2.next()), connectionType, i);
                }
            }
        }
    }

    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        InstanceHolder.instance.removeObserver(networkObserver);
    }

    private void startMonitoring(Context context, long j, String str) {
        Logging.d(TAG, 0Pz.A0t("Start monitoring with native observer ", " fieldTrialsString: ", str, j));
        if (context == null) {
            context = ContextUtils.applicationContext;
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            4YU.A1W(this.nativeNetworkObservers, j);
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    private void stopMonitoring(long j) {
        Logging.d(TAG, AnonymousClass001.A0h(AnonymousClass001.A0n("Stop monitoring with native observer "), j));
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        List activeNetworkList;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            activeNetworkList = networkChangeDetector == null ? null : networkChangeDetector.getActiveNetworkList();
        }
        if (activeNetworkList != null) {
            nativeNotifyOfActiveNetworkList(j, (NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
        }
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkChangeDetector getNetworkChangeDetector() {
        NetworkChangeDetector networkChangeDetector;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector = this.networkChangeDetector;
        }
        return networkChangeDetector;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.networkChangeDetectorLock) {
            i = this.numObservers;
        }
        return i;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        assertIsTrue(AnonymousClass001.A1O(this.numObservers));
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    public void startMonitoring() {
        startMonitoring(ContextUtils.applicationContext, "");
    }

    public void startMonitoring(Context context) {
        startMonitoring(context, "");
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            this.numObservers++;
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector == null) {
                networkChangeDetector = createNetworkChangeDetector(context, str);
                this.networkChangeDetector = networkChangeDetector;
            }
            this.currentConnectionType = networkChangeDetector.getCurrentConnectionType();
        }
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            int i = this.numObservers - 1;
            this.numObservers = i;
            if (i == 0) {
                this.networkChangeDetector.destroy();
                this.networkChangeDetector = null;
            }
        }
    }
}
