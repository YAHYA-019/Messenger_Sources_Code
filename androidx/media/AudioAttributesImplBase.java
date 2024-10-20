package androidx.media;

import X.0Pz;
import X.AnonymousClass001;
import X.JR0;
import android.util.SparseIntArray;

/* loaded from: AudioAttributesImplBase.class */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int A03 = 0;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;

    @Override // androidx.media.AudioAttributesImpl
    public Object AXh() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0 == 7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if ((r307 & 4) == 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof androidx.media.AudioAttributesImplBase
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L7e
            r0 = r302
            androidx.media.AudioAttributesImplBase r0 = (androidx.media.AudioAttributesImplBase) r0
            r302 = r0
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = r302
            int r0 = r0.A00
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L7e
            r0 = r301
            int r0 = r0.A01
            r306 = r0
            r0 = r302
            int r0 = r0.A01
            r307 = r0
            r0 = r302
            int r0 = r0.A02
            r308 = r0
            r0 = -1
            r303 = r0
            r0 = r308
            r1 = r303
            if (r0 == r1) goto L80
            r0 = 6
            r303 = r0
            r0 = r308
            r1 = r303
            if (r0 == r1) goto La0
            r0 = 7
            r303 = r0
            r0 = r308
            r1 = r303
            if (r0 != r1) goto L53
        L4d:
            r0 = r307
            r1 = 1
            r0 = r0 | r1
            r307 = r0
        L53:
            r0 = r307
            r1 = 273(0x111, float:3.83E-43)
            r0 = r0 & r1
            r303 = r0
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L7e
            r0 = r301
            int r0 = r0.A03
            r305 = r0
            r0 = r302
            int r0 = r0.A03
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L7e
            r0 = r301
            int r0 = r0.A02
            r303 = r0
            r0 = r303
            r1 = r308
            if (r0 != r1) goto L7e
            r0 = 1
            r304 = r0
        L7e:
            r0 = r304
            return r0
        L80:
            android.util.SparseIntArray r0 = androidx.media.AudioAttributesCompat.A01
            r0 = r307
            r1 = 1
            r0 = r0 & r1
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = 4
            r305 = r0
            r0 = r307
            r1 = 4
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L53
        La0:
            r0 = r307
            r1 = 4
            r0 = r0 | r1
            r307 = r0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return JR0.A0N(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A03), Integer.valueOf(this.A02));
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o("AudioAttributesCompat:");
        int i = this.A02;
        if (i != -1) {
            A0o.append(" stream=");
            A0o.append(i);
            A0o.append(" derived");
        }
        A0o.append(" usage=");
        int i2 = this.A03;
        SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = 0Pz.A0T("unknown usage ", i2);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        A0o.append(str);
        A0o.append(" content=");
        A0o.append(this.A00);
        A0o.append(" flags=0x");
        return AnonymousClass001.A0d(Integer.toHexString(this.A01).toUpperCase(), A0o);
    }
}
