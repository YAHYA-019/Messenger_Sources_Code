package com.facebook.profilo.provider.constants;

import X.0FI;
import X.C0lu;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: ExternalProvider.class */
public final class ExternalProvider extends C0lu {
    public MultiBufferLoggerLike A00;
    public final int A01;
    public final String A02;
    public volatile int A03;

    /* loaded from: ExternalProvider$MultiBufferLoggerLike.class */
    public final class MultiBufferLoggerLike {
        public MultiBufferLogger A00;

        public int A00(int i, int i2, int i3, int i4, long j) {
            MultiBufferLogger multiBufferLogger = this.A00;
            if (multiBufferLogger == null) {
                return 0;
            }
            return multiBufferLogger.writeStandardEntry(i, i2, 0L, 0, i3, i4, j);
        }

        public int A01(int i, int i2, int i3, String str) {
            MultiBufferLogger multiBufferLogger = this.A00;
            if (multiBufferLogger == null) {
                return 0;
            }
            return multiBufferLogger.writeBytesEntry(i, i2, i3, str);
        }
    }

    public ExternalProvider(String str) {
        super(null);
        this.A01 = ProvidersRegistry.A00.A02(str);
        this.A02 = str;
    }

    @Override // X.C0lu
    public boolean A09() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike, java.lang.Object] */
    public MultiBufferLoggerLike A0A() {
        if (this.A03 != 2) {
            if (this.A05) {
                MultiBufferLogger A05 = A05();
                ?? obj = new Object();
                obj.A00 = A05;
                this.A00 = obj;
                this.A03 = 2;
            } else if (this.A03 == 0) {
                ?? obj2 = new Object();
                obj2.A00 = null;
                this.A00 = obj2;
                this.A03 = 1;
            }
        }
        return this.A00;
    }

    @Override // X.C0lu
    public void disable() {
        0FI.A09(1916978890, 0FI.A03(1185053069));
    }

    @Override // X.C0lu
    public void enable() {
        0FI.A09(863822343, 0FI.A03(-1882151981));
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return this.A01;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        return this.A01 & TraceEvents.sProviders;
    }
}
