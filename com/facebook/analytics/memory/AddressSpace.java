package com.facebook.analytics.memory;

import X.0fH;
import X.C0il;

/* loaded from: AddressSpace.class */
public final class AddressSpace {
    public static final AddressSpace INSTANCE = new Object();
    public static volatile boolean initialized;

    public static final int getLargestChunkKb() {
        try {
        } catch (UnsatisfiedLinkError e) {
            0fH.A0r("AddressSpace", "Error querying address space", e);
        }
        if (initialized) {
            return nativeGetLargestAddressSpaceChunkKb();
        }
        if (C0il.A09()) {
            0fH.A0g(Boolean.toString(C0il.A0B("addressspace")), "AddressSpace", "SoLoader result = %s");
            initialized = true;
            return nativeGetLargestAddressSpaceChunkKb();
        }
        return -1;
    }

    public static final native int nativeGetLargestAddressSpaceChunkKb();
}
