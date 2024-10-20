package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;

/* renamed from: X.6ik, reason: invalid class name */
/* loaded from: 6ik.class */
public abstract class C6ik {
    public Integer A00 = 0S2.A00;
    public boolean A01;
    public final ThreadPRETltvLogger A02;
    public final C6ia A03;
    public final String A04;

    public C6ik(ThreadPRETltvLogger threadPRETltvLogger, C6ia c6ia, String str) {
        this.A02 = threadPRETltvLogger;
        this.A04 = str;
        this.A03 = c6ia;
    }

    public void A02(long j) {
        if (this instanceof C6in) {
            this.A02.onComponentStartedWithIndex(this, j);
        } else {
            if (this instanceof C6ij) {
                C6ij c6ij = (C6ij) this;
                if (C6ij.A01(c6ij, 0S2.A00, 0S2.A01)) {
                    c6ij.A02.onComponentStarted(c6ij, j);
                    return;
                }
                return;
            }
            this.A02.onComponentStarted(this, j);
        }
        Integer num = 0S2.A01;
        11T.A0F(num, 0);
        this.A00 = num;
    }

    public void A03(long j) {
        if (this instanceof C6in) {
            this.A02.onComponentSucceededWithIndex(this, j);
        } else {
            if (this instanceof C6ij) {
                C6ij c6ij = (C6ij) this;
                if (C6ij.A01(c6ij, 0S2.A01, 0S2.A0C)) {
                    c6ij.A02.onComponentSucceeded(c6ij, j);
                    return;
                }
                return;
            }
            if (this instanceof C7gz) {
                this.A02.onComponentSucceededIgnoringTimestamp(this, j);
            } else {
                this.A02.onComponentSucceeded(this, j);
            }
        }
        Integer num = 0S2.A0C;
        11T.A0F(num, 0);
        this.A00 = num;
    }

    public void A04(long j, boolean z) {
        if ((this instanceof C6in) || (this instanceof C6im)) {
            this.A02.onComponentSucceededWithCache(this, j, z);
            Integer num = 0S2.A0N;
            11T.A0F(num, 0);
            this.A00 = num;
            return;
        }
        if (this instanceof C6ij) {
            C6ij c6ij = (C6ij) this;
            if (C6ij.A01(c6ij, 0S2.A01, 0S2.A0N)) {
                c6ij.A02.onComponentSucceededWithCache(c6ij, j, z);
                return;
            }
            return;
        }
        C6ia c6ia = this.A03;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s.%s component succeeded with cache attempt for PerfComponentIgnoringTimestamp", this.A02.getClass().getSimpleName(), this.A04);
        11T.A0A(formatStrLocaleSafe);
        c6ia.report("PerfComponentIgnoringTimestamp", formatStrLocaleSafe);
    }

    public void A05(long j, boolean z, boolean z2) {
        C6ia c6ia;
        String formatStrLocaleSafe;
        String str;
        if ((this instanceof C6in) || (this instanceof C6im)) {
            this.A02.onComponentSucceededWithNetwork(this, j, z, z2);
            Integer num = 0S2.A0Y;
            11T.A0F(num, 0);
            this.A00 = num;
            return;
        }
        if (this instanceof C6ij) {
            C6ij c6ij = (C6ij) this;
            Integer num2 = c6ij.A00;
            if (num2 == 0S2.A01 || num2 == 0S2.A0N) {
                if (!C6ij.A01(c6ij, num2, 0S2.A0Y) || c6ij.A02.onComponentSucceededWithNetwork(c6ij, j, z, z2)) {
                    return;
                }
                11T.A0F(num2, 0);
                c6ij.A00 = num2;
                return;
            }
            c6ia = c6ij.A03;
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s.%s component succeeded with network attempt while the current state is %s", AnonymousClass001.A0X(c6ij.A02), c6ij.A04, C6ij.A00(num2));
            11T.A0A(formatStrLocaleSafe);
            str = "PerfComponentWithValidation";
        } else {
            c6ia = this.A03;
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s.%s component succeeded with network attempt for PerfComponentIgnoringTimestamp", this.A02.getClass().getSimpleName(), this.A04);
            11T.A0A(formatStrLocaleSafe);
            str = "PerfComponentIgnoringTimestamp";
        }
        c6ia.report(str, formatStrLocaleSafe);
    }
}
