package com.facebook.messaging.nativepagereply.savedreplies.creation.ui;

import X.06Z;
import X.1BQ;
import X.1Lo;
import X.2KE;
import X.2RH;
import X.4YU;
import X.4YV;
import X.6HM;
import X.6QF;
import X.7zN;
import X.7zP;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbM;
import X.AnonymousClass001;
import X.Bff;
import X.Bfh;
import X.C00i;
import X.C09s;
import X.C0A8;
import X.C15h;
import X.C2125Dee;
import X.C5bb;
import X.C8S;
import X.COW;
import X.CYa;
import X.CZF;
import X.DBe;
import X.DMV;
import X.LBN;
import X.QCo;
import X.QKG;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.litho.LithoView;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.CustomFrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.BitSet;

/* loaded from: SwipeableSavedRepliesTrayCreationView.class */
public class SwipeableSavedRepliesTrayCreationView extends CustomFrameLayout {
    public EditText A00;
    public EditText A01;
    public 06Z A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public Bfh A08;
    public MigColorScheme A09;
    public MediaResource A0A;
    public TextInputLayout A0B;
    public TextInputLayout A0C;
    public Long A0D;
    public boolean A0E;
    public boolean A0F;
    public C00i A0G;
    public C15h A0H;
    public C2125Dee A0I;
    public LithoView A0J;

    public SwipeableSavedRepliesTrayCreationView(Context context) {
        super(context);
        A00(4YV.A0D(context));
    }

    public SwipeableSavedRepliesTrayCreationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(4YV.A0D(context));
    }

    public SwipeableSavedRepliesTrayCreationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(4YV.A0D(context));
    }

    private void A00(FbUserSession fbUserSession) {
        this.A07 = AbH.A0F();
        DBe A00 = DBe.A00(this, 79);
        this.A0H = A00;
        Context context = getContext();
        this.A05 = 1Lo.A00(context, fbUserSession, 83950);
        this.A04 = 1BQ.A02(68339);
        this.A06 = AbI.A0J(context);
        this.A0G = AbF.A0Q(context, 50020);
        this.A03 = AbI.A0L();
        this.A09 = ((ThreadViewColorScheme) A00.get()).A0F;
        A0U(2132543433);
        EditText editText = (EditText) C09s.A01(this, 2131367092);
        this.A01 = editText;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1000)});
        this.A00 = (EditText) C09s.A01(this, 2131367093);
        this.A0C = (TextInputLayout) C09s.A01(this, 2131367811);
        this.A0B = (TextInputLayout) C09s.A01(this, 2131367813);
        this.A0J = (LithoView) C09s.A01(this, 2131367809);
        EditText editText2 = this.A01;
        2KE r0 = 2KE.A09;
        editText2.setTextSize(7zN.A00(r0));
        TextInputLayout textInputLayout = this.A0C;
        textInputLayout.A06 = 0;
        textInputLayout.A0V();
        this.A0C.A0X(2132608250);
        this.A00.setTextSize(7zN.A00(r0));
        this.A00.addTextChangedListener(new CYa(this, 8));
        this.A0B.A0g(true);
        this.A0B.A0j(true);
        this.A0B.A0W(1000);
        TextInputLayout textInputLayout2 = this.A0B;
        textInputLayout2.A06 = 0;
        textInputLayout2.A0V();
        this.A0B.A0X(2132608250);
        A0V();
    }

    public static void A01(SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView) {
        Uri uri;
        C5bb c5bb = new C5bb(swipeableSavedRepliesTrayCreationView.A09.AmV());
        Context context = swipeableSavedRepliesTrayCreationView.getContext();
        2RH r0 = 2RH.A05;
        c5bb.Cte(C0A8.A00(context, 4YU.A00(r0)));
        AbH.A1M(swipeableSavedRepliesTrayCreationView.A01, swipeableSavedRepliesTrayCreationView.A09);
        swipeableSavedRepliesTrayCreationView.A01.setHintTextColor(swipeableSavedRepliesTrayCreationView.A09.B9Q());
        swipeableSavedRepliesTrayCreationView.A0C.setBackground(c5bb);
        C5bb c5bb2 = new C5bb(swipeableSavedRepliesTrayCreationView.A09.AmV());
        c5bb2.Cte(C0A8.A00(context, 4YU.A00(r0)));
        swipeableSavedRepliesTrayCreationView.A0C.A0Z(ColorStateList.valueOf(swipeableSavedRepliesTrayCreationView.A09.BEj()));
        AbH.A1M(swipeableSavedRepliesTrayCreationView.A00, swipeableSavedRepliesTrayCreationView.A09);
        swipeableSavedRepliesTrayCreationView.A00.setHintTextColor(swipeableSavedRepliesTrayCreationView.A09.B9Q());
        TextInputLayout textInputLayout = swipeableSavedRepliesTrayCreationView.A0B;
        ColorStateList valueOf = ColorStateList.valueOf(swipeableSavedRepliesTrayCreationView.A09.AkX());
        LBN lbn = textInputLayout.A1F;
        lbn.A05 = valueOf;
        TextView textView = lbn.A08;
        if (textView != null && valueOf != null) {
            textView.setTextColor(valueOf);
        }
        TextInputLayout textInputLayout2 = swipeableSavedRepliesTrayCreationView.A0B;
        ColorStateList valueOf2 = ColorStateList.valueOf(swipeableSavedRepliesTrayCreationView.A09.AkX());
        if (textInputLayout2.A0K != valueOf2) {
            textInputLayout2.A0K = valueOf2;
            TextInputLayout.A0K(textInputLayout2);
        }
        swipeableSavedRepliesTrayCreationView.A0B.setBackground(c5bb2);
        TextInputLayout textInputLayout3 = swipeableSavedRepliesTrayCreationView.A0B;
        ColorStateList valueOf3 = ColorStateList.valueOf(swipeableSavedRepliesTrayCreationView.A09.BEj());
        if (textInputLayout3.A0L != valueOf3) {
            textInputLayout3.A0L = valueOf3;
            TextInputLayout.A0K(textInputLayout3);
        }
        swipeableSavedRepliesTrayCreationView.A0B.A0Z(ColorStateList.valueOf(swipeableSavedRepliesTrayCreationView.A09.BEj()));
        LithoView lithoView = swipeableSavedRepliesTrayCreationView.A0J;
        QCo qCo = new QCo(lithoView.A09, new QKG());
        MigColorScheme migColorScheme = swipeableSavedRepliesTrayCreationView.A09;
        QKG qkg = qCo.A01;
        qkg.A05 = migColorScheme;
        BitSet bitSet = qCo.A02;
        bitSet.set(1);
        MediaResource mediaResource = swipeableSavedRepliesTrayCreationView.A0A;
        if (mediaResource == null) {
            uri = null;
        } else {
            uri = mediaResource.A0D;
            if (uri == null) {
                uri = mediaResource.A0E;
            }
        }
        qkg.A00 = uri;
        bitSet.set(5);
        qkg.A07 = AnonymousClass001.A1T(swipeableSavedRepliesTrayCreationView.A0D);
        bitSet.set(7);
        qkg.A04 = new Bff(swipeableSavedRepliesTrayCreationView);
        bitSet.set(4);
        qkg.A02 = CZF.A00(swipeableSavedRepliesTrayCreationView, 14);
        bitSet.set(2);
        qkg.A01 = CZF.A00(swipeableSavedRepliesTrayCreationView, 13);
        bitSet.set(0);
        qkg.A03 = CZF.A00(swipeableSavedRepliesTrayCreationView, 12);
        bitSet.set(3);
        qkg.A06 = swipeableSavedRepliesTrayCreationView.A0F;
        bitSet.set(6);
        7zP.A17(qCo, bitSet, qCo.A03);
        lithoView.A0x(qkg);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Dee, android.app.Dialog] */
    public static void A02(SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView, String str) {
        C2125Dee c2125Dee = new C2125Dee(swipeableSavedRepliesTrayCreationView.getContext(), 2132608321);
        swipeableSavedRepliesTrayCreationView.A0I = c2125Dee;
        c2125Dee.A04(str);
        ?? r0 = swipeableSavedRepliesTrayCreationView.A0I;
        r0.A03 = 0;
        r0.setCancelable(false);
        swipeableSavedRepliesTrayCreationView.A0I.A05(true);
        6QF.A00(swipeableSavedRepliesTrayCreationView.A0I);
        swipeableSavedRepliesTrayCreationView.A0I.show();
    }

    public void A0V() {
        this.A01.getText().clear();
        this.A00.getText().clear();
        this.A0D = null;
        this.A0A = null;
        this.A0B.A0d(null);
        this.A0E = false;
        A01(this);
    }

    public void A0W() {
        DMV dmv = this.A0I;
        if (dmv == null || !dmv.isShowing()) {
            return;
        }
        try {
            this.A0I.dismiss();
        } catch (IllegalArgumentException unused) {
        }
        this.A0I = null;
    }

    public void A0X(Throwable th) {
        C8S A00 = COW.A00(getContext());
        A00.A00 = this.A09.Aho();
        A00.A03 = ServiceException.A00(th);
        COW.A01(A00, (6HM) this.A0G.get());
    }

    public boolean A0Y() {
        TextInputLayout textInputLayout;
        Resources resources;
        int i;
        if (AbM.A0u(this.A00).isEmpty()) {
            textInputLayout = this.A0B;
            resources = getContext().getResources();
            i = 2131965451;
        } else {
            int length = AbM.A0u(this.A00).length();
            textInputLayout = this.A0B;
            if (length <= 1000) {
                textInputLayout.A0d(null);
                return true;
            }
            resources = getContext().getResources();
            i = 2131965452;
        }
        textInputLayout.A0d(resources.getString(i));
        return false;
    }
}
