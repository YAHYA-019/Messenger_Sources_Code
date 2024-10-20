package X;

import android.text.TextUtils;
import java.util.List;

/* loaded from: EvQ.class */
public final class EvQ {
    public EtY A00;
    public EtY A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    /* JADX WARN: Type inference failed for: r0v17, types: [X.ETM, java.lang.Object] */
    public ETM A00() {
        if (TextUtils.isEmpty(this.A06) || TextUtils.isEmpty(this.A05) || TextUtils.isEmpty(this.A03)) {
            throw AnonymousClass001.A0L("The title, subtitle and description of PIN keypad screen should NOT be empty.");
        }
        ?? obj = new Object();
        ((ETM) obj).A06 = this.A06;
        ((ETM) obj).A05 = this.A05;
        ((ETM) obj).A03 = this.A03;
        ((ETM) obj).A00 = this.A00;
        ((ETM) obj).A02 = this.A02;
        ((ETM) obj).A07 = this.A07;
        ((ETM) obj).A04 = this.A04;
        ((ETM) obj).A01 = this.A01;
        return obj;
    }
}
