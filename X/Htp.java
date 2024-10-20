package X;

import java.util.Arrays;

/* loaded from: Htp.class */
public final class Htp {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public Htp(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = i6;
        this.A01 = i2;
        this.A00 = i;
        this.A04 = i5;
        this.A02 = i3;
        this.A03 = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Htp htp = (Htp) obj;
            if (this.A05 != htp.A05 || this.A01 != htp.A01 || this.A00 != htp.A00 || this.A04 != htp.A04 || this.A02 != htp.A02 || this.A03 != htp.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{64000, Integer.valueOf(this.A05), Integer.valueOf(this.A01), Integer.valueOf(this.A00), Integer.valueOf(this.A04), 7zN.A0h(), Integer.valueOf(this.A02), Integer.valueOf(this.A03), 7zN.A0i(), "audio/mp4a-latm"});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioEncoderConfig{bitRate=");
        A0k.append(64000);
        A0k.append(", sampleRate=");
        A0k.append(this.A05);
        A0k.append(4YT.A00(488));
        A0k.append(this.A01);
        A0k.append(", bufferSize=");
        A0k.append(this.A00);
        A0k.append(", pcmEncoding=");
        A0k.append(this.A04);
        A0k.append(", dequeueInputBufferTimeoutMs=");
        A0k.append(-1);
        A0k.append(", endOfStreamDequeueOutputBufferTimeoutUs=");
        A0k.append(this.A02);
        A0k.append(", maxTryAgainLaterRetries=");
        A0k.append(this.A03);
        A0k.append(", aacProfile=");
        A0k.append(1);
        A0k.append(", audioMimeType=");
        A0k.append("audio/mp4a-latm");
        return AnonymousClass001.A0f(A0k);
    }
}
