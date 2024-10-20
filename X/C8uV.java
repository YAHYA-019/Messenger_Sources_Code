package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.8uV, reason: invalid class name */
/* loaded from: 8uV.class */
public final class C8uV extends 6rJ {
    public final Context A00;
    public final Fragment A01;
    public final 06Z A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final ThreadKey A05;
    public final boolean A06;
    public final Bundle A07;
    public final FrameLayout A08;
    public final 2S4 A09;
    public final 1Iw A0A;
    public final LithoView A0B;
    public final AaO A0C;
    public final C5j5 A0D;
    public final Capabilities A0E;
    public final C6ri A0F;
    public final HeterogeneousMap A0G;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6w3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.6wF, java.lang.Object] */
    public C8uV(Context context, Bundle bundle, FrameLayout frameLayout, Fragment fragment, FbUserSession fbUserSession, 2S4 r307, 1Iw r308, LithoView lithoView, ThreadKey threadKey, AaO aaO, C5j5 c5j5, C6ri c6ri, HeterogeneousMap heterogeneousMap, String str) {
        super(context, bundle, frameLayout, fragment, fbUserSession, r307, r308, lithoView, threadKey, aaO, c5j5, (C6o6) null, (C6w3) new Object(), c6ri, (6wF) new Object(), (C6qq) null, heterogeneousMap, str);
        this.A00 = context;
        this.A0A = r308;
        this.A0D = c5j5;
        this.A0B = lithoView;
        this.A05 = threadKey;
        this.A03 = fbUserSession;
        this.A01 = fragment;
        this.A08 = frameLayout;
        this.A0F = c6ri;
        this.A0G = heterogeneousMap;
        this.A09 = r307;
        this.A0C = aaO;
        this.A07 = bundle;
        this.A04 = 1Bu.A00(66605);
        this.A02 = 7zN.A08(fragment);
        this.A06 = A0G().AZk(36323118243137813L);
        this.A0E = C5tt.A05;
    }

    public C78x A0J() {
        final Context A0A = 7zL.A0A(this.A0A);
        final boolean z = false;
        return new C78x(A0A, z) { // from class: X.78w
            public final C01i A00;
            public final boolean A01;

            {
                this.A01 = z;
                this.A00 = C01g.A00(C03i.A02, new AnonymousClass834(A0A, 14));
            }

            @Override // X.C78x
            public List CZZ(Capabilities capabilities, C77n c77n) {
                7DV AdO = ((7DS) this.A00.getValue()).A00.A00.AdO("CAMERA");
                7DV A00 = AdO != null ? 7DW.A00(AdO, "upload_video_interstitial", 2131968284) : null;
                C1u3 c1u3 = C1u3.A4t;
                11T.A0F(c1u3, 0);
                7DV A002 = 7DX.A00((AnonymousClass782) c77n.AUP(AnonymousClass781.class), new C2pn(c1u3), ((AnonymousClass781) c77n.AUP(AnonymousClass781.class)).A06);
                C1u3 c1u32 = C1u3.A4P;
                11T.A0F(c1u32, 0);
                C2pn c2pn = new C2pn(c1u32);
                C6xq AUP = c77n.AUP(78G.class);
                boolean z2 = c77n.AUP(78G.class).A05;
                boolean z3 = this.A01;
                7Bk r315 = null;
                Class<?> cls = AUP.getClass();
                7Bk r0 = new 7Bk(cls, false);
                if (z3) {
                    r315 = new 7Bk(cls, true);
                }
                7DV[] r02 = {A00, A002, 7DW.A00(new 7DV(r0, r315, (7DY) null, c2pn, 2131952950, z2), "upload_audio_interstitial", 2131968283)};
                11T.A0F(r02, 0);
                return 02L.A08(r02);
            }
        };
    }

    public 78S A0K() {
        78L r0 = new 78L();
        ImmutableList build = ImmutableList.builder().build();
        r0.A00 = build;
        C1pq.A08(4YT.A00(1238), build);
        return new 78S(r0);
    }

    public boolean A0V() {
        return this.A06;
    }

    public void A72(6xH r302) {
        11T.A0F(r302, 0);
        C00j.A05("CuckooComposerConfigurationFactory.addPlugins", -636252067);
        try {
            boolean z = this.A06;
            r302.A00(new 6xM[]{6xI.A00(AV4.A00(this, 14), z)});
            super.A72(r302);
            r302.A00(new 6xM[]{C75m.A00(new AVI(48, 1Bu.A00(67253), new AHf(this, 6), this), z), C75x.A00(AV4.A00(this, 15), z), 76V.A00(AV4.A00(this, 16), z), 76X.A00(ASJ.A00, z), 1XU.A00(this.A00) ? AnonymousClass829.A00(AV4.A00(this, 17), z) : null, 76Z.A00(ASK.A00, z), C76d.A00(AV4.A00(this, 18), z), C76f.A00(AV4.A00(this, 19), z), C76j.A00(AV4.A00(this, 12), z), C76n.A00(AV4.A00(this, 13), z)});
            C00j.A01(-872766187);
        } catch (Throwable th) {
            C00j.A01(-1874334341);
            throw th;
        }
    }

    public Capabilities Abd() {
        return this.A0E;
    }
}
