package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8gl, reason: invalid class name */
/* loaded from: 8gl.class */
public final class C8gl extends 1LH {
    public final 5gC A00;
    public final C70p A01;
    public final 8Kv A02;
    public final CharSequence A03;
    public final C5j5 A04;
    public final 7Gq A05;

    public C8gl(C5j5 c5j5, 5gC r303, 7Gq r304, C70p c70p, 8Kv r306, CharSequence charSequence) {
        this.A05 = r304;
        this.A03 = charSequence;
        this.A00 = r303;
        this.A01 = c70p;
        this.A04 = c5j5;
        this.A02 = r306;
    }

    public static final SpannableString A01(String str, C00m c00m) {
        SpannableString valueOf = SpannableString.valueOf(str);
        Iterator it = C0s8.A11(new StyleSpan(1), new 8Br(c00m, 14)).iterator();
        while (it.hasNext()) {
            valueOf.setSpan(it.next(), 2, valueOf.length(), 33);
        }
        return valueOf;
    }

    public 1LI A0s(C2k5 c2k5) {
        7Gq r313;
        Spanned valueOf;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, APx.A00);
        5gC r0 = this.A00;
        CharSequence charSequence = (Spannable) AQU.A00(c2k5, this, new Object[]{r0.A03, this.A03}, 13);
        C00m A002 = 4FN.A00(c2k5, new AQs(A00, this, 14));
        if (r0.AxW(5mF.A00) == null) {
            charSequence = 7zS.A12(this.A04, charSequence);
        }
        CharSequence charSequence2 = charSequence;
        8Kv r02 = this.A02;
        if (r02.A00.BRy(r0)) {
            11T.A0F(charSequence2, 0);
            if (4YU.A19(charSequence2, "\n", 0).size() > 5 && !7zP.A1V(A00)) {
                if (r02.A03) {
                    this.A05.A01.A0E = A01(3yH.A09(c2k5, 2131956257), A002);
                }
                r313 = this.A05;
                r313.A01.A00 = 5;
                SpannableStringBuilder append = new SpannableStringBuilder(4YV.A0t("\n", 0QD.A0Y(0CU.A0M(charSequence2, new String[]{"\n"}, 0), 4), (Function1) null)).append((CharSequence) A01(3yH.A09(c2k5, 2131956257), A002));
                11T.A0D(append);
                r313.A01.A0F = append;
                r313.A0J();
                7Gp r03 = r313.A01;
                11T.A0A(r03);
                return r03;
            }
        }
        r313 = this.A05;
        11T.A0F(charSequence2, 0);
        if (4YU.A19(charSequence2, "\n", 0).size() > 5) {
            valueOf = new SpannableStringBuilder(charSequence2).append((CharSequence) A01(0Pz.A0K(3yH.A09(c2k5, 2131956256), '\n'), A002));
            11T.A0D(valueOf);
        } else {
            valueOf = SpannableString.valueOf(charSequence2);
        }
        7Gp r04 = r313.A01;
        r04.A0F = valueOf;
        r04.A00 = (-1) >>> 1;
        r313.A0J();
        7Gp r032 = r313.A01;
        11T.A0A(r032);
        return r032;
    }
}
