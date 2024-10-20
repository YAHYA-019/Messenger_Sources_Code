package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;

/* renamed from: X.3on, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3on.class */
public abstract class AbstractC00793on {
    public static CharSequence A00(Context context, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && charSequence.charAt(0) == '@') {
            try {
                return context.getText(Integer.parseInt(charSequence.toString().substring(1)));
            } catch (Exception e) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Error getting text for resourceId '");
                A0k.append((Object) charSequence);
                0fH.A0w("ResourceUtils", AnonymousClass001.A0d("'.", A0k), e);
            }
        }
        return charSequence;
    }

    public static String A01(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        return resourceId != 0 ? context.getString(resourceId) : typedArray.getNonResourceString(i);
    }
}
