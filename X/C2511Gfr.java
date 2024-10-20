package X;

import android.graphics.drawable.Animatable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.samples.zoomable.ZoomableDraweeView;

/* renamed from: X.Gfr, reason: case insensitive filesystem */
/* loaded from: Gfr.class */
public final class C2511Gfr extends 4gM {
    public final int A00;
    public final Object A01;

    public C2511Gfr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bxg(String str, Throwable th) {
        switch (this.A00) {
            case 2:
                6KS r0 = ((Euu) this.A01).A00;
                if (r0 != null) {
                    r0.onFailure(th);
                    return;
                }
                return;
            case 3:
                ((C2lh) this.A01).A02(95W.A03);
                return;
            default:
                super.Bxg(str, th);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        6KS r0;
        switch (this.A00) {
            case 0:
                2Ec r02 = (2Ec) obj;
                DQ6 dq6 = (DQ6) this.A01;
                CallerContext callerContext = DQ6.A04;
                if (r02 != null) {
                    dq6.A02.getLayoutParams().width = (int) (7zO.A0I(dq6.A02.getContext()).density * 72.0f);
                    dq6.A02.getLayoutParams().height = -2;
                    dq6.A02.A04(r02.getWidth() / r02.getHeight());
                    return;
                }
                return;
            case 1:
                1Iw r03 = (1Iw) this.A01;
                if (r03.A02 != null) {
                    r03.A0G(new C2l4(4YU.A1b(false), 0), 7zK.A00(452));
                    return;
                }
                return;
            case 2:
                if (animatable instanceof 5CC) {
                    5Gk r04 = ((5CC) animatable).A00;
                    if (!(r04 instanceof 5Gk) || (r0 = ((Euu) this.A01).A00) == null) {
                        return;
                    }
                    r0.Bir(r04);
                    return;
                }
                return;
            case 3:
            default:
                super.Byc(animatable, obj, str);
                return;
            case 4:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.A01;
                zoomableDraweeView.hashCode();
                IDm iDm = zoomableDraweeView.A00;
                if (iDm.A03 || !zoomableDraweeView.A02) {
                    return;
                }
                iDm.A03 = true;
                ZoomableDraweeView.A03(zoomableDraweeView);
                return;
        }
    }

    public void CG6(String str) {
        if (4 - this.A00 != 0) {
            super.CG6(str);
            return;
        }
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.A01;
        zoomableDraweeView.hashCode();
        IDm iDm = zoomableDraweeView.A00;
        iDm.A03 = false;
        iDm.A04();
    }
}
