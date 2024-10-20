package com.fasterxml.jackson.databind.deser.std;

import X.0Pz;
import X.0Q8;
import X.3BP;
import X.3DX;
import X.3sK;
import X.AnonymousClass001;
import X.C24e;
import X.C24f;
import X.C27T;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: UUIDDeserializer.class */
public class UUIDDeserializer extends FromStringDeserializer {
    public static final int[] A00;
    public static final long serialVersionUID = 1;

    static {
        int[] iArr;
        int[] iArr2 = new int[127];
        A00 = iArr2;
        Arrays.fill(iArr2, -1);
        int i = 0;
        int i2 = 0;
        do {
            iArr = A00;
            iArr[i2 + 48] = i2;
            i2++;
        } while (i2 < 10);
        do {
            int i3 = i + 10;
            iArr[i + 97] = i3;
            iArr[i + 65] = i3;
            i++;
        } while (i < 6);
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private int A00(C27T c27t, String str, int i) {
        Class A0S;
        Object[] objArr;
        String hexString;
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt <= 127) {
            if (charAt2 <= 127) {
                int[] iArr = A00;
                int i2 = iArr[charAt2] | (iArr[charAt] << 4);
                if (i2 >= 0) {
                    return i2;
                }
            }
            if (A00[charAt] >= 0) {
                A0S = A0S();
                objArr = new Object[2];
                objArr[0] = Character.valueOf(charAt2);
                hexString = Integer.toHexString(charAt2);
                objArr[1] = hexString;
                throw c27t.A0Q(A0S, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", objArr));
            }
        }
        A0S = A0S();
        objArr = new Object[2];
        objArr[0] = Character.valueOf(charAt);
        hexString = Integer.toHexString(charAt);
        objArr[1] = hexString;
        throw c27t.A0Q(A0S, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", objArr));
    }

    private int A01(C27T c27t, String str, int i) {
        return (A00(c27t, str, i) << 24) + (A00(c27t, str, i + 2) << 16) + (A00(c27t, str, i + 4) << 8) + A00(c27t, str, i + 6);
    }

    private int A02(C27T c27t, String str, int i) {
        return (A00(c27t, str, i) << 8) + A00(c27t, str, i + 2);
    }

    public static long A03(byte[] bArr, int i) {
        int i2 = i + 4;
        return ((((bArr[i2 + 3] & 255) | (((bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16)) | ((bArr[i2 + 2] & 255) << 8))) << 32) >>> 32) | (((bArr[i + 3] & 255) | (((bArr[i] << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8))) << 32);
    }

    private UUID A04(C27T c27t, byte[] bArr) {
        int length = bArr.length;
        if (length == 16) {
            return new UUID(A03(bArr, 0), A03(bArr, 8));
        }
        throw new 3BP(c27t.A00, A0S(), bArr, 0Pz.A0d("Can only construct UUIDs from byte[16]; got ", " bytes", length));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        return new UUID(0L, 0L);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ Object A13(C27T c27t, Object obj) {
        if (obj instanceof byte[]) {
            return A04(c27t, (byte[]) obj);
        }
        super.A13(c27t, obj);
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ Object A14(C27T c27t, String str) {
        int length = str.length();
        if (length != 36) {
            if (length == 24) {
                C24f c24f = C24e.A01;
                3DX r0 = new 3DX((3sK) null);
                c24f.A07(r0, str);
                return A04(c27t, r0.A05());
            }
        } else if (str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-') {
            return new UUID((A01(c27t, str, 0) << 32) + ((A02(c27t, str, 9) << 16) | A02(c27t, str, 14)), ((A01(c27t, str, 28) << 32) >>> 32) | ((A02(c27t, str, 24) | (A02(c27t, str, 19) << 16)) << 32));
        }
        c27t.A0l(A0S(), str, "UUID has to be represented by standard 36-char representation", AnonymousClass001.A1Z());
        throw 0Q8.createAndThrow();
    }
}
