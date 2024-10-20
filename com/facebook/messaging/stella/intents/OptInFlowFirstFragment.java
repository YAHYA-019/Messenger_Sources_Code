package com.facebook.messaging.stella.intents;

import X.0FI;
import X.0yH;
import X.1BK;
import X.1BV;
import X.1pK;
import X.5BK;
import X.5Iw;
import X.7zL;
import X.7zO;
import X.AnonymousClass001;
import X.C06974ih;
import X.C06984ii;
import X.C07004ik;
import X.C07014il;
import X.C0A2;
import X.C15h;
import X.C7uL;
import X.CZF;
import X.LKO;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.user.model.User;

/* loaded from: OptInFlowFirstFragment.class */
public class OptInFlowFirstFragment extends 1pK {
    public static final CallerContext A01 = CallerContext.A0B("OptInFlowFirstFragment");
    public String A00 = "";

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1594456927);
        View inflate = layoutInflater.inflate(2132542842, viewGroup, false);
        0FI.A08(103797297, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        CharSequence A0a;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        context.getClass();
        1BV A0R = 7zL.A0R(context, 82256);
        String str = ((User) ((5Iw) A0R.get()).A03.get()).A0X.displayName;
        if (str == null) {
            throw 1BK.A0h();
        }
        this.A00 = str;
        FragmentActivity activity = getActivity();
        Intent intent = activity != null ? activity.getIntent() : null;
        int i = 0;
        if (intent != null) {
            i = intent.getIntExtra("content_variant", 0);
        }
        Context context2 = getContext();
        if (context2 != null) {
            TextView textView = (TextView) view.findViewById(2131366115);
            if (textView != null) {
                textView.setText(7zO.A0w(context2.getString(2131962531), new Object[]{"Messenger", this.A00}));
            }
            TextView textView2 = (TextView) view.findViewById(2131366111);
            if (textView2 != null) {
                if (i == 3 || i == 1) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append((Object) 0yH.A00(7zO.A0D(this), new String[]{"Messenger", this.A00}, 2131962515));
                    A0k.append("\n\n");
                    A0a = AnonymousClass001.A0a(0yH.A00(7zO.A0D(this), new String[]{"Messenger", this.A00}, 2131962516), A0k);
                } else {
                    A0a = 0yH.A00(7zO.A0D(this), new String[]{"Messenger", this.A00}, 2131962514);
                }
                textView2.setText(A0a);
            }
        }
        NavHostFragment navHostFragment = (NavHostFragment) requireActivity().BDe().A0Y(2131365938);
        if (navHostFragment != null) {
            Object value = navHostFragment.A03.getValue();
            View findViewById = view.findViewById(2131363276);
            if (findViewById != null) {
                findViewById.setOnClickListener(new LKO(value, 72));
            }
            View findViewById2 = view.findViewById(2131362859);
            if (findViewById2 != null && activity != null) {
                findViewById2.setOnClickListener(new CZF(activity, 69));
            }
        }
        C07004ik A00 = C06984ii.A00();
        A00.A03(2132411096);
        ((C07014il) A00).A04 = 5BK.A05;
        C06974ih A0L = 7zL.A0L(A00);
        View findViewById3 = view.findViewById(2131368304);
        if (findViewById3 != null) {
            C15h c15h = ((5Iw) A0R.get()).A03;
            String str2 = ((User) c15h.get()).A1R;
            if (str2 == null) {
                str2 = ((User) c15h.get()).A07();
                if (str2 == null) {
                    str2 = "";
                }
            }
            Uri uri = null;
            try {
                uri = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
            C7uL.A00(uri, findViewById3, A0L, A01);
        }
    }
}
