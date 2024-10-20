package com.facebook.rsys.snapshot.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SnapshotSendCommand.class */
public class SnapshotSendCommand {
    public static 2JQ CONVERTER = N6e.A00(59);
    public static long sMcfTypeId;
    public final String sendSnapshotURI;
    public final String threadID;

    public SnapshotSendCommand(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.sendSnapshotURI = str;
        this.threadID = str2;
    }

    public static native SnapshotSendCommand createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SnapshotSendCommand)) {
                return false;
            }
            SnapshotSendCommand snapshotSendCommand = (SnapshotSendCommand) obj;
            if (this.sendSnapshotURI.equals(snapshotSendCommand.sendSnapshotURI) && this.threadID.equals(snapshotSendCommand.threadID)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(this.sendSnapshotURI) + this.threadID.hashCode();
    }

    public String toString() {
        return 0Pz.A0z("SnapshotSendCommand{sendSnapshotURI=", this.sendSnapshotURI, ",threadID=", this.threadID, "}");
    }
}
