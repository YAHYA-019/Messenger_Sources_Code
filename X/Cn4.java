package X;

import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* loaded from: Cn4.class */
public final class Cn4 implements DIS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 3EX A01;
    public final /* synthetic */ 1F9 A02;
    public final /* synthetic */ DIS A03;
    public final /* synthetic */ Byb A04;
    public final /* synthetic */ C7s A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public Cn4(3EX r302, 1F9 r303, DIS dis, Byb byb, C7s c7s, String str, String str2, int i) {
        this.A03 = dis;
        this.A05 = c7s;
        this.A01 = r302;
        this.A02 = r303;
        this.A04 = byb;
        this.A00 = i;
        this.A06 = str;
        this.A07 = str2;
    }

    @Override // X.DIS
    public void Bsz() {
        CMw.A01(this.A02, (CMw) 1Br.A0B(this.A05.A00), this.A04.A00, AbstractC00603o4.A00(229), this.A07, false);
        this.A03.Bsz();
    }

    @Override // X.DIS
    public void Bt2() {
        this.A03.Bt2();
        C1266Ac8 c1266Ac8 = (C1266Ac8) 1Br.A0B(this.A05.A01);
        3EX r0 = this.A01;
        1F9 r02 = this.A02;
        ImmutableList immutableList = this.A04.A00;
        int i = this.A00;
        String str = this.A06;
        11T.A0F(r0, 0);
        1UG A08 = 1BK.A08(1Br.A02(c1266Ac8.A00), 1BJ.A00(1566));
        if (A08.isSampled()) {
            int A00 = COD.A00(r02);
            A08.A5c(r0, "entry_point");
            A08.A6H("actioned_unread_thread_count", AbI.A11(A08, 1BK.A0l(immutableList.size()), "actioned_thread_count", i));
            4YU.A1I(A08, "action", 4);
            4YU.A1I(A08, "folder", A00);
            A08.A7R(TraceFieldType.RequestID, str);
            A08.BZL();
        }
    }

    @Override // X.DIS
    public void Bt3() {
        this.A03.Bt3();
    }

    @Override // X.DIS
    public void Bt7() {
        CMw.A01(this.A02, (CMw) 1Br.A0B(this.A05.A00), this.A04.A00, AbstractC00603o4.A00(230), this.A07, true);
        this.A03.Bt7();
    }
}
