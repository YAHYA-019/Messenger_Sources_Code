package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: I1b.class */
public final class I1b {
    public final I52 A00 = (I52) 1Bn.A0A(116250);

    public static void A00(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, boolean z) {
        spannableStringBuilder.append((CharSequence) str);
        if (!z) {
            spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.length() - 7zQ.A05(str), spannableStringBuilder.length(), 33);
        }
        CharSequence charSequence = "\n";
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) str2);
        if (i != 1) {
            if (z) {
                charSequence = "\n\n";
            } else {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= i2) {
                        return;
                    }
                    spannableStringBuilder.append(charSequence);
                    i3 = i4 + 1;
                }
            }
        }
        spannableStringBuilder.append(charSequence);
    }

    public SpannableStringBuilder A01(Resources resources, String str, String[] strArr, int i, boolean z) {
        I52 i52 = this.A00;
        HashSet A04 = i52.A04(strArr);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int size = A04.size();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            String A0u = 4YU.A0u(resources, str, i52.A03(A0i));
            int i2 = 0;
            switch (A0i.hashCode()) {
                case -1639857183:
                    if (!A0i.equals("android.permission-group.CONTACTS")) {
                        break;
                    } else {
                        i2 = 2131965373;
                        break;
                    }
                case -1410061184:
                    if (!A0i.equals("android.permission-group.PHONE")) {
                        break;
                    } else {
                        i2 = 2131965401;
                        break;
                    }
                case -1250730292:
                    if (!A0i.equals("android.permission-group.CALENDAR")) {
                        break;
                    } else {
                        i2 = 2131965366;
                        break;
                    }
                case -1140935117:
                    if (!A0i.equals("android.permission-group.CAMERA")) {
                        break;
                    } else {
                        i2 = 2131965368;
                        break;
                    }
                case -746978218:
                    if (!A0i.equals("android.permission-group.READ_MEDIA_VISUAL")) {
                        break;
                    } else {
                        i2 = 2131965370;
                        break;
                    }
                case -43134093:
                    if (!A0i.equals("android.permission-group.READ_MEDIA_AURAL")) {
                        break;
                    } else {
                        i2 = 2131965398;
                        break;
                    }
                case 421761675:
                    if (!A0i.equals("android.permission-group.SENSORS")) {
                        break;
                    } else {
                        i2 = 2131965403;
                        break;
                    }
                case 828638019:
                    if (!A0i.equals("android.permission-group.LOCATION")) {
                        break;
                    } else {
                        i2 = 2131965392;
                        break;
                    }
                case 852078861:
                    if (!A0i.equals("android.permission-group.STORAGE")) {
                        break;
                    } else {
                        i2 = 2131965407;
                        break;
                    }
                case 1581272376:
                    if (!A0i.equals("android.permission-group.MICROPHONE")) {
                        break;
                    } else {
                        i2 = 2131965395;
                        break;
                    }
                case 1795181803:
                    if (!A0i.equals("android.permission-group.SMS")) {
                        break;
                    } else {
                        i2 = 2131965405;
                        break;
                    }
            }
            A00(spannableStringBuilder, A0u, 4YU.A0u(resources, str, i2), size, i, z);
            size--;
        }
        return spannableStringBuilder;
    }
}
