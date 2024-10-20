package com.facebook.rsys.clienttransportmonitor.gen;

import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: RetinaStats.class */
public class RetinaStats {
    public static 2JQ CONVERTER = N6e.A00(17);
    public static long sMcfTypeId;
    public final boolean configEngineEnabled;
    public final ArrayList edgerayIps;
    public final String relayIp;
    public final String uuid;
    public final boolean wasCallConnected;

    public RetinaStats(boolean z, boolean z2, ArrayList arrayList, String str, String str2) {
        7zP.A1S(arrayList, str, str2);
        this.configEngineEnabled = z;
        this.wasCallConnected = z2;
        this.edgerayIps = arrayList;
        this.relayIp = str;
        this.uuid = str2;
    }

    public static native RetinaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RetinaStats)) {
                return false;
            }
            RetinaStats retinaStats = (RetinaStats) obj;
            if (this.configEngineEnabled == retinaStats.configEngineEnabled && this.wasCallConnected == retinaStats.wasCallConnected && this.edgerayIps.equals(retinaStats.edgerayIps) && this.relayIp.equals(retinaStats.relayIp) && this.uuid.equals(retinaStats.uuid)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.edgerayIps, (AbstractC2326GOr.A03(this.configEngineEnabled ? 1 : 0) + (this.wasCallConnected ? 1 : 0)) * 31) + this.relayIp.hashCode()) * 31) + this.uuid.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RetinaStats{configEngineEnabled=");
        A0k.append(this.configEngineEnabled);
        A0k.append(",wasCallConnected=");
        A0k.append(this.wasCallConnected);
        A0k.append(",edgerayIps=");
        A0k.append(this.edgerayIps);
        A0k.append(",relayIp=");
        A0k.append(this.relayIp);
        A0k.append(",uuid=");
        return GOq.A12(this.uuid, A0k);
    }
}
