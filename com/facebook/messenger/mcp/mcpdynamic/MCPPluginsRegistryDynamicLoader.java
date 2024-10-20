package com.facebook.messenger.mcp.mcpdynamic;

import X.C0il;
import android.util.Pair;

/* loaded from: MCPPluginsRegistryDynamicLoader.class */
public class MCPPluginsRegistryDynamicLoader {
    public static boolean _isLoaded;

    public static Pair getLookupFunctions() {
        boolean z;
        Pair pair;
        synchronized (MCPPluginsRegistryDynamicLoader.class) {
            if (_isLoaded) {
                z = false;
            } else {
                C0il.A0B("mcpdynamic-mcpdynamic");
                z = true;
                _isLoaded = true;
            }
            long[] nativeGetLookupFunctions = nativeGetLookupFunctions();
            pair = new Pair(new Long[]{new Long(nativeGetLookupFunctions[0]), new Long(nativeGetLookupFunctions[1])}, Boolean.valueOf(z));
        }
        return pair;
    }

    public static native long[] nativeGetLookupFunctions();
}
