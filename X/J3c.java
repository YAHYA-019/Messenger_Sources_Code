package X;

import java.util.Iterator;

/* loaded from: J3c.class */
public final class J3c implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$37";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6Ue A01;
    public final /* synthetic */ 7uY A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public J3c(6Ue r302, 7uY r303, String str, String str2, String str3, long j) {
        this.A01 = r302;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r303;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A01);
        while (A1F.hasNext()) {
            6Ua r0 = (6Ua) A1F.next();
            long j = this.A00;
            r0.Bwd(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
