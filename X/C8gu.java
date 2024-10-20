package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8gu, reason: invalid class name */
/* loaded from: 8gu.class */
public final class C8gu extends 1LH {
    public final 1Br A00 = 1Bu.A00(67680);
    public final 8Kv A01;
    public final Context A02;
    public final MigColorScheme A03;
    public final 2KD A04;
    public final C5fv A05;
    public final CharSequence A06;

    public C8gu(Context context, MigColorScheme migColorScheme, 2KD r304, C5fv c5fv, 8Kv r306, CharSequence charSequence) {
        this.A04 = r304;
        this.A06 = charSequence;
        this.A02 = context;
        this.A03 = migColorScheme;
        this.A01 = r306;
        this.A05 = c5fv;
    }

    private final SpannableStringBuilder A01(C2k6 c2k6, String str, C00m c00m, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        EC2 A01 = ((CFx) 1Br.A0B(this.A00)).A01(7zP.A0L(c2k6), 83S.A00(c00m, 44), this.A03);
        int i = 0;
        if (z) {
            i = 2;
        }
        spannableStringBuilder.setSpan(A01, i, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public 1LI A0s(C2k5 c2k5) {
        2KD r304;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder A01;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, AO0.A00);
        C00m A002 = 4FN.A00(c2k5, new AQm(A00, 13));
        C5fv c5fv = this.A05;
        if (c5fv != null) {
            8Kv r0 = this.A01;
            if (r0.A00.BRy(c5fv)) {
                CharSequence charSequence = this.A06;
                11T.A0F(charSequence, 0);
                if (4YU.A19(charSequence, "\n", 0).size() > 5 && !7zP.A1V(A00)) {
                    if (r0.A03) {
                        this.A04.A01.A0J = A01(c2k5, 3yH.A09(c2k5, 2131960358), A002, true);
                    }
                    r304 = this.A04;
                    r304.A2q(5);
                    String A09 = 3yH.A09(c2k5, 2131960358);
                    spannableStringBuilder = new SpannableStringBuilder(4YV.A0t("\n", 0QD.A0Y(0CU.A0M(charSequence, new String[]{"\n"}, 0), 4), (Function1) null));
                    A01 = A01(c2k5, A09, A002, true);
                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) A01);
                    11T.A0D(append);
                    r304.A2z(append);
                    return r304.A2W();
                }
            }
        }
        r304 = this.A04;
        CharSequence charSequence2 = this.A06;
        String A0K = 0Pz.A0K(3yH.A09(c2k5, 2131960357), '\n');
        spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        A01 = A01(c2k5, A0K, A002, false);
        SpannableStringBuilder append2 = spannableStringBuilder.append((CharSequence) A01);
        11T.A0D(append2);
        r304.A2z(append2);
        return r304.A2W();
    }
}
