package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.util.TriState;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.service.models.FetchStickersParams;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* renamed from: X.6ox, reason: invalid class name */
/* loaded from: 6ox.class */
public final class C6ox implements 2SQ, CallerContextable {
    public static final String __redex_internal_original_name = "StickerToPackMetadataLoader";
    public 2eS A00;
    public 2TV A01;
    public 1BY A02;
    public final C00i A03 = new 1BV((1BY) null, 33031);
    public final C00i A04 = new 1BQ(16432);

    public C6ox(1BO r302) {
        this.A02 = new 1BY(r302);
    }

    public void A00(C7om c7om) {
        Object e9p;
        if (this.A01 != null) {
            1BY r0 = this.A02;
            FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0E((Context) null, r0, 16428));
            69H r02 = (69H) 1Lo.A04((Context) null, A04, r0, 49969);
            String str = c7om.A00;
            Sticker A02 = r02.A02(str);
            if (A02 != null) {
                GraphQLStickerType graphQLStickerType = A02.A0B;
                if (graphQLStickerType == GraphQLStickerType.AVATAR) {
                    e9p = new Object();
                } else if (graphQLStickerType == GraphQLStickerType.PAIR_AI_GENERATED) {
                    e9p = new Object();
                } else {
                    String str2 = A02.A0H;
                    if (str2 != null) {
                        StickerPack A03 = r02.A03(str2);
                        TriState A01 = r02.A01(str2);
                        if (A03 != null && A01.isSet()) {
                            e9p = new E9p(A03, A01.asBoolean() ? H9k.DOWNLOADED : H9k.IN_STORE);
                        }
                    }
                }
                this.A01.C4X(c7om, e9p);
                return;
            }
            2TV r03 = this.A01;
            Object obj = new Object();
            Bundle bundle = new Bundle();
            bundle.putParcelable("fetchStickersParams", new FetchStickersParams(0S2.A01, ImmutableList.of((Object) str)));
            1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) this.A03.get()).newInstance("fetch_stickers", bundle, 1, CallerContext.A06(getClass()), A04), true);
            Fvo fvo = new Fvo(c7om, this);
            C00i c00i = this.A04;
            2eH A002 = 2FP.A00(fvo, A00, (Executor) c00i.get());
            DeK deK = new DeK(1, c7om, this, obj);
            1Kd.A0F(deK, A002, (Executor) c00i.get());
            this.A00 = new 2eS(deK, A002);
            r03.C4n(A002, c7om);
        }
    }

    public void AEC() {
        2eS r0 = this.A00;
        if (r0 != null) {
            r0.A00(true);
        }
    }

    public void CmR(2TV r302) {
        this.A01 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
