package X;

import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.stickers.service.models.FetchStickerPackIdsParams;
import com.facebook.stickers.service.models.FetchStickerPacksApiParams;
import com.facebook.stickers.service.models.FetchStickerPacksByIdParams;
import com.facebook.stickers.service.models.FetchStickersParams;

/* renamed from: X.4r4, reason: invalid class name */
/* loaded from: 4r4.class */
public abstract class C4r4 implements InterfaceC04063zu {
    public static final String __redex_internal_original_name = "RawAbstractPersistedGraphQlApiMethod";
    public final C4r5 A00;

    public C4r4(C4r5 c4r5) {
        c4r5.getClass();
        this.A00 = c4r5;
    }

    public C7sc A04(Object obj) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (r0.A01.equals(X.5Qx.A02) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.graphql.query.GraphQlQueryParamSet A05(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4r4.A05(java.lang.Object):com.facebook.graphql.query.GraphQlQueryParamSet");
    }

    public 2Jf A06(Object obj) {
        int i;
        int i2;
        if (this instanceof C09994s4) {
            FetchStickersParams fetchStickersParams = (FetchStickersParams) obj;
            C6pl c6pl = ((C09994s4) this).A00;
            C30G c30g = new C30G(128);
            c6pl.A06(c30g);
            c30g.A02(fetchStickersParams.A01, "sticker_ids");
            c30g.A02(Boolean.valueOf(fetchStickersParams.A00), "sticker_state_enabled");
            return c30g;
        }
        if (this instanceof C09904ru) {
            C30G c30g2 = new C30G(3);
            c30g2.A06(AbE.A00(192), (AbstractC01653se.A00() * 40) / ActionId.OFFLINE);
            c30g2.A06(AbE.A00(680), (AbstractC01653se.A00() * 94) / ActionId.OFFLINE);
            c30g2.A06(AbE.A00(679), Resources.getSystem().getDisplayMetrics().widthPixels);
            C0et c0et = C0et.A0P;
            C0et c0et2 = ((C09904ru) this).A00.A02;
            c30g2.A08(AbE.A00(561), c0et.equals(c0et2));
            c30g2.A08("fetch_story_holdout", C0et.A0C.equals(c0et2));
            return c30g2;
        }
        if (this instanceof C09974s2) {
            C3sb c3sb = (C3sb) obj;
            if (c3sb == null) {
                throw 1BK.A0h();
            }
            2Jf r0 = c3sb.A0K;
            11T.A0A(r0);
            return r0;
        }
        if (this instanceof C09714rb) {
            i2 = 2;
        } else {
            if (!(this instanceof 4rB)) {
                if (this instanceof C09984s3) {
                    C30G c30g3 = new C30G(ActionId.VIEW_DID_LOAD_BEGIN);
                    c30g3.A07("pack_ids", ((FetchStickerPacksByIdParams) obj).A00);
                    C6pl c6pl2 = ((C09984s3) this).A00;
                    c30g3.A03("media_type", c6pl2.A02.booleanValue() ? "image/webp" : "image/png");
                    c30g3.A05("scaling_factor", Double.valueOf(c6pl2.A05()).doubleValue());
                    return c30g3;
                }
                FetchStickerPackIdsParams fetchStickerPackIdsParams = (FetchStickerPackIdsParams) obj;
                5Qx r02 = fetchStickerPackIdsParams.A02;
                int ordinal = r02.ordinal();
                if (ordinal == 0) {
                    i = 120;
                } else if (ordinal == 1) {
                    i = 122;
                } else {
                    if (ordinal != 2 && ordinal != 3) {
                        throw AnonymousClass002.A0C(r02, "Unrecognized sticker pack type: ", AnonymousClass001.A0k());
                    }
                    i = 129;
                }
                C30G c30g4 = new C30G(i);
                ((2Jf) c30g4).A00.A04("update_time", Long.valueOf(fetchStickerPackIdsParams.A00));
                c30g4.A03("sticker_store_version", "M4");
                return c30g4;
            }
            5Qx r03 = ((FetchStickerPacksApiParams) obj).A02.A01;
            int ordinal2 = r03.ordinal();
            if (ordinal2 == 0) {
                i2 = 121;
            } else if (ordinal2 == 1) {
                i2 = 123;
            } else {
                if (ordinal2 != 2 && ordinal2 != 3) {
                    throw AnonymousClass002.A0C(r03, "Unrecognized sticker pack type: ", AnonymousClass001.A0k());
                }
                i2 = 130;
            }
        }
        return new C30G(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f2, code lost:
    
        if (r0.equals(com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt.CAMERA_ID_FRONT) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00d2, code lost:
    
        if (r0.isEmpty() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0105, code lost:
    
        if (r323 == false) goto L27;
     */
    @Override // X.InterfaceC04063zu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C04103zy B2X(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4r4.B2X(java.lang.Object):X.3zy");
    }

    public final C04103zy B7F(Object obj) {
        return B2X(obj);
    }
}
