package com.facebook.messaging.qrcode.fragments.fullscreenfragment;

import X.0FI;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Gh;
import X.1UG;
import X.1pI;
import X.1pK;
import X.1pN;
import X.1vD;
import X.7zL;
import X.7zR;
import X.7zU;
import X.7zV;
import X.8Cy;
import X.9WR;
import X.9XO;
import X.AKX;
import X.AQq;
import X.AXg;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C6r6;
import X.C9qq;
import X.PzY;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.qrcode.fragments.fullscreenfragment.QrCodeFragment;

/* loaded from: QrCodeFragment.class */
public final class QrCodeFragment extends 1pK implements 1pN {
    public static final 9WR A07 = new Object();
    public LithoView A00;
    public C6r6 A01;
    public String A02;
    public PzY A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C01i A06;

    public QrCodeFragment() {
        AQq A00 = AQq.A00(this, 41);
        C01i A002 = C01g.A00(C03i.A02, AQq.A00(AQq.A00(this, 37), 38));
        this.A06 = 7zU.A0F(AQq.A00(A002, 39), A00, new AKX((Object) null, A002, 26), 7zL.A18(8Cy.class));
        this.A04 = 1Bq.A00(16508);
        this.A05 = 1Bu.A00(68572);
        this.A02 = "settings_top";
        this.A01 = C6r6.A0e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d1 A[Catch: InterruptedException -> 0x031a, ExecutionException -> 0x0328, TimeoutException -> 0x0336, TRY_ENTER, TRY_LEAVE, TryCatch #2 {InterruptedException -> 0x031a, ExecutionException -> 0x0328, TimeoutException -> 0x0336, blocks: (B:28:0x01f8, B:29:0x01ff, B:31:0x0208, B:32:0x020f, B:33:0x0216, B:35:0x021e, B:36:0x0223, B:37:0x022a, B:39:0x024b, B:41:0x0268, B:42:0x026f, B:44:0x0278, B:46:0x0284, B:48:0x028d, B:49:0x0296, B:52:0x02a2, B:53:0x02a9, B:57:0x02bc, B:60:0x02d1, B:61:0x02d8, B:62:0x02df, B:63:0x02e6, B:64:0x02ed, B:66:0x02f9, B:68:0x0304, B:70:0x030b, B:72:0x0312), top: B:27:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /* JADX WARN: Type inference failed for: r0v159, types: [androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(com.facebook.messaging.qrcode.fragments.fullscreenfragment.QrCodeFragment r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.qrcode.fragments.fullscreenfragment.QrCodeFragment.A03(com.facebook.messaging.qrcode.fragments.fullscreenfragment.QrCodeFragment, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(QrCodeFragment qrCodeFragment) {
        View view = qrCodeFragment.mView;
        if (view != null) {
            1pI A00 = 1vD.A00(view);
            if (A00.BVa()) {
                A00.CeH("QrCodeFragment");
            }
        }
    }

    public boolean Bkd() {
        A06(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-693672321);
        LithoView A0M = 7zR.A0M(this);
        A0M.setClickable(true);
        this.A00 = A0M;
        0FI.A08(-555351866, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(26764362);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A00 = null;
        7zV.A16(1Br.A02(((9XO) 1Br.A0B(this.A05)).A00), 1BJ.A00(1951), "");
        0FI.A08(564070249, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(842420215);
        super/*androidx.fragment.app.Fragment*/.onPause();
        ContentObserver contentObserver = this.A03;
        if (contentObserver != null) {
            try {
                requireContext().getContentResolver().unregisterContentObserver(contentObserver);
            } catch (Throwable th) {
                0fH.A0s("QrCodeFragment", "Failed to unregister screenshot content observer", th);
            }
        }
        0FI.A08(700383820, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1594929433);
        super/*androidx.fragment.app.Fragment*/.onResume();
        ContentObserver contentObserver = this.A03;
        if (contentObserver != null) {
            requireContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, contentObserver);
        }
        0FI.A08(687677197, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        C9qq.A01(getViewLifecycleOwner(), ((8Cy) this.A06.getValue()).A01, this, 77);
        HandlerThread A02 = ((1Gh) 1Br.A0B(this.A04)).A02("content_observer");
        11T.A0A(A02);
        A02.start();
        this.A03 = new PzY(requireContext(), new Handler(A02.getLooper()), new AXg() { // from class: X.9tc
            @Override // X.AXg
            public void CJ3() {
                QrCodeFragment qrCodeFragment = QrCodeFragment.this;
                8LV r0 = (8LV) ((8Cy) qrCodeFragment.A06.getValue()).A01.getValue();
                if (r0 != null) {
                    9XO r02 = (9XO) 1Br.A0B(qrCodeFragment.A05);
                    String str = r0.A05;
                    if (str == null) {
                        str = "";
                    }
                    7zV.A16(1Br.A02(r02.A00), "screenshot_qr_code", str);
                }
            }
        });
        9XO r0 = (9XO) 1Br.A0B(this.A05);
        String str = this.A02;
        11T.A0F(str, 0);
        1UG A08 = 1BK.A08(1Br.A02(r0.A00), 1BJ.A00(1952));
        if (A08.isSampled()) {
            A08.A7R("entry_point", str);
            A08.A7R("qr_unique_id", "");
            A08.BZL();
        }
    }
}
