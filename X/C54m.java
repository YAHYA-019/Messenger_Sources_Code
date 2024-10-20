package X;

import android.util.Base64;

/* renamed from: X.54m, reason: invalid class name */
/* loaded from: 54m.class */
public final class C54m {
    public final C00i A01 = new 1BQ(16511);
    public final 20A A00 = (20A) 1Bi.A03(100043);

    public void A00(BLy bLy, Exception exc, byte[] bArr, int i, long j) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Queue type: ");
        A0k.append(bLy.apiString);
        A0k.append("\n");
        A0k.append("Payload length: ");
        A0k.append(bArr.length);
        A0k.append("\n");
        A0k.append("Offset: ");
        A0k.append(i);
        A0k.append("\n");
        A0k.append("Bytes: ");
        A0k.append(new String(Base64.encode(bArr, 0)));
        A0k.append("\n");
        4YU.A1T("Last sequence id: ", "\n", A0k, j);
        1BK.A09(this.A01).softReport("sync_deserialization_error", A0k.toString(), exc);
    }
}
