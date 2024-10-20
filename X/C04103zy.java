package X;

import android.net.Uri;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.http.NameValuePair;

/* renamed from: X.3zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zy.class */
public final class C04103zy {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final long A06;
    public final 07S A07;
    public final 1SZ A08;
    public final C5ek A09;
    public final EnumC04093zx A0A;
    public final ImmutableList A0B;
    public final ImmutableList A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Object A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final List A0Y;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r302.A01 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C04103zy(X.C04083zw r302) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04103zy.<init>(X.3zw):void");
    }

    public C04103zy(RequestPriority requestPriority, Integer num, String str, String str2, String str3, List list) {
        this.A0H = str;
        this.A0L = str2;
        this.A0M = str3;
        this.A0N = null;
        this.A0B = null;
        this.A08 = 1TB.A00(requestPriority, str);
        this.A0C = ImmutableList.copyOf((Collection) list);
        this.A07 = null;
        this.A0D = num;
        this.A0Y = ImmutableList.of();
        this.A0G = null;
        this.A0U = false;
        this.A0Q = false;
        this.A0X = false;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0R = false;
        this.A0S = false;
        this.A00 = false;
        this.A05 = false;
        this.A0P = true;
        this.A0E = 0S2.A00;
        this.A0F = C04083zw.A0a;
        this.A09 = null;
        this.A0O = null;
        this.A06 = 0L;
        this.A0A = EnumC04093zx.A0B;
        this.A04 = false;
        this.A03 = false;
        this.A01 = true;
        this.A0I = null;
        this.A0J = null;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.encodedAuthority("rupload.facebook.com");
        this.A0K = builder.toString();
    }

    public C04103zy(Integer num, String str, String str2, String str3, List list) {
        this(null, num, str, str2, str3, list);
    }

    public ArrayList A00() {
        ImmutableList immutableList = this.A0C;
        ArrayList A0t = AnonymousClass001.A0t(immutableList == null ? 0 : immutableList.size());
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                A0t.add(((NameValuePair) it.next()).getName());
            }
        }
        return A0t;
    }

    public List A01() {
        List list = this.A0Y;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return list;
    }
}
