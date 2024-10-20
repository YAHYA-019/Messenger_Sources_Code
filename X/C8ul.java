package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8ul, reason: invalid class name */
/* loaded from: 8ul.class */
public final class C8ul extends GS2 {
    public 1BY A00;
    public final C00i A01;

    public C8ul(1BO r302) {
        super("JoiningCallWithBlockedUserPresenter");
        this.A01 = 7zN.A0D(85079);
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r307v2, types: [java.lang.Object, X.RLS] */
    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        RLS rls;
        FbUserSession A05 = 1Fw.A05(this.A00);
        if (A0V().isPresent()) {
            RrJ rrJ = (RrJ) A0V().get();
            ?? obj = new Object();
            rrJ.getClass();
            ((RLS) obj).A00 = rrJ.A00;
            ((RLS) obj).A01 = rrJ.A01;
            ((RLS) obj).A02 = rrJ.A02;
            rls = obj;
        } else {
            rls = new RLS();
        }
        C00i c00i = this.A01;
        ImmutableList A03 = ((CJC) c00i.get()).A03(A05);
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = A03.iterator();
        while (it.hasNext()) {
            A0h.m11011add((Object) ((User) it.next()).A0k);
        }
        ImmutableList build = A0h.build();
        rls.A00 = build;
        C1pq.A08("blockedUsers", build);
        ImmutableList A032 = ((CJC) c00i.get()).A03(A05);
        Context context = ((Fragment) A0W().get()).getContext();
        String str = ((User) A032.get(0)).A0X.firstName;
        String string = (A032.size() != 1 || str == null) ? context.getString(2131965216) : 1BK.A0v(context, str, 2131965214);
        rls.A02 = string;
        C1pq.A08("titleText", string);
        ImmutableList A033 = ((CJC) c00i.get()).A03(A05);
        Context context2 = ((Fragment) A0W().get()).getContext();
        String A13 = 7zL.A13((User) A033.get(0));
        String str2 = ((User) A033.get(0)).A0X.firstName;
        String string2 = (A033.size() != 1 || str2 == null || A13 == null) ? context2.getString(2131965215) : context2.getString(2131965213, A13, str2);
        rls.A01 = string2;
        C1pq.A08("messageText", string2);
        A0Z(new RrJ(rls));
    }
}
