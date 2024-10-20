package com.facebook.messaging.attribution;

import X.0Q8;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1G2;
import X.1GU;
import X.1NK;
import X.1Ql;
import X.4YT;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.JR0;
import android.util.Base64;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Platform;
import com.google.common.base.Throwables;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: ReplyTokenHelper.class */
public final class ReplyTokenHelper {
    public volatile SecretKey A04;
    public volatile IvParameterSpec A05;
    public final C00i A00 = AbH.A0K();
    public final C00i A03 = AbH.A0a();
    public final C00i A01 = AbH.A0S();
    public final SecureRandom A02 = (SecureRandom) 1Bn.A0A(116394);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v27, types: [javax.crypto.spec.IvParameterSpec, java.security.spec.AlgorithmParameterSpec] */
    /* JADX WARN: Type inference failed for: r0v7, types: [javax.crypto.Cipher] */
    public static Cipher A00(ReplyTokenHelper replyTokenHelper, int i) {
        SecretKey generateKey;
        byte[] decode;
        ?? r0 = 86;
        try {
            ?? cipher = Cipher.getInstance(4YT.A00(86));
            int blockSize = cipher.getBlockSize();
            C00i c00i = replyTokenHelper.A00;
            ((1GU) c00i.get()).AAs();
            if (replyTokenHelper.A05 == null) {
                C00i c00i2 = replyTokenHelper.A01;
                FbSharedPreferences A0R = 1BK.A0R(c00i2);
                1G2 r02 = 1NK.A3R;
                String A3a = A0R.A3a(r02, "");
                if (Platform.stringIsNullOrEmpty(A3a)) {
                    decode = new byte[blockSize];
                    replyTokenHelper.A02.nextBytes(decode);
                    1Ql A0V = 1BL.A0V(c00i2);
                    A0V.CaL(r02, Base64.encodeToString(decode, 0));
                    A0V.commit();
                } else {
                    decode = Base64.decode(A3a, 0);
                }
                replyTokenHelper.A05 = new IvParameterSpec(decode);
            }
            ((1GU) c00i.get()).AAs();
            if (replyTokenHelper.A04 == null) {
                C00i c00i3 = replyTokenHelper.A01;
                FbSharedPreferences A0R2 = 1BK.A0R(c00i3);
                1G2 r03 = 1NK.A3Q;
                String A3a2 = A0R2.A3a(r03, "");
                if (Platform.stringIsNullOrEmpty(A3a2)) {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                    keyGenerator.init(256, replyTokenHelper.A02);
                    generateKey = keyGenerator.generateKey();
                    String encodeToString = Base64.encodeToString(generateKey.getEncoded(), 0);
                    1Ql A0V2 = 1BL.A0V(c00i3);
                    A0V2.CaL(r03, encodeToString);
                    A0V2.commit();
                } else {
                    byte[] decode2 = Base64.decode(A3a2, 0);
                    generateKey = new SecretKeySpec(decode2, 0, decode2.length, "AES");
                }
                replyTokenHelper.A04 = generateKey;
            }
            SecretKey secretKey = replyTokenHelper.A04;
            r0 = replyTokenHelper.A05;
            cipher.init(i, secretKey, r0);
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            Throwables.propagate(r0);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.String] */
    public String A01(ThreadKey threadKey, String str, String str2) {
        str.getClass();
        str2.getClass();
        Cipher A00 = A00(this, 1);
        StringBuilder A0t = JR0.A0t(threadKey);
        A0t.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        AnonymousClass001.A1D(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2, A0t);
        A0t.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A0t.append(1BL.A08(this.A03));
        String A0e = AnonymousClass001.A0e(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0t, 1);
        ?? r0 = "UTF-8";
        try {
            r0 = Base64.encodeToString(A00.doFinal(A0e.getBytes(Charset.forName("UTF-8"))), 0);
            return r0;
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            Throwables.propagate(r0);
            throw 0Q8.createAndThrow();
        }
    }
}
