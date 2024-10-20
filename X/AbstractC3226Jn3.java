package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.fbpay.w3c.CardDetails;

/* renamed from: X.Jn3, reason: case insensitive filesystem */
/* loaded from: Jn3.class */
public abstract class AbstractC3226Jn3 extends JnD {
    public static final String __redex_internal_original_name = "SaveAutofillPaymentBottomSheetDialogFragment";
    public LET A00;
    public C11474wl A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public String A06 = "";

    /* JADX WARN: Multi-variable type inference failed */
    public void onCancel(DialogInterface dialogInterface) {
        JgX jgX;
        AbstractC3252Jnp A0U;
        11T.A0F(dialogInterface, 0);
        if (this.A00 != null && this.mArguments != null) {
            Parcelable parcelable = null;
            if (11T.A0O(this.A06, "partial_credential_save_first_screen")) {
                LET let = this.A00;
                if (let != null) {
                    Bundle bundle = this.mArguments;
                    Parcelable parcelable2 = bundle != null ? bundle.getParcelable("contact_info") : null;
                    Parcelable.Creator creator = CardDetails.CREATOR;
                    11T.A0B(creator);
                    let.A0P(KWB.A00((AutofillData) null, (CardDetails) 0Gm.A01(creator, parcelable2, CardDetails.class)));
                }
            } else {
                boolean A0O = 11T.A0O(this.A06, "partial_credential_save_second_screen");
                LET let2 = this.A00;
                if (A0O) {
                    if (let2 != null) {
                        Bundle bundle2 = this.mArguments;
                        Parcelable parcelable3 = bundle2 != null ? bundle2.getParcelable("payment_info") : null;
                        Parcelable.Creator creator2 = CardDetails.CREATOR;
                        11T.A0B(creator2);
                        if (KWB.A00((AutofillData) null, (CardDetails) 0Gm.A01(creator2, parcelable3, CardDetails.class)) != null) {
                            let2.A0F = true;
                            LEA.A09(let2, let2.A0H("DECLINED_CONFIRM_DETAILS_SAVE"));
                        }
                    }
                } else if (let2 != null) {
                    Bundle bundle3 = this.mArguments;
                    Parcelable parcelable4 = bundle3 != null ? bundle3.getParcelable("contact_info") : null;
                    Parcelable.Creator creator3 = AutofillData.CREATOR;
                    11T.A0B(creator3);
                    AutofillData autofillData = (AutofillData) 0Gm.A01(creator3, parcelable4, AutofillData.class);
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null) {
                        parcelable = bundle4.getParcelable("payment_info");
                    }
                    Parcelable.Creator creator4 = CardDetails.CREATOR;
                    11T.A0B(creator4);
                    L1y A00 = KWB.A00(autofillData, (CardDetails) 0Gm.A01(creator4, parcelable, CardDetails.class));
                    if (A00 != null) {
                        EnumC11364wa enumC11364wa = (EnumC11364wa) let2.A0P.A00.A0O.A00;
                        LET.A08(let2, enumC11364wa, A00, enumC11364wa == EnumC11364wa.A02 ? "DECLINED_SAVE" : (enumC11364wa == EnumC11364wa.A04 && let2.A03.A0J()) ? "DECLINED_RE_OPT_IN" : "DECLINED_ADD_NEW_CARD");
                        C3243Jnf c3243Jnf = let2.A03;
                        if (c3243Jnf.A0J()) {
                            BrowserLiteCallback browserLiteCallback = LDF.A00().A06;
                            if (browserLiteCallback != null) {
                                try {
                                    browserLiteCallback.BOX();
                                } catch (RemoteException e) {
                                    0fH.A0w("BrowserLiteCallbacker", "Error in incrementReOptInDeclineCount", e);
                                }
                            }
                            c3243Jnf.A0N = true;
                        }
                    }
                }
            }
        }
        LET let3 = this.A00;
        if (let3 != null) {
            C11474wl c11474wl = let3.A0P;
            if (!c11474wl.A00.A08.A03 || !2yD.A03(c11474wl.A04.A00, 36311839665819125L) || (jgX = ((L5Y) let3.A03).A04) == null || (A0U = jgX.A0U()) == null) {
                return;
            }
            A0U.A0A();
        }
    }
}
