package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.facebook.quickpromotion.ui.QuickPromotionInterstitialActivity;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4v6.class */
public final class C10984v6 extends 2vS {
    public static final InterstitialTrigger A01 = new InterstitialTrigger(1088, (String) null);
    public final ImmutableList A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10984v6() {
        /*
            r301 = this;
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r302
            r1 = 0
            r2 = 17149(0x42fd, float:2.4031E-41)
            java.lang.Object r0 = X.1Bn.A0E(r0, r1, r2)
            X.2xd r0 = (X.C2xd) r0
            r303 = r0
            r0 = r301
            r1 = r303
            r0.<init>(r1)
            com.facebook.interstitial.triggers.InterstitialTrigger r0 = X.C10984v6.A01
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            r0 = r301
            r1 = r303
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10984v6.<init>():void");
    }

    public long A01() {
        return 0L;
    }

    public Intent A02(Context context) {
        11T.A0F(context, 0);
        return C3o5.A0D(context, QuickPromotionInterstitialActivity.class);
    }

    public String A04() {
        return "in context unit of comment permalink";
    }

    public Set A05() {
        Set singleton = Collections.singleton(QuickPromotionDefinition.TemplateType.A0L);
        11T.A0A(singleton);
        return singleton;
    }

    public boolean A07() {
        return true;
    }

    public String Arn() {
        return "6972";
    }

    public C4Hx BC9(InterstitialTrigger interstitialTrigger) {
        return C4Hx.A02;
    }

    public ImmutableList BHB() {
        return this.A00;
    }
}
