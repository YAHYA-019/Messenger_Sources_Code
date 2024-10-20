package com.facebook.traffic.monitor.impl;

import X.C04I;
import android.util.LruCache;
import com.facebook.traffic.monitor.api.ITrafficTransportMonitor;
import java.util.UUID;

/* loaded from: SimpleTrafficTransportMonitor.class */
public class SimpleTrafficTransportMonitor implements ITrafficTransportMonitor {
    public static final int INSTANCE_KEY_CACHE_SIZE = 1000;
    public static final int MARKER_ID_CACHE_SIZE = 100;
    public static SimpleTrafficTransportMonitor instance;
    public final int instanceKeyCacheSize;
    public final LruCache qplMarkerUuids;

    public SimpleTrafficTransportMonitor() {
        this(100, 1000);
    }

    public SimpleTrafficTransportMonitor(int i, int i2) {
        this.qplMarkerUuids = new LruCache(i);
        this.instanceKeyCacheSize = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor) from 0x0016: SPUT (r302v3 ?? I:com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor) A[Catch: all -> 0x001d] com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor.instance com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor getInstance() {
        /*
            java.lang.Class<com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor> r0 = com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor r0 = com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor.instance     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor r0 = new com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor.instance = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor.getInstance():com.facebook.traffic.monitor.impl.SimpleTrafficTransportMonitor");
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public UUID getMarkerInstanceUuid(int i, int i2) {
        UUID uuid;
        synchronized (this) {
            LruCache lruCache = this.qplMarkerUuids;
            Integer valueOf = Integer.valueOf(i);
            uuid = lruCache.get(valueOf) == null ? null : (UUID) ((LruCache) this.qplMarkerUuids.get(valueOf)).get(Integer.valueOf(i2));
        }
        return uuid;
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public UUID getOrGenerateQplMarker(int i, int i2) {
        UUID markerInstanceUuid;
        synchronized (this) {
            markerInstanceUuid = getMarkerInstanceUuid(i, i2);
            if (markerInstanceUuid == null) {
                markerInstanceUuid = registerQplMarkerInstance(i, i2);
            }
        }
        return markerInstanceUuid;
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public UUID registerQplMarkerInstance(int i, int i2) {
        UUID A00;
        synchronized (this) {
            LruCache lruCache = this.qplMarkerUuids;
            Integer valueOf = Integer.valueOf(i);
            if (lruCache.get(valueOf) == null) {
                this.qplMarkerUuids.put(valueOf, new LruCache(this.instanceKeyCacheSize));
            }
            A00 = C04I.A00();
            LruCache lruCache2 = (LruCache) this.qplMarkerUuids.get(valueOf);
            lruCache2.getClass();
            lruCache2.put(Integer.valueOf(i2), A00);
        }
        return A00;
    }
}
