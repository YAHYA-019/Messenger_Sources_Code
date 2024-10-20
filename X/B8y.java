package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.litho.LithoView;
import java.util.Iterator;

/* loaded from: B8y.class */
public final class B8y extends BJB {
    public static final String __redex_internal_original_name = "EndToEndChatsFragment";
    public CMh A00;
    public By5 A01;
    public String A02;
    public final 1Br A03 = 1Bu.A00(147638);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r303 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.A1S(r1)
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r303 = r0
            java.lang.String r0 = "session_id"
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r303
            r1 = r304
            java.lang.String r0 = r0.getString(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1f
        L1b:
            java.lang.String r0 = X.1BK.A0t()
            r303 = r0
        L1f:
            r0 = r303
            X.11T.A0D(r0)
            r0 = r302
            if (r0 == 0) goto L33
            r0 = r302
            r1 = r304
            java.lang.String r0 = r0.getString(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L33
            r0 = r304
            r303 = r0
        L33:
            r0 = r301
            r1 = r303
            r0.A02 = r1
            X.9bw r0 = new X.9bw
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r303
            r1 = 2131963821(0x7f132fad, float:1.9564406E38)
            r0.A01 = r1
            r0 = r303
            r1 = r301
            r2 = 61
            X.By5 r0 = X.BJB.A0H(r0, r1, r2)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8y.A1S(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 126624141);
        1Br.A0C(this.A03);
        Context requireContext = requireContext();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        String str = this.A02;
        if (str == null) {
            11T.A0L("sessionId");
            throw 0Q8.createAndThrow();
        }
        CMh cMh = new CMh(requireContext, viewLifecycleOwner, new CsR(this), str);
        this.A00 = cMh;
        Iterator it = cMh.A0G.iterator();
        while (it.hasNext()) {
            ((CC9) it.next()).A00.A00.D3I();
        }
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(572573691, A04);
        return A0J;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.DZJ*/.onSaveInstanceState(bundle);
        String str = this.A02;
        if (str == null) {
            11T.A0L("sessionId");
            throw 0Q8.createAndThrow();
        }
        AbF.A1I(bundle, str);
    }
}
