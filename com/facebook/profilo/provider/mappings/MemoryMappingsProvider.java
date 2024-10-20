package com.facebook.profilo.provider.mappings;

import X.0FI;
import X.C0lu;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: MemoryMappingsProvider.class */
public final class MemoryMappingsProvider extends C0lu {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mappings");

    public MemoryMappingsProvider() {
        super("profilo_mappings");
    }

    public static native void nativeLogMappings(MultiBufferLogger multiBufferLogger);

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(-885041157);
        nativeLogMappings(A05());
        0FI.A09(2064528385, A03);
    }

    @Override // X.C0lu
    public void enable() {
        0FI.A09(-704850538, 0FI.A03(-1170798414));
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        return PROVIDER_MAPPINGS;
    }
}
