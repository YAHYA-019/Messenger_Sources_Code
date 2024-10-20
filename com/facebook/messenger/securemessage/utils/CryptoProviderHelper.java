package com.facebook.messenger.securemessage.utils;

import X.0Q8;
import X.1BJ;
import X.5Xg;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: CryptoProviderHelper.class */
public abstract class CryptoProviderHelper {
    public CryptoProviderHelper() {
        throw 0Q8.createAndThrow();
    }

    public static byte[] copyFromSharedPreference(long j, String str) {
        try {
            return 5Xg.A05(j, str);
        } catch (SecureMessageKeysSharedPrefs$DEKNotAvailableException | SecureMessageKeysSharedPrefs$SharedPrefsKeysDecryptionErrorException | SecureMessageKeysSharedPrefs$SharedPrefsKeysDoNotExistException | SecureMessageKeysSharedPrefs$SharedPrefsKeysInvalidKeyException unused) {
            return new byte[0];
        }
    }

    public static byte[] createCbcHmacDecryptedDataHandler(byte[] bArr, byte[] bArr2) {
        int length;
        byte[] bArr3 = null;
        if (bArr != null && (length = bArr.length) != 0 && 33 < length && bArr2 != null && bArr2.length != 0) {
            byte b = bArr[0];
            int i = (length - 32) - 1;
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, 1, bArr4, 0, i);
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr, i + 1, bArr5, 0, 32);
            byte[] createKeyMaterialForCBC = createKeyMaterialForCBC(bArr2, b);
            if (createKeyMaterialForCBC != null) {
                byte[] bArr6 = new byte[16];
                System.arraycopy(createKeyMaterialForCBC, 0, bArr6, 0, 16);
                byte[] bArr7 = new byte[16];
                System.arraycopy(createKeyMaterialForCBC, 16, bArr7, 0, 16);
                byte[] doHmacSHA256 = doHmacSHA256(bArr7, bArr4);
                if (doHmacSHA256 != null && Arrays.equals(bArr5, doHmacSHA256)) {
                    byte[] bArr8 = new byte[16];
                    System.arraycopy(bArr4, 0, bArr8, 0, 16);
                    int i2 = i - 16;
                    byte[] bArr9 = new byte[i2];
                    System.arraycopy(bArr4, 16, bArr9, 0, i2);
                    bArr3 = decrypt(bArr6, bArr8, bArr9);
                }
            }
        }
        return bArr3;
    }

    public static byte[] createCbcHmacEncryptedDataHandler(byte[] bArr, byte[] bArr2) {
        byte[] createKeyMaterialForCBC;
        byte[] bArr3 = null;
        if (bArr2 != null && bArr2.length != 0 && bArr != null && (createKeyMaterialForCBC = createKeyMaterialForCBC(bArr2, 0)) != null) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(createKeyMaterialForCBC, 0, bArr4, 0, 16);
            byte[] bArr5 = new byte[16];
            System.arraycopy(createKeyMaterialForCBC, 16, bArr5, 0, 16);
            byte[] bArr6 = new byte[16];
            generateRandomBytes(bArr6);
            byte[] encrypt = encrypt(bArr4, bArr6, bArr);
            if (encrypt != null) {
                int length = encrypt.length;
                int i = length + 16;
                byte[] bArr7 = new byte[i];
                System.arraycopy(bArr6, 0, bArr7, 0, 16);
                System.arraycopy(encrypt, 0, bArr7, 16, length);
                byte[] doHmacSHA256 = doHmacSHA256(bArr5, bArr7);
                if (doHmacSHA256 != null) {
                    bArr3 = new byte[i + 32 + 1];
                    bArr3[0] = 0;
                    System.arraycopy(bArr7, 0, bArr3, 1, i);
                    System.arraycopy(doHmacSHA256, 0, bArr3, i + 1, 32);
                }
            }
        }
        return bArr3;
    }

    public static byte[] createKeyMaterialForCBC(byte[] bArr, int i) {
        return createSHA256HKDFData(bArr, new byte[]{(byte) i}, "LSTincanStorage".getBytes(Charset.defaultCharset()), 32);
    }

    public static byte[] createSHA256HKDFData(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] bArr4;
        int i2;
        if (i > 8160) {
            throw new AssertionError("wrong output size is too big");
        }
        byte[] doHmacSHA256 = doHmacSHA256(bArr2, bArr);
        if (doHmacSHA256 == null) {
            bArr4 = null;
        } else {
            int ceil = (int) Math.ceil(i / 32.0d);
            bArr4 = new byte[i];
            byte[] bArr5 = new byte[32];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = i4;
                if (i3 >= ceil) {
                    break;
                }
                Mac mac = getMac();
                try {
                    mac.init(new SecretKeySpec(doHmacSHA256, "HmacSHA256"));
                    if (i3 > 0) {
                        mac.update(bArr5);
                    }
                    mac.update(bArr3);
                    i3++;
                    mac.update(new byte[]{(byte) i3});
                    bArr5 = mac.doFinal();
                    int i5 = i - i2;
                    if (i5 >= 32) {
                        i5 = 32;
                    }
                    System.arraycopy(bArr5, 0, bArr4, i2, i5);
                    i4 = i2 + i5;
                } catch (InvalidKeyException e) {
                    throw new AssertionError(e);
                }
            }
            if (i2 != i) {
                throw new AssertionError(1BJ.A00(2155));
            }
        }
        return bArr4;
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return getPlaintext(new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2), bArr3);
    }

    public static void deleteDataFromSharedPreference(long j, String str) {
        5Xg.A03(Long.toString(j), str);
    }

    public static byte[] doHmacSHA256(byte[] bArr, byte[] bArr2) {
        Key key;
        if (bArr2 == null) {
            return null;
        }
        Mac mac = getMac();
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    new SecretKeySpec(bArr, "HmacSHA256");
                    mac.init(key);
                    return mac.doFinal(bArr2);
                }
            } catch (InvalidKeyException unused) {
                return null;
            }
        }
        new SecretKeySpec(new byte[1], "HmacSHA256");
        mac.init(key);
        return mac.doFinal(bArr2);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return getCiphertext(new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2), bArr3);
    }

    public static void generateRandomBytes(byte[] bArr) {
        new SecureRandom().nextBytes(bArr);
    }

    public static Cipher getCipher(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, ivParameterSpec);
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] getCiphertext(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            return getCipher(1, secretKeySpec, ivParameterSpec).doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            return null;
        }
    }

    public static Mac getMac() {
        try {
            return Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] getPlaintext(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            return getCipher(2, secretKeySpec, ivParameterSpec).doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            return null;
        }
    }

    public static byte[] getSHA256Hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
