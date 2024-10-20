package X;

import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;

/* loaded from: F73.class */
public final class F73 {
    public static Eji A00(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return new Eji(0, charSequence.length());
        }
        Spanned spanned = (Spanned) charSequence;
        int selectionStart = Selection.getSelectionStart(spanned);
        if (selectionStart != Selection.getSelectionEnd(spanned)) {
            return null;
        }
        int length = charSequence.length();
        int i = 0;
        for (DOS dos : (DOS[]) spanned.getSpans(0, charSequence.length(), DOS.class)) {
            int spanStart = spanned.getSpanStart(dos);
            int spanEnd = spanned.getSpanEnd(dos);
            if (spanStart < selectionStart && spanEnd > selectionStart) {
                return null;
            }
            if (spanStart < selectionStart) {
                i = Math.max(i, spanEnd);
            } else if (spanEnd > selectionStart) {
                length = Math.min(length, spanStart);
            }
        }
        while (i < length && Character.isWhitespace(spanned.charAt(i))) {
            i++;
        }
        while (true) {
            int i2 = length - 1;
            if (i >= i2 || !Character.isWhitespace(spanned.charAt(i2))) {
                break;
            }
            length--;
        }
        return new Eji(i, length);
    }

    public CharSequence A01(CharSequence charSequence) {
        try {
            Eji A00 = A00(charSequence);
            return A00 != null ? charSequence.subSequence(A00.A01, A00.A00) : "";
        } catch (ArrayStoreException | IndexOutOfBoundsException e) {
            0fH.A0w("TokenPickerEditableUtil", "Failed to find plain test subsequence near insertion point.", e);
            return "";
        }
    }
}
