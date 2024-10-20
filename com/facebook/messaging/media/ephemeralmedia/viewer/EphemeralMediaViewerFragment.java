package com.facebook.messaging.media.ephemeralmedia.viewer;

import X.06Z;
import X.0D2;
import X.0FI;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bf;
import X.1Bn;
import X.1De;
import X.1Od;
import X.1Rv;
import X.1iF;
import X.1tJ;
import X.2Oc;
import X.2Ov;
import X.2Wo;
import X.48U;
import X.4YU;
import X.5FE;
import X.6KV;
import X.6QS;
import X.82O;
import X.9JZ;
import X.C00i;
import X.C09s;
import X.C0x;
import X.C1F6;
import X.C5f;
import X.C6p5;
import X.C9kl;
import X.HRf;
import X.HRg;
import X.Hij;
import X.Hk1;
import X.Htq;
import X.IGa;
import X.IlP;
import X.JFP;
import X.N0m;
import X.RFi;
import X.RFj;
import X.Rh7;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.ui.keyboard.CustomKeyboardLayout;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.ephemeralmedia.viewer.gesture.EphemeralMediaViewerGestureContainer;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.facebook.messaging.screenshotdetection.ThreadScreenshotDetector;
import com.facebook.resources.ui.FbTextView;

/* loaded from: EphemeralMediaViewerFragment.class */
public class EphemeralMediaViewerFragment extends 2Ov implements 2Oc, CallerContextable {
    public static final CallerContext A08 = CallerContext.A06(EphemeralMediaViewerFragment.class);
    public N0m A00;
    public 2Wo A01;
    public 6KV A02;
    public Rh7 A03;
    public final C00i A06 = new 1BV(this, 813);
    public final C00i A07 = 1BV.A00(65571);
    public final C00i A04 = 1BQ.A02(16616);
    public final C00i A05 = 1BQ.A02(67262);

    public Dialog A0n(Bundle bundle) {
        A0g(2, 2132608307);
        Dialog A0n = super.A0n(bundle);
        A0n.setOnKeyListener(new IGa(this, 0));
        return A0n;
    }

    public 1iF A17() {
        return new 1iF(870846630426547L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomKeyboardLayout AgH() {
        2Wo r302 = this.A01;
        if (r302 == null) {
            r302 = 2Wo.A00((ViewStub) C09s.A01(this.mView, 2131363502));
            this.A01 = r302;
        }
        return (CustomKeyboardLayout) r302.A01();
    }

    public boolean Bkd() {
        C9kl c9kl;
        Rh7 rh7 = this.A03;
        if (rh7 == null || (c9kl = rh7.A04) == null) {
            return false;
        }
        6QS r0 = c9kl.A01;
        if (r0 != null && r0.A21()) {
            return true;
        }
        if (c9kl.A03.getVisibility() != 0) {
            return false;
        }
        C9kl.A00(c9kl);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1801317598);
        super.onCreate(bundle);
        FbUserSession A0F = 1BL.A0F();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Message message = (Message) bundle2.getParcelable("message_key");
            ThreadSummary threadSummary = (ThreadSummary) this.mArguments.getParcelable("thread_summary_key");
            if (message != null && threadSummary != null) {
                C1F6 c1f6 = (C1F6) this.A06.get();
                Context context = getContext();
                CallerContext callerContext = A08;
                06Z childFragmentManager = getChildFragmentManager();
                Context A00 = 1Bf.A00(c1f6);
                try {
                    Rh7 rh7 = new Rh7(context, childFragmentManager, A0F, callerContext, c1f6, message, threadSummary);
                    1Bn.A0K();
                    FbInjector.A04(A00);
                    this.A03 = rh7;
                    C1F6 c1f62 = (C1F6) rh7.A0M.get();
                    Message message2 = rh7.A0S;
                    RFi rFi = new RFi(rh7);
                    A00 = 1Bf.A00(c1f62);
                    C5f c5f = new C5f(new 1De(c1f62, new int[0]), rFi, message2);
                    1Bn.A0K();
                    FbInjector.A04(A00);
                    rh7.A08 = c5f;
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A00);
                    throw th;
                }
            }
        }
        0FI.A08(-1760033021, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1378785125);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && dialog.getWindow() != null) {
            1tJ.A04(((0D2) this).A01.getWindow(), 5381);
        }
        View inflate = layoutInflater.inflate(2132541937, viewGroup, false);
        0FI.A08(628767624, A02);
        return inflate;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-437853813);
        6KV r0 = this.A02;
        if (r0 != null) {
            r0.A05(-1);
        }
        super.onDestroy();
        0FI.A08(-104747519, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        N0m n0m;
        ThreadKey threadKey;
        super/*X.0D2*/.onDismiss(dialogInterface);
        Activity A16 = A16();
        if ((A16 == null || !A16.isChangingConfigurations()) && (n0m = this.A00) != null) {
            C00i c00i = n0m.A00;
            if (c00i.get() != null) {
                c00i.get();
            }
        }
        Rh7 rh7 = this.A03;
        if (rh7 == null || (threadKey = rh7.A0S.A0V) == null) {
            return;
        }
        C00i c00i2 = rh7.A0O;
        C6p5 c6p5 = (C6p5) c00i2.get();
        FbUserSession fbUserSession = rh7.A01;
        c6p5.A01(fbUserSession, EphemeralMediaState.SEEN, threadKey, rh7.A0C.build());
        ((C6p5) c00i2.get()).A01(fbUserSession, EphemeralMediaState.EXPIRED, threadKey, rh7.A0B.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1942719518);
        super/*androidx.fragment.app.Fragment*/.onPause();
        Rh7 rh7 = this.A03;
        if (rh7 != null) {
            ThreadScreenshotDetector threadScreenshotDetector = (ThreadScreenshotDetector) rh7.A0Q.get();
            threadScreenshotDetector.A00.remove(rh7.A0V);
            Rh7.A01(rh7);
        }
        0FI.A08(169644140, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        Window window;
        int A02 = 0FI.A02(-1114127101);
        super/*androidx.fragment.app.Fragment*/.onResume();
        C00i c00i = this.A04;
        if (((1Od) c00i.get()).A08() != null && (window = ((1Od) c00i.get()).A08().getWindow()) != null) {
            if (((1Rv) this.A05.get()).A09(48U.A00(getContext(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}))) {
                window.clearFlags(8192);
            } else {
                window.setFlags(8192, 8192);
            }
        }
        Rh7 rh7 = this.A03;
        if (rh7 != null) {
            C00i c00i2 = rh7.A0Q;
            ((ThreadScreenshotDetector) c00i2.get()).A00.add(rh7.A0V);
            ((5FE) c00i2.get()).A04();
            ((5FE) c00i2.get()).A01();
            Rh7.A02(rh7);
        }
        0FI.A08(-433508475, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Rh7 rh7 = this.A03;
        if (rh7 != null) {
            ((5FE) rh7.A0Q.get()).init();
            rh7.A0C = 4YU.A0h();
            rh7.A0B = 4YU.A0h();
            2Wo A00 = 2Wo.A00((ViewStub) C09s.A01(view, 2131363502));
            rh7.A03 = (LithoView) C09s.A01(view, 2131367951);
            rh7.A0A = (FbTextView) C09s.A01(view, 2131368240);
            C1F6 c1f6 = (C1F6) rh7.A0L.get();
            ThreadSummary threadSummary = rh7.A0T;
            LithoView lithoView = rh7.A03;
            Context context = rh7.A0E;
            String string = context.getResources().getString(2131954234);
            Context A002 = 1Bf.A00(c1f6);
            try {
                Hk1 hk1 = new Hk1(new 1De(c1f6, new int[0]), lithoView, threadSummary, string);
                1Bn.A0K();
                FbInjector.A04(A002);
                rh7.A09 = hk1;
                hk1.A00 = new 9JZ(rh7);
                String str = hk1.A01;
                Resources resources = context.getResources();
                String A0u = str != null ? 4YU.A0u(resources, str, 2131956572) : resources.getString(2131956573);
                C1F6 c1f62 = (C1F6) rh7.A0J.get();
                FbUserSession fbUserSession = rh7.A01;
                06Z r0 = rh7.A0F;
                FrameLayout frameLayout = (FrameLayout) C09s.A01(view, 2131365609);
                FbTextView fbTextView = (FbTextView) C09s.A01(view, 2131363250);
                Context A003 = 1Bf.A00(c1f62);
                C9kl c9kl = new C9kl(context, frameLayout, r0, fbUserSession, c1f62, threadSummary, fbTextView, A00, A0u);
                1Bn.A0K();
                FbInjector.A04(A003);
                rh7.A04 = c9kl;
                c9kl.A02 = new RFj(rh7);
                rh7.A07 = C09s.A01(view, 2131363917);
                C1F6 c1f63 = (C1F6) rh7.A0K.get();
                EphemeralMediaViewerGestureContainer ephemeralMediaViewerGestureContainer = rh7.A07;
                CallerContext callerContext = rh7.A0G;
                C0x c0x = rh7.A0R;
                A002 = 1Bf.A00(c1f63);
                Hij hij = new Hij(context, ephemeralMediaViewerGestureContainer, callerContext, c1f63, c0x);
                1Bn.A0K();
                FbInjector.A04(A002);
                rh7.A06 = hij;
                rh7.A00 = (FrameLayout) C09s.A01(view, 2131364484);
                rh7.A07.A02 = new HRf(rh7);
                MontageProgressIndicatorView montageProgressIndicatorView = (MontageProgressIndicatorView) C09s.A01(view, 2131366709);
                Htq htq = (Htq) rh7.A0P.get();
                JFP jfp = rh7.A0U;
                htq.A02 = montageProgressIndicatorView;
                if (montageProgressIndicatorView != null) {
                    montageProgressIndicatorView.A04 = jfp;
                }
                Rh7.A00(rh7);
                this.A03.A05 = new HRg(this);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A002);
                throw th;
            }
        }
        2Wo A004 = 2Wo.A00((ViewStub) C09s.A01(view, 2131363502));
        this.A01 = A004;
        A004.A02 = new IlP(this, 1);
        6KV A005 = ((82O) this.A07.get()).A00(getContext());
        this.A02 = A005;
        A005.A02();
    }
}
