package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.xapp.messaging.threadview.overlay.DisableTitleBarOverlayFragment;

/* renamed from: X.752, reason: invalid class name */
/* loaded from: 752.class */
public final class AnonymousClass752 implements AnonymousClass753 {
    public LithoView A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final FbUserSession A04;
    public final 6tM A05;
    public final AnonymousClass726 A06;
    public final C6vi A07;
    public final 2Og A08;

    public AnonymousClass752(Context context, FbUserSession fbUserSession, 6tM r304, AnonymousClass726 anonymousClass726, C6vi c6vi, 2Og r307) {
        11T.A0F(anonymousClass726, 2);
        11T.A0F(c6vi, 4);
        11T.A0F(r307, 6);
        11T.A0F(r304, 7);
        this.A04 = fbUserSession;
        this.A06 = anonymousClass726;
        this.A07 = c6vi;
        this.A08 = r307;
        this.A05 = r304;
        this.A01 = 1Bu.A01(context, 147850);
        this.A02 = 1Lm.A00(context, fbUserSession, 65962);
        this.A03 = 1Bu.A01(context, 116182);
    }

    @Override // X.AnonymousClass753
    public void ARS() {
        0D2 r0;
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            lithoView.setVisibility(8);
        }
        C6rj c6rj = this.A07.A02;
        if (c6rj != null) {
            c6rj.A00();
        }
        06Z BdK = this.A08.BdK();
        Fragment fragment = null;
        if (BdK != null) {
            fragment = BdK.A0b("disable_title_bar_fragment_tag");
        }
        if (!(fragment instanceof 0D2) || (r0 = (0D2) fragment) == null) {
            return;
        }
        r0.A0p();
    }

    @Override // X.AnonymousClass753
    public void CkZ(String str, CharSequence charSequence) {
    }

    @Override // X.AnonymousClass753
    public void Cka(ThreadKey threadKey, 4kB r303, C5fv c5fv, CharSequence charSequence, String str) {
        11T.A0F(charSequence, 2);
        C00i c00i = this.A03.A00;
        c00i.get();
        String createTraceIdForType = TraceLogger.createTraceIdForType(45);
        if (createTraceIdForType != null) {
            ((5Et) c00i.get()).A04(45, (String) null, createTraceIdForType);
        }
        if (r303 != null) {
            r303.A73(str.hashCode(), "SEND_MESSAGE_API_START");
        }
        22C r0 = (22C) this.A02.A00.get();
        long j = threadKey.A01;
        long B32 = this.A06.B32();
        Long A0e = 0CW.A0e(str);
        long parseLong = Long.parseLong(((C5fu) c5fv).A09);
        String obj = charSequence.toString();
        A08 a08 = new A08(str, r303, 1);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        int A00 = 4uZ.A00(mailboxFutureImpl, (1X9) null);
        TraceInfo A02 = 4uZ.A02(mailboxFutureImpl, (LoggingOption) null, "MailboxTam", "runTamClientMessageEditOptimistic");
        mailboxFutureImpl.Cu4(a08);
        if (!AQV.Cj2(new N7V(mailboxFutureImpl, r0, A0e, createTraceIdForType, obj, A00, j, B32, parseLong))) {
            mailboxFutureImpl.cancel(false);
            4uZ.A03(A00);
            4uZ.A05((LoggingOption) null, A02, "MailboxTam", "runTamClientMessageEditOptimistic");
        }
        PlatformLogger.platformEventLog(5);
    }

    @Override // X.AnonymousClass753
    public void D1i() {
        View rootView;
        View findViewById;
        View A0h;
        C2lb A0l;
        C6vi c6vi = this.A07;
        C2kx c2kx = c6vi.A01;
        View view = c6vi.A00;
        06Z BdK = this.A08.BdK();
        if (c2kx == null || view == null || BdK == null) {
            return;
        }
        int A05 = 1tG.A05(this.A05.A00(0S2.A0N), 127);
        C6rj c6rj = c6vi.A02;
        if (c6rj != null) {
            c6rj.A00();
        }
        RecyclerView A02 = c2kx.A02();
        if (A02 != null && (A0h = A02.A0h(view)) != null && (A0l = A02.A0l(A0h)) != null) {
            int i = A0l.A05;
            if (i == -1) {
                i = A0l.A04;
            }
            c2kx.A04(i, 10);
        }
        C00i c00i = this.A01.A00;
        Integer num = null;
        if (((2yD) ((C5jk) c00i.get()).A00.A00.get()).AZk(36320859090403068L)) {
            LithoView lithoView = this.A00;
            if (lithoView == null) {
                RecyclerView A022 = c2kx.A02();
                if (A022 != null) {
                    View rootView2 = A022.getRootView();
                    ViewGroup viewGroup = rootView2 != null ? (ViewGroup) rootView2.findViewById(2131365867) : null;
                    LithoView lithoView2 = new LithoView(A022.getContext());
                    lithoView2.setBackgroundColor(A05);
                    lithoView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    lithoView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.7uv
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return true;
                        }
                    });
                    if (viewGroup != null) {
                        viewGroup.addView(lithoView2);
                    }
                    this.A00 = lithoView2;
                }
            } else {
                lithoView.setVisibility(0);
            }
            RecyclerView A023 = c2kx.A02();
            if (A023 != null && (rootView = A023.getRootView()) != null && (findViewById = rootView.findViewById(2131365869)) != null) {
                num = Integer.valueOf(findViewById.getHeight());
            }
        }
        boolean AZk = ((2yD) ((C5jk) c00i.get()).A00.A00.get()).AZk(36320859090403068L);
        2Ov disableTitleBarOverlayFragment = new DisableTitleBarOverlayFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("tint_overlay_color", A05);
        bundle.putBoolean("is_tint_overlay_enabled", AZk);
        if (num != null) {
            bundle.putInt("title_bar_height", num.intValue());
        }
        disableTitleBarOverlayFragment.setArguments(bundle);
        C06c c06c = new C06c(BdK);
        c06c.A0P(disableTitleBarOverlayFragment, "disable_title_bar_fragment_tag", 2131365865);
        c06c.A04();
        C6rj c6rj2 = c6vi.A02;
        if (c6rj2 != null) {
            disableTitleBarOverlayFragment.A18(new 7QF(c6rj2));
        }
        C6rj c6rj3 = c6vi.A02;
        if (c6rj3 != null) {
            RecyclerView A024 = c6rj3.A04.A02();
            if (A024 != null) {
                A024.suppressLayout(true);
            }
            c6rj3.A03 = true;
        }
    }
}
