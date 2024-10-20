package com.facebook.messaging.integrity.frx.messagepicker;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.2Og;
import X.5TX;
import X.5TZ;
import X.5oH;
import X.6tW;
import X.7zL;
import X.7zN;
import X.7zU;
import X.8dR;
import X.9AP;
import X.9JW;
import X.9OC;
import X.A3K;
import X.C00i;
import X.C5xv;
import X.C6v6;
import X.C9JV;
import X.C9zj;
import X.RMJ;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.fb.fragment.LoggingConfiguration;
import com.facebook.messaging.integrity.frx.messagepicker.model.MessagePickerPageData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.google.common.collect.ImmutableMap;
import java.util.BitSet;

/* loaded from: MessagePickerFragment.class */
public final class MessagePickerFragment extends SlidingSheetFullScreenDialogFragment implements 2Og {
    public FbUserSession A00;
    public RMJ A01;
    public LithoView A02;
    public MessagePickerPageData A03;
    public 8dR A04;
    public ThreadKey A05;
    public C6v6 A06;
    public 5oH A07;
    public 9OC A08;
    public final 1Br A09 = 7zN.A0I(this);
    public final 1Br A0A = 1Bu.A00(67807);
    public final C9JV A0B;
    public final 9JW A0C;
    public final 9AP A0D;
    public final C5xv A0E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.9AP] */
    public MessagePickerFragment() {
        ImmutableMap build = new ImmutableMap.Builder().build();
        11T.A0A(build);
        ?? obj = new Object();
        ((9AP) obj).A00 = build;
        this.A0D = obj;
        this.A0E = new C9zj(this, 73);
        this.A0C = new 9JW(this);
        this.A0B = new C9JV(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 06Z BdK() {
        if (isAdded()) {
            return getChildFragmentManager();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ca, code lost:
    
        if (r308 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.integrity.frx.messagepicker.MessagePickerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-150369632);
        super.onDestroyView();
        this.A02 = null;
        0FI.A08(-542307715, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        ThreadKey threadKey = this.A05;
        if (threadKey == null) {
            str = "threadKey";
        } else {
            9OC r0 = new 9OC(requireContext);
            1Iw A0W = 7zL.A0W(requireContext);
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                9JW r02 = this.A0C;
                11T.A0F(r02, 4);
                C00i c00i = r0.A01;
                6tW r03 = (6tW) c00i.get();
                Context context = r0.A00;
                5TX r04 = new 5TX();
                7zU.A0v(context, r04);
                BitSet A18 = 1BK.A18(2);
                A18.clear();
                r04.A02 = threadKey;
                A18.set(0);
                r04.A01 = fbUserSession.BKF();
                A18.set(1);
                5TZ.A00(A18, new String[]{"threadKey", "viewerContext"}, 2);
                r03.A03(context, this, A0W, LoggingConfiguration.A00("MessagePickerView").A00(), r04);
                ((6tW) c00i.get()).A00(new A3K(fbUserSession, r02, r0, threadKey));
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
