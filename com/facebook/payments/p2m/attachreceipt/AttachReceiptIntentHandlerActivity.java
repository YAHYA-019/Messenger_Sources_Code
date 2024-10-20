package com.facebook.payments.p2m.attachreceipt;

import X.0Q8;
import X.0fH;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.7zL;
import X.7zQ;
import X.7zR;
import X.7zU;
import X.C2125Dee;
import X.C3o5;
import X.C5ic;
import X.DKH;
import X.DR6;
import X.EN1;
import X.F8G;
import X.FG0;
import X.FK6;
import X.Fma;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2m.attachreceipt.photopicker.AttachReceiptPhotoPickerActivity;

/* loaded from: AttachReceiptIntentHandlerActivity.class */
public final class AttachReceiptIntentHandlerActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public C2125Dee A01;
    public C5ic A02;
    public MigColorScheme A03;
    public F8G A04;
    public String A05;
    public String A06;
    public final 1Br A07 = 1BK.A0C();
    public final 1Br A08 = 1Bq.A00(98533);

    public static final void A12(AttachReceiptIntentHandlerActivity attachReceiptIntentHandlerActivity) {
        if (attachReceiptIntentHandlerActivity.isFinishing()) {
            return;
        }
        ((FG0) 1Br.A0B(attachReceiptIntentHandlerActivity.A08)).A04(EN1.A01, (String) null);
        attachReceiptIntentHandlerActivity.finish();
    }

    public static final void A15(AttachReceiptIntentHandlerActivity attachReceiptIntentHandlerActivity) {
        1Br r0 = attachReceiptIntentHandlerActivity.A08;
        FG0 fg0 = (FG0) 1Br.A0B(r0);
        EN1 en1 = EN1.A01;
        fg0.A05(en1, "XMA_CTA_CLICK");
        String str = attachReceiptIntentHandlerActivity.A05;
        if (str != null) {
            ((FG0) 1Br.A0B(r0)).A06(en1, "invoice_id", str);
        }
        String str2 = attachReceiptIntentHandlerActivity.A06;
        if (str2 != null) {
            ((FG0) 1Br.A0B(r0)).A06(en1, "seller_id", str2);
        }
        ((FG0) 1Br.A0B(r0)).A03(en1, "photo_picker_opened");
        1BK.A0W().A09(attachReceiptIntentHandlerActivity, C3o5.A0D(attachReceiptIntentHandlerActivity, AttachReceiptPhotoPickerActivity.class), 1);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = DKH.A0H(this);
        this.A02 = 7zQ.A0l();
        this.A05 = getIntent().getStringExtra("invoice_id");
        this.A06 = getIntent().getStringExtra("page_id");
        String str = this.A05;
        if (str == null || str.length() == 0) {
            return;
        }
        if (!1Br.A07(this.A07).AZk(36313342900771023L)) {
            A15(this);
            return;
        }
        if (this.A02 == null) {
            throw 1BK.A0h();
        }
        MigColorScheme migColorScheme = this.A03;
        if (migColorScheme == null) {
            migColorScheme = 7zR.A0c(this);
        }
        this.A03 = migColorScheme;
        DR6 A01 = C5ic.A01(this, migColorScheme);
        A01.A00(2131967750);
        A01.A06(2131967749);
        A01.A0D(FK6.A00(this, 68), 2131967751);
        A01.A0B(FK6.A00(this, 69), 2131967752);
        A01.A0K(false);
        A01.A05();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            1Br r0 = this.A08;
            FG0 fg0 = (FG0) 1Br.A0B(r0);
            EN1 en1 = EN1.A01;
            fg0.A03(en1, "photo_picker_closed");
            if (i2 == -1) {
                if (intent == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra("selected_photo_uri");
                if (stringExtra != null && stringExtra.length() != 0) {
                    ((FG0) 1Br.A0B(r0)).A03(en1, "image_selected");
                    String str = this.A05;
                    if (str != null && str.length() != 0) {
                        try {
                            Uri A0C = 7zU.A0C(stringExtra);
                            F8G f8g = this.A04;
                            if (f8g == null) {
                                f8g = (F8G) 1Bn.A0E(this, (1BY) null, 98531);
                            }
                            this.A04 = f8g;
                            FbUserSession fbUserSession = this.A00;
                            if (fbUserSession == null) {
                                7zL.A1C();
                                throw 0Q8.createAndThrow();
                            }
                            f8g.A01(this, A0C, fbUserSession, new Fma(this), str);
                            return;
                        } catch (SecurityException e) {
                            0fH.A0r("AttachReceiptIntentHandlerActivity", "Cannot parse image uri", e);
                            A12(this);
                            return;
                        }
                    }
                }
            }
            A12(this);
        }
    }
}
