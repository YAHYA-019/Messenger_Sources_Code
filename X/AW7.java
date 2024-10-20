package X;

import android.view.View;

/* loaded from: AW7.class */
public final class AW7 extends C00q implements C0Bd {
    public final /* synthetic */ int $layerType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AW7(int i) {
        super(3);
        this.$layerType = i;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj2;
        int A05 = 7zP.A05(view, obj3, 1);
        int layerType = view.getLayerType();
        int i = this.$layerType;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
            if (i == A05) {
                i2 = 2;
            }
        }
        if (view.getLayerType() != i2) {
            view.setLayerType(i2, null);
        }
        return new C2md(new AKU(layerType, 3, view));
    }
}
