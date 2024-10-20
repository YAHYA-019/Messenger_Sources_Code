package X;

import com.facebook.acra.constants.ActionId;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lfb.class */
public final class Lfb implements MIz {
    public final int A00;
    public final SecretKeySpec A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public static final KMC A05 = KMC.A00;
    public static final ThreadLocal A07 = new Lxv();
    public static final ThreadLocal A06 = new Lxw();

    public Lfb(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        if (!A05.A00()) {
            throw JQx.A10("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw AnonymousClass001.A0L("IV size should be either 12 or 16 bytes");
        }
        this.A00 = i;
        L71.A01(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.A01 = secretKeySpec;
        Cipher cipher = (Cipher) A07.get();
        cipher.init(1, secretKeySpec);
        byte[] doFinal = cipher.doFinal(new byte[16]);
        byte[] bArr3 = new byte[16];
        int i4 = 0;
        do {
            int i5 = doFinal[i4] << 1;
            i2 = i4 + 1;
            JQx.A17(i5 ^ ((doFinal[i2] & 255) >>> 7), bArr3, i4);
            i4 = i2;
        } while (i2 < 15);
        bArr3[15] = (byte) (((doFinal[0] >> 7) & ActionId.MQTT_CONNECTING) ^ (doFinal[15] << 1));
        this.A02 = bArr3;
        byte[] bArr4 = new byte[16];
        int i6 = 0;
        do {
            int i7 = bArr3[i6] << 1;
            i3 = i6 + 1;
            JQx.A17(i7 ^ ((bArr3[i3] & 255) >>> 7), bArr4, i6);
            i6 = i3;
        } while (i3 < 15);
        bArr4[15] = (byte) (((bArr3[0] >> 7) & ActionId.MQTT_CONNECTING) ^ (bArr3[15] << 1));
        this.A03 = bArr4;
        this.A04 = bArr2;
    }

    private byte[] A00(Cipher cipher, byte[] bArr, int i, int i2, int i3) {
        byte[] copyOf;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 != 0) {
            byte[] doFinal = cipher.doFinal(bArr3);
            int i4 = 0;
            while (i3 - i4 > 16) {
                int i5 = 0;
                do {
                    doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
                    i5++;
                } while (i5 < 16);
                doFinal = cipher.doFinal(doFinal);
                i4 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
            int length = copyOfRange.length;
            if (length == 16) {
                byte[] bArr4 = this.A02;
                copyOf = new byte[length];
                int i6 = 0;
                do {
                    copyOf[i6] = (byte) (copyOfRange[i6] ^ bArr4[i6]);
                    i6++;
                } while (i6 < length);
            } else {
                copyOf = Arrays.copyOf(this.A03, 16);
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 >= length) {
                        break;
                    }
                    copyOf[i8] = (byte) (copyOf[i8] ^ copyOfRange[i8]);
                    i7 = i8 + 1;
                }
                copyOf[length] = (byte) (copyOf[length] ^ 128);
            }
            int length2 = doFinal.length;
            bArr2 = new byte[length2];
            int i9 = 0;
            while (true) {
                int i10 = i9;
                if (i10 >= length2) {
                    break;
                }
                bArr2[i10] = (byte) (doFinal[i10] ^ copyOf[i10]);
                i9 = i10 + 1;
            }
        } else {
            byte[] bArr5 = this.A02;
            bArr2 = new byte[16];
            int i11 = 0;
            do {
                bArr2[i11] = (byte) (bArr3[i11] ^ bArr5[i11]);
                i11++;
            } while (i11 < 16);
        }
        return cipher.doFinal(bArr2);
    }

    @Override // X.MIz
    public byte[] AMO(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = this.A04;
        int length = bArr5.length;
        if (length != 0) {
            if (!L9b.A02(bArr5, bArr)) {
                throw JQx.A10("Decryption failed (OutputPrefix mismatch).");
            }
            bArr3 = Arrays.copyOfRange(bArr, length, bArr.length);
        }
        int length2 = bArr3.length;
        int i = this.A00;
        int i2 = (length2 - i) - 16;
        if (i2 < 0) {
            throw JQx.A10("ciphertext too short");
        }
        Cipher cipher = (Cipher) A07.get();
        SecretKeySpec secretKeySpec = this.A01;
        cipher.init(1, secretKeySpec);
        byte[] A00 = A00(cipher, bArr3, 0, 0, i);
        int i3 = 0;
        if (bArr2 == null) {
            bArr4 = new byte[0];
        }
        byte[] A002 = A00(cipher, bArr4, 1, 0, bArr4.length);
        byte[] A003 = A00(cipher, bArr3, 2, i, i2);
        int i4 = length2 - 16;
        byte b = 0;
        do {
            b = (byte) (b | (((bArr3[i4 + i3] ^ A002[i3]) ^ A00[i3]) ^ A003[i3]));
            i3++;
        } while (i3 < 16);
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) A06.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(A00));
        return cipher2.doFinal(bArr3, i, i2);
    }

    @Override // X.MIz
    public byte[] AQ1(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2;
        int length = bArr.length;
        int i = this.A00;
        if (length > (((-1) >>> 1) - i) - 16) {
            throw JQx.A10("plaintext too long");
        }
        int i2 = length + i;
        byte[] bArr4 = new byte[i2 + 16];
        byte[] A00 = Kxq.A00(i);
        int i3 = 0;
        System.arraycopy(A00, 0, bArr4, 0, i);
        Cipher cipher = (Cipher) A07.get();
        SecretKeySpec secretKeySpec = this.A01;
        cipher.init(1, secretKeySpec);
        byte[] A002 = A00(cipher, A00, 0, 0, A00.length);
        if (bArr2 == null) {
            bArr3 = new byte[0];
        }
        byte[] A003 = A00(cipher, bArr3, 1, 0, bArr3.length);
        Cipher cipher2 = (Cipher) A06.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(A002));
        cipher2.doFinal(bArr, 0, length, bArr4, i);
        byte[] A004 = A00(cipher, bArr4, 2, i, length);
        do {
            bArr4[i2 + i3] = (byte) ((A003[i3] ^ A002[i3]) ^ A004[i3]);
            i3++;
        } while (i3 < 16);
        byte[] bArr5 = this.A04;
        if (bArr5.length != 0) {
            bArr4 = L9R.A00(bArr4, bArr5);
        }
        return bArr4;
    }
}
