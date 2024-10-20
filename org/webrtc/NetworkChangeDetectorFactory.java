package org.webrtc;

import android.content.Context;
import org.webrtc.NetworkChangeDetector;

/* loaded from: NetworkChangeDetectorFactory.class */
public interface NetworkChangeDetectorFactory {
    NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context);
}
