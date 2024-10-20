package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewAiBotParamsMetadata;

/* renamed from: X.9cp, reason: invalid class name */
/* loaded from: 9cp.class */
public abstract class C9cp {
    public Uri A00;
    public 8CW A01;
    public Integer A02;
    public C2a2 A03;
    public final Context A04;
    public final LifecycleOwner A05;
    public final 2S4 A06;
    public final 1Br A07;
    public final ThreadKey A08;
    public final C6ri A09;
    public final C01i A0A;
    public final C01i A0B;
    public final boolean A0C;
    public final FbUserSession A0D;

    public C9cp(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 2S4 r305, ThreadKey threadKey, ThreadViewAiBotParamsMetadata threadViewAiBotParamsMetadata, C6ri c6ri) {
        this.A04 = context;
        this.A05 = lifecycleOwner;
        this.A08 = threadKey;
        this.A0D = fbUserSession;
        this.A06 = r305;
        this.A09 = c6ri;
        C03i c03i = C03i.A02;
        this.A0A = AQa.A00(this, c03i, 3);
        this.A0B = AQa.A00(this, c03i, 4);
        this.A07 = 1Lm.A00(context, fbUserSession, 65869);
        this.A0C = threadViewAiBotParamsMetadata.A0E;
    }

    public void A01() {
        int intValue;
        int intValue2;
        C8uS c8uS = (C8uS) this;
        8Cf r0 = c8uS.A01;
        if (r0 != null) {
            Uri uri = ((C9cp) c8uS).A00;
            Integer num = ((C9cp) c8uS).A02;
            if (num != null && (intValue2 = num.intValue()) != 0) {
                r0.setBackground(7zL.A0D(intValue2));
            }
            if (uri != null) {
                5C4 AJb = 5BS.A01().AJb();
                5BY A03 = 5BS.A03();
                Resources resources = r0.getResources();
                11T.A0A(resources);
                5BR A05 = A03.A05(resources, 5Bm.A01(uri, (java.util.Map) null));
                5Bw A01 = 5BS.A01();
                11T.A0I(AJb, "null cannot be cast to non-null type com.facebook.fresco.vito.core.FrescoDrawableInterface");
                A01.ARx((Rect) null, (ContextChain) null, (5CK) null, (AWg) null, AJb, A05, (5Bk) null, (InterfaceC06154g3) null, CallerContext.A0B("AiBotNullStateView"));
                r0.setBackground(AJb);
            }
        }
        8Cd r02 = c8uS.A00;
        if (r02 != null) {
            Uri uri2 = ((C9cp) c8uS).A00;
            Integer num2 = ((C9cp) c8uS).A02;
            if (num2 != null && (intValue = num2.intValue()) != 0) {
                r02.setBackground(7zL.A0D(intValue));
            }
            if (uri2 != null) {
                5C4 AJb2 = 5BS.A01().AJb();
                5BY A032 = 5BS.A03();
                Resources resources2 = r02.getResources();
                11T.A0A(resources2);
                5BR A052 = A032.A05(resources2, 5Bm.A01(uri2, (java.util.Map) null));
                5Bw A012 = 5BS.A01();
                11T.A0I(AJb2, "null cannot be cast to non-null type com.facebook.fresco.vito.core.FrescoDrawableInterface");
                A012.ARx((Rect) null, (ContextChain) null, (5CK) null, (AWg) null, AJb2, A052, (5Bk) null, (InterfaceC06154g3) null, CallerContext.A0B("AiBotCardStackNullStateView"));
                r02.setBackground(AJb2);
            }
        }
    }

    public void A02() {
        C01i c01i = this.A0B;
        9OO r0 = (9OO) c01i.getValue();
        C93f c93f = (C93f) 1Lm.A05(this.A04, this.A0D, 68743);
        ThreadKey threadKey = this.A08;
        11T.A0F(threadKey, 0);
        r0.A01 = ((C5jm) 1Lm.A06(c93f.A00, 68746)).A00(0Pz.A0W("NULL_STATE_UI_STATE_PREFIX", 4YU.A0y(threadKey))).A02;
        9OO r02 = (9OO) c01i.getValue();
        boolean z = this.A0C;
        float f = 0.0f;
        float f2 = 100.0f;
        if (z) {
            f2 = 0.0f;
            f = 100.0f;
        }
        8Ko r03 = new 8Ko(f2, f, z);
        r02.A00 = r03;
        C5jn c5jn = r02.A01;
        if (c5jn != null) {
            c5jn.A00(r03);
        }
        C2a2 c2a2 = this.A03;
        if ((c2a2 == null || !c2a2.BQN()) && this.A00 == null) {
            this.A03 = 2aK.A04(new AJe(this, null, 45), (2aI) this.A0A.getValue());
        }
    }

    public void A03() {
        8CW r0 = this.A01;
        if (r0 == null || !r0.A08) {
            return;
        }
        r0.A00 = 0;
    }

    public abstract void A04();
}
