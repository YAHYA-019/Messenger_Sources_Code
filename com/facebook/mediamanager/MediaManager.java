package com.facebook.mediamanager;

import X.3M5;
import X.AnonymousClass001;
import X.C0il;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;
import java.util.Collections;
import java.util.Map;

/* loaded from: MediaManager.class */
public class MediaManager {
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;
    public final Map mTokenToRequest = Collections.synchronizedMap(AnonymousClass001.A0u());

    static {
        C0il.A0B("mediamanagerjni");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0.mkdir() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaManager(com.facebook.msys.mci.AccountSession r302, com.facebook.msys.mci.NetworkSession r303, com.facebook.msys.mci.NotificationCenter r304, java.io.File r305) {
        /*
            r301 = this;
            r0 = r301
            r306 = r0
            r0 = r301
            r0.<init>()
            r0 = r304
            r307 = r0
            r0 = r301
            r1 = r304
            r0.mNotificationCenter = r1
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.mTokenToRequest = r1
            java.lang.String r0 = "media_load_cache"
            r308 = r0
            r0 = r305
            r1 = r308
            java.io.File r0 = X.AnonymousClass001.A0D(r0, r1)     // Catch: java.io.IOException -> L7e
            r309 = r0
            r0 = r309
            boolean r0 = r0.exists()     // Catch: java.io.IOException -> L7e
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L54
            r0 = r309
            boolean r0 = r0.isDirectory()     // Catch: java.io.IOException -> L7e
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L54
            r0 = r309
            boolean r0 = r0.exists()     // Catch: java.io.IOException -> L7e
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L54
            r0 = r309
            boolean r0 = r0.delete()     // Catch: java.io.IOException -> L7e
        L54:
            r0 = r309
            boolean r0 = r0.exists()     // Catch: java.io.IOException -> L7e
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L70
            r0 = r309
            boolean r0 = r0.mkdir()     // Catch: java.io.IOException -> L7e
            r310 = r0
            r0 = r305
            r311 = r0
            r0 = r310
            if (r0 == 0) goto L74
        L70:
            r0 = r309
            r311 = r0
        L74:
            r0 = r311
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L7e
            r312 = r0
            goto L86
        L7e:
            r0 = r305
            java.lang.String r0 = r0.getAbsolutePath()
            r312 = r0
        L86:
            r0 = r302
            r311 = r0
            r0 = r306
            r1 = r302
            r2 = r303
            r3 = r307
            r4 = r312
            r5 = 262144000(0xfa00000, float:1.5777218E-29)
            r6 = 5242880(0x500000, float:7.34684E-39)
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            com.facebook.simplejni.NativeHolder r0 = initNativeHolder(r0, r1, r2, r3, r4, r5, r6, r7)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.mNativeHolder = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediamanager.MediaManager.<init>(com.facebook.msys.mci.AccountSession, com.facebook.msys.mci.NetworkSession, com.facebook.msys.mci.NotificationCenter, java.io.File):void");
    }

    private native void cancelMediaLoadNative(String str);

    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dispatchMediaListenerCallback(java.lang.String r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediamanager.MediaManager.dispatchMediaListenerCallback(java.lang.String, java.lang.Object):void");
    }

    private void dispatchMediaProgressListenerCallback(String str, Object obj) {
        Map map = (Map) obj;
        if (map == null || this.mTokenToRequest.get(str) == null) {
            return;
        }
        map.get("progressBytes");
        map.get("progressTotalBytes");
        map.get("progressTotalBytesExpected");
        throw AnonymousClass001.A0Q("onLoadProgressUpdate");
    }

    public static native NativeHolder initNativeHolder(MediaManager mediaManager, AccountSession accountSession, NetworkSession networkSession, NotificationCenter notificationCenter, String str, int i, int i2, float f);

    private native boolean isMediaLoadCanceledNative(String str);

    private native String loadMediaNative(String str, String str2, String str3, float f, float f2, float f3, String str4, int i, boolean z, boolean z2, Object obj);

    private native void registerLoggingContextNative(Mailbox mailbox);

    public String loadMedia(3M5 r302) {
        String loadMediaNative = loadMediaNative(r302.A02, null, r302.A01, 0.0f, 0.0f, 0.0f, r302.A03, 1, false, false, null);
        this.mTokenToRequest.put(loadMediaNative, r302);
        return loadMediaNative;
    }
}
