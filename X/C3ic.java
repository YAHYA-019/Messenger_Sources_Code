package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ic, reason: invalid class name */
/* loaded from: 3ic.class */
public final /* synthetic */ class C3ic implements Runnable {
    public static final String __redex_internal_original_name = "EndOfNavigationActionExecutor$$ExternalSyntheticLambda1";
    public final /* synthetic */ 3M1 A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ C3ic(3M1 r302, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = r302;
        this.A01 = l;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2vp] */
    @Override // java.lang.Runnable
    public final void run() {
        3M1 r0 = this.A00;
        C2vp c2vp = r0.A00;
        ?? obj = new Object();
        List list = r0.A03;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("satisfiesPredicate");
        }
        list.clear();
        r0.A01 = c2vp;
        r0.A00 = obj;
    }
}
