package com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata;

import X.0DE;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.1Um;
import X.1xA;
import X.1xH;
import X.2Zo;
import X.2Zy;
import X.2aK;
import X.2bX;
import X.4YU;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zR;
import X.7zS;
import X.9rW;
import X.A1d;
import X.A1e;
import X.AJi;
import X.AnonymousClass001;
import X.C0ty;
import X.C1wl;
import X.C1x1;
import X.C96q;
import X.C9gz;
import X.C9ku;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.BottomSheetState;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.ViewState;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: EbOneTimeCodeRestoreViewData.class */
public final class EbOneTimeCodeRestoreViewData {
    public String A00;
    public WeakReference A01;
    public List A02;
    public Function1 A03;
    public Function1 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final 2bX A09;
    public final 2bX A0A;
    public final 2bX A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final 1Br A0N;
    public final boolean A0O;
    public final long A0P;
    public final C9ku A0Q;

    public EbOneTimeCodeRestoreViewData(Context context, FbUserSession fbUserSession, boolean z) {
        11T.A0F(fbUserSession, 2);
        this.A0O = z;
        this.A0P = TimeUnit.SECONDS.toMillis(10);
        this.A0F = 7zM.A0W();
        this.A0K = 7zM.A0b();
        this.A0I = 1Bu.A01(context, 66524);
        this.A0H = 7zM.A0Z();
        this.A0M = 7zM.A0Q();
        this.A0E = 1Bq.A00(16457);
        this.A0D = 1Lm.A00(context, fbUserSession, 68902);
        this.A0J = 1Lm.A00(context, fbUserSession, 68660);
        this.A0N = 7zM.A0V();
        this.A0C = 1Lm.A00(context, fbUserSession, 68883);
        1Bu.A06(context, 147597);
        this.A0Q = new C9ku(context, fbUserSession);
        this.A0G = 1Bu.A01(context, 68815);
        this.A0L = 1Bu.A01(context, 68812);
        this.A09 = new LiveData(4YU.A0k());
        this.A0B = new LiveData(ViewState.Init.A00);
        this.A0A = new LiveData(BottomSheetState.Hidden.A00);
        this.A00 = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.4G8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData r301, X.0DR r302, X.C4G7 r303) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData.A00(com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData, X.0DR, X.4G7):java.lang.Object");
    }

    public static final void A01(ViewState viewState, EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData) {
        1BL.A1I(viewState, "Finishing submitting code with the result ", "EbOneTimeCodeRestoreViewData", AnonymousClass001.A0k());
        2bX r0 = ebOneTimeCodeRestoreViewData.A0B;
        Object value = r0.getValue();
        1Br r02 = ebOneTimeCodeRestoreViewData.A0H;
        7zP.A0O(r02).A01(r0, viewState);
        if (!11T.A0O(viewState, ViewState.Success.A00)) {
            C1x1 A0O = 7zP.A0O(r02);
            2bX r03 = ebOneTimeCodeRestoreViewData.A09;
            A0O.A01(r03, Integer.valueOf(7zR.A02(r03) + 1));
        } else {
            if (11T.A0O(viewState, value)) {
                return;
            }
            ((C1wl) 1Br.A0B(ebOneTimeCodeRestoreViewData.A0G)).A00();
            7zS.A1I(ebOneTimeCodeRestoreViewData.A0D, ebOneTimeCodeRestoreViewData.A0O ? C96q.A0A : C96q.A0I);
        }
    }

    public static final void A02(EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData) {
        ebOneTimeCodeRestoreViewData.A00 = "";
        1Br r0 = ebOneTimeCodeRestoreViewData.A0H;
        7zP.A0O(r0).A01(ebOneTimeCodeRestoreViewData.A0B, ViewState.Init.A00);
        7zP.A0O(r0).A01(ebOneTimeCodeRestoreViewData.A0A, BottomSheetState.Hidden.A00);
        7zP.A0O(r0).A01(ebOneTimeCodeRestoreViewData.A09, 4YU.A0k());
    }

    public static final void A03(EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData, List list) {
        7zP.A0O(ebOneTimeCodeRestoreViewData.A0H).A01(ebOneTimeCodeRestoreViewData.A0A, new BottomSheetState.Visible(list, ebOneTimeCodeRestoreViewData.A08, ebOneTimeCodeRestoreViewData.A07));
        if (list.isEmpty()) {
            7zO.A0Z(ebOneTimeCodeRestoreViewData.A0K).A07("OTC_VIEW_ALL_DEVICES_SCREEN_EMPTY_LIST");
        }
    }

    public static final void A04(EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData, Function2 function2) {
        LifecycleOwner lifecycleOwner;
        WeakReference weakReference = ebOneTimeCodeRestoreViewData.A01;
        if (weakReference == null || (lifecycleOwner = (LifecycleOwner) weakReference.get()) == null) {
            return;
        }
        2aK.A03((Integer) null, (0DE) null, new AJi(null, function2), 2Zy.A00(lifecycleOwner, 2Zo.A00()), 3);
    }

    public static final void A05(EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData, boolean z) {
        ebOneTimeCodeRestoreViewData.A08 = true;
        C9gz c9gz = (C9gz) 1Br.A0B(ebOneTimeCodeRestoreViewData.A0J);
        C0ty c0ty = C0ty.A00;
        11T.A0F(c0ty, 0);
        1xH r0 = new 1xH();
        1xA r02 = c9gz.A00;
        A1d A00 = A1d.A00(r0, 11);
        1Um A0R = 1BL.A0R(r02);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, A00);
        1Um.A02(A0R, A1e.A00(A0Q, r02, c0ty, 20), A0Q, false);
        r0.A03(new 9rW(1, ebOneTimeCodeRestoreViewData, z));
    }

    public final void A06() {
        if (7zP.A0a(this.A0F).A07()) {
            1Br.A0C(this.A0M);
            Thread.sleep(2000L);
        }
    }
}
