package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2qq, reason: invalid class name */
/* loaded from: 2qq.class */
public final class C2qq {
    public final Context A00;
    public final C15h A01;

    public C2qq(Context context, C15h c15h) {
        11T.A0F(c15h, 1);
        11T.A0F(context, 2);
        this.A01 = c15h;
        this.A00 = context;
    }

    public final String A00() {
        C15h c15h = this.A01;
        String language = ((Locale) c15h.get()).getLanguage();
        char c = ',';
        if (3IP.A02.contains(((Locale) c15h.get()).getLanguage())) {
            c = 12289;
        }
        if (3IP.A03.contains(language)) {
            String ch = Character.toString(c);
            11T.A0D(ch);
            return ch;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(' ');
        return sb.toString();
    }

    public final String A01(List list) {
        11T.A0F(list, 0);
        int size = list.size();
        if (size == 0) {
            throw new IllegalArgumentException();
        }
        if (size == 1) {
            return (String) list.get(0);
        }
        if (size == 2) {
            Resources resources = this.A00.getResources();
            11T.A0A(resources);
            String string = resources.getString(2131957746, list.get(0), list.get(1));
            11T.A0A(string);
            return string;
        }
        Object obj = list.get(0);
        Context context = this.A00;
        Resources resources2 = context.getResources();
        11T.A0A(resources2);
        String string2 = resources2.getString(2131957746);
        11T.A0A(string2);
        3eZ r0 = new 3eZ(list.size() * 5);
        Resources resources3 = context.getResources();
        11T.A0A(resources3);
        Formatter formatter = new Formatter((Appendable) r0, resources3.getConfiguration().locale);
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return obj.toString();
            }
            formatter.format(string2, obj, list.get(i2));
            List list2 = r0.A02;
            obj = new C3ea(list2, r0.A01, list2.size(), r0.A00);
            r0.A01 = list2.size();
            r0.A00 = 0;
            i = i2 + 1;
        }
    }

    public final String A02(List list) {
        11T.A0F(list, 0);
        int size = list.size();
        if (size == 0) {
            throw new IllegalArgumentException();
        }
        if (size == 1) {
            return (String) list.get(0);
        }
        Resources resources = this.A00.getResources();
        11T.A0A(resources);
        int i = size - 1;
        String string = resources.getString(2131957747, A01(list.subList(0, i)), list.get(i));
        11T.A0A(string);
        return string;
    }

    public final String A03(List list, int i) {
        if (i == 0) {
            return A02(list);
        }
        if (!1BK.A1Y(list)) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        Resources resources = this.A00.getResources();
        11T.A0A(resources);
        String quantityString = resources.getQuantityString(2131820619, i, AnonymousClass001.A1b(A01(list), i));
        11T.A0A(quantityString);
        return quantityString;
    }
}
