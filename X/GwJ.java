package X;

import com.facebook.rsys.callmanager.gen.AppModelListener;

/* loaded from: GwJ.class */
public final class GwJ extends AppModelListener {
    public final /* synthetic */ GwB A00;

    public GwJ(GwB gwB) {
        this.A00 = gwB;
    }

    @Override // com.facebook.rsys.callmanager.gen.AppModelListener
    public void onModels(java.util.Map map) {
        11T.A0F(map, 0);
        GwB gwB = this.A00;
        gwB.A01.A00.invoke(gwB.A07.invoke(map));
    }
}
