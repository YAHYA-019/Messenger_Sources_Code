package com.facebook.rsys.snapshot.gen;

import X.0Pz;
import X.1BL;
import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SnapshotDeleteCommand.class */
public class SnapshotDeleteCommand {
    public static 2JQ CONVERTER = N6e.A00(52);
    public static long sMcfTypeId;
    public final String snapshotURI;

    public SnapshotDeleteCommand(String str) {
        this.snapshotURI = str;
    }

    public static native SnapshotDeleteCommand createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SnapshotDeleteCommand)) {
                return false;
            }
            String str = this.snapshotURI;
            String str2 = ((SnapshotDeleteCommand) obj).snapshotURI;
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
        return 0Pz.A0j("SnapshotDeleteCommand{snapshotURI=", this.snapshotURI, "}");
    }
}
