package X;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: HuU.class */
public abstract class HuU {
    public long A00;
    public String A01;
    public boolean A02;
    public final java.util.Map A03 = AnonymousClass001.A0u();
    public final JDx A04;

    public HuU(JDx jDx) {
        this.A04 = jDx;
    }

    public String A01() {
        String str = this.A01;
        if (str == null) {
            str = GOo.A0u().toUpperCase(Locale.US);
            this.A01 = str;
        }
        return str;
    }

    public final void A02(String str, Object... objArr) {
        JDx jDx = this.A04;
        if (jDx != null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(4YT.A00(150));
            A0k.append(String.format(Locale.US, str, objArr));
            A0k.append('\n');
            A0k.append("session ID: ");
            A0k.append(A01());
            A0k.append('\n');
            A0k.append("time spent: ");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j = 0;
            if (this.A00 > 0) {
                j = Calendar.getInstance().getTimeInMillis() - this.A00;
            }
            A0k.append(timeUnit.toSeconds(j));
            A0k.append(" seconds");
            A0k.append('\n');
            A0k.append("params: ");
            jDx.BZO(HAO.A02, "AnalyticsLogger", AnonymousClass001.A0a(this.A03, A0k), null);
        }
    }

    public void A03(Throwable th) {
        A02("onScreenError: error=\"%s\"", th instanceof HCv ? "MappingException" : AnonymousClass001.A0X(th));
    }

    public void A04() {
        A02("onScreenHidden", new Object[0]);
        this.A03.clear();
        this.A01 = null;
        this.A00 = 0L;
        this.A02 = false;
    }

    public void A05() {
        A02("onScreenShown", AnonymousClass001.A1Z());
        this.A00 = Calendar.getInstance().getTimeInMillis();
    }
}
