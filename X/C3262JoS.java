package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;

/* renamed from: X.JoS, reason: case insensitive filesystem */
/* loaded from: JoS.class */
public final class C3262JoS extends KTe {
    public int A00;
    public int A01;
    public final Context A02;
    public final Handler A03;

    public C3262JoS() {
        boolean A09 = ((1CQ) 1Bi.A03(131252)).A09(2, false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 768, -3);
        if (!A09) {
            layoutParams.flags |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        }
        layoutParams.layoutInDisplayCutoutMode = 1;
        layoutParams.gravity = 51;
        ((KTe) this).A02 = layoutParams;
        ((KTe) this).A00 = AnonymousClass001.A07();
        setTouchable(true);
        setFocusable(false);
        Context A0J = 7zP.A0J();
        Handler handler = (Handler) 1Bn.A0B(16430);
        this.A02 = A0J;
        this.A03 = handler;
        setX(LocationComponentCompassEngine.SENSOR_DELAY_MICROS);
        setFocusable(false);
    }

    public static void A00(C3262JoS c3262JoS) {
        int height;
        View view = ((KTe) c3262JoS).A01;
        if (view == null || view.getWidth() <= 0 || ((KTe) c3262JoS).A01.getHeight() <= 0) {
            return;
        }
        JwQ jwQ = ((KTe) c3262JoS).A01;
        Integer num = jwQ.A03;
        if (num == 0S2.A01 || num == 0S2.A00) {
            c3262JoS.setX(c3262JoS.A00);
            height = c3262JoS.A01 - (((KTe) c3262JoS).A01.getHeight() / 2);
        } else {
            if (num != 0S2.A0C) {
                return;
            }
            c3262JoS.setX(c3262JoS.A00 - (jwQ.getWidth() / 2));
            height = c3262JoS.A01;
        }
        c3262JoS.setY(height);
    }

    public void A02() {
        this.A03.removeCallbacksAndMessages(null);
        ((KTe) this).A01.A00 = null;
        super.A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.common.util.concurrent.ListenableFuture] */
    public void A03() {
        Object obj;
        JwQ jwQ = ((KTe) this).A01;
        C66i c66i = jwQ.A01;
        if (c66i.A09.A00 == 0.0d) {
            obj = 1hM.A01;
        } else {
            jwQ.A02 = 4YU.A0j();
            c66i.A07(0.0d);
            obj = jwQ.A02;
        }
        obj.addListener(new Ll2(this), 1JU.A01);
    }

    public void A04() {
        JwQ jwQ = ((KTe) this).A01;
        C66i c66i = jwQ.A01;
        if (c66i.A09.A00 != 1.0d) {
            jwQ.A02 = 4YU.A0j();
            c66i.A07(1.0d);
        }
    }
}
