package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B99.class */
public final class B99 extends BJB {
    public static final String __redex_internal_original_name = "MessengerSupportInboxItemDetailReasonFragment";
    public C0r A00 = null;
    public final C00i A03 = 1BQ.A02(16477);
    public String A01 = null;
    public boolean A02 = false;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        Bundle bundle;
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView == null || (bundle = this.mArguments) == null) {
            return;
        }
        String string = bundle.getString("item_id");
        String string2 = 7zO.A0D(this).getString(2131960876);
        String string3 = this.mArguments.getString("key_reason_screen_title");
        if (string3 == null) {
            string3 = getString(2131960875);
        }
        String[] stringArray = this.mArguments.getStringArray("key_reason_screen_reasons_desc");
        String[] stringArray2 = this.mArguments.getStringArray("key_reason_screen_reasons_value");
        String string4 = this.mArguments.getString("key_reason_screen_button_label");
        if (string4 == null) {
            string4 = getString(2131960874);
        }
        if (string == null || stringArray == null || stringArray.length <= 0 || stringArray2 == null || stringArray2.length <= 0) {
            A1a();
            return;
        }
        A1b();
        1Iw A0T = 7zP.A0T(this);
        C9bw c9bw = new C9bw();
        c9bw.A04 = string2;
        By5 A0H = BJB.A0H(c9bw, this, 53);
        2cM A01 = 2cK.A01(A0T, (String) null, 0);
        7zP.A13(A01);
        A01.A2U(!this.A02);
        QCT qct = new QCT(A0T, new QJ9());
        MigColorScheme migColorScheme = ((BJB) this).A01;
        QJ9 qj9 = qct.A01;
        qj9.A01 = migColorScheme;
        BitSet bitSet = qct.A02;
        bitSet.set(0);
        qj9.A04 = stringArray;
        bitSet.set(2);
        qj9.A05 = stringArray2;
        bitSet.set(3);
        qj9.A02 = string3;
        bitSet.set(4);
        qj9.A03 = this.A01;
        bitSet.set(5);
        qj9.A00 = new RFe(this);
        bitSet.set(1);
        7zP.A15(qct, bitSet, qct.A03);
        A01.A2e(qj9);
        C1rq A012 = C1rg.A01(A0T, null, 0);
        A012.A2c();
        A012.A18(16.0f);
        A012.A0R();
        8Th A00 = C8nq.A00(A0T);
        A00.A2Z(((BJB) this).A01);
        A00.A2a(string4);
        A00.A2b(!TextUtils.isEmpty(this.A01));
        A00.A0R();
        A00.A13(16.0f);
        A00.A15(16.0f);
        A00.A0M();
        A00.A01.A04 = this.A02 ? 5Aw.A03 : 5Aw.A02;
        A00.A2Y(new Rjb(this, string, TextUtils.isEmpty(this.A01) ? "" : this.A01));
        A012.A2f(A00.A2W());
        7zL.A1I(A01, A012);
        1LI A1Z = A1Z(A01.A00, A0T, A0H);
        ComponentTree componentTree = lithoView.A00;
        if (componentTree == null) {
            AbN.A19(A1Z, A0T, lithoView);
        } else {
            componentTree.A0O(A1Z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(484296366);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(-255340294, A02);
        return A1Y;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1273474294);
        super/*X.DZJ*/.onDestroyView();
        this.A02 = false;
        0FI.A08(692737341, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-809431373);
        super/*androidx.fragment.app.Fragment*/.onStart();
        0FI.A08(57870331, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(-1569037964);
        super/*X.DZJ*/.onStop();
        0FI.A08(-1690916680, A02);
    }
}
