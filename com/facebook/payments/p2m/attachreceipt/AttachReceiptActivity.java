package com.facebook.payments.p2m.attachreceipt;

import X.07S;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1FV;
import X.1Lo;
import X.1pK;
import X.2JX;
import X.2Jf;
import X.4YU;
import X.4YV;
import X.5BG;
import X.5BH;
import X.5Bm;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.7zU;
import X.C00i;
import X.C06c;
import X.C3sa;
import X.C5ic;
import X.DKH;
import X.DKy;
import X.DR6;
import X.DZM;
import X.DZk;
import X.EN1;
import X.Ell;
import X.FG0;
import X.FKB;
import X.Fvw;
import X.GCy;
import X.GFY;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Map;

/* loaded from: AttachReceiptActivity.class */
public final class AttachReceiptActivity extends FbFragmentActivity implements GFY, GCy {
    public FbUserSession A00;
    public C00i A01;
    public C5ic A02;
    public MigColorScheme A03;
    public final 1Br A04 = 1Bq.A00(98533);

    public static final void A12(AttachReceiptActivity attachReceiptActivity) {
        if (attachReceiptActivity.isFinishing()) {
            return;
        }
        ((FG0) 1Br.A0B(attachReceiptActivity.A04)).A04(EN1.A02, (String) null);
        attachReceiptActivity.finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A00 = DKH.A0H(this);
        setContentView(2132541527);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession != null) {
            ((DKy) 1Lo.A04(this, fbUserSession, (1BY) null, 99445)).A01(this);
            View findViewById = findViewById(2131365419);
            if (findViewById != null) {
                MigColorScheme migColorScheme = this.A03;
                if (migColorScheme == null) {
                    migColorScheme = 7zR.A0c(this);
                }
                this.A03 = migColorScheme;
                MigColorScheme.A00(findViewById, migColorScheme);
            }
            String stringExtra = getIntent().getStringExtra("invoice_id");
            String stringExtra2 = getIntent().getStringExtra("page_id");
            String stringExtra3 = getIntent().getStringExtra("entry_point");
            if (stringExtra3 == null) {
                stringExtra3 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            }
            1Br r0 = this.A04;
            FG0 fg0 = (FG0) 1Br.A0B(r0);
            EN1 en1 = EN1.A02;
            fg0.A05(en1, stringExtra3);
            if (stringExtra2 != null) {
                ((FG0) 1Br.A0B(r0)).A06(en1, "seller_id", stringExtra2);
            }
            if (stringExtra != null) {
                ((FG0) 1Br.A0B(r0)).A06(en1, "invoice_id", stringExtra);
                if (stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
                    View requireViewById = requireViewById(2131362120);
                    11T.A0A(requireViewById);
                    MigColorScheme migColorScheme2 = this.A03;
                    if (migColorScheme2 == null) {
                        migColorScheme2 = 7zR.A0c(this);
                    }
                    this.A03 = migColorScheme2;
                    MigColorScheme.A00(requireViewById, migColorScheme2);
                    1Br r304 = this.A01;
                    if (r304 == null) {
                        r304 = 1Bu.A01(this, 98532);
                    }
                    this.A01 = r304;
                    Object obj = r304.get();
                    11T.A0A(obj);
                    Ell ell = (Ell) obj;
                    if (this.A00 != null) {
                        ((FG0) 1Br.A0B(r0)).A03(en1, "load_start");
                        Fragment fragment = new 1pK();
                        C06c A0D = 7zU.A0D(this);
                        A0D.A0Q(fragment, "attach_receipt_loading_fragment", 2131365304);
                        A0D.A04();
                        07S A02 = GraphQlCallInput.A02.A02();
                        GraphQlQueryParamSet A0N = 4YU.A0N(A02, stringExtra, "invoice_id");
                        4YV.A1A(A02, A0N, "input");
                        1FV A09 = 7zT.A09(ell.A00).A09(C3sa.A00(7zM.A0L(A0N, new 2Jf(2JX.class, (Class) null, "MCOMOffsiteBankDetailsScreenRootCall", (String) null, "fbandroid", 1368404509, 0, 2083093256L, 2083093256L, false, true)).A01()));
                        1Br.A0D(ell.A01, new Fvw(stringExtra, this, 1), A09);
                        return;
                    }
                }
            }
            A12(this);
            return;
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    public void BsZ() {
        1Br r0 = this.A04;
        FG0 fg0 = (FG0) 1Br.A0B(r0);
        EN1 en1 = EN1.A02;
        fg0.A03(en1, "load_failure");
        ((FG0) 1Br.A0B(r0)).A04(en1, "Data fetch failed");
        C5ic c5ic = this.A02;
        if (c5ic == null) {
            c5ic = 7zQ.A0l();
        }
        this.A02 = c5ic;
        MigColorScheme migColorScheme = this.A03;
        if (migColorScheme == null) {
            migColorScheme = 7zR.A0c(this);
        }
        this.A03 = migColorScheme;
        DR6 A01 = C5ic.A01(this, migColorScheme);
        A01.A00(2131957316);
        A01.A06(2131957337);
        A01.A0D((DialogInterface.OnClickListener) null, 2131962432);
        A01.A0H(new FKB(this, 5));
        A01.A05();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            1Br r0 = this.A04;
            FG0 fg0 = (FG0) 1Br.A0B(r0);
            EN1 en1 = EN1.A02;
            fg0.A03(en1, "photo_picker_closed");
            if (i2 != -1 || intent == null || (stringExtra = intent.getStringExtra("selected_photo_uri")) == null || stringExtra.length() == 0) {
                return;
            }
            ((FG0) 1Br.A0B(r0)).A03(en1, "image_selected");
            DZk A0b = BDe().A0b("AttachReceiptUploadPhotoFragment");
            if (A0b != null) {
                DZk.A03(A0b, false);
                try {
                    Uri A0C = 7zU.A0C(stringExtra);
                    LithoView lithoView = A0b.A00;
                    if (lithoView != null) {
                        5BH A01 = 5BG.A01(lithoView.A09);
                        A01.A2a(5Bm.A01(A0C, (Map) null));
                        A01.A2Z(DZk.A08);
                        A01.A2b(DZk.A07);
                        A01.A0J();
                        lithoView.A0x(A01.A00);
                        Object obj = A0b.A01;
                        if (obj != null) {
                            DZM A0b2 = ((FragmentActivity) obj).BDe().A0b("AttachReceiptConfirmFragment");
                            if (A0b2 != null) {
                                A0b2.A00 = A0C;
                                if (A0b2.A02 != null) {
                                    A0b2.A06 = true;
                                    DZM.A03(A0b2);
                                }
                            }
                        }
                    }
                } catch (SecurityException e) {
                    DZk.A03(A0b, true);
                    0fH.A0r("AttachReceiptUploadPhotoFragment", "Cannot parse image uri", e);
                }
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        A12(this);
    }
}
