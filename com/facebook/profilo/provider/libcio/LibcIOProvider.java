package com.facebook.profilo.provider.libcio;

import X.0FI;
import X.C0lu;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: LibcIOProvider.class */
public final class LibcIOProvider extends C0lu {
    public static final int PROVIDER_LIBC_IO = ProvidersRegistry.A00.A02("libc_io");

    public LibcIOProvider() {
        super("profilo_libcio");
    }

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(-50977711);
        nativeCleanup();
        0FI.A09(-1560096535, A03);
    }

    @Override // X.C0lu
    public void enable() {
        int A03 = 0FI.A03(1483191554);
        nativeInitialize(A05());
        0FI.A09(25905291, A03);
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_LIBC_IO;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        if (nativeIsTracingEnabled()) {
            return PROVIDER_LIBC_IO;
        }
        return 0;
    }

    public native void nativeCleanup();

    public native void nativeInitialize(MultiBufferLogger multiBufferLogger);

    public native boolean nativeIsTracingEnabled();
}
