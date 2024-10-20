package com.facebook.rsys.countdowntimer.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CountdownTimerModel.class */
public class CountdownTimerModel {
    public static 2JQ CONVERTER = LVi.A00(9);
    public static long sMcfTypeId;
    public final String id;
    public final String initiator;
    public final long lastActionTimestamp;
    public final long remainingDuration;
    public final int status;
    public final long totalDuration;

    public CountdownTimerModel(String str, long j, long j2, int i, String str2, long j3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.totalDuration = j;
        this.remainingDuration = j2;
        this.status = i;
        this.initiator = str2;
        this.lastActionTimestamp = j3;
    }

    public static native CountdownTimerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CountdownTimerModel)) {
                return false;
            }
            CountdownTimerModel countdownTimerModel = (CountdownTimerModel) obj;
            if (this.id.equals(countdownTimerModel.id) && this.totalDuration == countdownTimerModel.totalDuration && this.remainingDuration == countdownTimerModel.remainingDuration && this.status == countdownTimerModel.status && this.initiator.equals(countdownTimerModel.initiator) && this.lastActionTimestamp == countdownTimerModel.lastActionTimestamp) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.lastActionTimestamp, AnonymousClass002.A07(this.initiator, (AnonymousClass002.A02(this.remainingDuration, AnonymousClass002.A02(this.totalDuration, AbstractC2326GOr.A07(this.id))) + this.status) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CountdownTimerModel{id=");
        A0k.append(this.id);
        A0k.append(",totalDuration=");
        A0k.append(this.totalDuration);
        A0k.append(",remainingDuration=");
        A0k.append(this.remainingDuration);
        A0k.append(",status=");
        A0k.append(this.status);
        A0k.append(",initiator=");
        A0k.append(this.initiator);
        A0k.append(",lastActionTimestamp=");
        A0k.append(this.lastActionTimestamp);
        return 1BL.A0v(A0k);
    }
}
