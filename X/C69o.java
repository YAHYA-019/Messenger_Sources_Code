package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.69o, reason: invalid class name */
/* loaded from: 69o.class */
public abstract class C69o {
    public boolean A06;
    public boolean A07;
    public final Context A0A;
    public final Set A0B;
    public final Set A0C;
    public static final 4gJ A0E = new 4gM() { // from class: X.69p
        public void Byc(Animatable animatable, Object obj, String str) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };
    public static final NullPointerException A0F = new NullPointerException("No image request was specified!");
    public static final AtomicLong A0D = new AtomicLong();
    public Object A02 = null;
    public Object A03 = null;
    public Object A04 = null;
    public Object[] A09 = null;
    public boolean A08 = true;
    public 4gJ A00 = null;
    public boolean A05 = false;
    public C69w A01 = null;

    public C69o(Context context, Set set, Set set2) {
        this.A06 = false;
        this.A0A = context;
        this.A0B = set;
        this.A0C = set2;
        this.A06 = false;
    }

    public 1iL A00(final C69w c69w, Integer num, Object obj, String str) {
        if (!(this instanceof C69s)) {
            return new IQK(this, c69w, num, obj, this.A02, str, 0);
        }
        C69s c69s = (C69s) this;
        final 2Dp r0 = (2Dp) obj;
        final Object obj2 = ((C69o) c69s).A02;
        int intValue = num.intValue();
        C2r8 c2r8 = intValue != 0 ? intValue != 1 ? C2r8.BITMAP_MEMORY_CACHE : C2r8.DISK_CACHE : C2r8.FULL_FETCH;
        final C00i c00i = c69s.A04;
        final C2r8 c2r82 = c2r8;
        return new 1iL() { // from class: X.69y
            public /* bridge */ /* synthetic */ Object get() {
                2Ff r02 = (2Ff) c00i.get();
                2Dp r03 = r0;
                Object obj3 = obj2;
                C2r8 c2r83 = c2r82;
                C69w c69w2 = c69w;
                return r02.A07(6A4.A00(c69w2), c2r83, r03, obj3, c69w2 instanceof C69u ? ((C69v) c69w2).A06 : null);
            }

            public String toString() {
                C46q A00 = C2qv.A00(this);
                C46q.A00(A00, r0.A05, TraceFieldType.Uri);
                return A00.toString();
            }
        };
    }

    public 1iL A01(C69w c69w, String str) {
        1iL anonymousClass676;
        Object obj = this.A03;
        if (obj != null) {
            anonymousClass676 = A00(c69w, 0S2.A00, obj, str);
        } else {
            Object[] objArr = this.A09;
            if (objArr == null) {
                return new 31B(A0F);
            }
            ArrayList arrayList = new ArrayList(objArr.length * 2);
            for (Object obj2 : objArr) {
                arrayList.add(A00(c69w, 0S2.A0C, obj2, str));
            }
            for (Object obj3 : objArr) {
                arrayList.add(A00(c69w, 0S2.A00, obj3, str));
            }
            anonymousClass676 = new AnonymousClass676(arrayList);
        }
        Object obj4 = this.A04;
        if (obj4 != null) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(anonymousClass676);
            arrayList2.add(A00(c69w, 0S2.A00, obj4, str));
            anonymousClass676 = new AnonymousClass677(arrayList2, false);
        }
        return anonymousClass676;
    }

    public 1OW A02(C69w c69w, Integer num, Object obj, Object obj2, String str) {
        throw new UnsupportedOperationException();
    }

    public C69v A03() {
        if (2D9.A00().BWo()) {
            2D9.A02("AbstractDraweeControllerBuilder#buildController");
        }
        C69v A04 = A04();
        A04.A08 = this.A06;
        A04.A09 = this.A07;
        A06(A04);
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
        return A04;
    }

    public C69v A04() {
        InterfaceC04494b5 interfaceC04494b5;
        C69s c69s = (C69s) this;
        if (2D9.A00().BWo()) {
            2D9.A02("fb-obtainController");
        }
        try {
            C69w c69w = ((C69o) c69s).A01;
            2Dp r0 = (2Dp) ((C69o) c69s).A03;
            2DJ r02 = c69s.A03;
            if (r02 == null || r0 == null) {
                interfaceC04494b5 = null;
            } else {
                CallerContext callerContext = (CallerContext) ((C69o) c69s).A02;
                interfaceC04494b5 = r0.A0F != null ? r02.B42(r0, callerContext) : r02.AZD(r0, callerContext);
            }
            String valueOf = String.valueOf(A0D.getAndIncrement());
            C69t c69t = c69w instanceof C69t ? (C69t) c69w : (C69t) c69s.A07.get();
            c69t.A0J(interfaceC04494b5, c69s.A00, c69s.A01(c69t, valueOf), (CallerContext) ((C69o) c69s).A02, valueOf);
            c69t.A0K(c69s, c69s.A02);
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
            return c69t;
        } catch (Throwable th) {
            4YV.A14();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A03 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object[] r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            java.lang.Object r0 = r0.A03
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L16
        L14:
            r0 = 1
            r303 = r0
        L16:
            r0 = r303
            java.lang.String r1 = "Cannot specify both ImageRequest and FirstAvailableImageRequests!"
            X.C0By.A06(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69o.A05():void");
    }

    public void A06(C69v c69v) {
        Set set = this.A0B;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c69v.A0E((4gJ) it.next());
            }
        }
        Set set2 = this.A0C;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                c69v.A04.A00((2Ib) it2.next());
            }
        }
        4gJ r0 = this.A00;
        if (r0 != null) {
            c69v.A0E(r0);
        }
        if (this.A05) {
            c69v.A0E(A0E);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r302.length > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(java.lang.Object[] r302) {
        /*
            r301 = this;
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L10
            r0 = r302
            int r0 = r0.length
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 <= 0) goto L13
        L10:
            r0 = 1
            r305 = r0
        L13:
            r0 = r305
            java.lang.String r1 = "No requests specified!"
            X.C0By.A05(r0, r1)
            r0 = r301
            r1 = r302
            r0.A09 = r1
            r0 = r301
            r1 = r303
            r0.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69o.A07(java.lang.Object[]):void");
    }
}
