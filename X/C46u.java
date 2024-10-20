package X;

import android.os.Process;
import android.os.SystemClock;
import java.util.regex.Matcher;

/* renamed from: X.46u, reason: invalid class name */
/* loaded from: 46u.class */
public final class C46u implements 1Np {
    public long A00;
    public long A01;
    public 1DU A02;
    public String A03;
    public boolean A04 = true;
    public final 1Cw A05;

    public C46u(1Cw r302) {
        this.A05 = r302;
    }

    public static void A00(C46u c46u, String str, long j, long j2) {
        1Cw r0 = c46u.A05;
        Integer num = 0S2.A0C;
        String name = Thread.currentThread().getName();
        Integer num2 = 0S2.A00;
        long j3 = -1;
        r0.A01(c46u.A02, (Boolean) null, num, num2, num2, str, name, j3, j, j3, j2, j3, j3, j3, j3, 1L);
    }

    public void C6k(String str) {
        String str2;
        1DU r304;
        if (!this.A04) {
            String str3 = this.A03;
            str3.getClass();
            A00(this, str3, System.nanoTime() - this.A01, SystemClock.currentThreadTimeMillis() - this.A00);
            this.A04 = true;
            this.A03 = null;
            return;
        }
        Matcher matcher = C4Oj.A00.matcher(str);
        if (matcher.matches()) {
            matcher.group(1);
            String group = matcher.group(2);
            if (group == null) {
                group = "";
            }
            String group2 = matcher.group(3);
            matcher.group(4);
            String group3 = matcher.group(5);
            if (group3 == null) {
                group3 = "";
            }
            String group4 = matcher.group(6);
            if (group4 == null) {
                group4 = "";
            }
            int parseInt = Integer.parseInt(group4);
            if (group2 != null) {
                group = group2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(group);
            sb.append("/");
            sb.append(group3);
            sb.append("/");
            sb.append(parseInt);
            str2 = sb.toString();
        } else {
            str2 = null;
        }
        this.A03 = str2;
        if (str2 != null) {
            if (this.A02 == null) {
                try {
                    r304 = 1DU.A00(Process.getThreadPriority(Process.myTid()));
                } catch (RuntimeException e) {
                    3G7.A00("Unable to get thread priority", e);
                    r304 = null;
                }
                this.A02 = r304;
            }
            this.A01 = System.nanoTime();
            this.A00 = SystemClock.currentThreadTimeMillis();
            this.A04 = false;
        }
    }
}
