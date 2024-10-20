package com.meta.metaai.imagine.creation.impl.data;

import X.0Du;
import X.0QD;
import X.0Ro;
import X.0S2;
import X.0Xr;
import X.0Xs;
import X.1BK;
import X.2aI;
import X.AQD;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C15t;
import X.C2a2;
import X.C3o5;
import X.C9fl;
import X.EMg;
import X.Eyx;
import X.EzU;
import X.F9y;
import X.FHP;
import X.FJg;
import X.Fyk;
import X.GBU;
import android.app.Application;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: ImagineGenerationImageRepository.class */
public final class ImagineGenerationImageRepository {
    public boolean A00;
    public C2a2 A01;
    public final Application A02;
    public final FHP A03;
    public final FJg A04;
    public final EMg A05;
    public final ImagineNetworkService A06;
    public final Integer A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final C01i A0B;
    public final 0Xs A0C;
    public final 0Xs A0D;
    public final C15t A0E;
    public final C15t A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final MetaAIFeedbackNetworkService A0I;
    public final 2aI A0J;

    public ImagineGenerationImageRepository(Application application, FHP fhp, EMg eMg, ImagineNetworkService imagineNetworkService, MetaAIFeedbackNetworkService metaAIFeedbackNetworkService, Integer num, String str, 2aI r309, boolean z, boolean z2, boolean z3) {
        Eyx eyx;
        Object value;
        String str2;
        C3o5.A0k(eMg, 4, num);
        this.A02 = application;
        this.A06 = imagineNetworkService;
        this.A0J = r309;
        this.A05 = eMg;
        this.A07 = num;
        this.A03 = fhp;
        this.A0I = metaAIFeedbackNetworkService;
        this.A0G = z;
        this.A0H = z2;
        this.A08 = str;
        this.A0B = C01g.A00(C03i.A02, AQD.A00);
        FJg fJg = new FJg();
        this.A04 = fJg;
        0Ro A00 = 0Du.A00((Object) null);
        this.A0C = A00;
        String str3 = null;
        this.A0E = new 0Xr((C2a2) null, A00);
        this.A0A = AnonymousClass001.A0s();
        this.A09 = AnonymousClass001.A0s();
        0Ro A002 = 0Du.A00(Fyk.A00);
        this.A0D = A002;
        this.A0F = new 0Xr((C2a2) null, A002);
        application.registerComponentCallbacks(fJg);
        if (!this.A0H || (eyx = ((C9fl) this.A0B.getValue()).A01) == null) {
            return;
        }
        List list = eyx.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (((F9y) obj).A02 == 0S2.A01) {
                A0s.add(obj);
            }
        }
        0Xs r0 = this.A0C;
        do {
            value = r0.getValue();
            str2 = eyx.A01;
        } while (!r0.AGt(value, new Eyx(str2, A0s, eyx.A00, eyx.A03)));
        F9y f9y = (F9y) 0QD.A0E(A0s);
        EzU ezU = f9y != null ? f9y.A01 : null;
        List list2 = eyx.A02;
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object obj2 : list2) {
            if (((F9y) obj2).A02 == 0S2.A00) {
                A0s2.add(obj2);
            }
        }
        if (1BK.A1Y(A0s2)) {
            A02(null, str2, ezU != null ? ezU.A03 : str3, GBU.A00, A0s2.size(), false, z3, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00(X.EM4 r302, java.lang.String r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A00(X.EM4, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A01(java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r0.BQN() != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(X.F9y r302, java.lang.String r303, java.lang.String r304, kotlin.jvm.functions.Function1 r305, int r306, boolean r307, boolean r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A02(X.F9y, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, int, boolean, boolean, boolean):void");
    }
}
