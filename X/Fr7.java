package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import java.io.IOException;

/* loaded from: Fr7.class */
public abstract class Fr7 implements 29I {
    public final long A00;

    public Fr7(long j) {
        this.A00 = EYp.A00(getClass(), j);
    }

    private Object A05(View view, Object obj, Object obj2) {
        GLc gLc;
        DZU dzu;
        if (this instanceof EHi) {
            E8c e8c = (E8c) view;
            E8h e8h = (E8h) obj;
            if (e8h.A05 == null) {
                return null;
            }
            try {
                FyG fyG = e8h.A0A;
                fyG.getClass();
                EHi.A01(fyG, e8h.A05, (E8Z) e8c, e8h);
                Object obj3 = e8h.A03;
                Object obj4 = e8h.A02;
                if (obj3 instanceof Animatable) {
                    ((Animatable) obj3).start();
                }
                if (!(obj4 instanceof Animatable)) {
                    return null;
                }
                ((Animatable) obj4).start();
                return null;
            } catch (IOException e) {
                FGT.A00((FyG) null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
                return null;
            }
        }
        if (this instanceof EHf) {
            DLQ dlq = ((EHf) this).A00;
            view.setScaleX(dlq.Amm(ActionId.MQTT_CONNECTED, 1.0f));
            view.setScaleY(dlq.Amm(ActionId.MQTT_DISCONNECTED, 1.0f));
            view.setTranslationX(dlq.Amm(ActionId.ACTIVITY_START, 0.0f));
            view.setTranslationY(dlq.Amm(ActionId.BEGIN_START_ACTIVITY, 0.0f));
            view.setRotation(dlq.Amm(ActionId.MESSENGER_DELTA_REQUEST, 0.0f));
            view.setAlpha(dlq.Amm(ActionId.MESSENGER_THREAD_LIST_DISPLAYED, 1.0f));
            return null;
        }
        if (this instanceof EHh) {
            EHh eHh = (EHh) this;
            return eHh.A01.A0K(view, eHh.A00, ((E8j) obj).A00, obj2);
        }
        if (this instanceof EHg) {
            EHg eHg = (EHg) this;
            DLQ A0o = DKC.A0o((DLQ) obj);
            if (A0o == null || (dzu = eHg.A00) == null) {
                return null;
            }
            dzu.A1X(eHg.A01, A0o);
            return null;
        }
        EHe eHe = (EHe) this;
        DLQ dlq2 = (DLQ) obj;
        11T.A0F(dlq2, 2);
        DLQ A05 = dlq2.A05();
        if (A05 == null || (gLc = (GLc) FyG.A02(eHe.A00, 2131362452)) == null) {
            return null;
        }
        GHQ A00 = 1Wg.A00(A05, A05.A05);
        if (gLc instanceof GHR) {
            A00 = new FZr(A00, obj2);
        }
        gLc.BqW(A00);
        return null;
    }

    public boolean A06(Object obj, Object obj2, Object obj3, Object obj4) {
        if (!(this instanceof EHi) && !(this instanceof EHf)) {
            if (this instanceof EHg) {
                DLQ A06 = ((DLQ) obj).A06(36);
                if (A06 == ((DLQ) obj2).A06(36)) {
                    return false;
                }
                if (A06 != null) {
                    return !A06.equals(r0);
                }
                return true;
            }
            if (this instanceof EHh) {
                return ((EHh) this).A01.A0N(((E8j) obj).A00, ((E8j) obj2).A00, obj3, obj4);
            }
            DLQ dlq = (DLQ) obj;
            DLQ dlq2 = (DLQ) obj2;
            11T.A0H(dlq, dlq2);
            GLc gLc = (GLc) FyG.A02(((EHe) this).A00, 2131362452);
            if (gLc instanceof GHR) {
                return ((GHR) gLc).Cyy(dlq, dlq2, obj3, obj4);
            }
            DLQ A05 = dlq.A05();
            return (A05 != null && A05.equals(dlq2.A05()) && obj3 == obj4) ? false : true;
        }
        return AnonymousClass001.A1U(EbC.A01.get());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.F8i] */
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        Object A05;
        View view = (View) obj;
        boolean A1X = 1BL.A1X(context, view);
        long j = this.A00;
        FHF A0i = DKD.A0i();
        if (A0i == null) {
            A05 = A05(view, obj2, obj3);
        } else {
            ?? obj4 = new Object();
            Object obj5 = FHF.A02()[A1X ? 1 : 0];
            FHF.A01((Object) obj4, A1X ? 1 : 0);
            Object obj6 = obj5;
            if (!(obj5 instanceof F8i)) {
                obj6 = null;
            }
            try {
                F8i f8i = (F8i) obj6;
                A05 = A05(view, obj2, obj3);
                if (!obj4.A02() && f8i != null) {
                    f8i.A01(j);
                }
                FHF.A01(obj5, A1X ? 1 : 0);
                if (!obj4.A02()) {
                    A0i.A03.A01(new Ems(null, null, F8i.A00(obj4)), j, false);
                    return A05;
                }
            } catch (Throwable th) {
                FHF.A01(obj5, A1X ? 1 : 0);
                throw th;
            }
        }
        return A05;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public final boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        ThreadLocal threadLocal = EbC.A01;
        FHF fhf = (FHF) threadLocal.get();
        if (AnonymousClass001.A1V(fhf == null ? Boolean.valueOf(A06(obj, obj2, obj3, obj4)) : EYn.A00(ELi.A05, fhf, new AKs(25, obj, obj3, obj2, obj4, this)))) {
            return true;
        }
        long j = this.A00;
        if (EYo.A00(j)) {
            return true;
        }
        if (threadLocal.get() == null) {
            return false;
        }
        Object obj5 = FHF.A02()[1];
        if (obj5 == null) {
            obj5 = null;
        }
        F8i f8i = (F8i) obj5;
        if (f8i == null) {
            return false;
        }
        f8i.A01(j);
        return false;
    }
}
