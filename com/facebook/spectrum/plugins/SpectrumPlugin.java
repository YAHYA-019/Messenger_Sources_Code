package com.facebook.spectrum.plugins;

import android.util.Log;

/* loaded from: SpectrumPlugin.class */
public abstract class SpectrumPlugin {
    public abstract long createPlugin();

    public abstract void ensureLoadedAndInitialized();

    public final long getPlugin() {
        long createPlugin;
        synchronized (this) {
            ensureLoadedAndInitialized();
            createPlugin = createPlugin();
            Log.d("SpectrumPlugin", String.format(null, "Created plugin at 0x%016X", Long.valueOf(createPlugin)));
        }
        return createPlugin;
    }
}
