package X;

import java.util.Iterator;

/* loaded from: J3d.class */
public final class J3d implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$8";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 6Ue A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public J3d(6Ue r302, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A02 = r302;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A05 = z2;
        this.A04 = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A02);
        while (A1F.hasNext()) {
            ((6Ua) A1F.next()).CNj(this.A01, this.A00, this.A03, this.A05, this.A04);
        }
    }
}
