package X;

import java.util.Map;

/* renamed from: X.4OC, reason: invalid class name */
/* loaded from: 4OC.class */
public final class C4OC {
    public static final void A00(41Z r301, int i) {
        r301.A00((byte) (i & 255));
        r301.A00((byte) ((65280 & i) >> 8));
        r301.A00((byte) ((16711680 & i) >> 16));
        r301.A00((byte) ((i & (-16777216)) >> 24));
    }

    public static final void A01(41Z r301, long j) {
        r301.A00((byte) (255 & j));
        r301.A00((byte) ((65280 & j) >> 8));
        r301.A00((byte) ((16711680 & j) >> 16));
        r301.A00((byte) ((4278190080L & j) >> 24));
        r301.A00((byte) ((1095216660480L & j) >> 32));
        r301.A00((byte) ((280375465082880L & j) >> 40));
        r301.A00((byte) ((71776119061217280L & j) >> 48));
        r301.A00((byte) ((j & (-72057594037927936L)) >> 56));
    }

    public final void A02(41Z r302, String str) {
        11T.A0F(str, 1);
        byte[] bytes = str.getBytes(C41a.A01);
        11T.A0A(bytes);
        int length = bytes.length;
        A00(r302, length);
        int i = r302.A00 + length;
        byte[] bArr = r302.A01;
        int length2 = bArr.length;
        if (i >= length2) {
            byte[] bArr2 = new byte[(length2 + length) * 2];
            r302.A01 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        System.arraycopy(bytes, 0, r302.A01, r302.A00, length);
        r302.A00 += length;
    }

    public final void A03(41Z r302, java.util.Map map) {
        if (map == null) {
            A00(r302, 0);
            return;
        }
        A00(r302, map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            A02(r302, str);
            A02(r302, str2);
        }
    }
}
