package X;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment;
import com.facebook.messaging.photos.editing.layer.Layer;
import com.facebook.stickers.ui.StickerView;

/* loaded from: H0C.class */
public final class H0C extends C66m {
    public final int A00;
    public final Object A01;

    public H0C(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C66m, X.C66n
    public void CMP(C66i c66i) {
        if (1 - this.A00 != 0) {
            super.CMP(c66i);
            return;
        }
        View view = (View) this.A01;
        view.setRotation(0.0f);
        view.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [X.Gby, androidx.fragment.app.Fragment] */
    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        View A01;
        I5R A06;
        String str;
        String str2;
        long A0H;
        Hlo hlo;
        switch (this.A00) {
            case 0:
                FIU fiu = (FIU) this.A01;
                if (!fiu.A0Q || (A01 = C2cd.A01(fiu.A0I)) == null) {
                    return;
                }
                C2cd.A02(A01);
                return;
            case 2:
                double d = c66i.A01;
                if (d != 0.0d) {
                    0D2 r0 = (MontageViewerFragment) this.A01;
                    View view = r0.mView;
                    if (view != null && d == view.getHeight()) {
                        view.setAlpha(0.0f);
                    }
                    8uN A062 = MontageViewerFragment.A06(r0);
                    if (A062 != null) {
                        if (A062 instanceof C2396Gby) {
                            ?? r02 = (C2396Gby) A062;
                            A06 = C2396Gby.A06(r02);
                            str = r02.A0I;
                            A0H = GOq.A0H((Fragment) r02);
                            str2 = "gallery";
                        } else if (A062 instanceof 8uN) {
                            8uN r03 = A062;
                            A06 = 8uN.A06(r03);
                            str = r03.A04;
                            str2 = r03.A05;
                            A0H = GOq.A0H(r03);
                        }
                        A06.A01(A0H, str, str2, "swipe_down");
                    }
                    r0.A0p();
                    return;
                }
                return;
            case 5:
                TextureView textureView = ((PartialNuxCameraFragment) this.A01).A0A.A02.A01;
                if (textureView instanceof SurfaceView) {
                    AbH.A1K(textureView, GOo.A0A(textureView).getColor(2132214289, null));
                    return;
                }
                return;
            case 6:
                ((IQ0) this.A01).A0B = false;
                return;
            case 8:
                C9gR c9gR = (C9gR) this.A01;
                HWI hwi = c9gR.A00;
                if (hwi != null && c9gR.A08.A0C() && c9gR.A06.A0C()) {
                    C62h.A03(hwi.A00, c9gR.A09);
                    return;
                }
                return;
            case 12:
                JY5 jy5 = (JY5) this.A01;
                jy5.A0C = false;
                if (c66i.A09.A00 != 0.0d || (hlo = jy5.A07) == null) {
                    return;
                }
                hlo.A00();
                return;
            default:
                super.CMR(c66i);
                return;
        }
    }

    @Override // X.C66m, X.C66n
    public void CMS(C66i c66i) {
        if (1 - this.A00 != 0) {
            super.CMS(c66i);
        } else {
            ((View) this.A01).requestLayout();
        }
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        C9gR c9gR;
        switch (this.A00) {
            case 1:
                double A01 = GOq.A01(c66i);
                View view = (View) this.A01;
                view.setRotation((float) A01);
                view.requestLayout();
                return;
            case 2:
            default:
                super.CMV(c66i);
                return;
            case 3:
            case 4:
                ((View) this.A01).invalidate();
                return;
            case 5:
                PartialNuxCameraFragment partialNuxCameraFragment = (PartialNuxCameraFragment) this.A01;
                float f = (float) c66i.A09.A00;
                float f2 = ((1.0f - 0.8f) * f) + 0.8f;
                partialNuxCameraFragment.A02.setScaleX(f2);
                partialNuxCameraFragment.A02.setScaleY(f2);
                partialNuxCameraFragment.A04.setAlpha(((0.8f - 1.0f) * f) + 1.0f);
                return;
            case 6:
                IQ0 iq0 = (IQ0) this.A01;
                View view2 = iq0.A02;
                if (view2 != null) {
                    C66j c66j = c66i.A09;
                    view2.setScaleX((float) c66j.A00);
                    iq0.A02.setScaleY((float) c66j.A00);
                    return;
                }
                return;
            case 7:
                Layer layer = ((IKk) this.A01).A00;
                if (layer != null) {
                    layer.A02((float) c66i.A09.A00);
                    return;
                }
                return;
            case 8:
                c9gR = (C9gR) this.A01;
                break;
            case 9:
                c9gR = (C9gR) this.A01;
                if (c9gR.A07.A09.A00 > 0.800000011920929d) {
                    HWI hwi = c9gR.A00;
                    if (hwi != null) {
                        String str = c9gR.A09;
                        C62h c62h = hwi.A00;
                        if (c62h.A01 != null) {
                            5II r0 = c62h.A07;
                            String A00 = 4YT.A00(357);
                            if (r0.A0B()) {
                                r0.A07(A00, 0.25f);
                            }
                        }
                        C62h.A02(c62h, str);
                        return;
                    }
                    return;
                }
                break;
            case 10:
                I2k.A00((I2k) this.A01);
                return;
            case 11:
                float f3 = (float) c66i.A09.A00;
                StickerView stickerView = (StickerView) this.A01;
                stickerView.A00.setScaleX(f3);
                stickerView.A00.setScaleY(f3);
                return;
            case 12:
                double d = 1.0d - c66i.A09.A00;
                JY5 jy5 = (JY5) this.A01;
                jy5.A04.offsetTopAndBottom(((int) (d * jy5.getBottom())) - jy5.A06.getTop());
                return;
        }
        C89l c89l = c9gR.A01;
        if (c89l != null) {
            c89l.A00(c9gR);
        }
    }
}
