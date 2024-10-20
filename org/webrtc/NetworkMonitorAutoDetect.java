package org.webrtc;

import X.0FI;
import X.0Pz;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.GOn;
import X.JR6;
import X.Kvn;
import X.KyG;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.NetworkMonitorAutoDetect;

/* loaded from: NetworkMonitorAutoDetect.class */
public class NetworkMonitorAutoDetect extends BroadcastReceiver implements NetworkChangeDetector {
    public static final long INVALID_NET_ID = 255;
    public static final String TAG = "NetworkMonitorAutoDetect";
    public static boolean includeWifiDirect;
    public final ConnectivityManager.NetworkCallback allNetworkCallback;
    public final Set availableNetworks;
    public NetworkChangeDetector.ConnectionType connectionType;
    public ConnectivityManagerDelegate connectivityManagerDelegate;
    public final Context context;
    public final IntentFilter intentFilter;
    public boolean isRegistered;
    public final ConnectivityManager.NetworkCallback mobileNetworkCallback;
    public final NetworkChangeDetector.Observer observer;
    public WifiDirectManagerDelegate wifiDirectManagerDelegate;
    public WifiManagerDelegate wifiManagerDelegate;
    public String wifiSSID;

    /* loaded from: NetworkMonitorAutoDetect$ConnectivityManagerDelegate.class */
    public class ConnectivityManagerDelegate {
        public final Set availableNetworks;
        public final Kvn connectivityManager;
        public final boolean getAllNetworksFromCache;
        public final boolean includeOtherUidNetworks;
        public final boolean requestVPN;

        public ConnectivityManagerDelegate(Kvn kvn, Set set, String str) {
            this.connectivityManager = kvn;
            this.availableNetworks = set;
            this.getAllNetworksFromCache = checkFieldTrial(str, "getAllNetworksFromCache", false);
            this.requestVPN = checkFieldTrial(str, "requestVPN", false);
            this.includeOtherUidNetworks = checkFieldTrial(str, "includeOtherUidNetworks", false);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ConnectivityManagerDelegate(android.content.Context r302, java.util.Set r303, java.lang.String r304) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate.<init>(android.content.Context, java.util.Set, java.lang.String):void");
        }

        public static boolean checkFieldTrial(String str, String str2, boolean z) {
            if (str.contains(0Pz.A0W(str2, ":true"))) {
                z = true;
            } else if (str.contains(0Pz.A0W(str2, ":false"))) {
                return false;
            }
            return z;
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            return (networkInfo == null || !networkInfo.isConnected()) ? new NetworkState(false, -1, -1, -1, -1) : new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NetworkChangeDetector.NetworkInformation networkToInfo(Network network) {
            StringBuilder A0k;
            String str;
            if (network == null || this.connectivityManager == null) {
                return null;
            }
            ConnectivityManager connectivityManager = KyG.A00;
            11T.A0I(connectivityManager, 1BJ.A00(8));
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                A0k = AnonymousClass001.A0k();
                str = "Detected unknown network: ";
            } else {
                if (linkProperties.getInterfaceName() != null) {
                    NetworkState networkState = getNetworkState(network);
                    NetworkChangeDetector.ConnectionType connectionType = NetworkMonitorAutoDetect.getConnectionType(networkState);
                    if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
                        Logging.d(NetworkMonitorAutoDetect.TAG, 0Pz.A0j("Network ", network.toString(), " is disconnected"));
                        return null;
                    }
                    if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN || connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                        StringBuilder A0n = AnonymousClass001.A0n("Network ");
                        1BK.A1R(A0n, network);
                        A0n.append(" connection type is ");
                        A0n.append(connectionType);
                        A0n.append(" because it has type ");
                        A0n.append(networkState.type);
                        A0n.append(" and subtype ");
                        Logging.d(NetworkMonitorAutoDetect.TAG, GOn.A1B(A0n, networkState.subtype));
                    }
                    return new NetworkChangeDetector.NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), network.getNetworkHandle(), getIPAddresses(linkProperties));
                }
                A0k = AnonymousClass001.A0k();
                str = "Null interface name for network ";
            }
            A0k.append(str);
            1BK.A1R(A0k, network);
            Logging.w(NetworkMonitorAutoDetect.TAG, A0k.toString());
            return null;
        }

        public NetworkRequest createNetworkRequest() {
            NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
            if (this.requestVPN) {
                addCapability.removeCapability(15);
            }
            if (Build.VERSION.SDK_INT >= 31 && this.includeOtherUidNetworks) {
                addCapability.setIncludeOtherUidNetworks(true);
            }
            return addCapability.build();
        }

        public List getActiveNetworkList() {
            ArrayList A0s;
            if (AnonymousClass001.A1T(this.connectivityManager)) {
                A0s = AnonymousClass001.A0s();
                Network[] allNetworks = getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    NetworkChangeDetector.NetworkInformation networkToInfo = networkToInfo(allNetworks[i2]);
                    if (networkToInfo != null) {
                        A0s.add(networkToInfo);
                    }
                    i = i2 + 1;
                }
            } else {
                A0s = null;
            }
            return A0s;
        }

        public Network[] getAllNetworks() {
            Network[] networkArr;
            Kvn kvn = this.connectivityManager;
            if (kvn == null) {
                return new Network[0];
            }
            if (!AnonymousClass001.A1T(kvn) || !this.getAllNetworksFromCache) {
                ConnectivityManager connectivityManager = KyG.A00;
                11T.A0I(connectivityManager, 1BJ.A00(8));
                return connectivityManager.getAllNetworks();
            }
            synchronized (this.availableNetworks) {
                networkArr = (Network[]) this.availableNetworks.toArray(new Network[0]);
            }
            return networkArr;
        }

        public long getDefaultNetId() {
            long j = -1;
            if (AnonymousClass001.A1T(this.connectivityManager)) {
                ConnectivityManager connectivityManager = KyG.A00;
                String A00 = 1BJ.A00(8);
                11T.A0I(connectivityManager, A00);
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    long j2 = -1;
                    for (Network network : getAllNetworks()) {
                        if (hasInternetCapability(network)) {
                            ConnectivityManager connectivityManager2 = KyG.A00;
                            11T.A0I(connectivityManager2, A00);
                            NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(network);
                            if (networkInfo != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                                if (j2 != j) {
                                    throw AnonymousClass001.A0T("Multiple connected networks of same type are not supported.");
                                }
                                j2 = network.getNetworkHandle();
                            }
                        }
                    }
                    return j2;
                }
            }
            return j;
        }

        public NetworkChangeDetector.IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return iPAddressArr;
                }
                iPAddressArr[i2] = new NetworkChangeDetector.IPAddress(it.next().getAddress().getAddress());
                i = i2 + 1;
            }
        }

        public NetworkState getNetworkState() {
            if (this.connectivityManager == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            ConnectivityManager connectivityManager = KyG.A00;
            11T.A0I(connectivityManager, 1BJ.A00(8));
            return getNetworkState(connectivityManager.getActiveNetworkInfo());
        }

        public NetworkState getNetworkState(Network network) {
            boolean isConnected;
            int i;
            int type;
            int subtype;
            if (network != null && this.connectivityManager != null) {
                ConnectivityManager connectivityManager = KyG.A00;
                String A00 = 1BJ.A00(8);
                11T.A0I(connectivityManager, A00);
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null) {
                    if (networkInfo.getType() != 17) {
                        ConnectivityManager connectivityManager2 = KyG.A00;
                        11T.A0I(connectivityManager2, A00);
                        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                        if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                            isConnected = networkInfo.isConnected();
                            i = -1;
                            type = networkInfo.getType();
                            subtype = networkInfo.getSubtype();
                            return new NetworkState(isConnected, 17, i, type, subtype);
                        }
                        return getNetworkState(networkInfo);
                    }
                    if (networkInfo.getType() == 17) {
                        ConnectivityManager connectivityManager3 = KyG.A00;
                        11T.A0I(connectivityManager3, A00);
                        if (network.equals(connectivityManager3.getActiveNetwork())) {
                            ConnectivityManager connectivityManager4 = KyG.A00;
                            11T.A0I(connectivityManager4, A00);
                            NetworkInfo activeNetworkInfo = connectivityManager4.getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.getType() != 17) {
                                isConnected = networkInfo.isConnected();
                                i = -1;
                                type = activeNetworkInfo.getType();
                                subtype = activeNetworkInfo.getSubtype();
                                return new NetworkState(isConnected, 17, i, type, subtype);
                            }
                        }
                        return new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                    }
                    return getNetworkState(networkInfo);
                }
                Logging.w(NetworkMonitorAutoDetect.TAG, 0Pz.A0V("Couldn't retrieve information from network ", network));
            }
            float f = 0.0f / 0.0f;
            return new NetworkState(false, -1, -1, -1, -1);
        }

        public boolean hasInternetCapability(Network network) {
            boolean z = false;
            if (this.connectivityManager != null) {
                ConnectivityManager connectivityManager = KyG.A00;
                11T.A0I(connectivityManager, 1BJ.A00(8));
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z = true;
                }
            }
            return z;
        }

        public void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest createNetworkRequest = createNetworkRequest();
            KyG.A00(1BL.A1W(createNetworkRequest, networkCallback));
            Kvn.A00(new JR6(createNetworkRequest, networkCallback, 26));
        }

        public void releaseCallback(ConnectivityManager.NetworkCallback networkCallback) {
            if (AnonymousClass001.A1T(this.connectivityManager)) {
                Logging.d(NetworkMonitorAutoDetect.TAG, "Unregister network callback");
                11T.A0F(networkCallback, 0);
                KyG.A00(false);
                ConnectivityManager connectivityManager = KyG.A00;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                }
            }
        }

        public void requestMobileNetwork(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            NetworkRequest build = builder.build();
            KyG.A00(1BL.A1X(build, networkCallback));
            Kvn.A00(new JR6(build, networkCallback, 27));
        }

        public boolean supportNetworkCallback() {
            return AnonymousClass001.A1T(this.connectivityManager);
        }
    }

    /* loaded from: NetworkMonitorAutoDetect$NetworkState.class */
    public class NetworkState {
        public final boolean connected;
        public final int subtype;
        public final int type;
        public final int underlyingNetworkSubtypeForVpn;
        public final int underlyingNetworkTypeForVpn;

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }
    }

    /* loaded from: NetworkMonitorAutoDetect$SimpleNetworkCallback.class */
    public class SimpleNetworkCallback extends ConnectivityManager.NetworkCallback {
        public final Set availableNetworks;

        public SimpleNetworkCallback(Set set) {
            this.availableNetworks = set;
        }

        private void onNetworkChanged(Network network) {
            NetworkChangeDetector.NetworkInformation networkToInfo = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (networkToInfo != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Logging.d(NetworkMonitorAutoDetect.TAG, 0Pz.A0V("Network becomes available: ", network));
            synchronized (this.availableNetworks) {
                this.availableNetworks.add(network);
            }
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Logging.d(NetworkMonitorAutoDetect.TAG, 0Pz.A0V("capabilities changed: ", networkCapabilities));
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            Logging.d(NetworkMonitorAutoDetect.TAG, "link properties changed");
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            Logging.d(NetworkMonitorAutoDetect.TAG, 0Pz.A0H(i, "Network ", network.toString(), " is about to lose in ", "ms"));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Logging.d(NetworkMonitorAutoDetect.TAG, 0Pz.A0j("Network ", network.toString(), " is disconnected"));
            synchronized (this.availableNetworks) {
                this.availableNetworks.remove(network);
            }
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(network.getNetworkHandle());
        }
    }

    /* loaded from: NetworkMonitorAutoDetect$WifiDirectManagerDelegate.class */
    public class WifiDirectManagerDelegate extends BroadcastReceiver {
        public static final int WIFI_P2P_NETWORK_HANDLE = 0;
        public final Context context;
        public final NetworkChangeDetector.Observer observer;
        public NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        public WifiDirectManagerDelegate(NetworkChangeDetector.Observer observer, Context context) {
            this.context = context;
            this.observer = observer;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
            if (Build.VERSION.SDK_INT > 28) {
                WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new WifiP2pManager.GroupInfoListener() { // from class: org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$ExternalSyntheticLambda0
                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                        NetworkMonitorAutoDetect.WifiDirectManagerDelegate.this.m11283x61cecc50(wifiP2pGroup);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onWifiP2pGroupChange, reason: merged with bridge method [inline-methods] */
        public void m11283x61cecc50(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup == null || wifiP2pGroup.getInterface() == null) {
                return;
            }
            try {
                ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    iPAddressArr[i] = new NetworkChangeDetector.IPAddress(((InetAddress) list.get(i)).getAddress());
                }
                NetworkChangeDetector.NetworkInformation networkInformation = new NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0L, iPAddressArr);
                this.wifiP2pNetworkInfo = networkInformation;
                this.observer.onNetworkConnect(networkInformation);
            } catch (SocketException e) {
                Logging.e(NetworkMonitorAutoDetect.TAG, "Unable to get WifiP2p network interface", e);
            }
        }

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0L);
            }
        }

        public List getActiveNetworkList() {
            NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            return networkInformation != null ? Collections.singletonList(networkInformation) : Collections.emptyList();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int A01 = 0FI.A01(-637725672);
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                m11283x61cecc50((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
            0FI.A0D(109953860, A01, intent);
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }
    }

    /* loaded from: NetworkMonitorAutoDetect$WifiManagerDelegate.class */
    public class WifiManagerDelegate {
        public final Context context;

        public WifiManagerDelegate() {
            this.context = null;
        }

        public WifiManagerDelegate(Context context) {
            this.context = context;
        }

        public String getWifiSSID() {
            WifiInfo wifiInfo;
            String ssid;
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            return (registerReceiver == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
        }
    }

    public NetworkMonitorAutoDetect(NetworkChangeDetector.Observer observer, Context context) {
        HashSet A0v = AnonymousClass001.A0v();
        this.availableNetworks = A0v;
        this.observer = observer;
        this.context = context;
        ConnectivityManagerDelegate connectivityManagerDelegate = new ConnectivityManagerDelegate(context, A0v, ((NetworkMonitor.AnonymousClass2) observer).val$fieldTrialsString);
        this.connectivityManagerDelegate = connectivityManagerDelegate;
        this.wifiManagerDelegate = new WifiManagerDelegate(context);
        NetworkState networkState = connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        this.intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (includeWifiDirect) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer, context);
        }
        registerReceiver();
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (!AnonymousClass001.A1T(this.connectivityManagerDelegate.connectivityManager)) {
            this.mobileNetworkCallback = null;
            this.allNetworkCallback = null;
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
        try {
            this.connectivityManagerDelegate.requestMobileNetwork(networkCallback2);
            networkCallback = networkCallback2;
        } catch (SecurityException unused) {
            Logging.w(TAG, "Unable to obtain permission to request a cellular network.");
        }
        this.mobileNetworkCallback = networkCallback;
        SimpleNetworkCallback simpleNetworkCallback = new SimpleNetworkCallback(this.availableNetworks);
        this.allNetworkCallback = simpleNetworkCallback;
        this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
    }

    private void connectionTypeChanged(NetworkState networkState) {
        NetworkChangeDetector.ConnectionType connectionType = getConnectionType(networkState);
        String wifiSSID = getWifiSSID(networkState);
        if (connectionType == this.connectionType && wifiSSID.equals(this.wifiSSID)) {
            return;
        }
        this.connectionType = connectionType;
        this.wifiSSID = wifiSSID;
        Logging.d(TAG, AnonymousClass001.A0Z(connectionType, "Network connectivity changed, type is: ", AnonymousClass001.A0k()));
        this.observer.onConnectionTypeChanged(connectionType);
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.connected, networkState.type, networkState.subtype);
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_3G;
                case 13:
                case 18:
                    break;
                case 19:
                default:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_5G;
            }
        } else {
            if (i == 1) {
                return NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
            }
            if (i != 6) {
                return i != 7 ? i != 9 ? i != 17 ? NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN : NetworkChangeDetector.ConnectionType.CONNECTION_VPN : NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET : NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
            }
        }
        return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
    }

    public static NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        return networkState.type != 17 ? NetworkChangeDetector.ConnectionType.CONNECTION_NONE : getConnectionType(networkState.connected, networkState.underlyingNetworkTypeForVpn, networkState.underlyingNetworkSubtypeForVpn);
    }

    private String getWifiSSID(NetworkState networkState) {
        return getConnectionType(networkState) != NetworkChangeDetector.ConnectionType.CONNECTION_WIFI ? "" : this.wifiManagerDelegate.getWifiSSID();
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private void registerReceiver() {
        if (this.isRegistered) {
            return;
        }
        this.isRegistered = true;
        this.context.registerReceiver(this, this.intentFilter);
    }

    public static void setIncludeWifiDirect(boolean z) {
        includeWifiDirect = z;
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    @Override // org.webrtc.NetworkChangeDetector
    public void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    @Override // org.webrtc.NetworkChangeDetector
    public List getActiveNetworkList() {
        ArrayList A17;
        List activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            A17 = null;
        } else {
            A17 = 1BK.A17(activeNetworkList);
            WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
            if (wifiDirectManagerDelegate != null) {
                A17.addAll(wifiDirectManagerDelegate.getActiveNetworkList());
                return A17;
            }
        }
        return A17;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(this.connectivityManagerDelegate.getNetworkState());
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(-1282974911);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(networkState);
        }
        0FI.A0D(-1952484097, A01, intent);
    }

    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.connectivityManagerDelegate = connectivityManagerDelegate;
    }

    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.wifiManagerDelegate = wifiManagerDelegate;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public boolean supportNetworkCallback() {
        return AnonymousClass001.A1T(this.connectivityManagerDelegate.connectivityManager);
    }
}
