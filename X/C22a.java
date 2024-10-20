package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.ui.emoji.model.Emoji;
import java.util.List;

/* renamed from: X.22a, reason: invalid class name */
/* loaded from: 22a.class */
public interface C22a {
    public static final String A01 = new String(Character.toChars(128077));
    public static final String A00 = new String(Character.toChars(983040));

    boolean A5r(Spannable spannable, int i, int i2);

    boolean A7N(Spannable spannable, int i);

    boolean A7O(Spannable spannable, int i);

    boolean A7P(Spannable spannable, int i, int i2, int i3, boolean z);

    List A8z(List list, int i);

    List AJg();

    List AJh(int i);

    C6ka AjP(Emoji emoji, int i);

    C6ka AjQ(String str, int i);

    Drawable AjR(Context context, String str, int i);

    List AjT(Emoji emoji);

    List AjV(String str);

    Drawable Ayt(Context context, C6qa c6qa, String str);

    int BBB(Emoji emoji, int i);

    boolean BNY(Emoji emoji);

    boolean BWc(CharSequence charSequence, int i);

    boolean BXB(String str);

    CharSequence BdE(CharSequence charSequence, float f);

    CharSequence BdF(int i, CharSequence charSequence);
}
