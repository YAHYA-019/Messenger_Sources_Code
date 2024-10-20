package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.stickers.ui.StickerDraweeView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8nf, reason: invalid class name */
/* loaded from: 8nf.class */
public final class C8nf extends C1rj {
    public static final InterfaceC07034in A07 = InterfaceC07034in.A04;
    public int A00;
    public Drawable A01;
    public FbUserSession A02;
    public InterfaceC07034in A03;
    public 1Im A04;
    public C6qc A05;
    public 7sX A06;

    public C8nf() {
        super("HotLikePreviewComponent");
        this.A03 = A07;
        this.A00 = 0;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new StickerDraweeView(context);
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        C8nf c8nf = (C8nf) r302;
        C8nf c8nf2 = (C8nf) r303;
        InterfaceC07034in interfaceC07034in = null;
        Drawable drawable = c8nf == null ? null : c8nf.A01;
        Drawable drawable2 = c8nf2 == null ? null : c8nf2.A01;
        C6qc c6qc = c8nf == null ? null : c8nf.A05;
        C6qc c6qc2 = c8nf2 == null ? null : c8nf2.A05;
        Integer valueOf = c8nf == null ? null : Integer.valueOf(c8nf.A00);
        Integer valueOf2 = c8nf2 == null ? null : Integer.valueOf(c8nf2.A00);
        InterfaceC07034in interfaceC07034in2 = c8nf == null ? null : c8nf.A03;
        if (c8nf2 != null) {
            interfaceC07034in = c8nf2.A03;
        }
        boolean z = true;
        if (drawable != drawable2 || !11T.A0O(valueOf, valueOf2) || interfaceC07034in2 != interfaceC07034in) {
            return true;
        }
        if (c6qc == null || c6qc2 == null) {
            return 7zL.A1X(c6qc, c6qc2);
        }
        if (11T.A0O(c6qc.A06, c6qc2.A06) && 11T.A0O(c6qc.A04, c6qc2.A04)) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.9M8] */
    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C8p8 c8p8 = (C8p8) 4YU.A0P(r302);
        View view = (View) obj;
        7sX r0 = this.A06;
        AtomicReference atomicReference = c8p8.A00;
        7zR.A1N(view, atomicReference);
        if (r0 == null) {
            atomicReference.set(null);
            return;
        }
        9ZH r02 = new 9ZH(7zQ.A0J(r302), view);
        1LI r03 = r302.A02;
        final 1Im r1 = r03 == null ? null : ((C8nf) r03).A04;
        r02.A00 = new Object(r1) { // from class: X.9M8
            public final WeakReference A00;

            {
                this.A00 = 7zL.A14(r1);
            }
        };
        atomicReference.set(r02);
        9hQ r04 = r0.A00;
        if (r04 != null) {
            r02.A00(r04);
            r04.A00 = r02;
        } else {
            View view2 = r02.A01;
            view2.setRotation(0.0f);
            view2.requestLayout();
        }
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        StickerDraweeView stickerDraweeView = (StickerDraweeView) obj;
        FbUserSession fbUserSession = this.A02;
        Drawable drawable = this.A01;
        C6qc c6qc = this.A05;
        int i = this.A00;
        InterfaceC07034in interfaceC07034in = this.A03;
        1BL.A1F(stickerDraweeView, fbUserSession);
        if (drawable != null) {
            stickerDraweeView.A03(drawable);
        } else {
            if (c6qc == null) {
                throw 1BK.A0g();
            }
            stickerDraweeView.A04(fbUserSession, c6qc);
            stickerDraweeView.setAlpha(c6qc.A00);
        }
        stickerDraweeView.setColorFilter(i);
        stickerDraweeView.A06.A0B.A09(interfaceC07034in);
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        AtomicReference atomicReference = ((C8p8) 4YU.A0P(r302)).A00;
        11T.A0F(atomicReference, 3);
        9ZH r0 = (9ZH) atomicReference.get();
        if (r0 != null) {
            r0.A00 = null;
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        StickerDraweeView stickerDraweeView = (StickerDraweeView) obj;
        11T.A0F(stickerDraweeView, 1);
        stickerDraweeView.A06.A0C.A06((C69w) null);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C8p8) r303).A00 = new AtomicReference(null);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8nf c8nf = (C8nf) r302;
            Drawable drawable = this.A01;
            Drawable drawable2 = c8nf.A01;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A02;
            FbUserSession fbUserSession2 = c8nf.A02;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            7sX r0 = this.A06;
            7sX r02 = c8nf.A06;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            C6qc c6qc = this.A05;
            C6qc c6qc2 = c8nf.A05;
            if (c6qc != null) {
                if (!c6qc.equals(c6qc2)) {
                    return false;
                }
            } else if (c6qc2 != null) {
                return false;
            }
            InterfaceC07034in interfaceC07034in = this.A03;
            InterfaceC07034in interfaceC07034in2 = c8nf.A03;
            if (interfaceC07034in != null) {
                if (!interfaceC07034in.equals(interfaceC07034in2)) {
                    return false;
                }
            } else if (interfaceC07034in2 != null) {
                return false;
            }
            if (this.A00 != c8nf.A00) {
                return false;
            }
        }
        return true;
    }
}
