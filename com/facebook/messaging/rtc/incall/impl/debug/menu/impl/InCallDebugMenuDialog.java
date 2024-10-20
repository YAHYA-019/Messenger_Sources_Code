package com.facebook.messaging.rtc.incall.impl.debug.menu.impl;

import X.0D2;
import X.0FI;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.Q2h;
import X.SFL;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InCallDebugMenuDialog.class */
public final class InCallDebugMenuDialog extends 2Ov {
    public Set A00;

    public 1iF A17() {
        return AbF.A0C(594492937905231L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1904248153);
        super.onCreate(bundle);
        Set set = (Set) 1Bn.A0E(requireContext(), (1BY) null, 249);
        11T.A0A(set);
        this.A00 = set;
        0FI.A08(135623842, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1153411979);
        float f = RecyclerView.A1C;
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.A1D(new LinearLayoutManager(recyclerView.getContext()));
        ArrayList A17 = 1BK.A17(this.A00);
        Collections.sort(A17, SFL.A00);
        Q2h q2h = new Q2h();
        q2h.A00 = A17;
        q2h.A07();
        recyclerView.A16(q2h);
        0FI.A08(-689310856, A02);
        return recyclerView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        Set set = this.A00;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        Window window;
        int A02 = 0FI.A02(-48458149);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            ((ViewGroup.LayoutParams) attributes).width = -1;
            ((ViewGroup.LayoutParams) attributes).height = -2;
            window.setAttributes(attributes);
        }
        0FI.A08(578435263, A02);
    }
}
