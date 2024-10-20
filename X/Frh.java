package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.checkout.model.CheckoutData;
import com.google.common.collect.ImmutableList;

/* loaded from: Frh.class */
public final class Frh implements JKS {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 1Iw A02;
    public final /* synthetic */ MigColorScheme A03;
    public final /* synthetic */ CheckoutData A04;
    public final /* synthetic */ ImmutableList A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public Frh(View.OnClickListener onClickListener, View view, 1Iw r304, MigColorScheme migColorScheme, CheckoutData checkoutData, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = r304;
        this.A03 = migColorScheme;
        this.A04 = checkoutData;
        this.A09 = str;
        this.A0A = str2;
        this.A01 = view;
        this.A05 = immutableList;
        this.A00 = onClickListener;
        this.A0B = str3;
        this.A07 = str4;
        this.A06 = str5;
        this.A08 = str6;
    }

    public void onPermissionsCheckCanceled() {
    }

    public void onPermissionsGranted() {
        1Iw r0 = this.A02;
        MigColorScheme migColorScheme = this.A03;
        CheckoutData checkoutData = this.A04;
        String str = this.A09;
        String str2 = this.A0A;
        FGJ.A02(this.A00, this.A01, r0, migColorScheme, checkoutData, this.A05, (Integer) null, (Integer) null, str, str2, (String) null, (String) null, (String) null);
        Dzl.A0L(r0, this.A0B, this.A07, this.A06, this.A08);
    }

    public void onPermissionsNotGranted(String[] strArr, String[] strArr2) {
    }
}
