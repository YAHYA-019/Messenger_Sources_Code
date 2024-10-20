package X;

import java.util.Iterator;

/* loaded from: J3a.class */
public final class J3a implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$14";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ 6Ue A04;
    public final /* synthetic */ String A05;

    public J3a(6Ue r302, String str, long j, long j2, long j3, long j4) {
        this.A04 = r302;
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
        this.A05 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A04);
        while (A1F.hasNext()) {
            ((6Ua) A1F.next()).C3L(this.A05, this.A00, this.A03, this.A02, this.A01);
        }
    }
}
