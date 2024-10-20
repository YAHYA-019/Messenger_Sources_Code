package X;

import com.facebook.inspiration.genai.aienhance.model.InspirationAiEnhanceData;
import com.facebook.ipc.media.data.MediaData;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N2l.class */
public final class N2l {
    public EnumC3494Mfp A00;
    public EnumC3483Mf1 A01;
    public MediaData A02;
    public MediaData A03;
    public Set A04;
    public boolean A05;
    public boolean A06;

    public N2l() {
        this.A04 = AnonymousClass001.A0v();
    }

    public N2l(InspirationAiEnhanceData inspirationAiEnhanceData) {
        this.A04 = AnonymousClass001.A0v();
        this.A02 = inspirationAiEnhanceData.A02;
        this.A03 = inspirationAiEnhanceData.A03;
        this.A01 = inspirationAiEnhanceData.A01;
        this.A05 = inspirationAiEnhanceData.A05;
        this.A06 = inspirationAiEnhanceData.A06;
        this.A00 = inspirationAiEnhanceData.A00;
        this.A04 = AbF.A1E(inspirationAiEnhanceData.A04);
    }

    public void A00(EnumC3494Mfp enumC3494Mfp) {
        this.A00 = enumC3494Mfp;
        C1pq.A08("selectionSource", enumC3494Mfp);
        if (this.A04.contains("selectionSource")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A04);
        this.A04 = A1E;
        A1E.add("selectionSource");
    }

    public void A01(EnumC3483Mf1 enumC3483Mf1) {
        this.A01 = enumC3483Mf1;
        C1pq.A08("enhanceDataState", enumC3483Mf1);
        if (this.A04.contains("enhanceDataState")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A04);
        this.A04 = A1E;
        A1E.add("enhanceDataState");
    }
}
