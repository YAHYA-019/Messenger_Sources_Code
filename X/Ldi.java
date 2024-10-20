package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* loaded from: Ldi.class */
public final class Ldi implements MQh {
    public String A00;
    public Status A01;
    public byte[] A02;
    public final SafeBrowsingData A03;

    public Ldi(Status status, SafeBrowsingData safeBrowsingData) {
        this.A01 = status;
        this.A03 = safeBrowsingData;
        if (safeBrowsingData != null) {
            this.A00 = safeBrowsingData.A03;
            this.A02 = safeBrowsingData.A04;
        } else if (status.A00 <= 0) {
            this.A01 = new Status(8, null);
        }
    }

    public final Status BCJ() {
        return this.A01;
    }
}
