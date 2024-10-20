package X;

import com.facebook.pando.TreeJNI;

/* loaded from: Fwc.class */
public final class Fwc implements GH1 {
    public final /* synthetic */ FxX A00;
    public final /* synthetic */ String A01;

    public Fwc(FxX fxX, String str) {
        this.A00 = fxX;
        this.A01 = str;
    }

    @Override // X.GH1
    public void Bpk(int i, java.util.Map map) {
        Object obj = map.get(this.A01);
        if (obj instanceof TreeJNI) {
            ((TreeJNI) obj).maybeUpdateActiveFields();
        }
    }
}
