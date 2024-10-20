package X;

import android.content.Context;
import android.os.Looper;
import android.view.GestureDetector;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.threadview.renderer.audio.AudioMessageBubbleView;
import com.facebook.xapp.messaging.threadview.renderer.audio.ClipProgressLayout;

/* loaded from: H5r.class */
public final class H5r extends 48A {
    public float A00;
    public C5j5 A01;
    public 5vW A02;
    public 70W A03;
    public boolean A04;
    public final GestureDetector A05;
    public final C00i A06;
    public final AudioMessageBubbleView A07;
    public final AudioMessageBubbleView A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final Runnable A0B;
    public final ClipProgressLayout A0C;
    public final JN5 A0D;

    /* JADX WARN: Multi-variable type inference failed */
    public H5r(Context context) {
        super(context);
        this.A06 = AbH.A0I();
        this.A09 = new Ius(this);
        this.A0B = new Iut(this);
        this.A0A = new Iuu(this);
        this.A0D = new Im9(this);
        this.A05 = new GestureDetector(getContext(), (GestureDetector.OnGestureListener) new GTm(this, 13));
        this.A00 = 0.0f;
        setContentView(2132541536);
        this.A08 = C09s.A01(this, 2131362148);
        this.A07 = C09s.A01(this, 2131362149);
        this.A0C = C09s.A01(this, 2131362150);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static 70W A00(FbUserSession fbUserSession, H5r h5r) {
        70W r303 = h5r.A03;
        if (r303 == null) {
            1Bn.A0A(67181);
            r303 = new 70W(h5r.getContext());
            h5r.A03 = r303;
        }
        if (h5r.A02 != null && h5r.A01 != null) {
            r303.A06(h5r.A0D);
            h5r.A03.A05(fbUserSession, h5r.A01, (C5n6) h5r.A02.A00);
        }
        return h5r.A03;
    }

    public static void A01(H5r h5r, Integer num, Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h5r.A03(num);
        } else {
            1BK.A1E(h5r.A06).execute(runnable);
        }
    }

    public void A02(long j, float f) {
        this.A08.A0F(j);
        this.A07.A0F(j);
        if (f == 100.0f) {
            f = 0.0f;
        }
        this.A0C.setProgress(f / 100.0f);
        this.A00 = f;
    }

    public void A03(Integer num) {
        this.A04 = AnonymousClass001.A1W(num, 0S2.A00);
        this.A08.A0G(num);
        this.A07.A0G(num);
    }
}
