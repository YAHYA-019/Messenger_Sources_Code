package X;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.acra.constants.ActionId;

/* loaded from: I4f.class */
public final class I4f {
    public static final byte[] A04 = "from-data".getBytes();
    public static final byte[] A03 = "attachment".getBytes();
    public static final byte[] A05 = "inline".getBytes();
    public Uri A00 = null;
    public byte[] A02 = null;
    public SparseArray A01 = DKC.A0E();

    public int A00() {
        Number number = (Number) this.A01.get(ActionId.MESSENGER_QUEUE_CREATION);
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public void A01(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            throw AnonymousClass001.A0L("Content-Id may not be null or empty.");
        }
        if (length > 1 && ((char) bArr[0]) == '<' && ((char) bArr[length - 1]) == '>') {
            this.A01.put(192, bArr);
            return;
        }
        int i = length + 2;
        byte[] bArr2 = new byte[i];
        bArr2[0] = 60;
        bArr2[i - 1] = 62;
        System.arraycopy(bArr, 0, bArr2, 1, length);
        this.A01.put(192, bArr2);
    }

    public void A02(byte[] bArr) {
        if (bArr == null) {
            throw AnonymousClass001.A0Q("null content-type");
        }
        this.A01.put(ActionId.BEGIN_START_ACTIVITY, bArr);
    }
}
