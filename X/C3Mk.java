package X;

import java.nio.ByteBuffer;

/* renamed from: X.3Mk, reason: invalid class name */
/* loaded from: 3Mk.class */
public final class C3Mk {
    public final 3D3 A00;
    public final 1Wn A03;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final java.util.Map A01 = AnonymousClass001.A0u();
    public final java.util.Map A04 = AnonymousClass001.A0u();

    public C3Mk(3D3 r302, String str) {
        int i;
        int i2;
        this.A00 = r302;
        this.A03 = 1We.A00(str);
        int A05 = r302.A05();
        int A09 = A05 != 0 ? r302.A09(A05) : 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= A09) {
                break;
            }
            Integer valueOf = Integer.valueOf(i4);
            java.util.Map map = this.A02;
            ByteBuffer byteBuffer = null;
            int i5 = 0;
            int A052 = r302.A05();
            if (A052 != 0) {
                i5 = 1HU.A00(r302, A052, i4);
                byteBuffer = ((1HU) r302).A01;
            }
            int i6 = i5 - byteBuffer.getInt(i5);
            if (4 < byteBuffer.getShort(i6)) {
                short s = byteBuffer.getShort(i6 + 4);
                if (s != 0) {
                    i2 = byteBuffer.getInt(s + i5);
                    1BK.A1O(valueOf, map, i2);
                    i3 = i4 + 1;
                }
            }
            i2 = 0;
            1BK.A1O(valueOf, map, i2);
            i3 = i4 + 1;
        }
        int A03 = r302.A03();
        if (A03 != 0) {
            int A092 = r302.A09(A03);
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= A092) {
                    break;
                }
                Integer valueOf2 = Integer.valueOf(i8);
                java.util.Map map2 = this.A01;
                ByteBuffer byteBuffer2 = null;
                int i9 = 0;
                int A032 = r302.A03();
                if (A032 != 0) {
                    i9 = 1HU.A00(r302, A032, i8);
                    byteBuffer2 = ((1HU) r302).A01;
                }
                int i10 = i9 - byteBuffer2.getInt(i9);
                if (4 < byteBuffer2.getShort(i10)) {
                    short s2 = byteBuffer2.getShort(i10 + 4);
                    if (s2 != 0) {
                        i = byteBuffer2.getInt(s2 + i9);
                        1BK.A1O(valueOf2, map2, i);
                        i7 = i8 + 1;
                    }
                }
                i = 0;
                1BK.A1O(valueOf2, map2, i);
                i7 = i8 + 1;
            }
        }
        int A07 = r302.A07(12);
        if (A07 != 0) {
            int A093 = r302.A09(A07);
            for (int i11 = 0; i11 < A093; i11++) {
                java.util.Map map3 = this.A04;
                int A072 = r302.A07(12);
                String A0A = A072 != 0 ? r302.A0A(r302.A08(A072) + (i11 * 4)) : null;
                11T.A0A(A0A);
                1BK.A1P(A0A, map3, i11);
            }
        }
    }
}
