package X;

import com.google.android.gms.auth.blockstore.StoreBytesData;

/* loaded from: Kt1.class */
public final class Kt1 {
    public String A00 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
    public byte[] A01;

    public StoreBytesData A00() {
        return new StoreBytesData(this.A00, this.A01, false);
    }

    public void A01(String str) {
        AbstractC00481b7.A06(str, "key cannot be null or empty");
        this.A00 = str;
    }

    public void A02(byte[] bArr) {
        this.A01 = bArr;
    }
}
