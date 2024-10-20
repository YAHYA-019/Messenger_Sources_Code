package com.facebook.messaging.stella.intents;

import X.0FI;
import X.1BK;
import X.1Bi;
import X.1CO;
import X.1pK;
import X.7zK;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbJ;
import X.AbN;
import X.CYm;
import X.CYr;
import X.CZF;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;

/* loaded from: OptInFlowSecondFragment.class */
public class OptInFlowSecondFragment extends 1pK {
    public final 1CO A00 = AbJ.A0e();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(243094215);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542843);
        0FI.A08(-1493692479, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        TextView A06;
        int i;
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Intent intent = activity != null ? activity.getIntent() : null;
        int i2 = 0;
        if (intent != null) {
            i2 = intent.getIntExtra(7zK.A00(291), 0);
            str = intent.getStringExtra("salt");
        } else {
            str = "";
        }
        Context context = getContext();
        if (context != null) {
            TextView A062 = AbF.A06(view, 2131366107);
            if (A062 != null) {
                A062.setText(7zO.A0w(context.getString(2131962532), new Object[]{"Messenger"}));
            }
            TextView A063 = AbF.A06(view, 2131366108);
            if (A063 != null) {
                AbN.A0r(context, A063, 2131962522);
            }
            TextView A064 = AbF.A06(view, 2131366112);
            if (A064 != null) {
                AbN.A0r(context, A064, 2131962517);
            }
            TextView A065 = AbF.A06(view, 2131366109);
            if (A065 != null) {
                int i3 = 2131962524;
                if (i2 == 3) {
                    i3 = 2131962525;
                }
                AbN.A0r(context, A065, i3);
            }
            TextView A066 = AbF.A06(view, 2131366110);
            if (A066 != null) {
                AbN.A0r(context, A066, 2131962523);
            }
            if (i2 == 1 || i2 == 3) {
                TextView A067 = AbF.A06(view, 2131366113);
                if (A067 != null) {
                    int i4 = 2131962520;
                    if (i2 == 3) {
                        i4 = 2131962521;
                    }
                    A067.setText(7zO.A0w(1BK.A0v(context, "Messenger", i4), new Object[0]));
                }
                TextView A068 = AbF.A06(view, 2131366114);
                if (A068 != null) {
                    AbN.A0r(context, A068, 2131962518);
                }
                TextView A069 = AbF.A06(view, 2131366105);
                if (A069 != null) {
                    AbN.A0r(context, A069, 2131962526);
                    A069.setOnClickListener(new CYr(24, this, context, 1Bi.A03(49965)));
                }
                A06 = AbF.A06(view, 2131363276);
                if (A06 != null) {
                    i = 2131962528;
                    AbN.A0r(context, A06, i);
                }
            } else {
                TextView A0610 = AbF.A06(view, 2131366113);
                if (A0610 != null) {
                    A0610.setText(7zO.A0w(1BK.A0v(context, "Messenger", 2131962520), new Object[0]));
                }
                TextView A0611 = AbF.A06(view, 2131366114);
                if (A0611 != null) {
                    AbN.A0r(context, A0611, 2131962519);
                }
                TextView A0612 = AbF.A06(view, 2131366105);
                if (A0612 != null) {
                    A0612.setText(Html.fromHtml(context.getResources().getString(2131962527)));
                    A0612.setOnClickListener(new CYr(23, this, context, 1Bi.A03(49965)));
                }
                A06 = AbF.A06(view, 2131363276);
                if (A06 != null) {
                    i = 2131962529;
                    AbN.A0r(context, A06, i);
                }
            }
        }
        View findViewById = view.findViewById(2131363276);
        if (findViewById != null) {
            findViewById.setOnClickListener(new CYm(str, this, 6));
        }
        View findViewById2 = view.findViewById(2131362859);
        if (findViewById2 == null || activity == null) {
            return;
        }
        CZF.A01(findViewById2, activity, 70);
    }
}
