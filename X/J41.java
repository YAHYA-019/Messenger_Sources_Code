package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: J41.class */
public final class J41 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$36";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6Ue A01;
    public final /* synthetic */ 7uY A02;
    public final /* synthetic */ 6Uz A03;
    public final /* synthetic */ 6Uz A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public J41(6Ue r302, 7uY r303, 6Uz r304, 6Uz r305, String str, String str2, List list, long j) {
        this.A01 = r302;
        this.A03 = r304;
        this.A04 = r305;
        this.A00 = j;
        this.A06 = str;
        this.A07 = list;
        this.A05 = str2;
        this.A02 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator A1F = GOn.A1F(this.A01);
        while (A1F.hasNext()) {
            6Ua r0 = (6Ua) A1F.next();
            6Uz r02 = this.A03;
            6Uz r03 = this.A04;
            long j = this.A00;
            String str = this.A06;
            List list = this.A07;
            r0.CRO(this.A02, r02, r03, str, this.A05, list, j);
        }
    }
}
