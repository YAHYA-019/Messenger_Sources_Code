package X;

import com.facebook.cameracore.fbspecific.voltron.FbVoltronModuleLoader;

/* loaded from: Fc4.class */
public final class Fc4 implements GHd {
    public final /* synthetic */ FbVoltronModuleLoader A00;
    public final /* synthetic */ GHd A01;
    public final /* synthetic */ String A02;

    public Fc4(FbVoltronModuleLoader fbVoltronModuleLoader, GHd gHd, String str) {
        this.A00 = fbVoltronModuleLoader;
        this.A02 = str;
        this.A01 = gHd;
    }

    @Override // X.GHd
    public void Bxi(Throwable th, boolean z) {
        this.A01.Bxi(th, z);
    }

    @Override // X.GHd
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if ("pytorch".equals(this.A02)) {
            try {
                C0il.A0C(AnonymousClass000.A00(56), 16);
                C0il.A0C(AnonymousClass000.A00(36), 16);
                C0il.A0C(AnonymousClass000.A00(59), 16);
                C0il.A0C(AnonymousClass000.A00(94), 16);
            } catch (Throwable th) {
                0fH.A0w("FbVoltronModuleLoader", GOm.A00(48), th);
                this.A01.Bxi(th, false);
                return;
            }
        }
        this.A01.onSuccess(obj);
    }
}
