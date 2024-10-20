package X;

import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.Location;
import com.google.common.collect.ImmutableList;

/* loaded from: D49.class */
public final class D49 implements 1K9 {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ 5fT A02;
    public final /* synthetic */ ChJ A03;

    public D49(5fT r302, ChJ chJ, double d, double d2) {
        this.A03 = chJ;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = r302;
    }

    public void onFailure(Throwable th) {
        this.A02.onError(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        2JY A0B;
        2JY A0B2;
        ImmutableList A0a;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        String A0r = (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0B = 1BK.A0B((2JY) obj2, 2JX.class, 727458913, -800198494)) == null || (A0B2 = 1BK.A0B(A0B, 2JX.class, -1484121912, -993392375)) == null || (A0a = A0B2.A0a(-1215657508, 2JX.class)) == null || A0a.isEmpty() || A0a.get(0) == null || AbF.A0M(A0a, 0).A0r(-2048602096) == null) ? "" : AbF.A0M(A0a, 0).A0r(-2048602096);
        C1pq.A08("localizedAddress", A0r);
        this.A02.onSuccess(new Address(new Location(AnonymousClass001.A0v(), this.A00, this.A01, -1, -1), A0r, false));
    }
}
