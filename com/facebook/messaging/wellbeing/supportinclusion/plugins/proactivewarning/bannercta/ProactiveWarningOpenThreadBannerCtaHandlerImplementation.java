package com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.bannercta;

import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.1pK;
import X.5Vk;
import X.6mK;
import X.6mL;
import X.7zM;
import X.7zR;
import X.7zU;
import X.7zV;
import X.9uK;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ProactiveWarningOpenThreadBannerCtaHandlerImplementation.class */
public final class ProactiveWarningOpenThreadBannerCtaHandlerImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1pK A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final ThreadKey A09;
    public final 6mL A0A;
    public final AtomicReference A0B;

    public ProactiveWarningOpenThreadBannerCtaHandlerImplementation(Context context, 1pK r303, ThreadKey threadKey) {
        7zR.A1N(r303, context);
        this.A02 = r303;
        this.A09 = threadKey;
        this.A00 = context;
        this.A0B = new AtomicReference(null);
        1Br A0Y = 7zM.A0Y();
        this.A06 = A0Y;
        FbUserSession A09 = 7zV.A09(r303, A0Y);
        this.A01 = A09;
        this.A05 = 1Lm.A00(context, A09, 68478);
        this.A04 = 1Bu.A01(context, 68479);
        1Br A00 = 1Bq.A00(66693);
        this.A08 = A00;
        this.A0A = ((6mK) 1Br.A0B(A00)).A01(threadKey.A04);
        this.A07 = 1Bu.A01(context, 68427);
        this.A03 = 1Bu.A00(68480);
    }

    public static final void A00(Context context, ThreadKey threadKey, ProactiveWarningOpenThreadBannerCtaHandlerImplementation proactiveWarningOpenThreadBannerCtaHandlerImplementation) {
        7zU.A0M((5Vk) 1Bu.A06(context, 82763), threadKey).A02(new 9uK(proactiveWarningOpenThreadBannerCtaHandlerImplementation));
    }
}
