package X;

import com.facebook.inspiration.model.InspirationEffectWithSource;
import com.facebook.inspiration.model.InspirationEffectsModel;
import com.facebook.inspiration.model.InspirationInlineEffectsTrayState;
import com.facebook.ipc.inspiration.config.platform.PlatformCameraShareConfiguration;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N3T.class */
public final class N3T {
    public EOp A00;
    public InspirationEffectWithSource A01;
    public InspirationEffectWithSource A02;
    public InspirationEffectWithSource A03;
    public InspirationInlineEffectsTrayState A04;
    public PlatformCameraShareConfiguration A05;
    public ImmutableList A06;
    public ImmutableList A07;
    public ImmutableList A08;
    public ImmutableList A09;
    public ImmutableList A0A;
    public ImmutableList A0B;
    public String A0C;
    public Set A0D;
    public boolean A0E;

    public N3T() {
        this.A0D = AnonymousClass001.A0v();
        this.A0C = "";
        this.A06 = ImmutableList.of();
        this.A07 = ImmutableList.of();
        this.A08 = ImmutableList.of();
        this.A09 = ImmutableList.of();
        this.A0A = ImmutableList.of();
        this.A0B = ImmutableList.of();
    }

    public N3T(InspirationEffectsModel inspirationEffectsModel) {
        this.A0D = AnonymousClass001.A0v();
        inspirationEffectsModel.getClass();
        this.A0C = inspirationEffectsModel.A0C;
        this.A01 = inspirationEffectsModel.A01;
        this.A00 = inspirationEffectsModel.A00;
        this.A06 = inspirationEffectsModel.A06;
        this.A04 = inspirationEffectsModel.A04;
        this.A0E = inspirationEffectsModel.A0E;
        this.A05 = inspirationEffectsModel.A05;
        this.A07 = inspirationEffectsModel.A07;
        this.A08 = inspirationEffectsModel.A08;
        this.A09 = inspirationEffectsModel.A09;
        this.A0A = inspirationEffectsModel.A0A;
        this.A02 = inspirationEffectsModel.A02;
        this.A03 = inspirationEffectsModel.A03;
        this.A0B = inspirationEffectsModel.A0B;
        this.A0D = AbF.A1E(inspirationEffectsModel.A0D);
    }

    private void A00(String str) {
        if (this.A0D.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0D);
        this.A0D = A1E;
        A1E.add(str);
    }

    public void A01(InspirationEffectWithSource inspirationEffectWithSource) {
        this.A02 = inspirationEffectWithSource;
        C1pq.A08("selectedEffectWithSource", inspirationEffectWithSource);
        A00("selectedEffectWithSource");
    }

    public void A02(InspirationEffectWithSource inspirationEffectWithSource) {
        this.A03 = inspirationEffectWithSource;
        C1pq.A08("selectedPreCaptureEffect", inspirationEffectWithSource);
        A00("selectedPreCaptureEffect");
    }

    public void A03(InspirationInlineEffectsTrayState inspirationInlineEffectsTrayState) {
        this.A04 = inspirationInlineEffectsTrayState;
        C1pq.A08("inlineEffectsTrayState", inspirationInlineEffectsTrayState);
        A00("inlineEffectsTrayState");
    }

    public void A04(ImmutableList immutableList) {
        this.A09 = immutableList;
        C1pq.A08("savedEffectIds", immutableList);
    }
}
