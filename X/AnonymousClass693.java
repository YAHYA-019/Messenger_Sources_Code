package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.693, reason: invalid class name */
/* loaded from: 693.class */
public final class AnonymousClass693 {
    public final FbUserSession A00;
    public final 1De A01;
    public final List A02;
    public final Set A03;

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Comparator] */
    public AnonymousClass693(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        Set set = (Set) 1Bn.A0E((Context) null, r303.A00, 174);
        11T.A0A(set);
        this.A03 = set;
        ArrayList arrayList = new ArrayList();
        AnonymousClass694[] anonymousClass694Arr = (AnonymousClass694[]) set.toArray(new AnonymousClass694[0]);
        Arrays.sort(anonymousClass694Arr, new Object());
        for (AnonymousClass694 anonymousClass694 : anonymousClass694Arr) {
            if (!(anonymousClass694 instanceof AnonymousClass696) || ((AnonymousClass696) anonymousClass694).A02) {
                arrayList.add(anonymousClass694);
            }
        }
        this.A02 = arrayList;
        this.A00 = fbUserSession;
        0fH.A0g(arrayList, "PrefetchPolicyManager", "Enabled sorted policies: %s");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(X.AnonymousClass693 r301, X.HBi r302, java.lang.Integer r303) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass693.A00(X.693, X.HBi, java.lang.Integer):boolean");
    }
}
