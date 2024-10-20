package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Hro.class */
public final class Hro {
    public final Set A00;
    public final 1De A01;

    public Hro(1De r302) {
        this.A01 = r302;
        Set set = (Set) 1Bn.A0E((Context) null, r302.A00, ActionId.RTMP_CONNECTION_INTERCEPTED);
        11T.A0A(set);
        this.A00 = set;
    }

    public final JMy A00(PersistedGLRenderer persistedGLRenderer) {
        11T.A0F(persistedGLRenderer, 0);
        for (JJC jjc : this.A00) {
            if (jjc.D3Y().contains(persistedGLRenderer.A01)) {
                JMy AKh = jjc.AKh(persistedGLRenderer);
                11T.A0A(AKh);
                return AKh;
            }
        }
        throw AnonymousClass001.A0N(0Pz.A0j("PersistedGLRendererRegistry: factory not found for ", persistedGLRenderer.A01, " - did you forget to multi-bind it?"));
    }

    public final ImmutableList A01(List list) {
        11T.A0F(list, 0);
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) A00((PersistedGLRenderer) it.next()));
        }
        return 1Fj.A01(builder);
    }
}
