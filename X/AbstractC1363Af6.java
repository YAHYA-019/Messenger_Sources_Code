package X;

import android.widget.BaseAdapter;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Af6, reason: case insensitive filesystem */
/* loaded from: Af6.class */
public abstract class AbstractC1363Af6 extends BaseAdapter {
    public void A02(ImmutableList immutableList) {
        AoM aoM = (AoM) this;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(aoM.A04);
        ImmutableList A0y = AbG.A0y(builder, immutableList);
        aoM.A03 = A0y;
        aoM.A05 = A0y;
        AoM.A01(aoM);
        0V5.A00(aoM, 428139249);
    }
}
