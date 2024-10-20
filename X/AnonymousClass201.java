package X;

import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.201, reason: invalid class name */
/* loaded from: 201.class */
public final class AnonymousClass201 {
    public java.util.Map A00;
    public java.util.Map A01;

    public final HeterogeneousMap A00() {
        java.util.Map map = this.A00;
        if (map == null) {
            map = this.A01;
        }
        this.A00 = null;
        this.A01 = map;
        return new HeterogeneousMap(map);
    }

    public final void A01(AnonymousClass207 anonymousClass207, Object obj) {
        0QO r304 = this.A00;
        if (r304 == null) {
            java.util.Map map = this.A01;
            r304 = new 0QO(map.size());
            r304.putAll(map);
            this.A00 = r304;
        }
        String str = anonymousClass207.A01;
        Object cast = anonymousClass207.A00.cast(obj);
        if (cast == null) {
            throw 1BK.A0e();
        }
        r304.put(str, cast);
    }

    public final void A02(AnonymousClass207 anonymousClass207, Object obj) {
        11T.A0F(anonymousClass207, 0);
        if (obj != null) {
            A01(anonymousClass207, obj);
        }
    }
}
