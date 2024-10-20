package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hq5.class */
public final class Hq5 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final List A03;
    public final java.util.Map A04 = AnonymousClass001.A0u();
    public final 1De A05;
    public volatile HfW A06;

    public Hq5(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 16430);
        this.A00 = 1Bu.A03(r0, 114874);
        this.A01 = 1Bu.A03(r0, 82592);
        this.A03 = AnonymousClass001.A0s();
        synchronized (this) {
            ((HqD) 1Br.A0B(this.A00)).A00(new IMn(this, 0));
        }
    }

    public final void A00(JCf jCf, JHj jHj, ImmutableList immutableList, String str, boolean z) {
        11T.A0F(str, 5);
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this) {
            ARRequestAsset aRRequestAsset = (ARRequestAsset) immutableList.get(0);
            if (aRRequestAsset != null) {
                java.util.Map map = this.A04;
                String str2 = aRRequestAsset.A02.A09;
                11T.A0A(str2);
                map.put(str2, HAR.A03);
            }
        }
        ((HqD) 1Br.A0B(this.A00)).A00(new IMp(jCf, new IMy(jHj, this, immutableList), immutableList, str, atomicReference, z));
    }
}
