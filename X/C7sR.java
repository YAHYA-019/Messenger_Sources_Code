package X;

import com.google.common.base.MoreObjects;
import java.util.List;

/* renamed from: X.7sR, reason: invalid class name */
/* loaded from: 7sR.class */
public final class C7sR {
    public final int A00;
    public final List A01;

    public C7sR(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(5Wp.class);
        stringHelper.add("lines", this.A01);
        stringHelper.add("moreCount", this.A00);
        return stringHelper.toString();
    }
}
