package org.webrtc;

import X.AnonymousClass001;

/* loaded from: WebRtcClassLoader.class */
public class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw AnonymousClass001.A0T("Failed to get WebRTC class loader.");
    }
}
