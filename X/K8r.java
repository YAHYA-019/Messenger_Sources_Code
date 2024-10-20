package X;

import android.app.PendingIntent;
import java.util.List;

/* loaded from: K8r.class */
public final class K8r extends 3NT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final PendingIntent A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public K8r(PendingIntent pendingIntent, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = list;
        this.A07 = list2;
        this.A05 = pendingIntent;
        this.A08 = list3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof 3NT)) {
                return false;
            }
            K8r k8r = (K8r) ((3NT) obj);
            if (this.A00 != k8r.A00 || this.A01 != k8r.A01 || this.A02 != k8r.A02 || this.A03 != k8r.A03 || this.A04 != k8r.A04) {
                return false;
            }
            List list = this.A06;
            List list2 = k8r.A06;
            if (list == null) {
                if (list2 != null) {
                    return false;
                }
            } else if (!list.equals(list2)) {
                return false;
            }
            List list3 = this.A07;
            List list4 = k8r.A07;
            if (list3 == null) {
                if (list4 != null) {
                    return false;
                }
            } else if (!list3.equals(list4)) {
                return false;
            }
            PendingIntent pendingIntent = this.A05;
            PendingIntent pendingIntent2 = k8r.A05;
            if (pendingIntent == null) {
                if (pendingIntent2 != null) {
                    return false;
                }
            } else if (!pendingIntent.equals(pendingIntent2)) {
                return false;
            }
            List list5 = this.A08;
            List list6 = k8r.A08;
            if (list5 == null) {
                if (list6 != null) {
                    return false;
                }
            } else if (!list5.equals(list6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.A00 ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A02;
        long j = this.A03;
        long j2 = j ^ (j >>> 32);
        long j3 = this.A04;
        long j4 = j3 ^ (j3 >>> 32);
        int i2 = (int) j2;
        int i3 = i * 1000003;
        return ((((((((((i3 ^ i2) * 1000003) ^ ((int) j4)) * 1000003) ^ AnonymousClass001.A02(this.A06)) * 1000003) ^ AnonymousClass001.A02(this.A07)) * 1000003) ^ AnonymousClass001.A02(this.A05)) * 1000003) ^ 4YU.A03(this.A08);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        long j2 = this.A04;
        String valueOf = String.valueOf(this.A06);
        String valueOf2 = String.valueOf(this.A07);
        String valueOf3 = String.valueOf(this.A05);
        String valueOf4 = String.valueOf(this.A08);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SplitInstallSessionState{sessionId=");
        A0k.append(i);
        A0k.append(", status=");
        A0k.append(i2);
        A0k.append(", errorCode=");
        A0k.append(i3);
        A0k.append(", bytesDownloaded=");
        A0k.append(j);
        A0k.append(", totalBytesToDownload=");
        A0k.append(j2);
        A0k.append(", moduleNamesNullable=");
        A0k.append(valueOf);
        A0k.append(", languagesNullable=");
        A0k.append(valueOf2);
        A0k.append(", resolutionIntent=");
        A0k.append(valueOf3);
        A0k.append(", splitFileIntents=");
        return GOq.A12(valueOf4, A0k);
    }
}
