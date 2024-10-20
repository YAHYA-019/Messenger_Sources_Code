package com.facebook.privacy.e2ee;

import java.util.List;

/* loaded from: DevicePKEKeypairStore.class */
public interface DevicePKEKeypairStore {
    List getAllKeypairs();

    DevicePKEKeypair getKeypair(String str);

    int getSize();

    boolean shouldRegisterKey(long j);

    boolean tryAddKeypair(DevicePKEKeypair devicePKEKeypair, int i);

    boolean tryClearAllKeypairs();

    boolean tryClearKeypair(String str);

    boolean tryClearKeypairsOlderThan(long j);
}
