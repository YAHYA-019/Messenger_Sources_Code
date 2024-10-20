package X;

import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.business.inboxads.common.InboxAdsImage;
import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dys.class */
public final class Dys extends C1rj {
    public static final CallerContext A07 = CallerContext.A0C("InboxAdsPhotoComponentSpec", "InboxAdsPhotoComponent");
    public static final C97n A08 = C97n.DEFAULT;
    public int A00;
    public InboxAdsMediaInfo A01;
    public C97n A02;
    public Ezq A03;
    public Evu A04;
    public MigColorScheme A05;
    public boolean A06;

    public Dys() {
        super("InboxAdsPhotoComponent");
        this.A02 = A08;
        this.A00 = 0;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A05, this.A02, Integer.valueOf(this.A00), this.A01, this.A04, Boolean.valueOf(this.A06)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        InboxAdsMediaInfo inboxAdsMediaInfo = this.A01;
        MigColorScheme migColorScheme = this.A05;
        C97n c97n = this.A02;
        InboxAdsImage inboxAdsImage = inboxAdsMediaInfo.A05;
        if (inboxAdsImage == null) {
            return null;
        }
        Resources A0E = 4YU.A0E(r302);
        int A03 = C0A8.A03(A0E, c97n.mLeftRadiusDip);
        int A032 = C0A8.A03(A0E, c97n.mRightRadiusDip);
        if (!1iQ.A00()) {
            C5bd A00 = C5bc.A00(r302);
            A00.A2W(inboxAdsImage.A00());
            A00.A1J(2131960009);
            A00.A00.A00 = (float) inboxAdsMediaInfo.A00;
            C07004ik A002 = C06984ii.A00();
            C5be c5be = new C5be();
            c5be.setColor(migColorScheme.Atp());
            float f = A03;
            float f2 = A032;
            float[] fArr = {f, f, f2, f2};
            DKF.A1a(fArr, f2, f);
            c5be.setCornerRadii(fArr);
            A002.A06(c5be);
            ((C07014il) A002).A04 = 5BJ.A01(f, f2, f2, f);
            A00.A00.A04 = 7zO.A0Q(InterfaceC07034in.A01, A002);
            A00.A2X(A07);
            A00.A2K("inbox_ad_postclick_image");
            C5ba c5ba = C5ba.A0H;
            7zM.A1N(A00, r302, Dys.class, "InboxAdsPhotoComponent", new Object[]{c5ba});
            DKE.A1R(A00, r302, Dys.class, "InboxAdsPhotoComponent", new Object[]{c5ba});
            A00.A0J();
            return A00.A00;
        }
        5BH A01 = 5BG.A01(r302);
        A01.A2X(inboxAdsImage.A00());
        A01.A1J(2131960009);
        A01.A2W((float) inboxAdsMediaInfo.A00);
        C07004ik A003 = C06984ii.A00();
        C5be c5be2 = new C5be();
        c5be2.setColor(migColorScheme.Atp());
        float f3 = A03;
        float f4 = A032;
        float[] fArr2 = {f3, f3, f4, f4};
        DKF.A1a(fArr2, f4, f3);
        c5be2.setCornerRadii(fArr2);
        A003.A06(c5be2);
        ((C07014il) A003).A04 = 5BJ.A01(f3, f4, f4, f3);
        A003.A00(InterfaceC07034in.A01);
        C06984ii.A01(A01, A003);
        A01.A2b(A07);
        A01.A2K("inbox_ad_postclick_image");
        C5ba c5ba2 = C5ba.A0H;
        7zM.A1N(A01, r302, Dys.class, "InboxAdsPhotoComponent", new Object[]{c5ba2});
        DKE.A1R(A01, r302, Dys.class, "InboxAdsPhotoComponent", new Object[]{c5ba2});
        A01.A0J();
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1823397085) {
            if (i != -1351902487) {
                4YV.A1G(r302, obj, i);
                return null;
            }
            1Is r0 = r302.A00.A01;
            Dys dys = (Dys) r0;
            dys.A03.A03((C5ba) r302.A03[0], dys.A00);
            return null;
        }
        1Is r02 = r302.A00.A01;
        float f = ((2lD) obj).A00;
        Object obj2 = r302.A03[0];
        Dys dys2 = (Dys) r02;
        boolean z = dys2.A06;
        Evu evu = dys2.A04;
        int i2 = dys2.A00;
        if (f < 100.0f || evu == null) {
            return null;
        }
        String concat = obj2.toString().concat("_").concat(Integer.toString(i2));
        if (!z) {
            evu.A00(concat);
        }
        evu.A01(concat);
        return null;
    }
}
