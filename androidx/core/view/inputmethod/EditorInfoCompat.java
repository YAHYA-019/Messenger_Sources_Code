package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: EditorInfoCompat.class */
public final class EditorInfoCompat {
    public static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    public static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    public static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    public static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    public static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    public static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    public static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
    public static final String STYLUS_HANDWRITING_ENABLED_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* loaded from: EditorInfoCompat$Api30Impl.class */
    public class Api30Impl {
        public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    public static String[] getContentMimeTypes(EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        if (strArr == null) {
            strArr = EMPTY_STRING_ARRAY;
        }
        return strArr;
    }

    public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialSelectedText(editorInfo, i);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return null;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        int i4 = bundle.getInt(CONTENT_SELECTION_HEAD_KEY);
        int i5 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int i6 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i5 - i4 != i6 || (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        return (i & 1) != 0 ? charSequence.subSequence(i4, i5) : TextUtils.substring(charSequence, i4, i5);
    }

    public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextAfterCursor(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int min = Math.min(i, charSequence.length() - i3) + i3;
        return (i2 & 1) != 0 ? charSequence.subSequence(i3, min) : TextUtils.substring(charSequence, i3, min);
    }

    public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextBeforeCursor(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int min = i3 - Math.min(i, i3);
        return (i2 & 1) != 0 ? charSequence.subSequence(min, i3) : TextUtils.substring(charSequence, min, i3);
    }

    public static int getProtocol(EditorInfo editorInfo) {
        return 1;
    }

    public static boolean isCutOnSurrogate(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r0 == 18) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isPasswordInputType(int r301) {
        /*
            r0 = r301
            r1 = 4095(0xfff, float:5.738E-42)
            r0 = r0 & r1
            r301 = r0
            r0 = 129(0x81, float:1.81E-43)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L22
            r0 = 225(0xe1, float:3.15E-43)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L22
            r0 = 18
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L24
        L22:
            r0 = 1
            r302 = r0
        L24:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.inputmethod.EditorInfoCompat.isPasswordInputType(int):boolean");
    }

    public static boolean isStylusHandwritingEnabled(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(STYLUS_HANDWRITING_ENABLED_KEY);
    }

    public static void setContentMimeTypes(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i) {
        charSequence.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = i2 - i;
        if (i2 > i3) {
            i3 = i2;
        }
        int i5 = i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length || isPasswordInputType(editorInfo.inputType)) {
            setSurroundingText(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            setSurroundingText(editorInfo, charSequence, i4, i5);
        } else {
            trimLongSurroundingText(editorInfo, charSequence, i4, i5);
        }
    }

    public static void setInitialSurroundingText(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setStylusHandwritingEnabled(EditorInfo editorInfo, boolean z) {
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            bundle = new Bundle();
            editorInfo.extras = bundle;
        }
        bundle.putBoolean(STYLUS_HANDWRITING_ENABLED_KEY, z);
    }

    public static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, i);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, i2);
    }

    public static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3;
        if (i3 > 1024) {
            i4 = 0;
        }
        int length = charSequence.length() - i2;
        int i5 = MEMORY_EFFICIENT_TEXT_LENGTH - i4;
        int min = Math.min(length, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i6))) {
            i6++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + min) - 1))) {
            min--;
        }
        int i7 = min2 + i4;
        setSurroundingText(editorInfo, i4 != i3 ? TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)) : charSequence.subSequence(i6, i7 + min + i6), min2, i7);
    }
}
