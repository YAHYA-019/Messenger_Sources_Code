package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Gfm, reason: case insensitive filesystem */
/* loaded from: Gfm.class */
public final class C2506Gfm extends 2rI {
    public final int A00;
    public final Object A01;

    public C2506Gfm(int i) {
        this.A00 = i;
    }

    public C2506Gfm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02(1OW r302) {
        switch (this.A00) {
            case 0:
                Throwable AlY = r302.AlY();
                if (AlY == null) {
                    AlY = AnonymousClass001.A0T("DataSourceFailed");
                }
                ((H7M) this.A01).A00.setException(AlY);
                return;
            case 1:
            default:
                return;
            case 2:
                0fH.A0k("[MP] FrescoMediaManager", "fetchEncodedAttachment failed");
                ((JEi) this.A01).Bpr(null);
                return;
            case 3:
                11T.A0F(r302, 0);
                ((1xH) this.A01).A02();
                r302.AGD();
                return;
            case 4:
                11T.A0F(r302, 0);
                1FX r0 = (1FX) this.A01;
                Throwable AlY2 = r302.AlY();
                if (AlY2 == null) {
                    AlY2 = AbF.A1D("Unknown error");
                }
                r0.setException(AlY2);
                return;
            case 5:
                11T.A0F(r302, 0);
                JIJ jij = (JIJ) this.A01;
                Throwable AlY3 = r302.AlY();
                if (AlY3 == null) {
                    AlY3 = AbF.A1D("onFailureImpl callback with null failureCause");
                }
                jij.onFailure(AlY3);
                return;
            case 6:
                ((C2a1) ((AbD) this.A01)).A0O(null);
                return;
        }
    }

    public void A03(1OW r302) {
        AnonymousClass368 anonymousClass368;
        String str;
        Uri A03;
        2EU A0J;
        Bitmap bitmap;
        switch (this.A00) {
            case 0:
                if (r302.BSj()) {
                    ((H7M) this.A01).A00.set(r302.B7p());
                    return;
                }
                return;
            case 1:
                if (!r302.BSj() || r302.B7p() == null) {
                    return;
                }
                H72.A00(GOn.A0J(r302), (H72) this.A01);
                return;
            case 2:
                if (!GOp.A1V(r302)) {
                    return;
                }
                0fH.A0j("[MP] FrescoMediaManager", "imagePipeline.fetchEncodedImage finished");
                C05264db c05264db = null;
                try {
                    2EU A0J2 = GOn.A0J(r302);
                    if (A0J2 == null) {
                        0fH.A0k("[MP] FrescoMediaManager", "closeableReference is null");
                        ((JEi) this.A01).Bpr(null);
                    } else {
                        C05264db c05264db2 = new C05264db((4dR) A0J2.A09());
                        try {
                            ((JEi) this.A01).Bpr(c05264db2);
                            1Cu.A01(c05264db2);
                        } catch (Throwable th) {
                            th = th;
                            c05264db = c05264db2;
                            1Cu.A01(c05264db);
                            r302.AGD();
                            throw th;
                        }
                    }
                    break;
                } catch (Throwable th2) {
                    th = th2;
                }
            case 3:
                11T.A0F(r302, 0);
                2EU A0J3 = GOn.A0J(r302);
                2Ea r304 = null;
                if (A0J3 != null) {
                    r304 = (2Ea) A0J3.A09();
                }
                if ((r304 instanceof AnonymousClass368) && (anonymousClass368 = (AnonymousClass368) r304) != null && (str = anonymousClass368.A01) != null && (A03 = C0A2.A03(str)) != null) {
                    ((1xH) this.A01).A04(A03);
                    break;
                } else {
                    ((1xH) this.A01).A02();
                    break;
                }
                break;
            case 4:
                if (GOp.A1V(r302)) {
                    A0J = GOn.A0J(r302);
                    2EY r306 = null;
                    if (A0J != null) {
                        try {
                            r306 = (2Ea) A0J.A09();
                        } finally {
                            2EU.A04(A0J);
                        }
                    }
                    if (r306 instanceof 2EY) {
                        2EY r0 = r306;
                        if (r0 != null) {
                            ((SettableFuture) this.A01).set(r0.A00());
                            return;
                        }
                    }
                    ((SettableFuture) this.A01).setException(AnonymousClass001.A0L("Image is not a single bitmap"));
                    return;
                }
                return;
            case 5:
                if (GOp.A1V(r302)) {
                    2EU A0J4 = GOn.A0J(r302);
                    if (A0J4 == null) {
                        ((JIJ) this.A01).onFailure(AbF.A1D("Bitmap reference is null"));
                        return;
                    }
                    Object A09 = A0J4.A09();
                    11T.A0I(A09, AbE.A00(25));
                    2EU A00 = 2EU.A00(2EU.A05, new IQb(A0J4), ((2EY) A09).A04);
                    11T.A0A(A00);
                    try {
                        ((JIJ) this.A01).COT(A00);
                        return;
                    } finally {
                        A00.close();
                    }
                }
                return;
            case 6:
                if (r302.BSj()) {
                    A0J = GOn.A0J(r302);
                    2EU r307 = null;
                    if (A0J != null && AbG.A1a(A0J)) {
                        r307 = ((2EY) A0J.A09()).A00();
                        if (r307 != null) {
                            try {
                                Bitmap A0C = 7zL.A0C(r307);
                                if (A0C != null) {
                                    bitmap = A0C.copy(Bitmap.Config.ARGB_8888, false);
                                    ((AbD) this.A01).A0O(bitmap);
                                    2EU.A04(r307);
                                    return;
                                }
                            } catch (Throwable th3) {
                                2EU.A04(r307);
                                throw th3;
                            }
                        }
                    }
                    bitmap = null;
                    ((AbD) this.A01).A0O(bitmap);
                    2EU.A04(r307);
                    return;
                }
                return;
            default:
                return;
        }
        r302.AGD();
    }
}
