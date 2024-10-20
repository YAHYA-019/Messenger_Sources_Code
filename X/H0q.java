package X;

import android.media.AudioManager;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi;

/* loaded from: H0q.class */
public final class H0q extends H1Y {
    public Object A00;
    public final int A01;

    public H0q(1Iw r302, Object obj, int i) {
        this.A01 = i;
        ((H1Y) this).A00 = r302;
        this.A00 = obj;
    }

    public Class A04() {
        Class cls;
        switch (this.A01) {
            case 0:
                cls = QUp.class;
                break;
            case 1:
                cls = H2Q.class;
                break;
            default:
                cls = 6bV.class;
                break;
        }
        return cls;
    }

    /* JADX WARN: Type inference failed for: r306v2, types: [X.HFL, java.lang.Object] */
    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        1Iw r304;
        Object obj;
        switch (this.A01) {
            case 0:
                QUp qUp = (QUp) r302;
                String str = qUp.A03;
                if (str != null) {
                    r304 = ((H1Y) this).A00;
                    ?? obj2 = new Object();
                    ((HFL) obj2).A00 = qUp.A00;
                    ((HFL) obj2).A02 = qUp.A02;
                    ((HFL) obj2).A01 = qUp.A01;
                    ((HFL) obj2).A03 = str;
                    ((HFL) obj2).A04 = qUp.A04;
                    obj = obj2;
                    break;
                } else {
                    return;
                }
            case 1:
                if (((H2Q) r302).A00 == H9X.A03) {
                    r304 = ((H1Y) this).A00;
                    obj = null;
                    break;
                } else {
                    return;
                }
            default:
                Hql A00 = HvP.A00();
                if (A00 != null) {
                    1Br.A0C(A00.A0E);
                    Ia1 A0d = GOq.A0d();
                    CowatchAdPlayerApi Aer = A0d != null ? A0d.A02.Aer() : null;
                    String str2 = "adVideoState";
                    if (Aer != null) {
                        String str3 = A00.A08;
                        if (str3 == null) {
                            str2 = "clientToken";
                        } else {
                            if (A00.A03 != null) {
                                Aer.didStartAdPlayback(str3, r0.A02());
                            }
                        }
                        11T.A0L(str2);
                        throw 0Q8.createAndThrow();
                    }
                    DKE.A0K(A00.A0F).postDelayed(A00.A0I, A00.A0B);
                    GRD grd = A00.A04;
                    if (grd == null) {
                        str2 = "hostVideoState";
                    } else {
                        GRS A04 = grd.A04();
                        if (A04 != null) {
                            A04.CWm(C52j.A07);
                        }
                        GRD grd2 = A00.A03;
                        if (grd2 != null) {
                            GRS A042 = grd2.A04();
                            if (A042 != null) {
                                A042.A11(C52j.A07, ((AudioManager) 1Br.A0B(A00.A0D)).getStreamVolume(3));
                                return;
                            }
                            return;
                        }
                    }
                    11T.A0L(str2);
                    throw 0Q8.createAndThrow();
                }
                return;
        }
        Object obj3 = this.A00;
        if (r304.A02 != null) {
            r304.A0G(new C2l4(new Object[]{obj, obj3}, 0), "updateState:CowatchAdPlayerComponent.onUpdatePlayAd");
        }
    }
}
