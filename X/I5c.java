package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.model.MontageBucket;
import com.google.common.collect.ImmutableList;

/* loaded from: I5c.class */
public final class I5c {
    public ViewStub A00;
    public Hao A01;
    public HeK A02;
    public I3K A03;
    public final C2397Gbz A0E;
    public final C00i A0D = 1BV.A00(697);
    public final C00i A08 = 1BV.A00(700);
    public final C00i A09 = 1BV.A00(701);
    public final C00i A07 = 1BV.A00(705);
    public final C00i A0A = 1BV.A00(702);
    public final C00i A06 = 1BV.A00(699);
    public final C00i A0B = 1BV.A00(703);
    public final C00i A0C = 1BV.A00(704);
    public final C00i A05 = 1BV.A00(698);
    public final JFQ A0F = new IXX(this);
    public ImmutableList A04 = ImmutableList.of();

    public I5c(C2397Gbz c2397Gbz, HeK heK) {
        this.A0E = c2397Gbz;
        this.A02 = heK;
        I3K i3k = new I3K();
        this.A03 = i3k;
        JFQ jfq = this.A0F;
        synchronized (i3k) {
            i3k.A01.add(jfq);
        }
    }

    public static void A00(I5c i5c, IXY ixy) {
        IK1 ik1;
        View findViewById;
        if (ixy instanceof C2804Goh) {
            ik1 = IKE.A00(i5c.A0E, 97);
            findViewById = ixy.A00;
        } else {
            if (!(ixy instanceof C2805Goi)) {
                if (ixy instanceof C2806Goj) {
                    HTt hTt = i5c.A0E.A1l;
                    View view = ixy.A00;
                    if (view != null) {
                        IKC.A00(view, ixy, hTt, 26);
                        return;
                    }
                    return;
                }
                if (ixy instanceof C2809Gom) {
                    HTu hTu = i5c.A0E.A1m;
                    11T.A0F(hTu, 0);
                    View view2 = ixy.A00;
                    if (view2 != null) {
                        IKE.A01(view2, hTu, ActionId.CONTROLLER_INITIATED);
                        return;
                    }
                    return;
                }
                if (!(ixy instanceof Gop)) {
                    if (ixy instanceof C2810Gon) {
                        ((C2810Gon) ixy).A00 = new HTr(i5c.A0E);
                        return;
                    }
                    return;
                }
                HTo hTo = i5c.A0E.A1j;
                View view3 = ixy.A00;
                if (view3 != null) {
                    IKC.A00(view3, ixy, hTo, 27);
                    return;
                }
                return;
            }
            C2805Goi c2805Goi = (C2805Goi) ixy;
            HTs hTs = i5c.A0E.A1k;
            c2805Goi.A00 = hTs;
            View view4 = ((IXY) c2805Goi).A00;
            if (view4 == null) {
                return;
            }
            ik1 = new IK1(3, c2805Goi, hTs, view4);
            findViewById = view4.findViewById(2131366946);
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(ik1);
        }
    }

    public void A01() {
        C00j.A05("MontageViewerPageController.bindMontageViewerViewControllers", 1281787779);
        try {
            C2397Gbz c2397Gbz = this.A0E;
            HhX A1Y = c2397Gbz.A1Y();
            MontageBucket montageBucket = c2397Gbz.A0N;
            if (montageBucket != null && A1Y != null) {
                int size = this.A04.size();
                for (int i = 0; i < size; i++) {
                    IXY ixy = (IXY) this.A04.get(i);
                    ixy.A07(montageBucket, A1Y);
                    A00(this, ixy);
                }
            }
            C00j.A01(-1033141700);
        } catch (Throwable th) {
            C00j.A01(-2093995142);
            throw th;
        }
    }

    public void A02() {
        C00j.A05("MontageViewerPageController.onPlaybackStartedMontageViewerViewControllers", 754730581);
        try {
            int size = this.A04.size();
            for (int i = 0; i < size; i++) {
                this.A04.get(i);
            }
            C00j.A01(-1641489293);
        } catch (Throwable th) {
            C00j.A01(705375534);
            throw th;
        }
    }

    public void A03() {
        C00j.A05("MontageViewerPageController.onPlaybackStoppedMontageViewerViewControllers", 630529152);
        try {
            int size = this.A04.size();
            for (int i = 0; i < size; i++) {
                this.A04.get(i);
            }
            C00j.A01(-76065401);
        } catch (Throwable th) {
            C00j.A01(-1490637860);
            throw th;
        }
    }

    public void A04(boolean z) {
        I3K i3k = this.A03;
        if (i3k.A02().A08 != z) {
            I0O A01 = i3k.A01();
            A01.A08 = z;
            I3K.A00(A01, i3k);
        }
    }

    public void A05(boolean z) {
        I3K i3k = this.A03;
        if (i3k.A02().A0C != z) {
            I0O A01 = i3k.A01();
            A01.A0C = z;
            I3K.A00(A01, i3k);
        }
    }
}
