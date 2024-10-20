package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function1;

/* loaded from: F9p.class */
public abstract class F9p {
    public static final F2S A02 = new Object();
    public static final C01i A03 = C01g.A01(GA0.A00);
    public final String A00;
    public final KeyPair A01;

    public F9p(String str, Function1 function1, int i, boolean z) {
        KeyPair keyPair;
        11T.A0F(str, 1);
        this.A00 = str;
        synchronized (A02) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            11T.A0A(keyPairGenerator);
            if (z && F2S.A00().containsAlias(str)) {
                F2S.A00().deleteEntry(str);
            }
            if (!F2S.A00().containsAlias(str)) {
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, i);
                function1.invoke(builder);
                builder.setKeySize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                KeyGenParameterSpec build = builder.build();
                11T.A0A(build);
                keyPairGenerator.initialize(build);
                11T.A0A(keyPairGenerator.generateKeyPair());
            }
            KeyStore A00 = F2S.A00();
            PublicKey publicKey = A00.getCertificate(str).getPublicKey();
            KeyStore.Entry entry = A00.getEntry(str, null);
            11T.A0I(entry, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
            keyPair = new KeyPair(publicKey, ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
        }
        this.A01 = keyPair;
    }

    public final String A00() {
        byte[] encoded = this.A01.getPublic().getEncoded();
        11T.A0A(encoded);
        return DKC.A1B(encoded, 11);
    }

    public final String A01(String str) {
        PrivateKey privateKey = this.A01.getPrivate();
        11T.A0A(privateKey);
        List A0L = 0CU.A0L(str, new char[]{'.'}, 0);
        if (A0L.size() != 5) {
            throw new SecurityException("JWE format is invalid");
        }
        String A14 = 1BK.A14(A0L, 0);
        String A142 = 1BK.A14(A0L, 1);
        String A143 = 1BK.A14(A0L, 2);
        String A144 = 1BK.A14(A0L, 3);
        String A145 = 1BK.A14(A0L, 4);
        byte[] decode = Base64.decode(A142, 8);
        11T.A0A(decode);
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
        11T.A0A(cipher);
        cipher.init(2, privateKey, new OAEPParameterSpec("SHA-1", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT));
        byte[] doFinal = cipher.doFinal(decode);
        11T.A0A(doFinal);
        byte[] decode2 = Base64.decode(A144, 8);
        11T.A0A(decode2);
        byte[] A1a = DKC.A1a(A14, C03r.A01);
        byte[] decode3 = Base64.decode(A143, 8);
        11T.A0A(decode3);
        byte[] decode4 = Base64.decode(A145, 8);
        11T.A0A(decode4);
        if (decode4.length * 8 != 128) {
            throw new SecurityException("Tag size is invalid");
        }
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        cipher2.init(2, new SecretKeySpec(doFinal, "AES"), new GCMParameterSpec(128, decode3));
        cipher2.updateAAD(A1a);
        cipher2.update(decode2);
        byte[] doFinal2 = cipher2.doFinal(decode4);
        11T.A0A(doFinal2);
        return new String(doFinal2, C03r.A05);
    }

    public final String A02(byte[] bArr) {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(this.A01.getPrivate());
        signature.update(bArr);
        byte[] sign = signature.sign();
        11T.A0A(sign);
        return DKC.A1B(sign, 11);
    }
}
