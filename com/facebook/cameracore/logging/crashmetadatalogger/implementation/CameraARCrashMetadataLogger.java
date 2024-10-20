package com.facebook.cameracore.logging.crashmetadatalogger.implementation;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import com.facebook.breakpad.BreakpadManager;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: CameraARCrashMetadataLogger.class */
public final class CameraARCrashMetadataLogger {
    public HashSet loggedKeys = AnonymousClass001.A0v();

    public final void cleanupBreakpadData() {
        synchronized (this) {
            Iterator it = this.loggedKeys.iterator();
            while (it.hasNext()) {
                BreakpadManager.removeCustomData(AnonymousClass001.A0i(it));
            }
            this.loggedKeys.clear();
        }
    }

    public final HashSet getLoggedKeys() {
        return this.loggedKeys;
    }

    public final void setBreakpadData(String str, String str2) {
        synchronized (this) {
            1BK.A1M(str, str2);
            BreakpadManager.setCustomData(str, str2, new Object[0]);
            this.loggedKeys.add(str);
        }
    }

    public final void setLoggedKeys(HashSet hashSet) {
        11T.A0F(hashSet, 0);
        this.loggedKeys = hashSet;
    }
}
