package com.facebook.messaging.media.viewer.fragment;

import X.0FI;
import X.0NA;
import X.1Bi;
import X.1iF;
import X.2MR;
import X.2Me;
import X.2Mg;
import X.7zL;
import X.7zO;
import X.AbE;
import X.AbF;
import X.AbG;
import X.C0A2;
import X.C1is;
import X.C69e;
import X.DN1;
import X.FXr;
import X.GOm;
import X.InterfaceC07034in;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;

/* loaded from: FullScreenPictureViewDialogFragment.class */
public class FullScreenPictureViewDialogFragment extends FullScreenDialogFragment implements CallerContextable {
    public static final CallerContext A04 = CallerContext.A06(FullScreenPictureViewDialogFragment.class);
    public Toolbar A00;
    public FbDraweeView A01;
    public Context A02;
    public final C1is A03 = (C1is) 1Bi.A03(16766);

    public 1iF A17() {
        return AbF.A0C(308851093610228L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1339086647);
        super.onCreate(bundle);
        int A03 = 0NA.A03(getContext(), 2130970042, 2132608327);
        A0g(2, A03);
        this.A02 = new ContextThemeWrapper(getContext(), A03);
        0FI.A08(-1505032791, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1961084673);
        View A08 = AbG.A08(layoutInflater.cloneInContext(this.A02), viewGroup, 2132542642);
        0FI.A08(1317190747, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(GOm.A00(25), "");
        this.A01 = (FbDraweeView) 7zL.A0F(this, 2131366469);
        C69e c69e = new C69e(7zO.A0D(this));
        c69e.A07 = new DN1();
        c69e.A02(InterfaceC07034in.A04);
        this.A01.A05(c69e.A01());
        FbDraweeView fbDraweeView = this.A01;
        Uri uri = null;
        try {
            uri = C0A2.A03(string);
        } catch (SecurityException unused) {
        }
        fbDraweeView.A0G(uri, A04);
        Toolbar toolbar = (Toolbar) 7zL.A0F(this, 2131364266);
        this.A00 = toolbar;
        toolbar.A0T(requireArguments.getString(AbE.A00(666), ""));
        Toolbar toolbar2 = this.A00;
        Context context = getContext();
        2MR r0 = 2MR.A2K;
        2Mg r02 = 2Me.A02;
        toolbar2.A0N(r02.A03(context, r0));
        Toolbar toolbar3 = this.A00;
        ColorStateList valueOf = ColorStateList.valueOf(r02.A03(getContext(), r0));
        toolbar3.A06 = valueOf;
        TextView textView = toolbar3.A0C;
        if (textView != null) {
            textView.setTextColor(valueOf);
        }
        this.A00.A0S(requireArguments.getString("picture_sub_title", ""));
        this.A00.A0L(2131959241);
        FXr.A04(this.A00, this, 92);
        this.A03.A0B(this.A02, this);
    }
}
