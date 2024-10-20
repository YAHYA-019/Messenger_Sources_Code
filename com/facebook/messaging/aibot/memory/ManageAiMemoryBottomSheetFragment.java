package com.facebook.messaging.aibot.memory;

import X.0Q8;
import X.11T;
import X.1Iw;
import X.1qI;
import X.7zL;
import X.7zR;
import X.7zU;
import X.8DM;
import X.8La;
import X.8Yo;
import X.9De;
import X.AQc;
import X.AQk;
import X.AnonymousClass001;
import X.C01i;
import X.C03i;
import X.DGJ;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.memory.model.MemoryData;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: ManageAiMemoryBottomSheetFragment.class */
public final class ManageAiMemoryBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public FbUserSession A00;
    public LithoView A01;
    public MigColorScheme A02;
    public String A03;
    public final 1qI A04;
    public final C01i A05;

    public ManageAiMemoryBottomSheetFragment() {
        AQk A01 = AQk.A01(this, 32);
        C01i A00 = AQk.A00(AQk.A01(this, 25), C03i.A02, 26);
        this.A05 = 7zU.A0F(AQk.A01(A00, 27), A01, AQc.A00(null, A00, 27), 7zL.A18(8DM.class));
        this.A04 = 7zR.A0U();
    }

    public static final ArrayList A05(String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0s;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("fact_id");
            String string2 = jSONObject.getString("fact_string");
            11T.A0D(string);
            11T.A0D(string2);
            A0s.add(new MemoryData(string, string2));
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView A0M = 7zR.A0M(this);
        7zR.A11(A0M);
        this.A01 = A0M;
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme == null) {
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        A0M.A0x(new 8Yo((8La) 8DM.A00(this.A05), migColorScheme, AQk.A01(this, 23), AQk.A01(this, 24)));
        return A0M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new Object();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new DGJ() { // from class: X.9z6
            public 1LI AJE(1Iw r3022, MigColorScheme migColorScheme) {
                return 7zL.A0Y();
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a8, code lost:
    
        if (r313.isEmpty() != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.aibot.memory.ManageAiMemoryBottomSheetFragment.onCreate(android.os.Bundle):void");
    }
}
