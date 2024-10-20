package X;

import android.content.res.Configuration;

/* renamed from: X.1qj, reason: invalid class name */
/* loaded from: 1qj.class */
public final class C1qj extends C1qh {
    public final C1qk A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1qk] */
    public C1qj(Configuration configuration) {
        super(configuration);
        this.A00 = new C0A9() { // from class: X.1qk
            @Override // X.C0A9
            public /* bridge */ /* synthetic */ int A02(Object obj, Object obj2) {
                ((Number) obj).intValue();
                11T.A0F(obj2, 1);
                if (obj2 instanceof String) {
                    return ((String) obj2).length();
                }
                return 1;
            }
        };
    }

    @Override // X.C1qh
    public void A00(int i, Object obj) {
        11T.A0F(obj, 1);
        A04(Integer.valueOf(i), obj);
    }
}
