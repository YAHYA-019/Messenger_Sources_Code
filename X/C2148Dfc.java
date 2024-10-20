package X;

import android.content.Context;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;

/* renamed from: X.Dfc, reason: case insensitive filesystem */
/* loaded from: Dfc.class */
public final class C2148Dfc extends AbstractC2178Dg6 {
    public FEG A00;
    public Eho A01;
    public Ehp A02;
    public RXy A03;
    public C2179Dg7 A04;
    public 1Im A05;
    public Integer A06;
    public EKe A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Dg7, X.EnN] */
    public C2148Dfc(1Iw r302) {
        super(r302);
        ?? enN = new EnN();
        ((EnN) enN).A00 = 4;
        this.A04 = enN;
        this.A07 = EKe.A01;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        FEG feg;
        1Iw r0 = super.A04;
        DuL duL = new DuL(new Dxg(), r0);
        Dxg dxg = duL.A00;
        dxg.A00 = ezJ;
        BitSet bitSet = duL.A02;
        bitSet.set(2);
        dxg.A06 = new F7z(this.A04);
        bitSet.set(1);
        dxg.A08 = "FDSInstantFeedback";
        bitSet.set(0);
        duL.A0R();
        if (this.A06 != null) {
            AbstractC2178Dg6 abstractC2178Dg6 = new AbstractC2178Dg6(r0);
            ((DfN) abstractC2178Dg6).A00 = 0S2.A01;
            ((DfN) abstractC2178Dg6).A00 = this.A06;
            feg = new FEG(abstractC2178Dg6);
        } else {
            feg = this.A00;
        }
        dxg.A02 = feg;
        dxg.A05 = this.A03;
        dxg.A04 = this.A02;
        dxg.A03 = this.A01;
        dxg.A01 = this.A07;
        bitSet.set(3);
        if (this.A05 != null) {
            C2166Dfu A00 = EVm.A00(r0);
            duL.A2K("FDSInstantFeedback");
            ((AbstractC2150Dfe) A00).A03 = duL;
            ((AbstractC2150Dfe) A00).A04 = this.A05;
            DfL A03 = AbstractC2178Dg6.A03(A00, r0, ((EnN) this.A04).A02);
            A03.A03 = ENh.A01;
            Context context = r0.A0D;
            11T.A0F(context, 0);
            float f = 0.0f;
            if (context.getResources() != null) {
                f = context.getResources().getDimension(R.dimen.mapbox_eight_dp);
            }
            A03.A03(C0A8.A01(context, f));
            ((AbstractC2150Dfe) A00).A00 = A03;
            ((AbstractC2150Dfe) A00).A02 = ((AbstractC2150Dfe) A00).A03;
            AbstractC2178Dg6.A0D(A00);
            duL = A00.A0N(ezJ);
        }
        return duL;
    }

    public void A0f(int i) {
        String A0D = super.A05.A0D(i);
        if (A0D != null) {
            C2179Dg7 c2179Dg7 = this.A04;
            ((EnN) c2179Dg7).A02 = A0D;
            ((EnN) c2179Dg7).A03 = true;
            this.A04 = c2179Dg7;
        }
    }

    public void A0g(CharSequence charSequence) {
        if (charSequence == null) {
            ((ESq) this).A00 = true;
        }
        ((EnN) this.A04).A02 = charSequence;
    }
}
