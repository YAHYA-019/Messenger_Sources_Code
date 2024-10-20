package X;

import android.net.Uri;
import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: H73.class */
public final class H73 extends 6DJ {
    public int A00;
    public int A01;
    public 6DQ A02;
    public byte[] A03;

    public H73() {
        super(false);
    }

    public Uri BIM() {
        6DQ r0 = this.A02;
        if (r0 != null) {
            return r0.A06;
        }
        return null;
    }

    public long CVO(6DQ r302) {
        byte[] bytes;
        A02();
        this.A02 = r302;
        Uri uri = r302.A06;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String A0W = 0Pz.A0W("Unsupported scheme: ", scheme);
        if (!equals) {
            throw AnonymousClass001.A0L(String.valueOf(A0W));
        }
        String[] split = uri.getSchemeSpecificPart().split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
        if (split.length != 2) {
            IOException iOException = new IOException(AnonymousClass001.A0Z(uri, "Unexpected URI format: ", AnonymousClass001.A0k()), null);
            ((KLu) iOException).contentIsMalformed = true;
            ((KLu) iOException).dataType = 0;
            throw iOException;
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                bytes = Base64.decode(str, 0);
                this.A03 = bytes;
            } catch (IllegalArgumentException e) {
                IOException iOException2 = new IOException(0Pz.A0W("Error while parsing Base64 encoded string: ", str), e);
                ((KLu) iOException2).contentIsMalformed = true;
                ((KLu) iOException2).dataType = 0;
                throw iOException2;
            }
        } else {
            bytes = URLDecoder.decode(str, Charsets.US_ASCII.name()).getBytes(Charsets.UTF_8);
            this.A03 = bytes;
        }
        long j = r302.A04;
        int length = bytes.length;
        if (j > length) {
            this.A03 = null;
            throw new 6Dc();
        }
        int i = (int) j;
        this.A01 = i;
        int i2 = length - i;
        this.A00 = i2;
        long j2 = r302.A03;
        long j3 = -1;
        if (j2 != j3) {
            this.A00 = (int) Math.min(i2, j2);
        }
        A04(r302);
        if (j2 == j3) {
            j2 = this.A00;
        }
        return j2;
    }

    public void close() {
        if (this.A03 != null) {
            this.A03 = null;
            A01();
        }
        this.A02 = null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.A03, this.A01, bArr, i, min);
        this.A01 += min;
        this.A00 -= min;
        A03(min);
        return min;
    }
}
