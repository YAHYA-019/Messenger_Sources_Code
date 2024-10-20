package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: J3b.class */
public final class J3b implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$16";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6Ue A01;
    public final /* synthetic */ 6Uz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public J3b(6Ue r302, 6Uz r303, String str, List list, long j, boolean z) {
        this.A01 = r302;
        this.A02 = r303;
        this.A00 = j;
        this.A03 = str;
        this.A04 = list;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A01);
        while (A1F.hasNext()) {
            6Ua r0 = (6Ua) A1F.next();
            6Uz r02 = this.A02;
            long j = this.A00;
            String str = this.A03;
            List list = this.A04;
            if (list == null) {
                list = AnonymousClass001.A0s();
            }
            r0.Buv(r02, str, list, j, this.A05);
        }
    }
}
