package com.facebook.messaging.attribution;

import X.0D2;
import X.0FI;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1ED;
import X.1GU;
import X.1Kd;
import X.1Lo;
import X.1VX;
import X.1iF;
import X.2FP;
import X.2OB;
import X.2Ov;
import X.2Xd;
import X.4YU;
import X.53S;
import X.6NL;
import X.AbstractC00603o4;
import X.AbstractC05414dq;
import X.AnonymousClass000;
import X.Boa;
import X.C09s;
import X.C30G;
import X.C3sa;
import X.C5iw;
import X.C63n;
import X.C7gm;
import X.CMv;
import X.D2o;
import X.GzN;
import X.HQa;
import X.Hlo;
import X.Hsr;
import X.IJy;
import X.InF;
import X.JY5;
import X.Q2f;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.resources.ui.FbTextView;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.base.Preconditions;

/* loaded from: InlineReplyFragment.class */
public class InlineReplyFragment extends 2Ov {
    public Intent A00;
    public FbUserSession A01;
    public 1GU A02;
    public C7gm A03;
    public 6NL A04;
    public ContentAppAttribution A05;
    public CMv A06;
    public ThreadKey A07;
    public Hsr A08;
    public MediaResource A09;
    public JY5 A0A;
    public 1ED A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public long A0F;
    public Q2f A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public final C63n A0K = (C63n) 1Bi.A03(49944);

    public 1iF A17() {
        return new 1iF(661919377745181L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        Intent intent;
        String str;
        CMv cMv;
        ContentAppAttribution A02;
        int A022 = 0FI.A02(-730904044);
        super.onActivityCreated(bundle);
        Intent intent2 = this.A00;
        if (intent2 != null && !intent2.getBooleanExtra("IS_CHAT_HEADS_HARDWARE_ACCELERATION_DISABLED", true)) {
            Dialog dialog = ((0D2) this).A01;
            Preconditions.checkNotNull(dialog, "dialog");
            Window window = dialog.getWindow();
            Preconditions.checkNotNull(window, "window");
            window.setFlags(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
        }
        if (this.A0E && (intent = this.A00) != null && (str = this.A0D) != null && (cMv = this.A06) != null && (A02 = cMv.A02(intent, str)) != null) {
            Boa boa = (Boa) 1Lo.A04(requireContext(), this.A01, (1BY) null, 84496);
            C30G c30g = new C30G(44);
            c30g.A03("app_fbid", String.valueOf(A02.A04));
            c30g.A03("verification_type", "OTHER");
            c30g.A03("hash_key", A02.A05);
            C3sa A00 = C3sa.A00(c30g);
            A00.A0A(86400L);
            A00.A09(86400L);
            AbstractC05414dq A07 = 1VX.A07(boa.A00, boa.A01);
            4YU.A1J(A00, 661919377745181L);
            1Kd.A0F(new InF(this, 0), 2FP.A01(new D2o(A02, boa, 0), A07.A03(A00)), this.A0B);
        }
        53S r0 = (53S) 1Bn.A0E(requireContext(), (1BY) null, 49478);
        Context context = getContext();
        String[] strArr = (Build.VERSION.SDK_INT < 33 || context == null || context.getApplicationInfo().targetSdkVersion < 33) ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", AnonymousClass000.A00(7)} : new String[]{AbstractC00603o4.A00(0), AbstractC00603o4.A00(2), AbstractC00603o4.A00(4)};
        C5iw c5iw = new C5iw();
        c5iw.A00(requireContext().getResources().getString(2131960151));
        c5iw.A00 = 2;
        c5iw.A06 = false;
        r0.A01(this).AHQ(new RequestPermissionsConfig(c5iw), new GzN(this), strArr);
        0FI.A08(793648637, A022);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super/*X.0D2*/.onAttach(context);
        this.A01 = 1BL.A0G(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(743932909);
        super.onCreate(bundle);
        this.A02 = (1GU) 1Bi.A03(16458);
        this.A06 = (CMv) 1Bn.A0A(84495);
        this.A0B = (1ED) 1Bi.A03(16470);
        this.A08 = (Hsr) 1Bn.A0E(requireContext(), (1BY) null, 115949);
        Bundle requireArguments = requireArguments();
        this.A09 = (MediaResource) requireArguments.getParcelable("media_resource");
        this.A0C = requireArguments.getString("app_id");
        this.A0D = requireArguments.getString("app_package");
        this.A0J = requireArguments.getString("title");
        this.A0I = requireArguments.getString("description");
        this.A0H = requireArguments.getString("cancel_label");
        this.A00 = (Intent) requireArguments.getParcelable("reply_intent");
        this.A07 = (ThreadKey) requireArguments.getParcelable("thread_key");
        this.A0E = requireArguments.getBoolean("is_platform_instance", false);
        this.A0F = requireArguments.getLong("dialog_id");
        A0g(0, 2132608358);
        0FI.A08(615357365, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.widget.CustomFrameLayout, android.view.View, X.7gm, java.lang.Object] */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-17458392);
        ?? customFrameLayout = new CustomFrameLayout(getContext());
        customFrameLayout.A0U(2132542173);
        customFrameLayout.A03 = (MediaResourceView) C09s.A01(customFrameLayout, 2131365524);
        customFrameLayout.A00 = C09s.A01(customFrameLayout, 2131364620);
        customFrameLayout.A01 = C09s.A01(customFrameLayout, 2131367289);
        customFrameLayout.A04 = (FbTextView) C09s.A01(customFrameLayout, 2131362859);
        customFrameLayout.A06 = (FbTextView) C09s.A01(customFrameLayout, 2131368067);
        customFrameLayout.A05 = (FbTextView) C09s.A01(customFrameLayout, 2131363599);
        customFrameLayout.A00.setOnClickListener(new IJy((Object) customFrameLayout, 0));
        customFrameLayout.A01.setOnClickListener(new IJy((Object) customFrameLayout, 1));
        customFrameLayout.A04.setOnClickListener(new IJy((Object) customFrameLayout, 2));
        this.A03 = customFrameLayout;
        JY5 jy5 = new JY5(getContext());
        this.A0A = jy5;
        jy5.A00 = 1.0f;
        jy5.A01 = 1.0f;
        jy5.A06.setBackgroundDrawable(new ColorDrawable(0));
        2Xd q2f = new Q2f(this.A03);
        this.A0G = q2f;
        RecyclerView recyclerView = this.A0A.A06;
        if (recyclerView != null) {
            recyclerView.A16(q2f);
        }
        JY5 jy52 = this.A0A;
        jy52.A07 = new Hlo(this);
        0FI.A08(1948533765, A02);
        return jy52;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("media_resource", this.A09);
        bundle.putString("app_id", this.A0C);
        bundle.putString("app_package", this.A0D);
        bundle.putString("title", this.A0J);
        bundle.putString("description", this.A0I);
        bundle.putString("cancel_label", this.A0H);
        bundle.putParcelable("reply_intent", this.A00);
        bundle.putParcelable("thread_key", this.A07);
        bundle.putBoolean("is_platform_instance", this.A0E);
        bundle.putLong("dialog_id", this.A0F);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C7gm c7gm = this.A03;
        c7gm.A02 = new HQa(this);
        CharSequence charSequence = this.A0J;
        c7gm.A06.setText(charSequence);
        2OB r0 = c7gm.A06;
        int i = 0;
        if (charSequence == null) {
            i = 8;
        }
        r0.setVisibility(i);
        C7gm c7gm2 = this.A03;
        CharSequence charSequence2 = this.A0I;
        c7gm2.A05.setText(charSequence2);
        2OB r02 = c7gm2.A05;
        int i2 = 0;
        if (charSequence2 == null) {
            i2 = 8;
        }
        r02.setVisibility(i2);
        C7gm c7gm3 = this.A03;
        CharSequence charSequence3 = this.A0H;
        if (charSequence3 == null) {
            c7gm3.A04.setText(2131955696);
        } else {
            c7gm3.A04.setText(charSequence3);
        }
    }
}
