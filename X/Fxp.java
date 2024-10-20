package X;

import android.content.Context;
import android.view.View;

/* loaded from: Fxp.class */
public final class Fxp implements GL4 {
    public FHH A00;
    public final Context A01;
    public final E8b A02;
    public final String A03;

    public Fxp(E8b e8b, String str) {
        this.A02 = e8b;
        this.A03 = str;
        this.A01 = 4YU.A08(e8b);
    }

    @Override // X.GL4
    public void AN2() {
        FHH fhh = this.A00;
        if (fhh == null) {
            11T.A0L("bloksSurfaceController");
            throw 0Q8.createAndThrow();
        }
        fhh.A05();
    }

    @Override // X.GL4
    public String AWf() {
        FHH fhh = this.A00;
        if (fhh == null) {
            11T.A0L("bloksSurfaceController");
            throw 0Q8.createAndThrow();
        }
        FZo fZo = fhh.A05;
        String str = fZo.A08;
        if (str == null) {
            str = fZo.A09;
        }
        if (str == null) {
            str = fZo.A09;
        }
        return str;
    }

    @Override // X.GL4
    public String AZY() {
        return this.A03;
    }

    @Override // X.GL4
    public View AeR(Context context) {
        FHH fhh = this.A00;
        if (fhh == null) {
            11T.A0L("bloksSurfaceController");
            throw 0Q8.createAndThrow();
        }
        Object obj = fhh.A03(context).first;
        if (obj != null) {
            return (View) obj;
        }
        throw 1BK.A0h();
    }

    @Override // X.GL4
    public View Aot() {
        return this.A02;
    }

    @Override // X.GL4
    public EL9 B3E() {
        return EL9.A02;
    }

    @Override // X.GL4
    public void CUY() {
    }

    @Override // X.GL4
    public void Cbr() {
        FHH fhh = this.A00;
        if (fhh == null) {
            11T.A0L("bloksSurfaceController");
            throw 0Q8.createAndThrow();
        }
        Fs4 fs4 = fhh.A00;
        if (fs4 != null) {
            fs4.A01.ARw(1);
        }
    }

    @Override // X.GL4
    public void destroy() {
        FHH fhh = this.A00;
        if (fhh == null) {
            11T.A0L("bloksSurfaceController");
            throw 0Q8.createAndThrow();
        }
        fhh.A04();
    }

    @Override // X.GL4
    public Context getContext() {
        return this.A01;
    }

    @Override // X.GL4
    public void pause() {
    }

    @Override // X.GL4
    public void resume() {
    }

    @Override // X.GL4
    public void stop() {
        FHH fhh = this.A00;
        if (fhh == null) {
            11T.A0L("bloksSurfaceController");
            throw 0Q8.createAndThrow();
        }
        C47t c47t = fhh.A01;
        if (c47t != null) {
            c47t.BYH("BloksSurfaceController_onPause");
        }
    }
}
