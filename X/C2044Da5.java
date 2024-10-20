package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.stickers.model.StickerPack;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.util.HashMap;

/* renamed from: X.Da5, reason: case insensitive filesystem */
/* loaded from: Da5.class */
public final class C2044Da5 extends 1pK implements C02l, CallerContextable {
    public static final CallerContext A0N = CallerContext.A08(C2044Da5.class, "sticker_store_pack");
    public static final String __redex_internal_original_name = "StickerStorePackFragment";
    public ProgressBar A00;
    public FbUserSession A01;
    public FbDraweeView A02;
    public StickerPack A03;
    public Optional A04;
    public boolean A05;
    public boolean A06;
    public Context A07;
    public LayoutInflater A08;
    public Button A09;
    public LinearLayout A0A;
    public ProgressBar A0B;
    public ScrollView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public 1PA A0G;
    public 1I7 A0H;
    public FbDraweeView A0I;
    public 6HM A0J;
    public final 2S2 A0K = (2S2) 1Bi.A03(66368);
    public final Fao A0M = (Fao) 1Bi.A03(100161);
    public final EsU A0L = (EsU) 1Bi.A03(100211);

    public static void A03(FbUserSession fbUserSession, C2044Da5 c2044Da5) {
        c2044Da5.A07(c2044Da5.A03, "sticker_pack_download_tapped");
        c2044Da5.A09.setEnabled(false);
        c2044Da5.A0B.setProgress(0);
        c2044Da5.A0B.setVisibility(0);
        c2044Da5.A0M.A01(fbUserSession, c2044Da5.A03);
    }

    public static void A06(FbUserSession fbUserSession, C2044Da5 c2044Da5) {
        Button button;
        int i;
        if (c2044Da5.A03 == null || c2044Da5.A0I == null) {
            return;
        }
        c2044Da5.A0C.scrollTo(0, 0);
        FbDraweeView fbDraweeView = c2044Da5.A0I;
        Uri uri = c2044Da5.A03.A05;
        CallerContext callerContext = A0N;
        fbDraweeView.A0G(uri, callerContext);
        c2044Da5.A0F.setText(c2044Da5.A03.A0C);
        c2044Da5.A0D.setText(c2044Da5.A03.A09);
        StickerPack stickerPack = c2044Da5.A03;
        boolean z = stickerPack.A0J;
        TextView textView = c2044Da5.A0E;
        if (z) {
            textView.setText(2131966351);
        } else {
            textView.setText(stickerPack.A0A);
        }
        Fao fao = c2044Da5.A0M;
        if (fao.A02(c2044Da5.A03)) {
            c2044Da5.A09.setText(2131966350);
            c2044Da5.A09.setEnabled(false);
            c2044Da5.A0B.setIndeterminate(false);
            ProgressBar progressBar = c2044Da5.A0B;
            StickerPack stickerPack2 = c2044Da5.A03;
            HashMap hashMap = fao.A05;
            String str = stickerPack2.A0B;
            progressBar.setProgress(hashMap.containsKey(str) ? AnonymousClass001.A03(hashMap.get(str)) : 0);
            c2044Da5.A0B.setVisibility(0);
        } else {
            if (c2044Da5.A05) {
                c2044Da5.A09.setText(2131966349);
                c2044Da5.A09.setEnabled(false);
            } else {
                StickerPack stickerPack3 = c2044Da5.A03;
                if (stickerPack3.A0J) {
                    button = c2044Da5.A09;
                    i = 2131966348;
                } else {
                    boolean z2 = stickerPack3.A0D;
                    button = c2044Da5.A09;
                    i = 2131966365;
                    if (z2) {
                        button.setText(2131966348);
                        c2044Da5.A09.setEnabled(true);
                    }
                }
                button.setText(i);
                c2044Da5.A09.setEnabled(false);
                c2044Da5.A09.setTextColor(LightColorScheme.A00().Ahv());
            }
            c2044Da5.A0B.setVisibility(8);
        }
        Optional optional = c2044Da5.A04;
        if (optional.isPresent() && !c2044Da5.A03.A06.A01((C6xd) optional.get())) {
            c2044Da5.A09.setEnabled(false);
        }
        c2044Da5.A00.setVisibility(0);
        c2044Da5.A02.A0H(c2044Da5.A03.A02, callerContext, new C2521Gg1(c2044Da5, 11));
        c2044Da5.A0A.removeAllViews();
        1Du it = c2044Da5.A03.A07.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (!1JF.A0B(A0i)) {
                TextView textView2 = (TextView) c2044Da5.A08.inflate(2132542965, (ViewGroup) c2044Da5.A0A, false);
                textView2.setText(A0i);
                c2044Da5.A0A.addView(textView2);
            }
        }
        if (c2044Da5.A06) {
            A03(fbUserSession, c2044Da5);
            c2044Da5.A06 = false;
        }
    }

    private void A07(StickerPack stickerPack, String str) {
        EsU esU = this.A0L;
        2Jy A0G = DKH.A0G("sticker_store_pack");
        A0G.A0D("action", str);
        A0G.A0D("sticker_pack", stickerPack.A0B);
        A0G.A0F(4YT.A00(364), stickerPack.A0G);
        esU.A00(A0G);
    }

    public 1iF A1R() {
        return AbF.A0C(313698419837672L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = AbL.A09(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C02l
    public void CFb(Context context, Intent intent, C01q c01q) {
        int i;
        int A00 = C09o.A00(-1231125185);
        StickerPack stickerPack = (StickerPack) intent.getParcelableExtra("stickerPack");
        if (Objects.equal(this.A03, stickerPack)) {
            if ("com.facebook.orca.stickers.DOWNLOAD_PROGRESS".equals(intent.getAction())) {
                this.A09.setText(2131966350);
                this.A09.setEnabled(false);
                this.A0B.setIndeterminate(false);
                this.A0B.setProgress(intent.getIntExtra("progress", 0));
                this.A0B.setVisibility(0);
            } else if ("com.facebook.orca.stickers.DOWNLOAD_SUCCESS".equals(intent.getAction())) {
                A07(stickerPack, "sticker_pack_downloaded");
                this.A05 = true;
                FbUserSession fbUserSession = this.A01;
                fbUserSession.getClass();
                A06(fbUserSession, this);
            } else if ("com.facebook.orca.stickers.DOWNLOAD_FAILURE".equals(intent.getAction())) {
                A07(stickerPack, "sticker_pack_download_error");
                FbUserSession fbUserSession2 = this.A01;
                fbUserSession2.getClass();
                A06(fbUserSession2, this);
                6HM r0 = this.A0J;
                C8S c8s = new C8S(7zO.A0D(this));
                c8s.A05 = AbK.A12(requireContext());
                c8s.A00(2131957317);
                COW.A01(c8s, r0);
            }
            i = -1756610444;
        } else {
            i = -988752867;
        }
        C09o.A01(i, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(1164350254);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A0I = (FbDraweeView) 7zL.A0F(this, 2131368036);
        this.A0F = DKG.A0D(this, 2131365919);
        this.A0D = DKG.A0D(this, 2131362106);
        this.A0E = DKG.A0D(this, 2131363599);
        this.A0B = (ProgressBar) 7zL.A0F(this, 2131366701);
        this.A09 = (Button) 7zL.A0F(this, 2131363715);
        this.A00 = (ProgressBar) 7zL.A0F(this, 2131365306);
        this.A02 = (FbDraweeView) 7zL.A0F(this, 2131366636);
        this.A0A = (LinearLayout) 7zL.A0F(this, 2131363403);
        this.A0B.setMax(100);
        this.A09.setBackgroundResource(0NA.A03(this.A07, 2130971823, 2132411283));
        FXq.A01(this.A09, this, ActionId.APP_DID_ENTER_BACKGROUND);
        A1P();
        1P9 r0 = new 1P9(this.A0H);
        r0.A05(this, "com.facebook.orca.stickers.DOWNLOAD_PROGRESS");
        r0.A05(this, "com.facebook.orca.stickers.DOWNLOAD_SUCCESS");
        this.A0G = 1P9.A01(r0, this, "com.facebook.orca.stickers.DOWNLOAD_FAILURE");
        FbUserSession fbUserSession = this.A01;
        fbUserSession.getClass();
        A06(fbUserSession, this);
        0FI.A08(-1481909596, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(696797267);
        ContextThemeWrapper A06 = 0NA.A06(getContext(), 2130971834, 2132608349);
        this.A07 = A06;
        this.A08 = layoutInflater.cloneInContext(A06);
        this.A0C = (ScrollView) AbG.A08(layoutInflater, viewGroup, 2132542966);
        this.A0H = (1I7) 7zO.A0m(this, 65728);
        this.A0J = (6HM) 7zO.A0m(this, 50020);
        this.A0K.A01(this.A0C, this, "sticker_store");
        ScrollView scrollView = this.A0C;
        0FI.A08(1748594589, A02);
        return scrollView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-550350786);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        this.A0G.A01();
        0FI.A08(30918894, A02);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        A1P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-2114972185);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A0G.A00();
        FbUserSession fbUserSession = this.A01;
        fbUserSession.getClass();
        A06(fbUserSession, this);
        0FI.A08(470628963, A02);
    }
}
