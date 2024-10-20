package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Csv.class */
public final class Csv implements DK6 {
    public final double A00;
    public final BOi A01;
    public final ThreadSummary A02;
    public final DataSourceIdentifier A03;
    public final 53N A04;
    public final DK4 A05;
    public final String A06;
    public final String A07;

    public Csv(BOi bOi, ThreadSummary threadSummary, 53N r304, DK4 dk4, Double d, String str, String str2) {
        this.A02 = threadSummary;
        this.A01 = bOi;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = d == null ? 0.0d : d.doubleValue();
        this.A05 = dk4;
        this.A04 = r304;
        this.A03 = null;
    }

    public Csv(BOi bOi, ThreadSummary threadSummary, DataSourceIdentifier dataSourceIdentifier, 53N r305, DK4 dk4, Double d, String str) {
        this.A02 = threadSummary;
        this.A01 = bOi;
        this.A06 = null;
        this.A07 = str;
        this.A00 = d == null ? 0.0d : d.doubleValue();
        this.A05 = dk4;
        this.A04 = r305;
        this.A03 = dataSourceIdentifier;
    }

    public Csv(BOi bOi, ThreadSummary threadSummary, String str) {
        53N r0 = 53N.A0R;
        EnumC1297Ada enumC1297Ada = EnumC1297Ada.A1N;
        this.A02 = threadSummary;
        this.A01 = bOi;
        this.A06 = null;
        this.A07 = str;
        this.A00 = 0.0d;
        this.A05 = enumC1297Ada;
        this.A04 = r0;
        this.A03 = null;
    }

    public String BHk() {
        return this.A07;
    }

    public String getId() {
        ThreadSummary threadSummary = this.A02;
        ThreadKey threadKey = threadSummary.A0n;
        if (threadKey.A1K()) {
            return Long.toString(threadKey.A02);
        }
        if (!threadKey.A0z()) {
            return threadKey.A17() ? 1BK.A0w(threadKey) : threadKey.toString();
        }
        Long l = threadSummary.A1e;
        return l == null ? threadKey.A0u() : String.valueOf(l);
    }
}
