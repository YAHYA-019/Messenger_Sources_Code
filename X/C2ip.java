package X;

import com.facebook.inject.FbInjector;

/* renamed from: X.2ip, reason: invalid class name */
/* loaded from: 2ip.class */
public final class C2ip {
    public final C00i A03 = new 1BQ(16772);
    public final C00i A02 = new 1BQ(16766);
    public final C00i A01 = new 1BQ(32897);
    public final C00i A00 = FbInjector.A00;

    /* JADX WARN: Type inference failed for: r0v22, types: [X.2J3, X.33j] */
    public void A00() {
        String A00 = AbE.A00(5);
        2Jy r0 = new 2Jy("click");
        r0.A0D("pigeon_reserved_keyword_obj_id", A00);
        r0.A0D("pigeon_reserved_keyword_obj_type", "android_button");
        C1kw c1kw = (C1kw) this.A03.get();
        if (C33j.A00 == null) {
            synchronized (C33j.class) {
                if (C33j.A00 == null) {
                    C33j.A00 = new C2J3(c1kw);
                }
            }
        }
        C33j.A00.A03(r0);
    }
}
