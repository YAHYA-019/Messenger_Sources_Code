package X;

import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: L11.class */
public final class L11 {
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public IabCommonTrait A0O;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public boolean A0b;
    public final C0dp A0d;
    public final ZonePolicy A0e;
    public final boolean A0g;
    public ZonedValue A0P = new ZonedValue(ZonePolicy.A03, "");
    public long A08 = 0;
    public int A00 = -1;
    public int A02 = 9;
    public int A03 = 9;
    public int A01 = 0;
    public int A07 = -1;
    public int A06 = -1;
    public boolean A0Z = false;
    public boolean A0X = false;
    public boolean A0Y = false;
    public boolean A0a = false;
    public boolean A0c = false;
    public Boolean A0R = false;
    public Boolean A0Q = false;
    public int A04 = 1;
    public int A05 = 1;
    public final ArrayList A0f = AnonymousClass001.A0s();
    public List A0W = AnonymousClass001.A0s();

    public L11(C0dp c0dp, ZonePolicy zonePolicy, boolean z) {
        long j = -1;
        this.A0L = j;
        this.A0K = j;
        this.A0M = j;
        this.A0B = j;
        this.A0C = j;
        this.A0A = j;
        this.A0F = j;
        this.A0H = j;
        this.A0I = j;
        this.A0N = j;
        this.A0D = j;
        this.A0E = j;
        this.A0G = j;
        this.A09 = j;
        this.A0J = j;
        this.A0g = z;
        this.A0d = c0dp;
        this.A0e = zonePolicy;
    }

    public static long A00(L11 l11) {
        return l11.A0d.now();
    }
}
