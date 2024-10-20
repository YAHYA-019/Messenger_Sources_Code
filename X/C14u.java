package X;

import android.text.TextUtils;
import java.nio.CharBuffer;

/* renamed from: X.14u, reason: invalid class name */
/* loaded from: 14u.class */
public final class C14u {
    public final String A00;
    public final String A01;
    public final String A02;

    public C14u(String str, String str2) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = null;
    }

    public C14u(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public static void A00(CharBuffer charBuffer) {
        int limit = charBuffer.limit() - charBuffer.position();
        if (limit >= 4 || limit <= 0) {
            throw AnonymousClass001.A0L("IPV4 octet must contain between 1 and 3 digits");
        }
        try {
            int parseInt = Integer.parseInt(charBuffer.toString(), 10);
            if (parseInt < 0 || parseInt > 255) {
                throw 0Pz.A04("IPV4 octet value must be between 0 and 255, got ", parseInt);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AnonymousClass001.A0Z(charBuffer, "Unable to parse decimal octet ", AnonymousClass001.A0k()), e);
        }
    }

    public String A01() {
        StringBuilder A0k = AnonymousClass001.A0k();
        if (!TextUtils.isEmpty(this.A02)) {
            A0k.append("<REDACTED>");
            A0k.append("@");
        }
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            A0k.append(str);
        }
        String str2 = this.A01;
        if (!TextUtils.isEmpty(str2)) {
            A0k.append(":");
            A0k.append(str2);
        }
        return A0k.toString();
    }

    public String toString() {
        return A01();
    }
}
