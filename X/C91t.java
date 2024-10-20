package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.business.ads.orderhistory.data.ThreadOrderHistoryDataFetch;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.91t, reason: invalid class name */
/* loaded from: 91t.class */
public final class C91t extends 5TY {
    public String A00;
    public String A01;

    public C91t() {
        super("ThreadOrderHistoryProps");
    }

    public long A05() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public Bundle A06() {
        Bundle A05 = 1BK.A05();
        String str = this.A00;
        if (str != null) {
            A05.putString("pageId", str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            A05.putString("userId", str2);
        }
        return A05;
    }

    public 5iK A07(5iJ r302) {
        return ThreadOrderHistoryDataFetch.create(r302, this);
    }

    public /* bridge */ /* synthetic */ 5TY A08(Context context, Bundle bundle) {
        C91t c91t = new C91t();
        7zU.A0v(context, c91t);
        BitSet A18 = 1BK.A18(2);
        A18.clear();
        c91t.A00 = bundle.getString("pageId");
        A18.set(0);
        c91t.A01 = bundle.getString("userId");
        A18.set(1);
        5TZ.A00(A18, new String[]{"pageId", "userId"}, 2);
        return c91t;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C91t)) {
                return false;
            }
            C91t c91t = (C91t) obj;
            String str = this.A00;
            String str2 = c91t.A00;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
            String str3 = this.A01;
            String str4 = c91t.A01;
            if (str3 != str4 && (str3 == null || !str3.equals(str4))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(((5TY) this).A03);
        String str = this.A00;
        if (str != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("pageId", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str, A0k);
        }
        String str2 = this.A01;
        if (str2 != null) {
            A0k.append(" ");
            AnonymousClass001.A1D("userId", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str2, A0k);
        }
        return A0k.toString();
    }
}
