package com.facebook.errorreporting.lacrima.common.mappedfile.mlocked;

import X.C0pe;
import java.nio.ByteBuffer;

/* loaded from: MLockedFile.class */
public class MLockedFile extends C0pe {
    public static volatile boolean sLibraryLoaded;

    public static native void mlockBuffer(ByteBuffer byteBuffer);

    public static native void munlockBuffer(ByteBuffer byteBuffer);

    @Override // X.C0pe
    public void mlockBuffer() {
        if (sLibraryLoaded) {
            mlockBuffer(this.A00);
        }
    }
}
