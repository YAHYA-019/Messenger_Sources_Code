package X;

import com.facebook.fbtrace.FbTraceNode;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import org.apache.http.Header;

/* renamed from: X.3zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zm.class */
public final class C04033zm {
    public RequestPriority A01;
    public 3lP A02;
    public 3OK A03;
    public C5e9 A04;
    public ImmutableList A05;
    public String A07;
    public Integer A06 = 0S2.A00;
    public FbTraceNode A00 = FbTraceNode.A03;
    public boolean A08 = true;

    public void A00(ImmutableList immutableList) {
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument("X-".equalsIgnoreCase(((Header) it.next()).getName().substring(0, 2)));
            }
        }
        this.A05 = immutableList;
    }

    public void A01(Integer num) {
        num.getClass();
        this.A06 = num;
    }
}
