package X;

import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: L71.class */
public abstract class L71 {
    public static final Pattern A00 = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    public static final Pattern A01 = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    public static String A00(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring("android-keystore://".length());
        }
        throw 1BK.A0f("key URI must start with %s", new Object[]{"android-keystore://"});
    }

    public static void A01(int i) {
        if (i != 16 && i != 32) {
            throw JQx.A11("invalid key size %d; only 128-bit and 256-bit AES keys are supported", AnonymousClass001.A1a(i * 8));
        }
    }
}
