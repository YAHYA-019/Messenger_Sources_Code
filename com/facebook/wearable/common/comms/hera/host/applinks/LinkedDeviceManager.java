package com.facebook.wearable.common.comms.hera.host.applinks;

import X.0fH;
import X.11T;
import X.1BK;
import X.7zR;
import X.AnonymousClass001;
import X.C0s8;
import X.GOp;
import X.KNo;
import X.L4C;
import X.LDe;
import X.MJF;
import X.RUG;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LinkedDeviceManager.class */
public final class LinkedDeviceManager {
    public static final Companion Companion = new Object();
    public static final List DEFAULT_SUPPORTED_DEVICES = C0s8.A14(DeviceType.GREATWHITE, DeviceType.MAKO, DeviceType.SILVERTIP, DeviceType.ZEBRA, DeviceType.COLADA);
    public static final String TAG = "Hera.LinkedDeviceMgr";
    public final Context applicationContext;
    public String debugStat;
    public final boolean isReleaseBuild;
    public final Object lamLock;
    public RUG linkedAppManager;
    public final MJF linkedAppStoreImpl;
    public final Map linkedDeviceConfigs;
    public boolean linkedDeviceConfigsReceived;
    public final List onDeviceDiscoveredListeners;
    public final List onDeviceGoneListeners;
    public final List supportedDevices;

    /* loaded from: LinkedDeviceManager$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final List getDEFAULT_SUPPORTED_DEVICES() {
            return LinkedDeviceManager.DEFAULT_SUPPORTED_DEVICES;
        }
    }

    public LinkedDeviceManager(Context context, boolean z, List list) {
        7zR.A1N(context, list);
        this.isReleaseBuild = z;
        this.supportedDevices = list;
        this.onDeviceDiscoveredListeners = AnonymousClass001.A0s();
        this.onDeviceGoneListeners = AnonymousClass001.A0s();
        Context applicationContext = context.getApplicationContext();
        11T.A0A(applicationContext);
        this.applicationContext = applicationContext;
        this.linkedAppStoreImpl = new LinkedAppStoreImpl(new LinkedAppPrefs(applicationContext).get(LinkedAppPrefsStore.APP_IDENTITY));
        this.linkedDeviceConfigs = 1BK.A1C();
        this.lamLock = AnonymousClass001.A0R();
    }

    public /* synthetic */ LinkedDeviceManager(Context context, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z, (i & 4) != 0 ? DEFAULT_SUPPORTED_DEVICES : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void announceGoneDeviceConfigs(List list, Map map) {
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Object A15 = GOp.A15(A0y);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(A15);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void announceLinkedDeviceConfigs(List list) {
        synchronized (this.linkedDeviceConfigs) {
            Iterator A0y = AnonymousClass001.A0y(this.linkedDeviceConfigs);
            while (A0y.hasNext()) {
                AppLinksDeviceConfig appLinksDeviceConfig = (AppLinksDeviceConfig) GOp.A15(A0y);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(appLinksDeviceConfig);
                }
            }
        }
    }

    private final RUG makeLam() {
        Context context = this.applicationContext;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        11T.A0A(newCachedThreadPool);
        RUG rug = new RUG(context, new L4C(KNo.A02, this.isReleaseBuild, false), this.linkedAppStoreImpl, newCachedThreadPool);
        LinkedDeviceManager$makeLam$1$1 linkedDeviceManager$makeLam$1$1 = new LinkedDeviceManager$makeLam$1$1(this);
        LDe lDe = rug.A04;
        lDe.A03 = linkedDeviceManager$makeLam$1$1;
        lDe.A02 = new LinkedDeviceManager$makeLam$1$2(this);
        lDe.A05 = LinkedDeviceManager$makeLam$1$3.INSTANCE;
        lDe.A07 = LinkedDeviceManager$makeLam$1$4.INSTANCE;
        lDe.A06 = new LinkedDeviceManager$makeLam$1$5(this);
        return rug;
    }

    public final void addOnDeviceDiscoveredListener(Function1 function1) {
        11T.A0F(function1, 0);
        synchronized (this.onDeviceDiscoveredListeners) {
            if (!this.onDeviceDiscoveredListeners.contains(function1)) {
                this.onDeviceDiscoveredListeners.add(function1);
                announceLinkedDeviceConfigs(11T.A03(function1));
            }
        }
    }

    public final void addOnDeviceGoneListener(Function1 function1) {
        11T.A0F(function1, 0);
        synchronized (this.onDeviceGoneListeners) {
            if (!this.onDeviceGoneListeners.contains(function1)) {
                this.onDeviceGoneListeners.add(function1);
            }
        }
    }

    public final String getDebugStat() {
        return this.debugStat;
    }

    public final Boolean hasSupportedDevice() {
        Boolean valueOf;
        synchronized (this.linkedDeviceConfigs) {
            valueOf = this.linkedDeviceConfigsReceived ? Boolean.valueOf(AnonymousClass001.A1O(this.linkedDeviceConfigs.isEmpty() ? 1 : 0)) : null;
        }
        return valueOf;
    }

    public final Boolean hasSupportedDeviceForPeerVideo() {
        synchronized (this.linkedDeviceConfigs) {
            if (this.linkedDeviceConfigsReceived) {
                Iterator A0y = AnonymousClass001.A0y(this.linkedDeviceConfigs);
                while (A0y.hasNext()) {
                    if (((AppLinksDeviceConfig) GOp.A15(A0y)).deviceType.getPeerVideoSupported()) {
                        return AnonymousClass001.A0K();
                    }
                }
            }
            return 1BK.A0d();
        }
    }

    public final void removeOnDeviceDiscoveredListener(Function1 function1) {
        11T.A0F(function1, 0);
        synchronized (this.onDeviceDiscoveredListeners) {
            this.onDeviceDiscoveredListeners.remove(function1);
        }
    }

    public final void removeOnDeviceGoneListener(Function1 function1) {
        11T.A0F(function1, 0);
        synchronized (this.onDeviceGoneListeners) {
            this.onDeviceGoneListeners.remove(function1);
        }
    }

    public final void start() {
        0fH.A0j(TAG, "Starting LinkedDeviceManager and kicking off device discovery.");
        synchronized (this.lamLock) {
            if (this.linkedAppManager != null) {
                0fH.A0j(TAG, "Not starting LinkedDeviceManager again. Already started.");
            } else {
                RUG makeLam = makeLam();
                makeLam.A00();
                this.linkedAppManager = makeLam;
            }
        }
    }

    public final void stop() {
        0fH.A0l(TAG, "Stopping LinkedAppManager.");
        synchronized (this.lamLock) {
            RUG rug = this.linkedAppManager;
            if (rug != null) {
                rug.A01();
            }
            this.linkedAppManager = null;
        }
    }
}
