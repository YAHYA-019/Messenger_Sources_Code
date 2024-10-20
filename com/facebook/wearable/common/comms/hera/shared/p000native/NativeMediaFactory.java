package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import X.AnonymousClass001;
import X.JDb;
import X.JJM;
import X.JKh;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NativeMediaFactory.class */
public final class NativeMediaFactory implements JJM {
    public final boolean useSgVideoDecoder;

    public NativeMediaFactory() {
        this(false);
    }

    public NativeMediaFactory(boolean z) {
        this.useSgVideoDecoder = z;
    }

    public /* synthetic */ NativeMediaFactory(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        if (X.Hxu.A01.A00 != X.HBE.A03) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.JHC createMediaReceiver(int r302, X.JDa r303, X.JDY r304, java.lang.Integer r305) {
        /*
            r301 = this;
            r0 = r303
            r306 = r0
            r0 = r303
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
            r307 = r0
            r0 = r302
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L35
            r0 = r303
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L88
            r0 = r303
            com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink r0 = (com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSink) r0
            r306 = r0
            com.facebook.wearable.common.comms.hera.shared.native.NativeAudioReceiver r0 = new com.facebook.wearable.common.comms.hera.shared.native.NativeAudioReceiver
            r309 = r0
            r0 = r309
            r1 = r302
            r2 = r306
            r0.<init>(r1, r2)
        L2f:
            r0 = r309
            X.JHC r0 = (X.JHC) r0
            return r0
        L35:
            r0 = r303
            com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink r0 = (com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink) r0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L82
            r0 = r305
            int r0 = r0.intValue()
            r310 = r0
        L47:
            r0 = r301
            boolean r0 = r0.useSgVideoDecoder
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L69
            X.Hxu r0 = X.Hxu.A01
            X.HBE r0 = r0.A00
            r309 = r0
            X.HBE r0 = X.HBE.A03
            r311 = r0
            r0 = 1
            r312 = r0
            r0 = r309
            r1 = r311
            if (r0 == r1) goto L6c
        L69:
            r0 = 0
            r312 = r0
        L6c:
            com.facebook.wearable.common.comms.hera.shared.native.NativeVideoReceiver r0 = new com.facebook.wearable.common.comms.hera.shared.native.NativeVideoReceiver
            r309 = r0
            r0 = r309
            r1 = r308
            r2 = r306
            r3 = 0
            r4 = r310
            r5 = r312
            r0.<init>(r1, r2, r3, r4, r5)
            goto L2f
        L82:
            r0 = -1
            r310 = r0
            goto L47
        L88:
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.p000native.NativeMediaFactory.createMediaReceiver(int, X.JDa, X.JDY, java.lang.Integer):X.JHC");
    }

    public JKh createMediaSender(int i, JDb jDb) {
        JKh nativeAudioSender;
        11T.A0F(jDb, 1);
        if (jDb instanceof IRawVideoSource) {
            nativeAudioSender = new NativeVideoSender(i, (IRawVideoSource) jDb);
        } else {
            if (!(jDb instanceof IRawAudioSource)) {
                throw AnonymousClass001.A0p();
            }
            nativeAudioSender = new NativeAudioSender(i, (IRawAudioSource) jDb);
        }
        return nativeAudioSender;
    }
}
