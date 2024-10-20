package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: Cbn.class */
public final class Cbn implements 1xJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cbn(Context context, 9mT r303, int i) {
        this.A00 = i;
        this.A02 = r303;
        this.A01 = context;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        Context context;
        String str;
        1xH A0A;
        1xJ c3Vs;
        9mT r309;
        Context context2;
        int i;
        Activity activity;
        Runnable d7g;
        switch (this.A00) {
            case 0:
                AnonymousClass999 anonymousClass999 = (AnonymousClass999) obj;
                if (anonymousClass999 instanceof C87e) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Backup status: ");
                    9mT.A03((Context) this.A01, AnonymousClass001.A0a(((C87e) anonymousClass999).A00, A0k), 0);
                    return;
                } else {
                    context = (Context) this.A01;
                    str = "Error fetching backup state";
                    9mT.A03(context, str, 0);
                    return;
                }
            case 1:
                AnonymousClass999 anonymousClass9992 = (AnonymousClass999) obj;
                if (!(anonymousClass9992 instanceof C87e)) {
                    context = (Context) this.A01;
                    str = 1BJ.A00(677);
                    9mT.A03(context, str, 0);
                    return;
                }
                String str2 = (String) ((C87e) anonymousClass9992).A00;
                9mT r0 = (9mT) this.A02;
                C1x8 A00 = 9mT.A00(r0);
                String A02 = 9mT.A01(r0).A02();
                11T.A0A(A02);
                A0A = A00.A0A(A02);
                c3Vs = new C3Vs(this.A01, r0, str2, 2);
                A0A.A03(c3Vs);
                return;
            case 2:
                boolean z = obj instanceof C87e;
                context = (Context) this.A01;
                str = z ? "Backup restore succeeded" : "Backup restore failed";
                9mT.A03(context, str, 0);
                return;
            case 3:
                C8p c8p = (C8p) obj;
                if (c8p != null) {
                    String str3 = c8p.A00;
                    if (str3.length() != 0) {
                        r309 = (9mT) this.A02;
                        C1x8 A002 = 9mT.A00(r309);
                        String A022 = 9mT.A01(r309).A02();
                        11T.A0A(A022);
                        A0A = A002.A09(C96p.A04, str3, A022);
                        context2 = (Context) this.A01;
                        i = 2;
                        c3Vs = new Cbn(context2, r309, i);
                        A0A.A03(c3Vs);
                        return;
                    }
                }
                context = (Context) this.A01;
                str = "Couldn't fetch recovery code from Block Store";
                9mT.A03(context, str, 0);
                return;
            case 4:
                boolean z2 = obj instanceof C87e;
                context = (Context) this.A01;
                str = z2 ? "Update Base Timestamp for TTL succeeded" : "Update Base Timestamp for TTL failed";
                9mT.A03(context, str, 0);
                return;
            case 5:
                C8p c8p2 = (C8p) obj;
                if (c8p2 != null) {
                    String str4 = c8p2.A00;
                    if (str4.length() != 0) {
                        r309 = (9mT) this.A02;
                        A0A = 9mT.A00(r309).A0C(str4);
                        context2 = (Context) this.A01;
                        i = 4;
                        c3Vs = new Cbn(context2, r309, i);
                        A0A.A03(c3Vs);
                        return;
                    }
                }
                context = (Context) this.A01;
                str = "Couldn't fetch recovery code from Block Store";
                9mT.A03(context, str, 0);
                return;
            case 6:
                C8p c8p3 = (C8p) obj;
                if (c8p3 == null || c8p3.A00.length() == 0) {
                    context = (Context) this.A01;
                    str = "Couldn't find recovery code from block store";
                    9mT.A03(context, str, 0);
                    return;
                } else {
                    Context context3 = (Context) this.A01;
                    11T.A0I(context3, 7zK.A00(2));
                    activity = (Activity) context3;
                    d7g = new D7g(context3, c8p3);
                    activity.runOnUiThread(d7g);
                    return;
                }
            case 7:
                boolean z3 = obj instanceof C87e;
                context = (Context) this.A01;
                str = z3 ? "Opt out succeeded" : "Opt out failed";
                9mT.A03(context, str, 0);
                return;
            default:
                AnonymousClass999 anonymousClass9993 = (AnonymousClass999) obj;
                String A0R = anonymousClass9993 instanceof C87e ? 0Pz.A0R("Opted out check succeeded\nis_user_opted_out = (", ')', AnonymousClass001.A1V(((C87e) anonymousClass9993).A00)) : "Opted out check failed";
                Context context4 = (Context) this.A01;
                11T.A0I(context4, 7zK.A00(2));
                activity = (Activity) context4;
                d7g = new D7f(context4, A0R);
                activity.runOnUiThread(d7g);
                return;
        }
    }
}
