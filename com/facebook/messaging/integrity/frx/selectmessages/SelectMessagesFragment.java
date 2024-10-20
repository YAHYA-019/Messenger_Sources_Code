package com.facebook.messaging.integrity.frx.selectmessages;

import X.0D2;
import X.0FI;
import X.0NA;
import X.0Pz;
import X.1BK;
import X.1BL;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Hv;
import X.1iF;
import X.1tC;
import X.2S3;
import X.2S4;
import X.6Hk;
import X.AbF;
import X.AbN;
import X.AnonymousClass001;
import X.B5M;
import X.BeU;
import X.BlV;
import X.C00i;
import X.C01e;
import X.C0o;
import X.C4f;
import X.C62;
import X.C6tg;
import X.Clh;
import X.QAk;
import X.QLR;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SelectMessagesFragment.class */
public class SelectMessagesFragment extends FullScreenDialogFragment {
    public static final String[] A0A = {"key_is_banner_visible", "key_last_visible_item_position"};
    public FbUserSession A00;
    public C00i A01;
    public LithoView A02;
    public B5M A03;
    public C62 A04;
    public C0o A05;
    public BlV A06;
    public C00i A07;
    public final 2S4 A09 = new 2S3(this, "SelectMessagesFragment");
    public final BeU A08 = new BeU(this);

    public 1iF A17() {
        return AbF.A0C(876431843082365L);
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.A03.A05();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2036448133);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        ContextThemeWrapper A06 = 0NA.A06(requireContext, 2130972036, 2132607937);
        FbUserSession A0G = 1BL.A0G(this);
        this.A00 = A0G;
        this.A03 = (B5M) 1Bn.A0E(requireContext, (1BY) null, 84922);
        this.A07 = 1BV.A00(16838);
        BlV blV = (BlV) 1Bn.A0A(84924);
        this.A06 = blV;
        this.A01 = 1BV.A00(67674);
        B5M b5m = this.A03;
        ((6Hk) b5m).A00 = this;
        b5m.A05 = this.A05;
        String[] strArr = A0A;
        if (bundle != null) {
            blV.A01.set(true);
            int i = 0;
            do {
                String str = strArr[i];
                blV.A00.put(str, bundle.get(str));
                i++;
            } while (i < 2);
        }
        C62 A0W = AbF.A0O(requireContext, 940).A0W(A0G, this.A09, true);
        this.A04 = A0W;
        A0W.A00(A06, getChildFragmentManager());
        0FI.A08(-1263178435, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(-758687031);
        C6tg c6tg = this.A04.A01;
        QAk A00 = QLR.A00(c6tg.A01);
        A00.A0J();
        LithoView A03 = c6tg.A03(A00.A01);
        this.A02 = A03;
        MigColorScheme.A00(A03, AbN.A0T(requireArguments()));
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            ((1tC) this.A07.get()).A03(window, AbN.A0T(requireArguments()));
        }
        LithoView lithoView = this.A02;
        0FI.A08(-1295657920, A02);
        return lithoView;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-256372520);
        super.onDestroy();
        this.A03.A04();
        0FI.A08(1783137608, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        B5M b5m = this.A03;
        C4f c4f = (C4f) 1Hv.A02(requireContext(), 84542);
        String str = c4f.A02;
        if (str != null) {
            bundle.putString("arg_first_message_id", str);
        }
        int i = c4f.A00;
        if (i > 0) {
            bundle.putInt("arg_message_count", i);
        }
        bundle.putParcelable("frx_params_key", b5m.A01);
        bundle.putStringArrayList("select_messages_key", 1BK.A17(b5m.A0B));
        bundle.putString("prompt_token_id_key", b5m.A08);
        Iterator A0y = AnonymousClass001.A0y(this.A06.A00);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            Object value = A0z.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    bundle.putBoolean(A0j, AnonymousClass001.A1V(value));
                } else if (value instanceof Integer) {
                    bundle.putInt(A0j, AnonymousClass001.A03(value));
                } else {
                    if (!(value instanceof String)) {
                        throw AnonymousClass001.A0L(0Pz.A0j("Trying to save invalid value type (", C01e.A00(value.getClass()), ") in LithoStateStore"));
                    }
                    bundle.putString(A0j, (String) value);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ThreadKey threadKey;
        super.onViewCreated(view, bundle);
        B5M b5m = this.A03;
        Context requireContext = requireContext();
        if (bundle != null) {
            z = false;
        } else {
            bundle = this.mArguments;
            z = true;
        }
        b5m.A01 = (FRXParams) bundle.getParcelable("frx_params_key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("select_messages_key");
        b5m.A08 = bundle.getString("prompt_token_id_key");
        if (stringArrayList != null) {
            b5m.A0B.addAll(stringArrayList);
        }
        b5m.A01.getClass();
        FRXParams fRXParams = b5m.A01;
        b5m.A06 = fRXParams.A05;
        UserKey userKey = fRXParams.A08;
        b5m.A07 = userKey != null ? userKey.id : null;
        C4f c4f = (C4f) 1Hv.A02(requireContext, 84542);
        if (z) {
            c4f.A01 = null;
            c4f.A00 = 0;
            c4f.A02 = null;
            c4f.A03.A03.clear();
        } else {
            String string = bundle.getString("arg_first_message_id", null);
            if (string != null) {
                c4f.A02 = string;
            }
            int i = bundle.getInt("arg_message_count", 0);
            if (i > 0) {
                c4f.A00 = i;
            }
        }
        FRXParams fRXParams2 = b5m.A01;
        if (fRXParams2 == null || (threadKey = fRXParams2.A04) == null) {
            B5M.A00(b5m);
        } else {
            c4f.A00(new Clh(b5m), threadKey);
        }
    }
}
