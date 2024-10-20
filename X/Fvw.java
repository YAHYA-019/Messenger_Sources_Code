package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.locale.Country;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.payments.p2m.attachreceipt.AttachReceiptActivity;
import com.facebook.payments.p2m.attachreceipt.models.BankAccountDetail;
import com.facebook.payments.p2m.attachreceipt.models.BankDetailsComponent;
import com.facebook.payments.p2m.attachreceipt.models.ConfirmButtonComponent;
import com.facebook.payments.p2m.attachreceipt.models.OffsiteBankTransferScreen;
import com.facebook.payments.p2m.attachreceipt.models.PhotoUploadComponent;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: Fvw.class */
public final class Fvw implements 1K9 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Fvw(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                FHt fHt = (FHt) this.A01;
                Set set = FHt.A0L;
                fHt.A0D.remove(this.A02);
                0fH.A0u("NTTypeaheadSource", "Normal search query failed", th);
                return;
            case 1:
                ((GFY) this.A01).BsZ();
                return;
            default:
                F9R f9r = (F9R) this.A01;
                F9R.A00(f9r.A01.A01, f9r, this.A02);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        2JY r0;
        2JY A0B;
        List list;
        String str;
        switch (this.A00) {
            case 0:
                GraphQLResult graphQLResult = (GraphQLResult) obj;
                FHt fHt = (FHt) this.A01;
                Set set = FHt.A0L;
                if (graphQLResult == null || ((AbstractC08294mh) graphQLResult).A03 == null) {
                    list = fHt.A02;
                } else {
                    java.util.Map A02 = FHt.A02(graphQLResult, fHt);
                    List A01 = FHt.A01(fHt, A02);
                    java.util.Map map = fHt.A0C;
                    map.putAll(A02);
                    List list2 = fHt.A0B;
                    Set set2 = FHt.A0K;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str = AnonymousClass001.A0i(it);
                            if (set2.contains(str)) {
                            }
                        } else {
                            str = "reorder";
                        }
                    }
                    if (str.equals("append_new_results")) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(fHt.A02);
                        linkedHashSet.addAll(A01);
                        list = 1BK.A17(linkedHashSet);
                    } else {
                        list = FHt.A01(fHt, map);
                    }
                }
                if (fHt.A00.equals(this.A02)) {
                    FJ5.A05();
                    fHt.A02 = list;
                    EeX.A00(fHt.A06, fHt.A09, list, false, false);
                    return;
                }
                return;
            case 1:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh != null && (r0 = (2JY) abstractC08294mh.A03) != null && (A0B = 1BK.A0B(r0, 2JX.class, 1457445091, 1043648864)) != null) {
                    2JY A0B2 = 1BK.A0B(A0B, 2JX.class, -878512131, -2071289636);
                    BankDetailsComponent bankDetailsComponent = null;
                    if (A0B2 != null) {
                        String A0o = A0B2.A0o();
                        String A0r = A0B2.A0r(-2060497896);
                        ImmutableList A0c = 7zU.A0c(A0B2, 2JX.class, -1787434815, 828917081);
                        ImmutableList.Builder builder = ImmutableList.builder();
                        1Du it2 = A0c.iterator();
                        while (it2.hasNext()) {
                            2JY A0P = 7zL.A0P(it2);
                            String A0r2 = A0P.A0r(-1787383122);
                            String A0r3 = A0P.A0r(652065612);
                            String A0r4 = A0P.A0r(550036478);
                            String A0r5 = A0P.A0r(727380379);
                            String A0r6 = A0P.A0r(-1938127243);
                            if (A0r2 != null && A0r3 != null && A0r5 != null) {
                                builder.m11011add((Object) new BankAccountDetail(A0r4, A0r5, A0r6, A0r3, A0r2));
                            }
                        }
                        ImmutableList A012 = 1Fj.A01(builder);
                        if (A0o != null && A0r != null && !A012.isEmpty()) {
                            ImmutableList.of();
                            bankDetailsComponent = new BankDetailsComponent(A012, A0r, A0o);
                        }
                    }
                    2JY A0B3 = 1BK.A0B(A0B, 2JX.class, -1449329416, 1287740859);
                    PhotoUploadComponent photoUploadComponent = null;
                    if (A0B3 != null) {
                        String A0o2 = A0B3.A0o();
                        String A0r7 = A0B3.A0r(-2060497896);
                        if (A0o2 != null && A0r7 != null) {
                            photoUploadComponent = new PhotoUploadComponent(A0r7, A0o2);
                        }
                    }
                    2JY A0B4 = 1BK.A0B(A0B, 2JX.class, 1285659205, 798582225);
                    ConfirmButtonComponent confirmButtonComponent = null;
                    if (A0B4 != null) {
                        String A0r8 = A0B4.A0r(1292959499);
                        String A0r9 = A0B4.A0r(1253979765);
                        if (A0r8 != null && A0r9 != null) {
                            confirmButtonComponent = new ConfirmButtonComponent(A0r9, A0r8);
                        }
                    }
                    if (bankDetailsComponent != null && photoUploadComponent != null && confirmButtonComponent != null) {
                        GFY gfy = (GFY) this.A01;
                        String str2 = this.A02;
                        OffsiteBankTransferScreen offsiteBankTransferScreen = new OffsiteBankTransferScreen(bankDetailsComponent, confirmButtonComponent, photoUploadComponent);
                        AttachReceiptActivity attachReceiptActivity = (AttachReceiptActivity) gfy;
                        ((FG0) 1Br.A0B(attachReceiptActivity.A04)).A03(EN1.A02, "load_success");
                        Fragment A0b = attachReceiptActivity.BDe().A0b("attach_receipt_loading_fragment");
                        if (A0b != null) {
                            C06c A0D = 7zU.A0D(attachReceiptActivity);
                            A0D.A0I(A0b);
                            A0D.A04();
                        }
                        Fragment dz5 = new DZ5();
                        C06c A0D2 = 7zU.A0D(attachReceiptActivity);
                        A0D2.A0Q(dz5, "attach_receipt_title_fragment", 2131368077);
                        A0D2.A04();
                        BankDetailsComponent bankDetailsComponent2 = offsiteBankTransferScreen.A00;
                        11T.A0A(bankDetailsComponent2);
                        Fragment dYj = new DYj();
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable("bank_details_param_key", bankDetailsComponent2);
                        dYj.setArguments(A05);
                        C06c A0D3 = 7zU.A0D(attachReceiptActivity);
                        A0D3.A0Q(dYj, "AttachReceiptBankDetailsFragment", 2131362354);
                        A0D3.A04();
                        PhotoUploadComponent photoUploadComponent2 = offsiteBankTransferScreen.A02;
                        11T.A0A(photoUploadComponent2);
                        Fragment dZk = new DZk();
                        Bundle A052 = 1BK.A05();
                        A052.putParcelable("photo_upload_photo_fragment", photoUploadComponent2);
                        dZk.setArguments(A052);
                        C06c A0D4 = 7zU.A0D(attachReceiptActivity);
                        A0D4.A0Q(dZk, "AttachReceiptUploadPhotoFragment", 2131368261);
                        A0D4.A04();
                        ConfirmButtonComponent confirmButtonComponent2 = offsiteBankTransferScreen.A01;
                        11T.A0A(confirmButtonComponent2);
                        Fragment dzm = new DZM();
                        Bundle A053 = 1BK.A05();
                        A053.putString("invoice_id", str2);
                        A053.putParcelable("confirm_button_param_key", confirmButtonComponent2);
                        dzm.setArguments(A053);
                        C06c A0D5 = 7zU.A0D(attachReceiptActivity);
                        A0D5.A0Q(dzm, "AttachReceiptConfirmFragment", 2131363267);
                        A0D5.A04();
                        return;
                    }
                }
                ((GFY) this.A01).BsZ();
                return;
            default:
                Country country = (Country) obj;
                F9R f9r = (F9R) this.A01;
                if (country == null) {
                    country = f9r.A01.A01;
                }
                F9R.A00(country, f9r, this.A02);
                return;
        }
    }
}
