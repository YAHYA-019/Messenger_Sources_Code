package com.facebook.messaging.interop.plugins.banner.xacsunset;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1EZ;
import X.1Fw;
import X.1LI;
import X.2Sh;
import X.2yD;
import X.5Hr;
import X.63D;
import X.6Ky;
import X.7OX;
import X.7Ou;
import X.9DU;
import X.AnonymousClass831;
import X.AnonymousClass834;
import X.C01g;
import X.C01i;
import X.C1pq;
import X.C9g0;
import X.C9pv;
import X.CZv;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: XacSunsetImplementation.class */
public final class XacSunsetImplementation {
    public 7OX A00;
    public final Context A01;
    public final Observer A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadKey A06;
    public final 63D A07;
    public final C01i A08;
    public final C01i A09;
    public final C01i A0A;

    public XacSunsetImplementation(Context context, ThreadKey threadKey, 63D r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 3);
        this.A01 = context;
        this.A06 = threadKey;
        this.A07 = r304;
        this.A04 = 1Bu.A00(67674);
        this.A03 = 1Bu.A00(82613);
        this.A05 = 1Bq.A00(67528);
        this.A09 = C01g.A01(new AnonymousClass831(this, 49));
        this.A08 = C01g.A01(new AnonymousClass831(this, 48));
        this.A0A = C01g.A01(new AnonymousClass834(this, 0));
        this.A02 = new CZv(this, 2);
    }

    public static final void A00(XacSunsetImplementation xacSunsetImplementation, ThreadSummary threadSummary, 7OX r303) {
        if (r303 == null || threadSummary == null) {
            return;
        }
        Context context = xacSunsetImplementation.A01;
        if (((5Hr) xacSunsetImplementation.A04.A00.get()).A02(context, 1Fw.A04((1EZ) 1Bu.A06(context, 16428)), threadSummary, (User) null, (2Sh) null).A00.get(193)) {
            String str = (String) xacSunsetImplementation.A09.getValue();
            C1pq.A08("title", str);
            String str2 = (String) xacSunsetImplementation.A08.getValue();
            int A00 = 2yD.A00(1Br.A07(((7Ou) 1Br.A0B(xacSunsetImplementation.A03)).A00), 36605138680486897L);
            String str3 = (String) xacSunsetImplementation.A0A.getValue();
            11T.A0A(str3);
            r303.CXr(new 6Ky((View.OnClickListener) null, (View.OnClickListener) null, (1LI) null, (C9g0) null, 9DU.A00(new C9pv(xacSunsetImplementation, 11), str3), (C9g0) null, (ImmutableList) null, "ls://circleicon?icon=comment_left_right&iconColor=staticwhite&circleColor=blue", str2, str, (Class) null, (Integer) null, A00, false));
        }
    }
}
