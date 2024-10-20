package com.facebook.messaging.threadview.environment.hintcard.proactivewarning;

import X.0D2;
import X.0Pz;
import X.0S2;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.4YT;
import X.6IQ;
import X.6mL;
import X.6mO;
import X.83S;
import X.8P3;
import X.9RY;
import X.AnonymousClass954;
import X.C1rs;
import X.DR7;
import X.QJt;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: ProactiveWarningBottomSheetFragment.class */
public class ProactiveWarningBottomSheetFragment extends MigBottomSheetDialogFragment {
    public 6IQ A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        QJt qJt;
        DR7 dr7 = ((0D2) this).A01;
        if (dr7 != null) {
            dr7.setCanceledOnTouchOutside(false);
            if (dr7 instanceof DR7) {
                DR7 dr72 = dr7;
                dr72.A05().A0B(3);
                dr72.A05().A0W = true;
                dr72.A05().A0O = false;
            }
        }
        this.A04 = true;
        MigColorScheme migColorScheme = (MigColorScheme) requireArguments().getParcelable(4YT.A00(971));
        ProactiveWarningInfo proactiveWarningInfo = (ProactiveWarningInfo) requireArguments().getParcelable(4YT.A00(1580));
        if (migColorScheme == null || proactiveWarningInfo == null) {
            Dialog dialog = ((0D2) this).A01;
            if (dialog != null) {
                dialog.dismiss();
            }
            qJt = 2cK.A01(r302, (String) null, 0).A00;
        } else {
            8P3 r0 = new 8P3(r302, new QJt());
            r0.A2K(0Pz.A0W("frx_pw_bottom_sheet_", proactiveWarningInfo.A02));
            qJt = r0.A01;
            qJt.A00 = migColorScheme;
            BitSet bitSet = r0.A02;
            bitSet.set(0);
            qJt.A02 = proactiveWarningInfo.A07;
            bitSet.set(1);
            qJt.A03 = proactiveWarningInfo.A08;
            bitSet.set(2);
            ImmutableList.Builder builder = ImmutableList.builder();
            String str = proactiveWarningInfo.A06;
            if (!TextUtils.isEmpty(str)) {
                builder.m11011add((Object) new 9RY(83S.A00(this, 32), AnonymousClass954.SECONDARY, str));
            }
            String str2 = proactiveWarningInfo.A04;
            if (!TextUtils.isEmpty(str2)) {
                builder.m11011add((Object) new 9RY(83S.A00(this, 33), AnonymousClass954.SECONDARY, str2));
            }
            qJt.A01 = builder.build();
            C1rs.A03(bitSet, r0.A03);
            r0.A0J();
        }
        return (1LI) qJt;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        6IQ r0 = this.A00;
        if (r0 == null || r0.A09) {
            return;
        }
        Integer num = 0S2.A0C;
        6mL r02 = r0.A05;
        if (r02 != null) {
            r02.A05(num);
        }
        6mO r03 = r0.A04;
        if (r03 != null) {
            r03.A01();
        }
        6IQ.A02(r0, true, true);
        r0.A09 = true;
    }
}
