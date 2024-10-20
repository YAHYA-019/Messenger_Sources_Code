package com.meta.metaai.shared.nux.data;

import X.04S;
import X.0DR;
import X.0Ds;
import X.11T;
import X.1Ve;
import X.5Dh;
import X.AnonymousClass001;
import X.DKE;
import X.EMy;
import X.F1O;
import X.FB3;
import X.FgT;
import android.app.Application;
import com.facebook.foa.session.FbMetaSessionImpl;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import java.lang.reflect.InvocationTargetException;

/* loaded from: MetaAINuxRepository.class */
public final class MetaAINuxRepository {
    public final Application A00;
    public final FbMetaSessionImpl A01;
    public final MetaAINuxNetworkService A02;

    public /* synthetic */ MetaAINuxRepository(Application application, FbMetaSessionImpl fbMetaSessionImpl) {
        MetaAINuxNetworkService metaAINuxNetworkService = new MetaAINuxNetworkService(application, fbMetaSessionImpl);
        this.A00 = application;
        this.A01 = fbMetaSessionImpl;
        this.A02 = metaAINuxNetworkService;
    }

    public static final Object A00(MetaAINuxRepository metaAINuxRepository, EMy eMy, String str, 0DR r304) {
        11T.A0F(str, 0);
        metaAINuxRepository.A00.getSharedPreferences("MetaAINuxImpressionCache", 0).edit().putBoolean(str, true).commit();
        MetaAINuxNetworkService metaAINuxNetworkService = metaAINuxRepository.A02;
        String str2 = metaAINuxRepository.A01.A00.A05;
        1Ve r0 = metaAINuxNetworkService.A02;
        FgT fgT = F1O.class;
        try {
            fgT = (FgT) DKE.A0p(fgT, "create", 0);
            GraphQlQueryParamSet graphQlQueryParamSet = fgT.A00;
            graphQlQueryParamSet.A05("owner", str2);
            fgT.A03 = true;
            graphQlQueryParamSet.A05("intent_card_type", MetaAINuxNetworkService.A00(eMy));
            fgT.A02 = true;
            graphQlQueryParamSet.A03("has_seen", true);
            fgT.A01 = true;
            5Dh A00 = FgT.A00(fgT);
            11T.A0A(A00);
            Object A01 = FB3.A01(r0, A00, r304);
            0Ds r02 = 0Ds.A02;
            if (A01 != r02) {
                A01 = 04S.A00;
            }
            if (A01 != r02) {
                A01 = 04S.A00;
            }
            return A01;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(fgT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.EMy r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.nux.data.MetaAINuxRepository.A01(X.EMy, X.0DR):java.lang.Object");
    }
}
