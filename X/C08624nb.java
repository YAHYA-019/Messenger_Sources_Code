package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4nb.class */
public final class C08624nb {
    public final 2UZ A00 = (2UZ) 1Bi.A03(17034);
    public final C08634nc A01 = (C08634nc) 1Bn.A0A(49261);

    public static Uri A00(ImmutableList.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            builder.m11011add((Object) str2);
            return null;
        }
        try {
            return C0A2.A03(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
