package com.facebook.rsys.snapshot.gen;

import X.0Pz;
import X.1BL;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SnapshotDismissCommand.class */
public class SnapshotDismissCommand {
    public static 2JQ CONVERTER = N6e.A00(53);
    public static long sMcfTypeId;
    public final String snapshotURI;

    public SnapshotDismissCommand(String str) {
        this.snapshotURI = str;
    }

    public static native SnapshotDismissCommand createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SnapshotDismissCommand)) {
                return false;
            }
            String str = this.snapshotURI;
            String str2 = ((SnapshotDismissCommand) obj).snapshotURI;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + 1BL.A05(this.snapshotURI);
    }

    public String toString() {
        return 0Pz.A0j("SnapshotDismissCommand{snapshotURI=", this.snapshotURI, "}");
    }
}
