package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: DA8.class */
public final class DA8 implements Runnable {
    public static final String __redex_internal_original_name = "NeueContactPickerCombinedInviteLoader$4";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ CnX A01;
    public final /* synthetic */ Bwo A02;
    public final /* synthetic */ ImmutableList A03;
    public final /* synthetic */ ImmutableList A04;

    public DA8(FbUserSession fbUserSession, CnX cnX, Bwo bwo, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A01 = cnX;
        this.A02 = bwo;
        this.A04 = immutableList;
        this.A03 = immutableList2;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public void run() {
        CnX cnX = this.A01;
        Bwo bwo = this.A02;
        ImmutableList immutableList = this.A04;
        ImmutableList immutableList2 = this.A03;
        FbUserSession fbUserSession = this.A00;
        ArrayList A00 = CnX.A00(fbUserSession, bwo);
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            A0u.put(A0t.A0k, A0t);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            User A0t2 = AbG.A0t(it2);
            if (!A0u.containsKey(A0t2.A0k)) {
                A0s.add(A0t2);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        1Du it3 = immutableList.iterator();
        while (it3.hasNext()) {
            User A0t3 = AbG.A0t(it3);
            if (!((C4P) 1Lo.A06(fbUserSession, 84366)).A00(A0t3)) {
                A0s2.add(A0t3);
            }
        }
        List[] listArr = {A0s, A0s2};
        CN7 cn7 = cnX.A0B;
        List A0s3 = AnonymousClass001.A0s();
        int i = 0;
        do {
            List list = listArr[i];
            if (09K.A01(A0s3)) {
                A0s3 = list;
            } else if (!09K.A01(list)) {
                ArrayList A0t4 = AnonymousClass001.A0t(A0s3.size() + list.size());
                A0t4.addAll(A0s3);
                A0t4.addAll(list);
                Collections.sort(A0t4, new DAg());
                A0s3 = A0t4;
            }
            i++;
        } while (i < 2);
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it4 = ((CGj) cn7.A01.get()).A00(A0s3).iterator();
        while (it4.hasNext()) {
            BlL blL = (BlL) it4.next();
            String A1A = AbK.A1A(blL.A01, "…");
            builder.m11011add((Object) new Cey(A1A, A1A));
            1Du it5 = blL.A00.iterator();
            while (it5.hasNext()) {
                builder.m11011add((Object) CN7.A00(cn7, AbG.A0t(it5)));
            }
        }
        cnX.A03 = builder.build();
        cnX.A06 = true;
        CnX.A01(fbUserSession, cnX, bwo);
    }
}
