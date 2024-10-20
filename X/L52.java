package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: L52.class */
public final class L52 {
    public final StringBuilder A00 = AnonymousClass001.A0k();

    public static void A00(L52 l52, String str) {
        l52.A05(str);
        l52.A02();
        l52.A03();
        l52.A01();
    }

    private final void A01() {
        JR0.A1I(this.A00, "HttpOnly");
    }

    public final void A02() {
        StringBuilder sb = this.A00;
        JR0.A1J(sb, "Path");
        JR0.A1I(sb, "/");
    }

    public final void A03() {
        JR0.A1I(this.A00, "Secure");
    }

    public final void A04(long j) {
        StringBuilder sb = this.A00;
        JR0.A1J(sb, "Expires");
        Date date = new Date(j * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(1BJ.A00(256), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(date);
        11T.A0A(format);
        JR0.A1I(sb, format);
    }

    public final void A05(String str) {
        StringBuilder sb = this.A00;
        JR0.A1J(sb, "Domain");
        JR0.A1I(sb, str);
    }
}
