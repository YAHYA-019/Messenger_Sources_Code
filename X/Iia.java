package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.videocodec.effects.model.TextData;
import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Iia.class */
public final class Iia implements JJC {
    public static final Set A02;
    public static final Set A03 = C1n3.A05("textrenderer");
    public 1BY A00;
    public final C15h A01 = J5u.A03(this, ActionId.DATA_LOAD_START);

    static {
        HashSet A0v = AnonymousClass001.A0v();
        A02 = A0v;
        A0v.add(IiH.class);
    }

    public Iia(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ JMy AKh(PersistedGLRenderer persistedGLRenderer) {
        return new IiH((TextData) ((C3R8) this.A01.get()).A02(persistedGLRenderer.A00, TextData.class), (I7m) 1Bn.A0E((Context) null, this.A00, 116239));
    }

    public Set D3Y() {
        return A03;
    }
}
