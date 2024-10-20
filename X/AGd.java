package X;

import com.facebook.messaging.montage.model.art.EffectItem;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: AGd.class */
public final class AGd implements Runnable {
    public static final String __redex_internal_original_name = "VideoExpressionLoader$downloadFirstElements$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ IPz A01;
    public final /* synthetic */ HAl A02;
    public final /* synthetic */ ImmutableList A03;

    public AGd(IPz iPz, HAl hAl, ImmutableList immutableList, int i) {
        this.A03 = immutableList;
        this.A00 = i;
        this.A01 = iPz;
        this.A02 = hAl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<EffectItem> A0Y = 0QD.A0Y(this.A03, this.A00);
        IPz iPz = this.A01;
        HAl hAl = this.A02;
        for (EffectItem effectItem : A0Y) {
            11T.A0D(effectItem);
            iPz.A0B(hAl, effectItem, false);
        }
    }
}
