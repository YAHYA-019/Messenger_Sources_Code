package X;

import X.7zR;
import X.C8vC;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.CustomLinearLayout;

/* renamed from: X.8vC, reason: invalid class name */
/* loaded from: 8vC.class */
public final class C8vC extends BJB {
    public static final String __redex_internal_original_name = "BusinessInboxFAQCreationFragment";
    public AutomatedResponseCustomQuestionModel A00;
    public C6oc A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public LithoView A07;
    public LithoView A08;
    public final 1Br A0A = 1Bq.A00(68336);
    public final 1Br A0C = 1HG.A01(this, 99435);
    public final 1Br A0B = 1Bu.A00(83294);
    public final 1Br A09 = 1Bu.A02(this, 68329);
    public boolean A06 = true;
    public final AZU A0E = new AZU() { // from class: X.9ww
        /* JADX WARN: Type inference failed for: r0v1, types: [X.8vC, androidx.fragment.app.Fragment] */
        public void onFailure(Throwable th) {
            ?? r0 = C8vC.this;
            C8vC.A07(r0, 7zN.A0s((Fragment) r0, 2131953254));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [X.8vC, androidx.fragment.app.Fragment] */
        public void onSuccess() {
            final ?? r0 = C8vC.this;
            final String A0s = 7zN.A0s((Fragment) r0, 2131953258);
            InputMethodManager A0C = 7zS.A0C(r0.requireContext());
            View view = r0.mView;
            if (view != null) {
                IBinder applicationWindowToken = view.getApplicationWindowToken();
                final Handler A07 = AnonymousClass001.A07();
                if (A0C.hideSoftInputFromWindow(applicationWindowToken, 0, new ResultReceiver(A07) { // from class: com.facebook.messaging.nativepagereply.faq.creation.BusinessInboxFAQCreationFragment$dismissKeyboardShowToastAndFinishActivity$isHiding$1
                    /* JADX WARN: Type inference failed for: r0v2, types: [X.8vC, androidx.fragment.app.Fragment] */
                    @Override // android.os.ResultReceiver
                    public void onReceiveResult(int i, Bundle bundle) {
                        super.onReceiveResult(i, bundle);
                        ?? r02 = r0;
                        C8vC.A07(r02, A0s);
                        7zR.A14((Fragment) r02);
                    }
                })) {
                    return;
                }
                C8vC.A07(r0, A0s);
                7zR.A14((Fragment) r0);
            }
        }
    };
    public final AZU A0D = new AZU() { // from class: X.9wv
        /* JADX WARN: Type inference failed for: r0v1, types: [X.8vC, androidx.fragment.app.Fragment] */
        public void onFailure(Throwable th) {
            ?? r0 = C8vC.this;
            C8vC.A07(r0, 7zN.A0s((Fragment) r0, 2131953254));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [X.8vC, androidx.fragment.app.Fragment] */
        public void onSuccess() {
            ?? r0 = C8vC.this;
            C8vC.A07(r0, 7zN.A0s((Fragment) r0, 2131953257));
            7zR.A14((Fragment) r0);
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:44:0x02ac, code lost:
    
        if (X.11T.A0O(r313, "file") != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(android.content.Context r301, X.C8vC r302, X.AZU r303, com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel r304, com.google.common.collect.ImmutableList r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vC.A03(android.content.Context, X.8vC, X.AZU, com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel, com.google.common.collect.ImmutableList, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r0.length() > 500) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A06(X.C8vC r301) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vC.A06(X.8vC):void");
    }

    public static final void A07(C8vC c8vC, String str) {
        7zU.A1X((F8q) 1Br.A0B(c8vC.A0C), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (X.11T.A0O(((X.4yJ) r0.get()).A03(r0), ((X.4yJ) r0.get()).A03(r302)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A08(X.C8vC r301, com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel r302, com.google.common.collect.ImmutableList r303) {
        /*
            r0 = r302
            int r0 = r0.A00
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.Object r0 = X.0QD.A0J(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L48
            r0 = r301
            X.1Br r0 = r0.A0A
            X.00i r0 = r0.A00
            r301 = r0
            r0 = r301
            java.lang.Object r0 = r0.get()
            X.4yJ r0 = (X.4yJ) r0
            r1 = r305
            java.lang.String r0 = r0.A03(r1)
            r305 = r0
            r0 = r301
            java.lang.Object r0 = r0.get()
            X.4yJ r0 = (X.4yJ) r0
            r1 = r302
            java.lang.String r0 = r0.A03(r1)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = X.11T.A0O(r0, r1)
            r307 = r0
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L4d
        L48:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L4d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vC.A08(X.8vC, com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel, com.google.common.collect.ImmutableList):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel;
        String string;
        String string2;
        super.A1S(bundle);
        this.A01 = (C6oc) 7zN.A0n(this, 1BM.A01(this), 68134);
        Bundle bundle2 = this.mArguments;
        String str = "add";
        if (bundle2 != null && (string2 = bundle2.getString("arg_mode", str)) != null) {
            str = string2;
        }
        this.A05 = str;
        Bundle bundle3 = this.mArguments;
        String str2 = "me_settings";
        if (bundle3 != null && (string = bundle3.getString("arg_entry_point", str2)) != null) {
            str2 = string;
        }
        this.A04 = str2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || (automatedResponseCustomQuestionModel = (AutomatedResponseCustomQuestionModel) bundle4.getParcelable("arg_editing_faq_model")) == null) {
            return;
        }
        this.A00 = automatedResponseCustomQuestionModel;
        String str3 = "editingFAQModel";
        String str4 = automatedResponseCustomQuestionModel.A03;
        11T.A0A(str4);
        this.A02 = str4;
        AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel2 = this.A00;
        if (automatedResponseCustomQuestionModel2 != null) {
            String str5 = automatedResponseCustomQuestionModel2.A04;
            11T.A0A(str5);
            this.A03 = str5;
            AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel3 = this.A00;
            if (automatedResponseCustomQuestionModel3 != null) {
                this.A06 = automatedResponseCustomQuestionModel3.A05;
                9lJ A0c = 7zP.A0c(this.A09);
                String str6 = this.A04;
                if (str6 == null) {
                    str3 = "entryPoint";
                } else {
                    String str7 = this.A05;
                    if (str7 != null) {
                        1UG A08 = 1BK.A08(1Br.A02(A0c.A01), 1BJ.A00(1625));
                        if (A08.isSampled()) {
                            7zN.A16(A08);
                            0DA r0 = new 0DA();
                            r0.A07("entrypoint", 9lJ.A01(str6));
                            r0.A03("is_adding_faq", Boolean.valueOf(str7.equals(str)));
                            1UG.A01(r0, A08);
                            1UG.A04(A08, A0c.A02);
                            return;
                        }
                        return;
                    }
                    str3 = "mode";
                }
            }
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        A1b();
        LithoView lithoView = this.A07;
        String str = "contentView";
        if (lithoView != null) {
            Context requireContext = requireContext();
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            String str2 = this.A04;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                String str3 = this.A05;
                if (str3 == null) {
                    str = "mode";
                } else {
                    AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel = this.A00;
                    if (automatedResponseCustomQuestionModel != null) {
                        lithoView.A0y(new C8az(new 9OW(requireContext, this), automatedResponseCustomQuestionModel, migColorScheme, str2, str3));
                        A06(this);
                        return;
                    }
                    str = "editingFAQModel";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 491566144);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        CustomLinearLayout customLinearLayout = new CustomLinearLayout(requireContext());
        customLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        customLinearLayout.setOrientation(1);
        Context context = customLinearLayout.getContext();
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        this.A08 = lithoView;
        customLinearLayout.addView(lithoView, new LinearLayout.LayoutParams(-1, -2));
        LithoView lithoView2 = new LithoView(context, (AttributeSet) null);
        this.A07 = lithoView2;
        customLinearLayout.addView(lithoView2, new LinearLayout.LayoutParams(-1, -1));
        0FI.A08(-376052175, A04);
        return customLinearLayout;
    }
}
