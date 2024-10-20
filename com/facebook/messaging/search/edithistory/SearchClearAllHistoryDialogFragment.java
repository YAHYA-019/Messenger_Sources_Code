package com.facebook.messaging.search.edithistory;

import X.0AW;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1iF;
import X.2Ov;
import X.7zQ;
import X.7zV;
import X.AbK;
import X.Bh9;
import X.C5ic;
import X.CSG;
import X.CSM;
import X.DR6;
import X.JZj;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: SearchClearAllHistoryDialogFragment.class */
public final class SearchClearAllHistoryDialogFragment extends 2Ov {
    public Bh9 A00;
    public MigColorScheme A01;
    public C5ic A02;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchClearAllHistoryDialogFragment() {
        setRetainInstance(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String str;
        this.A01 = 7zV.A0S(this);
        C5ic A0l = 7zQ.A0l();
        this.A02 = A0l;
        if (A0l == null) {
            str = "dialogBuilderFactory";
        } else {
            Context requireContext = requireContext();
            MigColorScheme migColorScheme = this.A01;
            if (migColorScheme != null) {
                DR6 dr6 = new DR6(requireContext, migColorScheme);
                dr6.A00(2131959867);
                dr6.A06(2131959866);
                CSG.A05(dr6, this, ActionId.FORMAT_ERROR, 2131959865);
                dr6.A0C(CSG.A00(this, ActionId.FILE_SYSTEM_FAIL), 2131959869);
                JZj A04 = dr6.A04();
                A04.setOnShowListener(new CSM(A04, this, 3));
                return A04;
            }
            str = "colorScheme";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public 1iF A17() {
        return AbK.A0E();
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(664678183);
        super.onCreate(bundle);
        0FI.A08(662503617, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        Dialog dialog;
        int A02 = 0FI.A02(1065877441);
        if (((0D2) this).A01 != null) {
            0AW.A03(this);
            if (this.mRetainInstance && (dialog = ((0D2) this).A01) != null) {
                dialog.setDismissMessage(null);
            }
        }
        super.onDestroyView();
        0FI.A08(602102903, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1560535707);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0o();
        0FI.A08(-1861055801, A02);
    }
}
