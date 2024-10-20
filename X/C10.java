package X;

import android.icu.text.DisplayContext;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.ULocale;
import android.text.format.DateUtils;

/* loaded from: C10.class */
public final class C10 {
    public final 1Br A00 = 7zM.A0d();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.CharSequence] */
    public final CharSequence A00(1Iw r302, long j) {
        double d;
        RelativeDateTimeFormatter.Direction direction;
        RelativeDateTimeFormatter.RelativeUnit relativeUnit;
        String format;
        11T.A0F(r302, 0);
        C00i c00i = this.A00.A00;
        long A05 = 4YV.A05(c00i) - j;
        if (A05 < 1000) {
            return r302.A0D(2131963499);
        }
        if (A05 <= 604800000) {
            format = DateUtils.getRelativeTimeSpanString(j, 4YV.A05(c00i), 0L, 1);
        } else {
            RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(ULocale.forLocale(4YU.A0B(r302.A0D.getApplicationContext()).locale), null, RelativeDateTimeFormatter.Style.LONG, DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
            if (A05 < 2419200000L) {
                d = A05 / 604800000;
                direction = RelativeDateTimeFormatter.Direction.LAST;
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.WEEKS;
            } else if (A05 < 31449600000L) {
                d = A05 / 2419200000L;
                direction = RelativeDateTimeFormatter.Direction.LAST;
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
            } else {
                d = A05 / 31449600000L;
                direction = RelativeDateTimeFormatter.Direction.LAST;
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
            }
            format = relativeDateTimeFormatter.format(d, direction, relativeUnit);
        }
        11T.A0D(format);
        return format;
    }
}
