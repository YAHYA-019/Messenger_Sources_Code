package com.facebook.messaging.rtc.views.rtcomnigridview;

import X.0FI;
import X.11T;
import X.1BL;
import X.2Qa;
import X.4YU;
import X.4zI;
import X.4zJ;
import X.AKW;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C2621GjB;
import X.C2630Gjf;
import X.C2631Gjg;
import X.C2632Gji;
import X.DKC;
import X.GOn;
import X.GV0;
import X.Gvg;
import X.HDm;
import X.HJy;
import X.HKz;
import X.HL3;
import X.Hr2;
import X.J8a;
import X.JFk;
import X.JKR;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: RtcOmniGridView.class */
public final class RtcOmniGridView extends GV0 implements JFk {
    public JKR A00;
    public HDm A01;
    public final C01i A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcOmniGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A01 = Gvg.A00;
        this.A02 = C01g.A01(new AKW(context, this, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0088, code lost:
    
        if (r308 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(X.8Lm r302, boolean r303) {
        /*
            r301 = this;
            r0 = r302
            java.lang.Object r0 = r0.A04
            X.8Lu r0 = (X.8Lu) r0
            java.lang.Object r0 = r0.A01
            r304 = r0
            X.J8b r0 = X.J8b.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb6
            X.Gvf r0 = X.Gvf.A00
            r307 = r0
        L22:
            r0 = r301
            X.HDm r0 = r0.A01
            r305 = r0
            r0 = r305
            r1 = r307
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto Laf
            r0 = r301
            java.lang.String r0 = X.I6F.A00(r0)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L8b
            r0 = 33088(0x8140, float:4.6366E-41)
            r309 = r0
            java.lang.String r0 = "RtcOmniGridView"
            r304 = r0
            r0 = r301
            r1 = r304
            com.facebook.auth.usersession.FbUserSession r0 = X.IDw.A01(r0, r1)
            r305 = r0
            r0 = r301
            r1 = r305
            r2 = r309
            java.lang.Object r0 = X.GOq.A0y(r0, r1, r2)
            X.2JS r0 = X.GOn.A0x(r0)
            r305 = r0
            r0 = r305
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r305
            com.facebook.rsys.state.gen.State r0 = X.GOq.A0m(r0)
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.localCallId
            r308 = r0
            r0 = r304
            java.util.List r0 = X.11T.A03(r0)
            r310 = r0
            java.lang.String r0 = "local_call_id_missing_in_ui"
            r311 = r0
            r0 = r311
            r1 = r308
            r2 = 0
            r3 = r310
            r4 = 0
            r5 = 0
            X.I6E.A01(r0, r1, r2, r3, r4, r5)
            r0 = r308
            if (r0 == 0) goto La9
        L8b:
            r0 = r308
            X.5Vt r0 = X.C9lt.A00(r0)
            kotlin.jvm.functions.Function1 r0 = r0.A00
            r304 = r0
            X.87v r0 = new X.87v
            r305 = r0
            r0 = r305
            r1 = r307
            r0.<init>(r1)
            r0 = r304
            r1 = r305
            java.lang.Object r0 = r0.invoke(r1)
        La9:
            r0 = r301
            r1 = r307
            r0.A01 = r1
        Laf:
            r0 = r301
            r1 = r302
            r2 = r303
            r0.A06(r1, r2)
            return
        Lb6:
            X.J8c r0 = X.J8c.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Ld0
            X.Gve r0 = X.Gve.A00
            r307 = r0
            goto L22
        Ld0:
            X.Gvg r0 = X.Gvg.A00
            r307 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.views.rtcomnigridview.RtcOmniGridView.A08(X.8Lm, boolean):void");
    }

    @Override // X.JFk
    public C2630Gjf ADL() {
        if (((List) super.A02.A05).isEmpty()) {
            return null;
        }
        OmniGridLayoutManager omniGridLayoutManager = this.A0H;
        C2632Gji c2632Gji = omniGridLayoutManager.A07;
        if (omniGridLayoutManager.A06.A01 != J8a.A00 || c2632Gji.A03 == 0 || c2632Gji.A02 == 0) {
            Hr2 hr2 = Hr2.A00;
            ImmutableMap A00 = HKz.A00();
            C2631Gjg c2631Gjg = new C2631Gjg(GridSelfViewLocation.TOP_RIGHT, hr2, hr2, hr2, hr2, hr2, hr2, GOn.A10(0), GOn.A10(0), A00, false, false, false, true);
            List list = (List) super.A02.A05;
            ArrayList A0z = 1BL.A0z(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0z.add(GV0.A01((C2621GjB) it.next(), (Map) super.A02.A06));
            }
            GridLayoutInput gridLayoutInput = new GridLayoutInput(A0z, c2631Gjg.A01(4YU.A08(this)), 1000, 1000);
            c2632Gji = HJy.A00(gridLayoutInput);
            4zJ r0 = 4zI.A03;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Computed grid layout for pip aspect ratio calculation, input: ");
            A0k.append(gridLayoutInput);
            r0.A05("RtcOmniGridView", AnonymousClass001.A0Z(c2632Gji, " output: ", A0k), new Object[0]);
        }
        Rect A0C = DKC.A0C();
        HL3.A00(A0C, c2632Gji);
        return new C2630Gjf(A0C.width(), A0C.height(), 6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2125881264);
        ((2Qa) this.A02.getValue()).A01 = this;
        super.onAttachedToWindow();
        0FI.A0C(-1488920498, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-183321117);
        ((2Qa) this.A02.getValue()).A01 = null;
        super.onDetachedFromWindow();
        0FI.A0C(1541129807, A06);
    }
}
