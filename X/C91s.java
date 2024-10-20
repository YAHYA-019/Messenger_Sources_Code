package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.business.ads.orderhistory.data.UserInboxOrderHistoryDataFetch;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.91s, reason: invalid class name */
/* loaded from: 91s.class */
public final class C91s extends 5TY {
    public String A00;

    public C91s() {
        super("UserInboxOrderHistoryProps");
    }

    public long A05() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public Bundle A06() {
        Bundle A05 = 1BK.A05();
        String str = this.A00;
        if (str != null) {
            A05.putString("userId", str);
        }
        return A05;
    }

    public 5iK A07(5iJ r302) {
        return UserInboxOrderHistoryDataFetch.create(r302, this);
    }

    public /* bridge */ /* synthetic */ 5TY A08(Context context, Bundle bundle) {
        C91s c91s = new C91s();
        7zU.A0v(context, c91s);
        BitSet A18 = 1BK.A18(1);
        A18.clear();
        c91s.A00 = bundle.getString("userId");
        A18.set(0);
        5TZ.A00(A18, new String[]{"userId"}, 1);
        return c91s;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C91s)) {
                return false;
            }
            String str = this.A00;
            String str2 = ((C91s) obj).A00;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(((5TY) this).A03);
        String str = this.A00;
        if (str != null) {
            A0k.append(" ");
            A0k.append("userId");
            A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A0k.append(str);
        }
        return A0k.toString();
    }
}
