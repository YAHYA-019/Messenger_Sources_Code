package X;

import com.facebook.messaging.search.lists.model.FTSMessageIndexProgress;
import com.google.common.collect.ImmutableList;

/* loaded from: Cmu.class */
public final class Cmu implements InterfaceC10284sz {
    public final /* synthetic */ 5O6 A00;
    public final /* synthetic */ CQU A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public Cmu(5O6 r302, CQU cqu, ImmutableList immutableList, String str, boolean z, boolean z2, boolean z3) {
        this.A01 = cqu;
        this.A02 = immutableList;
        this.A03 = str;
        this.A00 = r302;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
    }

    @Override // X.InterfaceC10284sz
    public final void Bq6(FTSMessageIndexProgress fTSMessageIndexProgress) {
        CQU.A07(this.A00, this.A01, this.A02, this.A03, true, this.A05, this.A06, this.A04, 4YV.A1X(fTSMessageIndexProgress.A01, fTSMessageIndexProgress.A00));
    }
}
