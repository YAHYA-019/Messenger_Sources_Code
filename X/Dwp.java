package X;

import android.graphics.RectF;
import android.util.SparseArray;
import com.facebook.graphql.enums.GraphQLStringDefUtil;

/* loaded from: Dwp.class */
public final class Dwp extends C1rj {
    public C2578Ghr A00;
    public I4p A01;
    public HxC A02;
    public GL2 A03;

    public Dwp() {
        super("StoryViewerBloksStickerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        EiU eiU;
        String str;
        GL2 gl2 = this.A03;
        C2578Ghr c2578Ghr = this.A00;
        I4p i4p = this.A01;
        HxC hxC = this.A02;
        11T.A0F(r302, 0);
        7zT.A1W(gl2, c2578Ghr, i4p, hxC);
        1BV A0R = 7zL.A0R(7zL.A0A(r302), 98751);
        1BV A00 = 1BV.A00(99756);
        String A0r = c2578Ghr.A0r(794783964);
        if (A0r == null) {
            eiU = (EiU) A00.get();
            str = "empty_bloks_payload";
        } else {
            2JX AZz = c2578Ghr.AZz();
            if (AZz != null) {
                FH5 fh5 = (FH5) A0R.get();
                Hsm Avt = gl2.Avt();
                if (Avt == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                int i = Avt.A02;
                Hsm Avt2 = gl2.Avt();
                if (Avt2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                EiW A05 = fh5.A05(AZz, new C2630Gjf(i, Avt2.A01, 0), 0);
                2cM A01 = 2cK.A01(r302, (String) null, 0);
                A01.A2e(new DvE((SparseArray) null, new Faz(i4p, hxC), A0r, (java.util.Map) null));
                A01.A0c();
                C26z c26z = C26z.LEFT;
                RectF rectF = A05.A01;
                A01.A2E(c26z, (int) rectF.left);
                A01.A2E(C26z.TOP, (int) rectF.top);
                A01.A0u((float) A05.A00);
                A01.A0C((int) rectF.width());
                A01.A1L((int) rectF.height());
                return A01.A00;
            }
            eiU = (EiU) A00.get();
            str = "empty_bounds";
        }
        1UG A08 = 1BK.A08(1Br.A02(eiU.A01), 1BJ.A00(1279));
        if (!A08.isSampled()) {
            return null;
        }
        A08.A7R("event_name", str);
        A08.A6H(AbE.A00(432), Long.valueOf(1Br.A00(eiU.A00)));
        String A0t = c2578Ghr.A0t(GraphQLStringDefUtil.A00(), 1BJ.A00(283), 1886405885);
        if (A0t != null) {
            A08.A7R("sticker_style", A0t);
        }
        A08.BZL();
        return null;
    }
}
