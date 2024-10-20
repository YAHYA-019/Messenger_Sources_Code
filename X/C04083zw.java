package X;

import android.net.Uri;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.3zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zw.class */
public final class C04083zw {
    public static final Integer A0a = 0S2.A00;
    public long A00;
    public 07S A01;
    public RequestPriority A02;
    public C5ek A03;
    public ImmutableList A05;
    public Integer A06;
    public Object A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public List A0I;
    public List A0J;
    public boolean A0L;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public volatile 1SZ A0Z;
    public boolean A0M = true;
    public Integer A07 = 0S2.A00;
    public Integer A08 = A0a;
    public EnumC04093zx A04 = EnumC04093zx.A0B;
    public boolean A0K = true;

    public C04083zw() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.encodedAuthority("rupload.facebook.com");
        this.A0C = builder.toString();
    }

    public static 1SZ A00(C04083zw c04083zw) {
        if (c04083zw.A0Z == null) {
            synchronized (c04083zw) {
                if (c04083zw.A0Z == null) {
                    String str = c04083zw.A0D;
                    if (str == null) {
                        str = "unknown";
                    }
                    c04083zw.A0Z = 1TB.A00(c04083zw.A02, str);
                }
            }
        }
        return c04083zw.A0Z;
    }

    public C04103zy A01() {
        A00(this);
        return new C04103zy(this);
    }

    public final void A02() {
        A03(RequestPriority.INTERACTIVE);
    }

    public void A03(RequestPriority requestPriority) {
        this.A02 = requestPriority;
        if (this.A0Z != null) {
            1SZ r0 = this.A0Z;
            RequestPriority requestPriority2 = this.A02;
            if (requestPriority2 != null) {
                r0.A03 = requestPriority2;
            }
        }
    }

    public void A04(ImmutableList immutableList) {
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Header header = (Header) it.next();
                if (!header.getName().equalsIgnoreCase("Content-Encoding")) {
                    Preconditions.checkArgument("X-".equalsIgnoreCase(header.getName().substring(0, 2)));
                }
            }
        }
        this.A05 = immutableList;
    }

    public void A05(Integer num) {
        num.getClass();
        this.A08 = num;
    }

    public void A06(java.util.Map map) {
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new BasicNameValuePair((String) entry.getKey(), String.valueOf(entry.getValue())));
        }
        Iterator it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            Optional optional = (Optional) A0z.getValue();
            if (optional.isPresent()) {
                arrayList.add(new BasicNameValuePair(AnonymousClass001.A0j(A0z), String.valueOf(optional.get())));
            }
        }
        this.A0J = arrayList;
    }
}
