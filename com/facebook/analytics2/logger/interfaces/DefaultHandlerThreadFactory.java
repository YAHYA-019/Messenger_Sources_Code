package com.facebook.analytics2.logger.interfaces;

import X.1Nz;
import X.C0T8;
import android.content.Context;
import android.os.HandlerThread;

/* loaded from: DefaultHandlerThreadFactory.class */
public class DefaultHandlerThreadFactory implements 1Nz {
    public DefaultHandlerThreadFactory(Context context) {
    }

    public HandlerThread AJ2(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        C0T8.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }
}
