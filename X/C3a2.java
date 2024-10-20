package X;

/* renamed from: X.3a2, reason: invalid class name */
/* loaded from: 3a2.class */
public final class C3a2 implements C5j5 {
    public byte[] A00;

    @Override // X.C5j5
    public String ALg(CharSequence charSequence) {
        return ALh(charSequence, -1);
    }

    @Override // X.C5j5
    public String ALh(CharSequence charSequence, long j) {
        0fH.A0h(Long.valueOf(j), "VaultContextVaulted", "Feature: %d is un-vaulting sensitive data");
        if (charSequence.length() >= 7) {
            int i = 0;
            while (charSequence.charAt(i) == "\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i)) {
                i++;
                if (i >= 7) {
                    byte[] bArr = this.A00;
                    02W.A04(AnonymousClass001.A1Q(bArr.length, 8));
                    int length = (charSequence.length() - 7) / 2;
                    int i2 = 0;
                    int i3 = 0;
                    while (charSequence.charAt(i3) == "\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i2)) {
                        i3++;
                        i2++;
                        if (i2 >= 7) {
                            byte[] bArr2 = new byte[length];
                            int i4 = 0;
                            while (true) {
                                int i5 = i4;
                                if (i5 >= length) {
                                    return new String(bArr2, R4p.A00);
                                }
                                byte charAt = (byte) (((byte) (((byte) (((byte) charSequence.charAt(i3)) - 65)) << 4)) & (-16));
                                i3 = i3 + 1 + 1;
                                bArr2[i5] = (byte) (((byte) (charAt | ((byte) (((byte) (((byte) (((byte) charSequence.charAt(r0)) - 65)) << 0)) & 15)))) ^ bArr[i5 % 8]);
                                i4 = i5 + 1;
                            }
                        }
                    }
                    return charSequence.toString();
                }
            }
        }
        throw AnonymousClass001.A0T("Value is not vaulted");
    }
}
