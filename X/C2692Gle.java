package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.samples.zoomable.ZoomableDraweeView;

/* renamed from: X.Gle, reason: case insensitive filesystem */
/* loaded from: Gle.class */
public final class C2692Gle extends C1rj {
    public static final CallerContext A02 = CallerContext.A05(new ContextChain((ContextChain) null, "i", "msg.components.ZoomableImage"), "ZoomableImageSpec");
    public Uri A00;
    public C69f A01;

    public C2692Gle() {
        super("ZoomableImage");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new ZoomableDraweeView(context);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) obj;
        C69f c69f = this.A01;
        Uri uri = this.A00;
        11T.A0F(r302, 0);
        1BL.A1F(zoomableDraweeView, c69f);
        C69s c69s = (C69s) 7zN.A0k(r302.A0D, 49976);
        c69s.A0A(uri);
        ((C69o) c69s).A02 = A02;
        zoomableDraweeView.A06(c69s.A08());
        zoomableDraweeView.A05(c69f);
        zoomableDraweeView.A01 = false;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C2692Gle c2692Gle = (C2692Gle) r302;
            C69f c69f = this.A01;
            C69f c69f2 = c2692Gle.A01;
            if (c69f != null) {
                if (!c69f.equals(c69f2)) {
                    return false;
                }
            } else if (c69f2 != null) {
                return false;
            }
            Uri uri = this.A00;
            Uri uri2 = c2692Gle.A00;
            if (uri != null) {
                if (!uri.equals(uri2)) {
                    return false;
                }
            } else if (uri2 != null) {
                return false;
            }
        }
        return true;
    }
}
