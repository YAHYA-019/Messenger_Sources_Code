package X;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: I4h.class */
public final class I4h {
    public static final HtA A04 = new Object();
    public final I8v A00;
    public final QpB A01;
    public final boolean A02;
    public final boolean A03;

    public I4h(I8v i8v, QpB qpB, boolean z, boolean z2) {
        this.A01 = qpB;
        this.A00 = i8v;
        this.A03 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof I4h)) {
                return false;
            }
            I4h i4h = (I4h) obj;
            if (this.A03 == i4h.A03 && this.A02 == i4h.A02 && this.A01 == i4h.A01 && this.A00 == i4h.A00) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, Boolean.valueOf(this.A03), Boolean.valueOf(this.A02)});
    }

    public String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("mUploadMode", this.A01);
        A0u.put("mVideoTranscodeParams", this.A00);
        A0u.put("mIsStreamingEnabled", Boolean.valueOf(this.A03));
        A0u.put("mShouldEnableVideoSegmentationMode", Boolean.valueOf(this.A02));
        return A0u.toString();
    }
}
