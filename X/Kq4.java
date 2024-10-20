package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import java.util.concurrent.ExecutorService;

/* loaded from: Kq4.class */
public abstract class Kq4 {
    public final 1Fi A00;
    public final 1Ve A01;
    public final ExecutorService A02;
    public final Object A03 = AnonymousClass001.A0R();

    public Kq4(1Fi r302, 1Ve r303, ExecutorService executorService) {
        this.A01 = r303;
        this.A02 = executorService;
        this.A00 = r302;
    }

    public void A00(MIU miu) {
        1Fi r0;
        String string;
        Object obj = this.A03;
        synchronized (obj) {
            r0 = this.A00;
            string = r0.getString("ohai_config", "");
            11T.A0A(string);
        }
        try {
            if (!string.equals("")) {
                OHAIConfig oHAIConfig = (OHAIConfig) 5Yj.A03.A00(string, Lvp.A00);
                if (oHAIConfig != null && System.currentTimeMillis() < oHAIConfig.A04 * 1000) {
                    miu.COc(oHAIConfig, false);
                    return;
                }
            }
        } catch (C7hs e) {
            0fH.A0r("OHAIConfigFetcherBase", "Failed to parse OHAI Config from local storage", e);
        }
        synchronized (obj) {
            InterfaceC00051a0 AP5 = r0.AP5();
            AP5.Cdi("ohai_config");
            if (!AP5.commit()) {
                0fH.A0k("OHAIConfigFetcherBase", "Failed to remove OHAI Config from local storage");
            }
        }
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        2Jf r02 = new 2Jf(2JX.class, (Class) null, "FBMessagingOHAIConfigsQuery", (String) null, "fbandroid", -690948496, 0, 2018550679L, 2018550679L, false, true);
        r02.A00 = graphQlQueryParamSet;
        C3sa A00 = C3sa.A00(r02);
        this.A01.ARJ(new LW3(miu, 6), new LW5(this, miu, 6), A00, this.A02);
    }
}
