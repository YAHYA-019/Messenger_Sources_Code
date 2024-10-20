package com.facebook.messenger.msys.filemanager.implementations;

import X.02W;
import X.04J;
import X.0S2;
import X.0fH;
import X.1BQ;
import X.1Bi;
import X.1CO;
import X.1Fv;
import X.1G2;
import X.1Ne;
import X.1PL;
import X.1PN;
import X.1Ql;
import X.2L5;
import X.2L6;
import X.4YT;
import X.AnonymousClass001;
import X.C00i;
import X.C0il;
import X.C1UI;
import X.C1f0;
import com.facebook.crypto.module.LoggedInUserCrypto;
import com.facebook.msys.mcf.MsysError;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: FileEncryptionProviderImpl.class */
public class FileEncryptionProviderImpl {
    public static int CURRENT_ENCRYPTION_VERSION = 1;
    public static boolean sInitialized;
    public static boolean shouldUseStreaming;
    public static final 1PL isFileEncryptionProviderInitialized = new 1PL();
    public static final 1PN HEX_ENCODING = 1PN.A00.A01();
    public final C00i mMobileConfig = new 1BQ(16385);
    public final C00i mDeviceEncryptionKeyProvider = new 1BQ(33065);
    public final C00i mLogger = new 1BQ(16634);

    static {
        C0il.A0B("messengerfileencryptionorcajni");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v38, types: [javax.crypto.Mac] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.security.Key, javax.crypto.spec.SecretKeySpec] */
    public static byte[] createKeyMaterialForCBC(byte[] bArr, int i) {
        int i2;
        byte[] bytes = "LSTincanStorage".getBytes(Charset.defaultCharset());
        byte[] doHmacSHA256 = doHmacSHA256(new byte[]{(byte) i}, bArr);
        if (doHmacSHA256 == null) {
            throw AnonymousClass001.A0J("Invalid key from doHmacSHA256");
        }
        int ceil = (int) Math.ceil(32.0d / 32.0d);
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[32];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = i4;
            if (i3 >= ceil) {
                break;
            }
            Object obj = "HmacSHA256";
            try {
                obj = Mac.getInstance("HmacSHA256");
                try {
                    obj = new SecretKeySpec(doHmacSHA256, "HmacSHA256");
                    obj.init(obj);
                    if (i3 > 0) {
                        obj.update(bArr3);
                    }
                    obj.update(bytes);
                    i3++;
                    obj.update(new byte[]{(byte) i3});
                    bArr3 = obj.doFinal();
                    int i5 = 32 - i2;
                    if (i5 >= 32) {
                        i5 = 32;
                    }
                    System.arraycopy(bArr3, 0, bArr2, i2, i5);
                    i4 = i2 + i5;
                } catch (InvalidKeyException unused) {
                    throw AnonymousClass001.A0J(obj);
                }
            } catch (NoSuchAlgorithmException unused2) {
                throw AnonymousClass001.A0J(obj);
            }
        }
        if (i2 == 32) {
            return bArr2;
        }
        throw AnonymousClass001.A0J("wrong number of copied bytes");
    }

    public static byte[] decryptFile(long j, byte[] bArr) {
        byte[] bArr2;
        synchronized (FileEncryptionProviderImpl.class) {
            0fH.A0l("FileEncryptionProviderImpl", "decryptFile.");
            try {
                Boolean bool = (Boolean) isFileEncryptionProviderInitialized.A00.get(5000L, TimeUnit.MILLISECONDS);
                02W.A03("At this moment, if future was not set, that means sInitialized is false which means this should be captured.", bool);
                02W.A04(bool.booleanValue());
            } catch (InterruptedException | NullPointerException | ExecutionException | TimeoutException e) {
                C1UI.A01("FileEncryptionProviderImpl", "FileEncryptionProvider failed to init when db decryption.");
                0fH.A0k("FileEncryptionProviderImpl", "FileEncryptionProvider failed to init when db decryption.");
                logDecryptFileFailure(1, e.getMessage(), -1);
            }
            Integer num = 0S2.A0C;
            C1UI.A00("FileEncryptionProviderImpl", num, "Start decrypt DB file");
            byte[] userDecryptedDEK = getUserDecryptedDEK(Long.toString(j));
            if (userDecryptedDEK == null) {
                C1UI.A01("FileEncryptionProviderImpl", "Failed to decrypt DB file: Null DEK Key");
                0fH.A0k("FileEncryptionProviderImpl", "Failed to decrypt DB file: Null DEK Key");
                logDecryptFileFailure(2, null, -1);
                return null;
            }
            if (bArr != null) {
                int length = bArr.length;
                if (length != 0 && 33 < length) {
                    byte b = bArr[0];
                    int i = (length - 32) - 1;
                    byte[] bArr3 = new byte[i];
                    System.arraycopy(bArr, 1, bArr3, 0, i);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(bArr, i + 1, bArr4, 0, 32);
                    byte[] createKeyMaterialForCBC = createKeyMaterialForCBC(userDecryptedDEK, b);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(createKeyMaterialForCBC, 0, bArr5, 0, 16);
                    byte[] bArr6 = new byte[16];
                    System.arraycopy(createKeyMaterialForCBC, 16, bArr6, 0, 16);
                    if (!Arrays.equals(bArr4, doHmacSHA256(bArr6, bArr3))) {
                        0fH.A0k("FileEncryptionProviderImpl", "computed MAC and expected MAC do not match");
                        logDecryptFileFailure(4, null, b);
                        return null;
                    }
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr3, 0, bArr7, 0, 16);
                    int i2 = i - 16;
                    byte[] bArr8 = new byte[i2];
                    System.arraycopy(bArr3, 16, bArr8, 0, i2);
                    0fH.A0b(16, 16, Integer.valueOf(i2), "FileEncryptionProviderImpl", "decrypt key length: %d, iv length: %d, cipherText length: %d");
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr5, "AES");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr7);
                    try {
                        try {
                            Cipher cipher = Cipher.getInstance(4YT.A00(86));
                            cipher.init(2, secretKeySpec, ivParameterSpec);
                            bArr2 = cipher.doFinal(bArr8);
                        } catch (BadPaddingException | IllegalBlockSizeException unused) {
                            bArr2 = null;
                        }
                        if (bArr2 != null) {
                            C1UI.A00("FileEncryptionProviderImpl", num, "Decrypt DB file success");
                            0fH.A0h(Integer.valueOf(bArr2.length), "FileEncryptionProviderImpl", "Decrypt file with output size: %d");
                        } else {
                            C1UI.A01("FileEncryptionProviderImpl", "Failed to decrypt DB file: Invalid output data");
                            0fH.A0k("FileEncryptionProviderImpl", "Error decrypt file.");
                            logDecryptFileFailure(5, null, b);
                        }
                        return bArr2;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                        throw AnonymousClass001.A0J(e2);
                    }
                }
            }
            C1UI.A01("FileEncryptionProviderImpl", "Failed to decrypt DB file: Invalid input data");
            0fH.A0k("FileEncryptionProviderImpl", "Invalid input length");
            logDecryptFileFailure(3, null, -1);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [javax.crypto.Mac] */
    public static byte[] doHmacSHA256(byte[] bArr, byte[] bArr2) {
        Object obj = "HmacSHA256";
        try {
            obj = Mac.getInstance("HmacSHA256");
            try {
                obj.init(new SecretKeySpec(bArr, "HmacSHA256"));
                return obj.doFinal(bArr2);
            } catch (InvalidKeyException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException unused2) {
            throw AnonymousClass001.A0J(obj);
        }
    }

    public static byte[] encryptFile(long j, byte[] bArr) {
        byte[] bArr2;
        int i;
        byte[] bArr3;
        synchronized (FileEncryptionProviderImpl.class) {
            0fH.A0l("FileEncryptionProviderImpl", "encryptFile.");
            try {
                Boolean bool = (Boolean) isFileEncryptionProviderInitialized.A00.get(5000L, TimeUnit.MILLISECONDS);
                02W.A03("At this moment, if future was not set, that means sInitialized is false which means this should be captured.", bool);
                02W.A04(bool.booleanValue());
            } catch (InterruptedException | NullPointerException | ExecutionException | TimeoutException e) {
                C1UI.A01("FileEncryptionProviderImpl", "FileEncryptionProvider failed to init when db encryption.");
                logEncryptFileFailure(1, e.getMessage());
            }
            Integer num = 0S2.A0C;
            C1UI.A00("FileEncryptionProviderImpl", num, "Start encrypt DB file");
            byte[] userDecryptedDEK = getUserDecryptedDEK(Long.toString(j));
            bArr2 = null;
            if (userDecryptedDEK == null) {
                C1UI.A01("FileEncryptionProviderImpl", "Failed to encrypt DB file: Null DEK Key");
                i = 2;
            } else {
                if (bArr != null) {
                    int length = bArr.length;
                    if (length != 0) {
                        byte[] createKeyMaterialForCBC = createKeyMaterialForCBC(userDecryptedDEK, CURRENT_ENCRYPTION_VERSION);
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(createKeyMaterialForCBC, 0, bArr4, 0, 16);
                        byte[] bArr5 = new byte[16];
                        System.arraycopy(createKeyMaterialForCBC, 16, bArr5, 0, 16);
                        byte[] bArr6 = new byte[16];
                        new SecureRandom().nextBytes(bArr6);
                        0fH.A0b(16, 16, Integer.valueOf(length), "FileEncryptionProviderImpl", "encrypt key length: %d, iv length: %d, plainText length: %d");
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, "AES");
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr6);
                        try {
                            try {
                                Cipher cipher = Cipher.getInstance(4YT.A00(86));
                                cipher.init(1, secretKeySpec, ivParameterSpec);
                                bArr3 = cipher.doFinal(bArr);
                            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                                throw AnonymousClass001.A0J(e2);
                            }
                        } catch (BadPaddingException | IllegalBlockSizeException unused) {
                            bArr3 = null;
                        }
                        if (bArr3 == null) {
                            C1UI.A01("FileEncryptionProviderImpl", "Failed to encrypt DB file: Invalid output data");
                            0fH.A0k("FileEncryptionProviderImpl", "Error encrypt file.");
                            i = 6;
                        } else {
                            int length2 = bArr3.length;
                            int i2 = length2 + 16;
                            byte[] bArr7 = new byte[i2];
                            System.arraycopy(bArr6, 0, bArr7, 0, 16);
                            System.arraycopy(bArr3, 0, bArr7, 16, length2);
                            byte[] doHmacSHA256 = doHmacSHA256(bArr5, bArr7);
                            if (doHmacSHA256 == null) {
                                C1UI.A01("FileEncryptionProviderImpl", "Failed to encrypt DB file: Invalid output data");
                                0fH.A0k("FileEncryptionProviderImpl", "Error encrypt file.");
                                i = 7;
                            } else {
                                int i3 = i2 + 32 + 1;
                                bArr2 = new byte[i3];
                                bArr2[0] = (byte) CURRENT_ENCRYPTION_VERSION;
                                System.arraycopy(bArr7, 0, bArr2, 1, i2);
                                System.arraycopy(doHmacSHA256, 0, bArr2, i2 + 1, 32);
                                C1UI.A00("FileEncryptionProviderImpl", num, "Encrypt DB file success");
                                0fH.A0h(Integer.valueOf(i3), "FileEncryptionProviderImpl", "Encrypt file with output size: %d");
                            }
                        }
                    }
                }
                C1UI.A01("FileEncryptionProviderImpl", "Failed to encrypt DB file: Invalid input data");
                i = 3;
            }
            logEncryptFileFailure(i, null);
        }
        return bArr2;
    }

    public static byte[] getUserDecryptedDEK(String str) {
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1G2 r0 = (1G2) C1f0.A07.A0D(str);
        String A3a = fbSharedPreferences.A3a(r0, "");
        if (A3a.isEmpty()) {
            return null;
        }
        try {
            return HEX_ENCODING.A05(A3a);
        } catch (IllegalArgumentException unused) {
            1Ql edit = fbSharedPreferences.edit();
            edit.Cdj(r0);
            edit.commit();
            return null;
        }
    }

    public static boolean isMCPEnabledForFileEncryption() {
        return 1Ne.A00(0);
    }

    public static void logDecryptFileFailure(int i, String str, int i2) {
        EventBuilder annotate = ((QuickPerformanceLogger) 1Bi.A03(16520)).markEventBuilder(734737895, "db_decryption_failure").annotate(TraceFieldType.ErrorCode, i).annotate("current_encryption_version", CURRENT_ENCRYPTION_VERSION);
        if (str != null) {
            annotate.annotate("error_message", str);
        }
        if (i2 >= 0) {
            annotate.annotate(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, i2);
        }
        annotate.report();
    }

    public static void logEncryptFileFailure(int i, String str) {
        EventBuilder annotate = ((QuickPerformanceLogger) 1Bi.A03(16520)).markEventBuilder(734729381, "db_encryption_failure").annotate(TraceFieldType.ErrorCode, i).annotate("encryption_version", CURRENT_ENCRYPTION_VERSION);
        if (str != null) {
            annotate.annotate("error_message", str);
        }
        annotate.report();
    }

    public static native boolean nativeDecryptFile(String str, String str2, long j);

    public static native boolean nativeEncryptFile(String str, String str2, long j);

    public static void throwMsysError(Throwable th) {
        02W.A04(th instanceof MsysError);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Object, X.1UM] */
    public void initialize() {
        byte[] copyOf;
        1Ql edit;
        synchronized (this) {
            if (!sInitialized) {
                04J r0 = (04J) this.mLogger.get();
                if (C1UI.A00 == null) {
                    C1UI.A00 = r0;
                }
                DeviceEncryptionKeyProviderImpl deviceEncryptionKeyProviderImpl = (DeviceEncryptionKeyProviderImpl) this.mDeviceEncryptionKeyProvider.get();
                synchronized (deviceEncryptionKeyProviderImpl) {
                    try {
                        if (DeviceEncryptionKeyProviderImpl.A02 == null) {
                            DeviceEncryptionKeyProviderImpl.A01 = new Object();
                            try {
                                ((LoggedInUserCrypto) deviceEncryptionKeyProviderImpl.A00.get()).A02(DeviceEncryptionKeyProviderImpl.A01);
                            } catch (2L5 | 2L6 e) {
                                0fH.A0r("com.facebook.messenger.msys.filemanager.implementations.DeviceEncryptionKeyProviderImpl", "Failed to config account key setter", e);
                            }
                            0fH.A0l("com.facebook.messenger.msys.filemanager.implementations.DeviceEncryptionKeyProviderImpl", "DeviceEncryptionKeyProviderImpl initialization success");
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                String str = ((1Fv) 1Bi.A03(66351)).A04().A02;
                synchronized (((DeviceEncryptionKeyProviderImpl) this.mDeviceEncryptionKeyProvider.get())) {
                    try {
                        byte[] bArr = DeviceEncryptionKeyProviderImpl.A02;
                        if (bArr != null) {
                            int length = bArr.length;
                            if (length != 0) {
                                copyOf = Arrays.copyOf(bArr, length);
                            }
                        }
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("com.facebook.messenger.msys.filemanager.implementations.DeviceEncryptionKeyProviderImpl");
                        PrintStream printStream = System.out;
                        boolean z = true;
                        if (bArr != null) {
                            z = false;
                        }
                        throw AnonymousClass001.A0T(AnonymousClass001.A0a(printStream.printf(" Error fetching DeviceEncryptionKey. mLoggedInUserDeviceEncryptionKey == null: %b", Boolean.valueOf(z)), A0k));
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
                1G2 A0D = C1f0.A07.A0D(str);
                if (copyOf == null) {
                    edit = fbSharedPreferences.edit();
                    edit.Cdj(A0D);
                } else {
                    edit = fbSharedPreferences.edit();
                    edit.CaL(A0D, HEX_ENCODING.A03(copyOf));
                }
                edit.commit();
                int i = 1;
                isFileEncryptionProviderInitialized.A00.set(true);
                sInitialized = true;
                0fH.A0l("FileEncryptionProviderImpl", "FileEncryptionProviderImpl initialization success.");
                boolean AZk = ((1CO) this.mMobileConfig.get()).AZk(36318587052372771L);
                shouldUseStreaming = AZk;
                if (!AZk) {
                    i = 0;
                }
                CURRENT_ENCRYPTION_VERSION = i;
            }
        }
    }
}
