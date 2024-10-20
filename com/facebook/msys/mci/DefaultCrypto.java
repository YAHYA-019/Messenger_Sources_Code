package com.facebook.msys.mci;

import X.0Pz;
import X.0RZ;
import X.0fH;
import X.1BK;
import X.7kF;
import X.AnonymousClass001;
import X.C0A2;
import X.C0B9;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: DefaultCrypto.class */
public class DefaultCrypto implements Crypto {
    public static final Crypto A00 = new Object();

    @Override // com.facebook.msys.mci.Crypto
    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return sb.toString().getBytes();
                }
                sb.append(String.format("%02x", Byte.valueOf(digest[i2])));
                i = i2 + 1;
            }
        } catch (NoSuchAlgorithmException e) {
            throw 1BK.A0s("MD5 algorithm was not found. Should not happen", e);
        }
    }

    @Override // com.facebook.msys.mci.Crypto
    public byte[] computeMd5V2(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return C0B9.A00(messageDigest.digest(), false).toLowerCase(Locale.US).getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw 1BK.A0s("MD5 algorithm was not found. Should not happen", e);
        }
    }

    @Override // com.facebook.msys.mci.Crypto
    public String computeSHA256(String str, String str2) {
        RuntimeException A0s;
        IllegalArgumentException A05;
        try {
            try {
                Uri A03 = C0A2.A03(str);
                String scheme = A03.getScheme();
                if (TextUtils.isEmpty(scheme)) {
                    A05 = 0Pz.A05("Invalid fileUrlString: ", str);
                } else if (scheme.equalsIgnoreCase("file")) {
                    String path = A03.getPath();
                    if (TextUtils.isEmpty(path)) {
                        A05 = 0Pz.A05("Invalid input file Url: ", str);
                    } else {
                        File file = new File(path);
                        if (file.exists()) {
                            String path2 = file.getPath();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                FileInputStream fileInputStream = new FileInputStream(path2);
                                                try {
                                                    File file2 = new File(path2);
                                                    byte[] bArr = new byte[8192];
                                                    long length = file2.length();
                                                    Mac mac = Mac.getInstance("HmacSHA256");
                                                    mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
                                                    long j = length;
                                                    long j2 = 0;
                                                    boolean z = true;
                                                    while (j > 0) {
                                                        int read = fileInputStream.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        for (int i = 0; z && i < 8192; i++) {
                                                            z = false;
                                                            if (bArr[i] == 0) {
                                                                z = true;
                                                            }
                                                        }
                                                        int min = Math.min((int) j, read);
                                                        mac.update(bArr, 0, min);
                                                        j2 += read;
                                                        j -= min;
                                                    }
                                                    if (z || j2 != length || j != 0) {
                                                        0fH.A0T(DefaultCrypto.class, "Read bytes failed.TotalBytesRead: %d, FileSize: %d", new Object[]{Long.valueOf(j2), Long.valueOf(length)});
                                                        throw AnonymousClass001.A0T("Unable to read all bytes from file");
                                                    }
                                                    String lowerCase = C0B9.A00(mac.doFinal(), false).toLowerCase(Locale.US);
                                                    fileInputStream.close();
                                                    return lowerCase;
                                                } catch (Throwable th) {
                                                    try {
                                                        fileInputStream.close();
                                                    } catch (Throwable th2) {
                                                        7kF.A00(th, th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (IllegalArgumentException e) {
                                                A0s = 1BK.A0s("Invalid arguments", e);
                                                throw A0s;
                                            } catch (Exception e2) {
                                                A0s = 1BK.A0s("Unexpected exception", e2);
                                                throw A0s;
                                            }
                                        } catch (UnsupportedEncodingException e3) {
                                            A0s = 1BK.A0s("UTF_8 encoding is not supported.", e3);
                                            throw A0s;
                                        } catch (IllegalStateException e4) {
                                            A0s = 1BK.A0s("Couldn't update the hash.", e4);
                                            throw A0s;
                                        }
                                    } catch (IOException e5) {
                                        A0s = 1BK.A0s("Couldn't read the content.", e5);
                                        throw A0s;
                                    }
                                } catch (InvalidKeyException e6) {
                                    A0s = 1BK.A0s("Invalid secret key.", e6);
                                    throw A0s;
                                }
                            } catch (NoSuchAlgorithmException e7) {
                                A0s = 1BK.A0s("HMAC SHA256 algorithm is not found.", e7);
                                throw A0s;
                            }
                        }
                        new FileNotFoundException(0Pz.A0W("File does not exist. Url: ", str));
                    }
                } else {
                    A05 = 0Pz.A05("Url MUST be of 'file:' scheme. Found: ", scheme);
                }
                throw A05;
            } catch (FileNotFoundException | IllegalArgumentException | SecurityException e8) {
                A0s = 1BK.A0s("Exception while parsing fileUrl", e8);
            }
        } catch (RuntimeException e9) {
            0fH.A0H(DefaultCrypto.class, "computeSHA256 with fileUrl: exception occurred", e9);
            return null;
        }
    }

    @Override // com.facebook.msys.mci.Crypto
    public String computeSHA256(byte[] bArr, String str) {
        0RZ.A03(bArr, "file bytes can not be null");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA256"));
            return C0B9.A00(mac.doFinal(bArr), false).toLowerCase(Locale.US);
        } catch (UnsupportedEncodingException e) {
            throw 1BK.A0s("UTF_8 encoding is not supported.", e);
        } catch (InvalidKeyException e2) {
            throw 1BK.A0s("Invalid secret key.", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw 1BK.A0s("HMAC SHA256 algorithm is not found.", e3);
        }
    }
}
