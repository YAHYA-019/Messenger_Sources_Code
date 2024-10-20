package com.facebook.messaging.rtc.links.ui.sharesheet;

import X.0FI;
import X.0NA;
import X.1Bn;
import X.1JF;
import X.1iF;
import X.1tJ;
import X.2Ov;
import X.4zI;
import X.AbE;
import X.AbF;
import X.AbL;
import X.AnonymousClass001;
import X.C0A2;
import X.C1F6;
import X.C3061Jhu;
import X.DKD;
import X.DKG;
import X.DSl;
import X.EAX;
import X.EeH;
import X.EeM;
import X.ElY;
import X.FEo;
import X.FeH;
import X.G6a;
import X.GW5;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;

/* loaded from: VideoChatLinkFullShareSheetDialogFragment.class */
public class VideoChatLinkFullShareSheetDialogFragment extends 2Ov {
    public EAX A00;
    public ElY A01;

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        String string = bundle2.getString("link");
        4zI.A00("VideoChatLinkFullShareSheetDialogFragment", "Create in-call share dialog for link [%s]", new Object[]{string});
        EeH eeH = new EeH(this);
        Uri uri = null;
        try {
            uri = C0A2.A03(string);
        } catch (SecurityException unused) {
        }
        uri.getClass();
        C1F6 c1f6 = (C1F6) 1Bn.A0A(399);
        Context context = getContext();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            FEo fEo = new FEo(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            String string2 = bundle2.getString("share_text");
            String string3 = bundle2.getString(AbE.A00(606));
            FEo.A00(fEo);
            ArrayList A0t = AnonymousClass001.A0t(1);
            Context context2 = fEo.A00;
            A0t.add(LayoutInflater.from(context2).inflate(2132543196, (ViewGroup) fEo.A03, false));
            int A012 = 0NA.A01(context2, R.attr.statusBarColor, context2.getColor(2132214339));
            fEo.A01 = uri;
            DKG.A1V(string2);
            fEo.A06 = string2;
            if (!1JF.A0B(string3)) {
                string2 = string3;
            }
            fEo.A07 = string2;
            fEo.A05 = eeH;
            EAX eax = new EAX(context2, 0);
            fEo.A04 = eax;
            eax.A0A(new FeH(0.75f));
            C1F6 c1f62 = (C1F6) 1Bn.A0A(398);
            Intent intent = FEo.A09;
            A01 = FbInjector.A01();
            AbL.A0y(c1f62);
            try {
                DSl dSl = new DSl(context2, intent);
                1Bn.A0K();
                FbInjector.A04(A01);
                dSl.A00 = new EeM(fEo);
                dSl.A02 = new G6a();
                C3061Jhu c3061Jhu = new C3061Jhu(dSl);
                c3061Jhu.A01 = A0t;
                c3061Jhu.A07();
                FEo.A00(fEo);
                fEo.A02.A01 = new GW5(fEo, c3061Jhu, 1);
                DKD.A1B(fEo.A03, -1, -2);
                fEo.A03.setBackgroundColor(-1);
                fEo.A03.A16(c3061Jhu);
                fEo.A04.setContentView(fEo.A03);
                1tJ.A06(fEo.A04.getWindow(), A012);
                this.A00 = fEo.A04;
                4zI.A00("VideoChatLinkFullShareSheetDialogFragment", "In-call share dialog for link [%s] created", new Object[]{uri});
                return this.A00;
            } finally {
            }
        } finally {
        }
    }

    public 1iF A17() {
        return AbF.A0C(322006035685628L);
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1763340158);
        super.onCreate(bundle);
        0FI.A08(-928938594, A02);
    }
}
