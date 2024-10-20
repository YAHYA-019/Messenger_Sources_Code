package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: CsL.class */
public final class CsL implements AYC {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bmy A01;
    public final /* synthetic */ QuickPromotionDefinition.Creative A02;

    public CsL(Context context, Bmy bmy, QuickPromotionDefinition.Creative creative) {
        this.A01 = bmy;
        this.A00 = context;
        this.A02 = creative;
    }

    public void BoD() {
        String str;
        FIu fIu = (FIu) 1Br.A0B(this.A01.A00);
        Context context = this.A00;
        QuickPromotionDefinition.Action action = this.A02.primaryAction;
        if (action == null || (str = action.url) == null) {
            throw 1BK.A0h();
        }
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        fIu.A09(context, uri, C5id.A0F);
    }
}
