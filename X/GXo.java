package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: GXo.class */
public final class GXo extends C2lb {
    public HRw A00;
    public Hsx A01;
    public MediaResource A02;
    public final HRr A03;
    public final HjJ A04;
    public final HaU A05;
    public final IPn A06;
    public final HaV A07;
    public final Hzu A08;

    public GXo(View view, ThreadKey threadKey, boolean z, boolean z2) {
        super(view);
        this.A03 = new HRr(this);
        Context context = view.getContext();
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 518);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            IPn iPn = new IPn(view, c1f6, z, z2);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A06 = iPn;
            C1F6 c1f62 = (C1F6) 1Bn.A0A(519);
            Context A012 = FbInjector.A01();
            AbL.A0y(c1f62);
            HaV haV = new HaV(view);
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A07 = haV;
            ((FrameLayout.LayoutParams) haV.A00.getLayoutParams()).gravity = 85;
            C1F6 c1f63 = (C1F6) 1Bn.A0A(517);
            A01 = FbInjector.A01();
            AbL.A0y(c1f63);
            HjJ hjJ = new HjJ(view, threadKey, z);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = hjJ;
            1Bn.A0A(147631);
            Hzu hzu = new Hzu(context);
            this.A08 = hzu;
            hzu.A01 = new IVf(this);
            this.A05 = new HaU(view);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
