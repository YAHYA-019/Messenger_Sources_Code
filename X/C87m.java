package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.particles.ParticleSystemView;
import com.facebook.xapp.messaging.events.common.lifecycle.OnCreateView;

/* renamed from: X.87m, reason: invalid class name */
/* loaded from: 87m.class */
public final class C87m implements 1Vf {
    public final int A00;
    public final 6sX A01;

    public C87m(6sR r302) {
        this.A01 = r302.BHn();
        this.A00 = r302.AeB();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        6sX r309;
        ViewGroup viewGroup;
        boolean A1X = 1BL.A1X(r302, str);
        switch (str.hashCode()) {
            case -381575838:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible")) {
                    6sX r0 = this.A01;
                    7zS.A1H(r0.A03);
                    r0.A02 = false;
                    ParticleSystemView particleSystemView = r0.A01;
                    if (particleSystemView != null) {
                        particleSystemView.A01();
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case 22507532:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
                    6sX r02 = this.A01;
                    7zS.A1H(r02.A03);
                    r02.A02 = A1X;
                    return;
                }
                throw 4YV.A0f(str);
            case 728810746:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroyView")) {
                    r309 = this.A01;
                    7zS.A1H(r309.A03);
                    ParticleSystemView particleSystemView2 = r309.A01;
                    if (particleSystemView2 != null) {
                        particleSystemView2.A01();
                    }
                    ViewGroup viewGroup2 = r309.A00;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(r309.A01);
                    }
                    viewGroup = null;
                    r309.A01 = null;
                    break;
                }
                throw 4YV.A0f(str);
            case 763992870:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreateView")) {
                    OnCreateView onCreateView = (OnCreateView) r302;
                    11T.A0F(onCreateView, 0);
                    r309 = this.A01;
                    View requireViewById = onCreateView.A00.requireViewById(2131365867);
                    11T.A0A(requireViewById);
                    viewGroup = (ViewGroup) requireViewById;
                    11T.A0F(viewGroup, 0);
                    7zS.A1H(r309.A03);
                    break;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
        r309.A00 = viewGroup;
    }
}
