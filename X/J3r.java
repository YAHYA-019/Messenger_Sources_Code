package X;

import java.util.Iterator;

/* loaded from: J3r.class */
public final class J3r implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$7";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6Ue A01;
    public final /* synthetic */ 6Ud A02;
    public final /* synthetic */ 6Uc A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public J3r(6Ue r302, 6Ud r303, 6Uc r304, String str, long j, boolean z, boolean z2) {
        this.A01 = r302;
        this.A03 = r304;
        this.A02 = r303;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A01);
        while (A1F.hasNext()) {
            6Ua r0 = (6Ua) A1F.next();
            6Uc r02 = this.A03;
            6Ud r03 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            r0.CMj(r03, r02, this.A04, this.A00, z, z2);
        }
    }
}
