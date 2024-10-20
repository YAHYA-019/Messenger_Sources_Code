package X;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: Iwr.class */
public final class Iwr implements Runnable {
    public static final String __redex_internal_original_name = "CoWatchSharedStateImpl$rtcUiCallback$1$onDataReceived$1";
    public final /* synthetic */ IDo A00;
    public final /* synthetic */ byte[] A01;

    public Iwr(IDo iDo, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = iDo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            str = DKC.A1F(GOq.A16(this.A01)).getString("user_id");
        } catch (JSONException e) {
            0fH.A0r("RtcDataChannelConstants", "Failed to parse JSON", e);
            str = null;
        }
        IDo iDo = this.A00;
        if (iDo.A09 && iDo.A01 != null) {
            AbR A0J = AbJ.A0J(iDo.A0P);
            Context context = iDo.A01;
            11T.A0D(context);
            A0J.A0I(context).A00();
        }
        if (iDo.A0A) {
            return;
        }
        iDo.A0A = true;
        Iterator it = iDo.A0d.iterator();
        while (it.hasNext()) {
            ((HFY) it.next()).A00(str);
        }
    }
}
