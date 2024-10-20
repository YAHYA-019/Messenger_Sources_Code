package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbavatar.FbAvatarEditorBaseActivity;

/* loaded from: Eze.class */
public final class Eze {
    public final Context A00;

    public Eze(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final void A00() {
        Context context = this.A00;
        11T.A0I(context, "null cannot be cast to non-null type com.facebook.fbavatar.FbAvatarEditorBaseActivity");
        FbAvatarEditorBaseActivity fbAvatarEditorBaseActivity = (FbAvatarEditorBaseActivity) context;
        fbAvatarEditorBaseActivity.A3B();
        fbAvatarEditorBaseActivity.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r304 != 2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(androidx.fragment.app.Fragment r302, java.lang.String r303, int r304, boolean r305) {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.11T.A0I(r0, r1)
            r0 = r306
            r307 = r0
            r0 = r306
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.06Z r0 = r0.BDe()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L83
            r0 = r307
            X.06c r0 = X.7zL.A0G(r0)
            r308 = r0
            r0 = r306
            boolean r0 = X.C2rY.A00(r0)
            r309 = r0
            r0 = 2
            r310 = r0
            r0 = 1
            r311 = r0
            r0 = r309
            if (r0 == 0) goto L45
            r0 = r304
            r1 = r311
            if (r0 == r1) goto L97
            r0 = r304
            r1 = r310
            if (r0 == r1) goto L84
        L45:
            r0 = r304
            r1 = r311
            if (r0 == r1) goto L84
            r0 = r304
            r1 = r310
            if (r0 == r1) goto L97
            r0 = 3
            r311 = r0
            r0 = r304
            r1 = r311
            if (r0 != r1) goto L66
            r0 = 4099(0x1003, float:5.744E-42)
            r311 = r0
            r0 = r308
            r1 = r311
            r0.A06 = r1
        L66:
            r0 = 2131363991(0x7f0a0897, float:1.8347806E38)
            r311 = r0
            r0 = r308
            r1 = r302
            r2 = r303
            r3 = r311
            r0.A0Q(r1, r2, r3)
            r0 = r305
            if (r0 == 0) goto L7e
            r0 = r308
            r1 = r303
            r0.A0V(r1)
        L7e:
            r0 = r308
            r0.A05()
        L83:
            return
        L84:
            r0 = 2130772099(0x7f010083, float:1.7147307E38)
            r312 = r0
            r0 = 2130772103(0x7f010087, float:1.7147315E38)
            r309 = r0
            r0 = 2130772098(0x7f010082, float:1.7147305E38)
            r310 = r0
            r0 = 2130772104(0x7f010088, float:1.7147317E38)
            r311 = r0
            goto La7
        L97:
            r0 = 2130772098(0x7f010082, float:1.7147305E38)
            r312 = r0
            r0 = 2130772104(0x7f010088, float:1.7147317E38)
            r309 = r0
            r0 = 2130772099(0x7f010083, float:1.7147307E38)
            r310 = r0
            r0 = 2130772103(0x7f010087, float:1.7147315E38)
            r311 = r0
        La7:
            r0 = r308
            r1 = r312
            r2 = r309
            r3 = r310
            r4 = r311
            r0.A0D(r1, r2, r3, r4)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Eze.A01(androidx.fragment.app.Fragment, java.lang.String, int, boolean):void");
    }

    public final void A02(String str) {
        Context context = this.A00;
        11T.A0I(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        06Z BDe = ((FragmentActivity) context).BDe();
        if (BDe != null) {
            if (!BDe.A1U()) {
                int A0U = BDe.A0U();
                for (int i = 0; i < A0U; i++) {
                    if (11T.A0O(((C06c) BDe.A0e(i)).A0A, str)) {
                        BDe.A1Q(str, 1);
                        return;
                    }
                }
            }
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0.A0b(r302) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = r0.A00
            r303 = r0
            r0 = r303
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.11T.A0I(r0, r1)
            r0 = r303
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            r303 = r0
            r0 = r303
            X.06Z r0 = r0.BDe()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L26
            r0 = r304
            r1 = r302
            androidx.fragment.app.Fragment r0 = r0.A0b(r1)
            r303 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L2b
        L26:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L2b:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Eze.A03(java.lang.String):boolean");
    }
}
