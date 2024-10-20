package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

/* loaded from: Fv1.class */
public final class Fv1 implements GIx {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public Fv1(0Jt r302, MediatorLiveData mediatorLiveData, Ek0 ek0, Rh9 rh9, Object obj, String str, int i) {
        this.A00 = i;
        this.A01 = rh9;
        this.A06 = str;
        if (i != 0) {
            this.A03 = r302;
            this.A04 = obj;
            this.A05 = mediatorLiveData;
            this.A02 = ek0;
        } else {
            this.A02 = r302;
            this.A04 = obj;
            this.A05 = mediatorLiveData;
            this.A03 = ek0;
        }
    }

    @Override // X.GIx
    public void BkH(Throwable th) {
        ((LiveData) this.A05).postValue(FJC.A06(th));
    }

    @Override // X.GIx
    public void BkI(RMC rmc) {
        0Jt r306;
        Object obj;
        MediatorLiveData mediatorLiveData;
        Object obj2;
        int i = this.A00;
        Rh9 rh9 = (Rh9) this.A01;
        String str = this.A06;
        if (i != 0) {
            r306 = (0Jt) this.A03;
            obj = this.A04;
            mediatorLiveData = (MediatorLiveData) this.A05;
            obj2 = this.A02;
        } else {
            r306 = (0Jt) this.A02;
            obj = this.A04;
            mediatorLiveData = (MediatorLiveData) this.A05;
            obj2 = this.A03;
        }
        Rh9.A00(r306, mediatorLiveData, (Ek0) obj2, rmc, rh9, obj, str);
    }
}
