package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.8X3, reason: invalid class name */
/* loaded from: 8X3.class */
public final class C8X3 extends 1LH {
    public final HighlightsFeedContent A00;
    public final 5zD A01;
    public final MigColorScheme A02;

    public C8X3(5zD r302, HighlightsFeedContent highlightsFeedContent, MigColorScheme migColorScheme) {
        7zR.A1O(migColorScheme, r302);
        this.A00 = highlightsFeedContent;
        this.A02 = migColorScheme;
        this.A01 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        StringBuilder A0k;
        Object obj;
        int i;
        9nH r0 = 9nH.A01;
        HighlightsFeedContent highlightsFeedContent = this.A00;
        if (!r0.A07(highlightsFeedContent)) {
            return null;
        }
        String str = highlightsFeedContent.A0Q;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String str2 = highlightsFeedContent.A0R;
        int i2 = 0;
        if (str2 != null && !0CU.A0O(str2)) {
            List A19 = 4YU.A19(str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
            int A00 = 07G.A00(0, AnonymousClass001.A04(A19), 2);
            if (A00 >= 0) {
                while (true) {
                    Integer A0c = 0CW.A0c(1BK.A14(A19, i2));
                    if (A0c != null) {
                        int intValue = A0c.intValue();
                        if (intValue < 0 || intValue >= spannableStringBuilder.length()) {
                            A0k = AnonymousClass001.A0k();
                            A0k.append("Invalid start index: ");
                            obj = A19.get(i2);
                        } else {
                            int i3 = i2 + 1;
                            if (i3 < A19.size()) {
                                Integer A0c2 = 0CW.A0c(1BK.A14(A19, i3));
                                if (A0c2 != null) {
                                    i = Math.min(A0c2.intValue(), spannableStringBuilder.length());
                                }
                            } else {
                                i = intValue + 1;
                            }
                            if (i <= intValue) {
                                A0k = AnonymousClass001.A0k();
                                A0k.append("Invalid end index: ");
                                obj = 0QD.A0J(A19, i3);
                            } else {
                                spannableStringBuilder.setSpan(new StyleSpan(1), intValue, i, 33);
                            }
                        }
                        0fH.A0l("HighlightsContextLineComponent", AnonymousClass001.A0d((String) obj, A0k));
                    }
                    if (i2 == A00) {
                        break;
                    }
                    i2 += 2;
                }
            }
        }
        int i4 = highlightsFeedContent.A05;
        return new C8gr(this.A01, this.A02, spannableStringBuilder, (i4 == C5by.A03.value || i4 == C5by.A06.value) ? 2yD.A00(C1ub.A00(), 36603111472109596L) : 7, 7zP.A0A(), AnonymousClass001.A1Q(i4, C5by.A07.value), false);
    }
}
