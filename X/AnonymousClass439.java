package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.439, reason: invalid class name */
/* loaded from: 439.class */
public final class AnonymousClass439 {
    public final int A00;
    public final ImmutableList A01;
    public final Object A02;
    public final C04103zy A03;
    public final 1Wx A04;

    public AnonymousClass439(C04103zy c04103zy, 1Wx r303, Object obj, List list, int i) {
        this.A03 = c04103zy;
        this.A00 = i;
        this.A02 = obj;
        this.A04 = r303;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }

    public AnonymousClass439(C04103zy c04103zy, 1Wx r303, Object obj, List list, int i, long j, long j2) {
        this.A03 = c04103zy;
        this.A00 = i;
        this.A02 = obj;
        this.A04 = r303;
        this.A01 = ImmutableList.copyOf((Collection) list);
    }

    public AbstractC01033pi A00() {
        Object obj = this.A02;
        Preconditions.checkState(obj instanceof AbstractC01033pi, "No response json parser.");
        return (AbstractC01033pi) obj;
    }

    public 24X A01() {
        Object obj = this.A02;
        Preconditions.checkState(obj instanceof 24X, "No response json node.");
        A03();
        return (24X) obj;
    }

    public String A02() {
        Object obj = this.A02;
        Preconditions.checkState(obj instanceof String, "No response body.");
        A03();
        return (String) obj;
    }

    public void A03() {
        Object obj = this.A02;
        if (obj instanceof String) {
            this.A04.A05((String) obj);
            return;
        }
        if (obj instanceof 24X) {
            1Wx r0 = this.A04;
            24X r02 = (24X) obj;
            if (r02 != null) {
                try {
                    1Wx.A01(r0, r02);
                } catch (2LD unused) {
                }
            }
        }
    }
}
