package com.facebook.rsys.snapshot.gen;

import X.0Pz;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SnapshotRecaptureCommand.class */
public class SnapshotRecaptureCommand {
    public static 2JQ CONVERTER = N6e.A00(58);
    public static long sMcfTypeId;
    public final boolean shouldCaptureFrozenPeer;

    public SnapshotRecaptureCommand(boolean z) {
        this.shouldCaptureFrozenPeer = z;
    }

    public static native SnapshotRecaptureCommand createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SnapshotRecaptureCommand)) {
                return false;
            }
            if (this.shouldCaptureFrozenPeer != ((SnapshotRecaptureCommand) obj).shouldCaptureFrozenPeer) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 527 + (this.shouldCaptureFrozenPeer ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A19("SnapshotRecaptureCommand{shouldCaptureFrozenPeer=", "}", this.shouldCaptureFrozenPeer);
    }
}
