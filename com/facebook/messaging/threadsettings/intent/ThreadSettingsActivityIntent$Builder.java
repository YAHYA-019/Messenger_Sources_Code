package com.facebook.messaging.threadsettings.intent;

import X.0Q8;
import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ThreadSettingsActivityIntent$Builder.class */
public abstract class ThreadSettingsActivityIntent$Builder {
    public final Context context;
    public boolean forceExplicitIntent;
    public boolean quitOnBack;
    public int startupFragmentIdentifier;
    public ParcelableSecondaryData surfaceArgs;
    public final ThreadKey threadKey;
    public String threadViewSource;

    public ThreadSettingsActivityIntent$Builder(Context context, ThreadKey threadKey) {
        throw 0Q8.createAndThrow();
    }

    public abstract Intent build();

    public abstract ThreadSettingsActivityIntent$Builder forceExplicitIntent();

    public abstract boolean getForceExplicitIntent();

    public abstract boolean getQuitOnBack();

    public abstract int getStartupFragmentIdentifier();

    public abstract ParcelableSecondaryData getSurfaceArgs();

    public abstract String getThreadViewSource();

    public abstract ThreadSettingsActivityIntent$Builder quitOnBack(boolean z);

    public abstract ThreadSettingsActivityIntent$Builder startupFragmentIdentifier(int i);

    public abstract ThreadSettingsActivityIntent$Builder surfaceArgs(ParcelableSecondaryData parcelableSecondaryData);

    public abstract ThreadSettingsActivityIntent$Builder threadViewSource(String str);
}
