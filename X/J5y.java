package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.media.viewer.fragment.MediaViewFragment;
import com.facebook.messaging.media.viewer.theme.MediaViewerTheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.RoundedCornersFrameLayout;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import kotlin.jvm.functions.Function1;

/* loaded from: J5y.class */
public final class J5y implements C00l, Function1 {
    public final int A00;
    public final Object A01;

    public J5y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HrB hrB;
        JLe jLe;
        java.util.Map map;
        Context context;
        String str;
        MediaViewFragment mediaViewFragment;
        String str2;
        HY7 hy7;
        JMV jmv;
        switch (this.A00) {
            case 0:
                H5s h5s = (H5s) this.A01;
                RoundedCornersFrameLayout roundedCornersFrameLayout = h5s.A0D;
                if (!(roundedCornersFrameLayout.getChildAt(0) instanceof H5u)) {
                    return null;
                }
                ((H5u) roundedCornersFrameLayout.getChildAt(0)).A02(h5s.A0O, null, true);
                return null;
            case 1:
                MediaResource mediaResource = (MediaResource) obj;
                HaZ haZ = ((H5s) this.A01).A09;
                if (haZ != null) {
                    5Pz r0 = 5Pz.A0X;
                    Hm2 hm2 = haZ.A01.A04;
                    if (hm2 != null && (hrB = hm2.A00.A03) != null && (jLe = hrB.A00.A0Q) != null) {
                        jLe.CKT(r0, mediaResource);
                    }
                }
                return 04S.A00;
            case 2:
                IVp iVp = (IVp) this.A01;
                iVp.A0A = AnonymousClass001.A1P(AnonymousClass001.A03(obj));
                iVp.A0Q.execute(new IqT(iVp));
                return 04S.A00;
            case 3:
                map = (java.util.Map) obj;
                context = ((MediaViewFragment) this.A01).A05;
                str = "video/*";
                FIo.A05(context, str, map);
                return 04S.A00;
            case 4:
                mediaViewFragment = (MediaViewFragment) this.A01;
                str2 = (String) obj;
                MediaViewFragment.A0Q(mediaViewFragment, str2);
                return 04S.A00;
            case 5:
                map = (java.util.Map) obj;
                context = ((MediaViewFragment) this.A01).A05;
                str = "image/jpeg";
                FIo.A05(context, str, map);
                return 04S.A00;
            case 6:
            case 9:
            default:
                MIN min = (MIN) this.A01;
                if (min != null) {
                    min.D2v();
                }
                return 04S.A00;
            case 7:
                ((MediaViewFragment) this.A01).A1D((MediaViewerTheme) obj);
                return null;
            case 8:
                MediaViewFragment mediaViewFragment2 = (MediaViewFragment) this.A01;
                mediaViewFragment2.A0i = (ThreadThemeInfo) obj;
                MediaViewFragment.A0I(mediaViewFragment2);
                return null;
            case 10:
                str2 = (String) obj;
                mediaViewFragment = ((HrB) this.A01).A00;
                MediaViewFragment.A0Q(mediaViewFragment, str2);
                return 04S.A00;
            case 11:
                ((I9K) this.A01).A00.A0L((Hio) null, (MediaResource) obj, 8);
                return 04S.A00;
            case 12:
                String str3 = (String) obj;
                HGD hgd = ((C2397Gbz) this.A01).A0X;
                if (hgd == null) {
                    return null;
                }
                hgd.A07(5Pz.A0s, str3);
                return null;
            case 13:
                C2797Goa c2797Goa = (C2797Goa) obj;
                11T.A0F(c2797Goa, 0);
                ((I3z) this.A01).A09.A00(c2797Goa);
                return 04S.A00;
            case 14:
                GWm gWm = (GWm) this.A01;
                CallerContext callerContext = GWm.A0W;
                if (gWm.A04 != null && gWm.A05 != null && gWm.A07 != null) {
                    gWm.A0K.get();
                    Hmu hmu = gWm.A08;
                    Hvu.A00(gWm.A04, gWm.A05, (hmu == null || (hy7 = hmu.A00.A06) == null || (jmv = ((IFE) hy7.A00.A01).A04) == null) ? null : jmv.Afy(), gWm.A07, "ContentSearchResultsAdapter");
                }
                return 04S.A00;
        }
    }
}
