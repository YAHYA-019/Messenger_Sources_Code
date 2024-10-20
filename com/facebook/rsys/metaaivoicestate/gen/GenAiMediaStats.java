package com.facebook.rsys.metaaivoicestate.gen;

import X.0Pz;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: GenAiMediaStats.class */
public class GenAiMediaStats {
    public static 2JQ CONVERTER = N6e.A00(39);
    public static long sMcfTypeId;
    public final long serverToClientAudioCtpLatencyMs;

    public GenAiMediaStats(long j) {
        this.serverToClientAudioCtpLatencyMs = j;
    }

    public static native GenAiMediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof GenAiMediaStats)) {
                return false;
            }
            if (this.serverToClientAudioCtpLatencyMs != ((GenAiMediaStats) obj).serverToClientAudioCtpLatencyMs) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        long j = this.serverToClientAudioCtpLatencyMs;
        return 527 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return 0Pz.A0h("GenAiMediaStats{serverToClientAudioCtpLatencyMs=", "}", this.serverToClientAudioCtpLatencyMs);
    }
}
