package X;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.16l, reason: invalid class name */
/* loaded from: 16l.class */
public abstract class C16l {
    public static final Set A01 = Collections.unmodifiableSet(AnonymousClass001.A0w(new String[]{"fb-messenger-secure", "fb-messenger-sametask", "fb-messenger-lite-secure", "fb-workchat-secure", "fb-workchat-sametask", "flash-secure", "fbinternal", "fb-biz-internal"}));
    public static final Set A03 = Collections.unmodifiableSet(AnonymousClass001.A0w(new String[]{"intent", "content", "file"}));
    public static final Set A00 = Collections.unmodifiableSet(AnonymousClass001.A0w(new String[]{"http", "https"}));
    public static final Set A02 = Collections.unmodifiableSet(AnonymousClass001.A0w(new String[]{"sms", "tel"}));

    public static boolean A00(String str) {
        boolean z = false;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (A01.contains(lowerCase) || A03.contains(lowerCase)) {
                z = true;
            }
        }
        return z;
    }
}
