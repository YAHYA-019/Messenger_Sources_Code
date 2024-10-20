package X;

import android.content.Context;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.2sT, reason: invalid class name */
/* loaded from: 2sT.class */
public final class C2sT {
    public 2sU A00;

    public static SimpleDateFormat A00(2sU r301) {
        Object clone = r301.A00().clone();
        11T.A0I(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return (SimpleDateFormat) clone;
    }

    public final DateFormat A01() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A03;
        DateFormat dateFormat = (DateFormat) threadLocal.get();
        if (dateFormat == null) {
            Context context = r0.A00;
            if (context != null) {
                String str = android.text.format.DateFormat.is24HourFormat(context) ? "Hm" : "hm";
                Locale locale = r0.A0F;
                dateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str), locale);
            } else {
                dateFormat = DateFormat.getTimeInstance(3, r0.A0F);
            }
            threadLocal.set(dateFormat);
        }
        11T.A0D(dateFormat);
        return dateFormat;
    }

    public final SimpleDateFormat A02() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A01;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = A00(r0);
            2sX.A00("MMMMd, yyyy", simpleDateFormat, r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A03() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A02;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = A00(r0);
            2sX.A00("MMMM yyyy", simpleDateFormat, r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A04() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A04;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("EEEE", r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A05() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A05;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            Object clone = r0.A00().clone();
            11T.A0I(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
            simpleDateFormat = (SimpleDateFormat) clone;
            2sX.A00("MMMd", simpleDateFormat, r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A06() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A07;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            Object clone = r0.A00().clone();
            11T.A0I(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
            simpleDateFormat = (SimpleDateFormat) clone;
            2sX.A00("MMMd, yyyy", simpleDateFormat, r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A07() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A09;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = A00(r0);
            2sX.A00("MMM yyyy", simpleDateFormat, r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A08() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A0A;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("EE", r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A09() {
        2sU r0 = this.A00;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) r0.A0B.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = A00(r0);
            2sX.A00("EE, MMM d", simpleDateFormat, r0.A0F);
            r0.A0D.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A0A() {
        2sU r0 = this.A00;
        ThreadLocal threadLocal = r0.A0D;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            Object clone = r0.A00().clone();
            11T.A0I(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
            simpleDateFormat = (SimpleDateFormat) clone;
            2sX.A00("EEEE, MMMM d", simpleDateFormat, r0.A0F);
            threadLocal.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }
}
