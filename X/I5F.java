package X;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: I5F.class */
public final class I5F {
    public static final H9A A05 = H9A.A01;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final H9A A04;

    public I5F(H9A h9a, int i, int i2, int i3, int i4) {
        this.A03 = i4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = h9a;
    }

    public HashMap A00() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("AudioRecorderConfig.channelType", String.valueOf(this.A00));
        A0u.put("AudioRecorderConfig.encoding", String.valueOf(this.A01));
        A0u.put("AudioRecorderConfig.sampleRateHz", String.valueOf(this.A03));
        A0u.put("AudioRecorderConfig.readBufferSizeInBytes", String.valueOf(this.A02));
        A0u.put("AudioRecorderConfig.bitRate", String.valueOf(64000));
        A0u.put("AudioRecorderConfig.presentationTimeStrategy", String.valueOf(this.A04));
        return A0u;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            I5F i5f = (I5F) obj;
            if (this.A03 != i5f.A03 || this.A00 != i5f.A00 || this.A01 != i5f.A01 || this.A02 != i5f.A02 || this.A04 != i5f.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), 64000, this.A04});
    }

    public String toString() {
        Integer valueOf = Integer.valueOf(this.A03);
        int i = this.A00;
        String A0T = i != 12 ? i != 16 ? 0Pz.A0T("Wrong enum ", i) : "CHANNEL_IN_MONO" : "CHANNEL_IN_STEREO";
        int i2 = this.A01;
        return String.format(null, "AudioRecorderConfig{sampleRateHz=%d, channelType=%s, encoding=%s, readBufferSizeInBytes=%d, bitrate=%d. presentationTimeStrategy=%s}", valueOf, A0T, i2 != 2 ? i2 != 3 ? i2 != 4 ? 0Pz.A0T("Wrong enum ", i2) : "ENCODING_PCM_FLOAT" : "ENCODING_PCM_8BIT" : "ENCODING_PCM_16BIT", Integer.valueOf(this.A02), 64000, this.A04);
    }
}
