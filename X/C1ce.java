package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.1ce, reason: invalid class name */
/* loaded from: 1ce.class */
public final class C1ce extends 1Km implements C0mi, 1HN {
    public static final 1G2 A05;
    public static final 1G2 A06;
    public static final 1G2 A07 = 1G0.A05.A0D("qpl/overlay/filter");
    public final C1cg A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public volatile boolean A04 = false;

    static {
        1G2 r0 = 1G0.A04;
        A05 = r0.A0D("debugoverlay/QPL");
        A06 = r0.A0D("debugoverlay/show_failure_cancel_only");
    }

    public C1ce() {
        1BQ r0 = new 1BQ(33013);
        this.A01 = r0;
        1BV r02 = new 1BV(16735);
        this.A02 = r02;
        1BV r03 = new 1BV(99754);
        this.A03 = r03;
        this.A00 = (C1cg) (((2yD) 1Bi.A03(16385)).AZk(36317500425645363L) ? r03.get() : r02.get());
        ((FbSharedPreferences) r0.get()).CcT(new Runnable() { // from class: X.1cn
            public static final String __redex_internal_original_name = "QPLOverlay$1";

            @Override // java.lang.Runnable
            public void run() {
                C1ce.A02(C1ce.this, true);
            }
        });
        ((FbSharedPreferences) r0.get()).CcV(this, A05);
        ((FbSharedPreferences) r0.get()).CcV(this, A06);
        ((FbSharedPreferences) r0.get()).CcV(this, A07);
    }

    public static void A02(C1ce c1ce, boolean z) {
        C00i c00i = c1ce.A01;
        boolean AZn = ((FbSharedPreferences) c00i.get()).AZn(A05, false);
        if (!z || AZn) {
            boolean AZn2 = 1BK.A0R(c00i).AZn(A06, false);
            Pattern pattern = null;
            String BD0 = 1BK.A0R(c00i).BD0(A07);
            if (BD0 != null && !BD0.equals("")) {
                StringBuilder A0k = AnonymousClass001.A0k();
                String[] split = BD0.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                int i = 0;
                while (true) {
                    int i2 = i;
                    int length = split.length;
                    if (i2 >= length) {
                        break;
                    }
                    String trim = split[i2].trim();
                    if (!trim.isEmpty()) {
                        A0k.append(".*");
                        A0k.append(trim);
                        A0k.append(".*");
                        if (i2 < length - 1) {
                            A0k.append("|");
                        }
                    }
                    i = i2 + 1;
                }
                if (!A0k.toString().isEmpty()) {
                    try {
                        pattern = Pattern.compile(A0k.toString(), 2);
                    } catch (PatternSyntaxException e) {
                        0fH.A0r("QPLOverlay", "Failed to parse QPL filter pattern", e);
                    }
                }
            }
            if (AZn != c1ce.A04) {
                c1ce.A04 = AZn;
                c1ce.A00.CoT(AZn);
            }
            C1cg c1cg = c1ce.A00;
            c1cg.CqW(AZn2 ? 0S2.A01 : 0S2.A00);
            c1cg.CsN(pattern);
        }
    }

    @Override // X.C0mi
    public 02V Au5() {
        return null;
    }

    @Override // X.C0mi
    public C02S Au6() {
        return this.A04 ? C02S.A01 : C02S.A03;
    }

    @Override // X.C0mi
    public void C5Z(C03b c03b) {
        if (this.A04) {
            this.A00.C5a(c03b, c03b.At1(), c03b.At2());
        }
    }

    @Override // X.C0mi
    public void C5e(AnonymousClass045 anonymousClass045, C03b c03b, String str, int i, long j, long j2, boolean z) {
        if (this.A04) {
            this.A00.C5f(anonymousClass045, c03b, str, i, j, z);
        }
    }

    @Override // X.C0mi
    public void C5i(C03b c03b) {
        if (this.A04) {
            this.A00.C5i(c03b);
        }
    }

    @Override // X.C0mi
    public String getName() {
        return "qpl_overlay";
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        A02(this, false);
    }
}
