package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.dialog.MenuDialogItem;

/* renamed from: X.4Zl, reason: invalid class name */
/* loaded from: 4Zl.class */
public final class C4Zl {
    public Context A00;
    public 7yT A01;
    public C8t A02;
    public 1BY A03;
    public final C00i A05;
    public final C00i A07;
    public final C00i A06 = new 1BQ(17034);
    public final C00i A08 = new 1BQ(49965);
    public final C00i A04 = new 1BV((1BY) null, 68120);

    public C4Zl(1BO r302) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A00 = context;
        this.A07 = new 1HH(context, 67720);
        this.A05 = new 1BQ(16511);
        this.A03 = new 1BY(r302);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.9g5] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.9g5] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.9g5] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.9g5] */
    public static 7Z3 A00(Context context, InboxAdsData inboxAdsData) {
        CharSequence string;
        7Z3 r0 = new 7Z3();
        r0.A04 = true;
        r0.A02 = "";
        ?? obj = new Object();
        obj.A02 = 29;
        obj.A03 = 2131959927;
        r0.A02(new MenuDialogItem((C9g5) obj));
        ?? obj2 = new Object();
        obj2.A02 = 30;
        obj2.A03 = 2131959928;
        r0.A02(new MenuDialogItem((C9g5) obj2));
        ?? obj3 = new Object();
        obj3.A02 = 31;
        if (inboxAdsData.A03().getBooleanQueryParameter("show_ad_choices", false)) {
            ImageSpan imageSpan = new ImageSpan(context, 2132410688);
            0Dc r02 = new 0Dc(context.getResources(), new SpannableStringBuilder());
            r02.A04(imageSpan, 33);
            r02.A02(" ");
            r02.A00();
            r02.A02(" ");
            r02.A01(2131959930);
            string = new SpannableString(r02.A01);
        } else {
            string = context.getString(2131959930);
        }
        obj3.A05 = string;
        r0.A02(new MenuDialogItem((C9g5) obj3));
        ?? obj4 = new Object();
        obj4.A02 = 32;
        obj4.A03 = 2131960015;
        r0.A02(new MenuDialogItem((C9g5) obj4));
        return r0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(android.content.Context r301, X.06Z r302, final com.facebook.messaging.business.inboxads.common.InboxAdsData r303, final X.C4Zl r304, X.C5yq r305, int r306) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Zl.A01(android.content.Context, X.06Z, com.facebook.messaging.business.inboxads.common.InboxAdsData, X.4Zl, X.5yq, int):boolean");
    }
}
