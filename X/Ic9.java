package X;

import android.content.Context;

/* loaded from: Ic9.class */
public final class Ic9 implements JOW, JOX {
    public final HWj A00 = new HWj();
    public final JQ4 A01;

    public Ic9(JQ4 jq4) {
        this.A01 = jq4;
    }

    public void AAp(String str) {
        if (this.A01.A07 == 0) {
            throw AnonymousClass001.A0N("LiteCameraController must be initialized before taking photo.");
        }
    }

    public JQC AdC(GuJ guJ) {
        11T.A0F(guJ, 0);
        JQC AdC = this.A01.AdC(guJ);
        11T.A0A(AdC);
        return AdC;
    }

    public JG5 AdD(HJS hjs) {
        11T.A0F(hjs, 0);
        return this.A01.AdD(hjs);
    }

    public Object Adm(HJO hjo) {
        throw AnonymousClass001.A0N("ConnectConfigurationKey not supported!");
    }

    public Object Adn(Hvf hvf) {
        11T.A0F(hvf, 0);
        return this.A01.Adn(hvf);
    }

    public boolean BRD(GuJ guJ) {
        11T.A0F(guJ, 0);
        return this.A01.BRD(guJ);
    }

    public boolean BRE(HJS hjs) {
        11T.A0F(hjs, 0);
        return this.A01.BRE(hjs);
    }

    public void destroy() {
        synchronized (this) {
            this.A01.release();
        }
    }

    public Context getContext() {
        Context context = this.A01.getContext();
        11T.A0A(context);
        return context;
    }

    public void pause() {
        synchronized (this) {
            this.A01.disconnect();
        }
    }

    public void resume() {
        synchronized (this) {
            this.A01.AHU(new Hxz(this.A00));
        }
    }
}
