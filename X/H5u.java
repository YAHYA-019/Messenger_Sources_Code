package X;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.samples.zoomable.ZoomableDraweeView;

/* loaded from: H5u.class */
public final class H5u extends 48A implements CallerContextable {
    public static final CallerContext A0J = CallerContext.A08(H5u.class, "photo_message_view");
    public static final String __redex_internal_original_name = "PhotoMessageView";
    public HnR A00;
    public GnG A01;
    public HSL A02;
    public boolean A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final ThreadKey A0E;
    public final C2512Gfs A0F;
    public final QuickPerformanceLogger A0G;
    public final ZoomableDraweeView A0H;
    public final ImageView A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [X.Gfs, android.graphics.drawable.Drawable] */
    public H5u(Context context, ThreadKey threadKey) {
        super(context, (AttributeSet) null, 0);
        11T.A0F(context, 1);
        this.A0E = threadKey;
        this.A04 = 1Bq.A00(66368);
        this.A07 = 1Bq.A00(49958);
        this.A0B = 1Bu.A00(49939);
        this.A0D = 1Bu.A00(115802);
        this.A0A = 1Bq.A00(16431);
        this.A0C = 1Bq.A00(16472);
        this.A06 = AbG.A0M();
        this.A09 = 1Bq.A00(68024);
        this.A08 = 1Bu.A00(115917);
        this.A05 = 1Bu.A01(context, 49976);
        this.A03 = true;
        this.A0G = QuickPerformanceLoggerProvider.getQPLInstance();
        setContentView(2132542946);
        ImageView imageView = (ImageView) C09s.A01(this, 2131363717);
        this.A0I = imageView;
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) C09s.A01(this, 2131366438);
        this.A0H = zoomableDraweeView;
        IKm.A00(zoomableDraweeView, this, 7);
        C69e c69e = new C69e(getResources());
        c69e.A02(InterfaceC07034in.A04);
        c69e.A01 = 0;
        C69f A01 = c69e.A01();
        if (zoomableDraweeView.A00 == null) {
            throw AnonymousClass001.A0Q("getClass");
        }
        IDm iDm = this.A0H.A00;
        11T.A0I(iDm, "null cannot be cast to non-null type com.facebook.samples.zoomable.DefaultZoomableController");
        IgI igI = new IgI();
        JKT jkt = iDm.A02;
        if (jkt != null) {
            synchronized (igI) {
                igI.A00.add(jkt);
            }
        }
        IgK igK = new IgK(this);
        synchronized (igI) {
            igI.A00.add(igK);
        }
        iDm.A00 = 3.0f;
        iDm.A02 = igI;
        zoomableDraweeView.A05.A00 = new GTh(this);
        zoomableDraweeView.A05(A01);
        C66g c66g = new C66g(context, (C62j) 1Br.A0B(this.A0B));
        c66g.A00 = c66g.A05.getColor(2132213840);
        c66g.invalidateSelf();
        c66g.A03 = false;
        c66g.A02 = -1;
        c66g.invalidateSelf();
        imageView.setImageDrawable(c66g);
        c66g.setLevel((int) (0.05f * 10000.0f));
        c66g.invalidateSelf();
        I5M i5m = new I5M(imageView, ((HQt) 1Br.A0B(this.A0D)).A00);
        ?? c2512Gfs = new C2512Gfs();
        this.A0F = c2512Gfs;
        c2512Gfs.A00 = new HzS(i5m, c66g, this);
        C69f.A02(c2512Gfs, A01, 3);
    }

    public static final float A00(H5u h5u) {
        IDm iDm = h5u.A0H.A00;
        Matrix matrix = iDm.A04;
        float[] fArr = iDm.A09;
        matrix.getValues(fArr);
        float f = fArr[0];
        if (DKC.A01(1.0f, f) < 0.01f) {
            f = 1.0f;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(H5u h5u) {
        HnR hnR;
        GnG gnG = h5u.A01;
        if (gnG == null || (hnR = h5u.A00) == null) {
            return;
        }
        Object tag = h5u.getTag();
        Hm2 hm2 = hnR.A01.A04;
        if (hm2 != null) {
            int i = hnR.A00;
            IDn iDn = hm2.A00;
            if (iDn.A03 != null) {
                if (iDn.A00 == i || !1BK.A0N(iDn.A09).AZk(72341031814697337L)) {
                    View A01 = IDn.A01(iDn);
                    Object tag2 = A01 != null ? A01.getTag() : null;
                    if (tag == null || tag.equals(tag2)) {
                        iDn.A03.A01(gnG);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(MediaMessageItem mediaMessageItem, java.util.Map map, boolean z) {
        CallerContext A00;
        11T.A0F(mediaMessageItem, 0);
        String Aw7 = mediaMessageItem.Aw7();
        if (Aw7 == null) {
            A00 = A0J;
        } else {
            A00 = HJE.A00(A0J, Aw7);
            11T.A0D(A00);
        }
        if (map == null) {
            map = 04R.A0G();
        }
        C6yj.A00(A00.A01, map);
        ThreadKey threadKey = this.A0E;
        boolean A01 = threadKey != null ? C6yj.A01(threadKey) : false;
        1Br.A0C(this.A04);
        setTag(2131362030, A00);
        4YV.A11(this.A0A).execute(new J2l(A00, this, mediaMessageItem, A01, z));
    }
}
