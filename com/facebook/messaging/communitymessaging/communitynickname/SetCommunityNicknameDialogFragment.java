package com.facebook.messaging.communitymessaging.communitynickname;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Um;
import X.22I;
import X.2Ov;
import X.4YU;
import X.6QF;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zV;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AbN;
import X.BzO;
import X.C2g;
import X.C4Y;
import X.CSG;
import X.CYa;
import X.CZz;
import X.Ca0;
import X.CzU;
import X.Czj;
import X.DR6;
import X.JZj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: SetCommunityNicknameDialogFragment.class */
public final class SetCommunityNicknameDialogFragment extends 2Ov {
    public static final BzO A09 = new Object();
    public EditText A00;
    public FbUserSession A01;
    public MigColorScheme A02;
    public Long A03;
    public String A04;
    public String A05;
    public final 1Br A06 = 1Bu.A00(83430);
    public final 1Br A08 = 1Bu.A02(this, 67525);
    public final 1Br A07 = 1HG.A01(this, 83068);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r0.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A05(com.facebook.messaging.communitymessaging.communitynickname.SetCommunityNicknameDialogFragment r301) {
        /*
            r0 = r301
            android.app.Dialog r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.JZj
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4b
            r0 = r302
            X.JZj r0 = (X.JZj) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4b
            r0 = r302
            X.L7t r0 = r0.A00
            r304 = r0
            r0 = r304
            android.widget.Button r0 = r0.A0F
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4b
            r0 = r301
            java.lang.String r0 = r0.A05
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3f
            r0 = r304
            int r0 = r0.length()
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 != 0) goto L41
        L3f:
            r0 = 1
            r303 = r0
        L41:
            r0 = r303
            r1 = 1
            r0 = r0 ^ r1
            r303 = r0
            r0 = r305
            r1 = r303
            r0.setEnabled(r1)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.communitynickname.SetCommunityNicknameDialogFragment.A05(com.facebook.messaging.communitymessaging.communitynickname.SetCommunityNicknameDialogFragment):void");
    }

    public static final void A06(SetCommunityNicknameDialogFragment setCommunityNicknameDialogFragment, String str) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        11T.A0A(valueOf);
        setCommunityNicknameDialogFragment.A05 = str;
        EditText editText = setCommunityNicknameDialogFragment.A00;
        if (editText != null) {
            editText.setText(valueOf);
        }
        EditText editText2 = setCommunityNicknameDialogFragment.A00;
        if (editText2 != null) {
            editText2.setSelection(0, editText2.length());
        }
        A05(setCommunityNicknameDialogFragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(SetCommunityNicknameDialogFragment setCommunityNicknameDialogFragment, boolean z) {
        MutableLiveData A0H;
        Long l = setCommunityNicknameDialogFragment.A03;
        if (l != null) {
            long longValue = l.longValue();
            EditText editText = setCommunityNicknameDialogFragment.A00;
            Editable editable = null;
            if (editText != null) {
                editable = editText.getText();
            }
            String valueOf = String.valueOf(editable);
            String A13 = AbK.A13(setCommunityNicknameDialogFragment.requireContext(), z ? 7zL.A13(AbJ.A0n(setCommunityNicknameDialogFragment.A06)) : valueOf, 2131954563);
            FragmentActivity requireActivity = setCommunityNicknameDialogFragment.requireActivity();
            C2g c2g = (C2g) 1Br.A0B(setCommunityNicknameDialogFragment.A08);
            FbUserSession fbUserSession = setCommunityNicknameDialogFragment.A01;
            if (z) {
                if (fbUserSession != null) {
                    A0H = c2g.A00(fbUserSession, longValue, 7zQ.A0H(AbJ.A0n(setCommunityNicknameDialogFragment.A06)));
                    A0H.observe(requireActivity, new Ca0(requireActivity, setCommunityNicknameDialogFragment, A13, 0));
                    ((C4Y) 1Br.A0B(setCommunityNicknameDialogFragment.A07)).A00(setCommunityNicknameDialogFragment.A04, setCommunityNicknameDialogFragment.A05, 2, 1);
                    return;
                }
                11T.A0L("fbUserSession");
                throw 0Q8.createAndThrow();
            }
            if (fbUserSession != null) {
                long A0H2 = 7zQ.A0H(AbJ.A0n(setCommunityNicknameDialogFragment.A06));
                11T.A0F(valueOf, 3);
                A0H = 7zL.A0H();
                ((22I) 4YU.A0o(fbUserSession, c2g.A01, 33183)).A0L(Czj.A00(A0H, c2g, 36), (Number) null, (Number) null, valueOf, (String) null, longValue, A0H2);
                A0H.observe(requireActivity, new Ca0(requireActivity, setCommunityNicknameDialogFragment, A13, 0));
                ((C4Y) 1Br.A0B(setCommunityNicknameDialogFragment.A07)).A00(setCommunityNicknameDialogFragment.A04, setCommunityNicknameDialogFragment.A05, 2, 1);
                return;
            }
            11T.A0L("fbUserSession");
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        this.A02 = 7zV.A0S(this);
        EditText editText = new EditText(getContext());
        editText.setSingleLine(true);
        1Br r0 = this.A06;
        editText.setHint(7zL.A13(AbJ.A0n(r0)));
        MigColorScheme migColorScheme = this.A02;
        String str = "colorScheme";
        if (migColorScheme != null) {
            AbG.A1I(editText, migColorScheme);
            int dimensionPixelSize = 7zO.A0D(this).getDimensionPixelSize(2132279320);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(editText, layoutParams);
            this.A00 = editText;
            AbN.A0v(editText, 50);
            MigColorScheme migColorScheme2 = this.A02;
            if (migColorScheme2 != null) {
                AbH.A1M(editText, migColorScheme2);
                Context A0C = 7zM.A0C(this, 67527);
                MigColorScheme migColorScheme3 = this.A02;
                if (migColorScheme3 != null) {
                    DR6 dr6 = new DR6(A0C, migColorScheme3);
                    dr6.A00(2131954564);
                    dr6.A06(2131954560);
                    dr6.A0I(linearLayout);
                    dr6.A0K(true);
                    CSG.A05(dr6, this, 43, 2131954562);
                    dr6.A0C(CSG.A00(this, 44), 2131954559);
                    CSG.A04(dr6, this, 45, 2131954561);
                    JZj A04 = dr6.A04();
                    6QF.A00(A04);
                    Window window = A04.getWindow();
                    if (window != null) {
                        window.setSoftInputMode(36);
                    }
                    Long l = this.A03;
                    if (l != null) {
                        long longValue = l.longValue();
                        1Br A0Q = 7zM.A0Q();
                        C2g c2g = (C2g) 1Br.A0B(this.A08);
                        FbUserSession fbUserSession = this.A01;
                        if (fbUserSession == null) {
                            str = "fbUserSession";
                        } else {
                            long A0H = 7zQ.A0H(AbJ.A0n(r0));
                            MutableLiveData A0H2 = 7zL.A0H();
                            22I r02 = (22I) 4YU.A0o(fbUserSession, c2g.A01, 33183);
                            Czj A00 = Czj.A00(A0H2, c2g, 35);
                            1Um A0O = 1BK.A0O(r02, 0);
                            MailboxFutureImpl A0Q2 = 1BK.A0Q(A0O, A00);
                            1Um.A02(A0O, new CzU(r02, A0Q2, 2, longValue, A0H), A0Q2, false);
                            A0H2.observe(this, new CZz(2, this, A0H2, A0Q));
                        }
                    }
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        editText2.addTextChangedListener(new CYa(this, 5));
                    }
                    C4Y c4y = (C4Y) 1Br.A0B(this.A07);
                    Long valueOf = Long.valueOf(7zQ.A0H(AbJ.A0n(r0)));
                    Long l2 = this.A03;
                    c4y.A01 = valueOf;
                    c4y.A00 = l2;
                    c4y.A02 = 7zR.A0s();
                    return A04;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1386934370);
        super.onCreate(bundle);
        this.A01 = 1BM.A01(this);
        if (bundle != null) {
            this.A04 = bundle.getString("arg_current_nickname");
            this.A05 = bundle.getString("arg_entered_nickname");
        } else {
            this.A04 = requireArguments().getString("arg_current_nickname");
            this.A05 = requireArguments().getString("arg_entered_nickname");
            bundle = requireArguments();
        }
        this.A03 = AbI.A10(bundle, "arg_community_id");
        0FI.A08(919557532, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-152005488);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A05(this);
        String str = this.A05;
        if (str != null && str.length() != 0) {
            A06(this, str);
        }
        0FI.A08(-1743154564, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("arg_current_nickname", this.A04);
        bundle.putString("arg_entered_nickname", this.A05);
        Long l = this.A03;
        if (l != null) {
            bundle.putLong("arg_community_id", l.longValue());
        }
    }
}
