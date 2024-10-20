package com.facebook.rsys.crypto.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: ParticipantIdentityInfo.class */
public class ParticipantIdentityInfo {
    public static 2JQ CONVERTER = IR0.A00(97);
    public static long sMcfTypeId;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public ParticipantIdentityInfo(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
    }

    public static native ParticipantIdentityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ParticipantIdentityInfo)) {
                return false;
            }
            ParticipantIdentityInfo participantIdentityInfo = (ParticipantIdentityInfo) obj;
            if (this.participantId.equals(participantIdentityInfo.participantId) && Arrays.equals(this.publicIdentityKey, participantIdentityInfo.publicIdentityKey)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(this.participantId) + Arrays.hashCode(this.publicIdentityKey);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ParticipantIdentityInfo{participantId=");
        A0k.append(this.participantId);
        A0k.append(",publicIdentityKey=");
        return AbstractC2327GOs.A0U(this.publicIdentityKey, A0k);
    }
}
