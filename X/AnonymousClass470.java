package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.model.messages.Message;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.470, reason: invalid class name */
/* loaded from: 470.class */
public final class AnonymousClass470 {
    public int A00;
    public final Context A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C22a A06 = (C22a) 1Bi.A03(66067);
    public final C15h A07;
    public final C15h A08;
    public final C00i A09;
    public final C00i A0A;
    public final C2n0 A0B;
    public final C15h A0C;

    public AnonymousClass470(Context context) {
        1BV r0 = new 1BV(66575);
        this.A03 = r0;
        this.A02 = new 1BQ(68024);
        this.A00 = -1;
        this.A01 = context;
        this.A04 = new 1BV(context, 49419);
        this.A05 = new 1BV(context, 83431);
        1BV r02 = new 1BV(context, 16979);
        this.A09 = r02;
        this.A0A = new 1BV(81926);
        this.A0B = new C2n0(context, null, null, ((MigColorScheme) r02.get()).B4i(), ((MigColorScheme) r02.get()).B9Q(), ((MigColorScheme) r02.get()).BEj(), context.getResources().getDimensionPixelSize(2KV.A06.textSizeResId), 2132608903, 2132608902, true, ((2yD) ((AnonymousClass471) r0.get()).A01.A00.get()).AZk(36311173939005949L), false, false, false, false);
        Object A0D = 1Bn.A0D(context, 16428);
        this.A07 = new 4OK(A0D, this, 1);
        this.A0C = new 4OK(A0D, this, 2);
        this.A08 = new 4OK(A0D, this, 3);
    }

    public static int A00(AnonymousClass470 anonymousClass470) {
        int i = anonymousClass470.A00;
        float f = 0.0f / 0.0f;
        if (i == -1) {
            Context context = anonymousClass470.A01;
            i = 0NA.A02(context, 2130971121, context.getResources().getDimensionPixelSize(2132279592)) - C0A8.A00(context, 1.0f);
            anonymousClass470.A00 = i;
        }
        return i;
    }

    public static SpannableStringBuilder A01(FbUserSession fbUserSession, AnonymousClass470 anonymousClass470, Message message, String str, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        60P r0 = (60P) 1Lo.A03(anonymousClass470.A01, fbUserSession, 49926);
        ImmutableList immutableList = message.A0v;
        if (immutableList != null && !immutableList.isEmpty()) {
            C00i c00i = anonymousClass470.A05;
            if (c00i.get() != null && ((ViewerContext) c00i.get()).mIsPageContext) {
                spannableStringBuilder = new SpannableStringBuilder(Spannable.Factory.getInstance().newSpannable(str));
                boolean A00 = r0.A00(message);
                ImmutableList immutableList2 = C1q7.A07;
                ImmutableMap immutableMap = message.A13;
                immutableMap.containsKey("message_with_markdown");
                anonymousClass470.A05(spannableStringBuilder, A00);
                AnonymousClass471 anonymousClass471 = (AnonymousClass471) anonymousClass470.A03.get();
                immutableMap.containsKey("message_with_markdown");
                1Br.A0C(anonymousClass471.A00);
                anonymousClass470.A04(spannableStringBuilder, z);
                anonymousClass470.A03(spannableStringBuilder);
                return spannableStringBuilder;
            }
        }
        boolean A002 = r0.A00(message);
        ImmutableList immutableList3 = C1q7.A07;
        message.A13.containsKey("message_with_markdown");
        spannableStringBuilder = new SpannableStringBuilder(Spannable.Factory.getInstance().newSpannable(str));
        anonymousClass470.A05(spannableStringBuilder, A002);
        ((AnonymousClass471) anonymousClass470.A03.get()).A00.A00.get();
        anonymousClass470.A04(spannableStringBuilder, z);
        anonymousClass470.A03(spannableStringBuilder);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A02(FbUserSession fbUserSession, AnonymousClass470 anonymousClass470, Message message, boolean z) {
        String str = message.A0F().A00;
        return A01(fbUserSession, anonymousClass470, message, 1JF.A0A(str) ? C12104yr.A02(message, null, null, (C12104yr) anonymousClass470.A04.get()) : str.trim(), z);
    }

    private void A03(Editable editable) {
        Context context = this.A01;
        11T.A0F(context, 0);
        if (((2yD) 1Bi.A03(16385)).AZk(36327030958151595L)) {
            editable.insert(0, "_");
            Drawable drawable = context.getDrawable(2132346801);
            if (drawable == null) {
                throw 1BK.A0h();
            }
            editable.setSpan(new ImageSpan(drawable), 0, 1, 33);
        }
    }

    private void A04(Editable editable, boolean z) {
        C22a c22a;
        Context context;
        Resources resources;
        int i;
        if (!((2yD) ((AnonymousClass471) this.A03.get()).A01.A00.get()).AZk(2342157739385561233L) || (c22a = this.A06) == null) {
            return;
        }
        if (!z) {
            c22a.A7O(editable, A00(this));
            return;
        }
        if (((6P0) this.A02.get()).A00() && c22a.BWc(editable, 3)) {
            context = this.A01;
            resources = context.getResources();
            i = 2131427342;
        } else {
            context = this.A01;
            resources = context.getResources();
            i = 2131427351;
        }
        c22a.A7N(editable, (int) TypedValue.applyDimension(1, resources.getInteger(i), context.getResources().getDisplayMetrics()));
    }

    private void A05(Editable editable, boolean z) {
        C00i c00i = this.A03;
        if (((2yD) ((64H) ((AnonymousClass471) c00i.get()).A00.A00.get()).A00.A00.get()).AZk(36311173938874876L)) {
            1Br.A0C(((AnonymousClass471) c00i.get()).A02);
            this.A0B.A03(editable, null, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r301.A06.BWc(r0, (-1) >>> 1) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A06(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.secure.secrettypes.SecretString r0 = r0.A0F()
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r304
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4e
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L29
            r0 = r303
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4e
        L29:
            r0 = r302
            X.5Pm r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4e
            r0 = r301
            X.22a r0 = r0.A06
            X.2KY r0 = (X.2KY) r0
            r306 = r0
            r0 = r306
            r1 = r304
            r2 = -1
            r3 = 1
            int r2 = r2 >>> r3
            boolean r0 = r0.BWc(r1, r2)
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L53
        L4e:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L53:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass470.A06(com.facebook.messaging.model.messages.Message):boolean");
    }

    public SpannableStringBuilder A07(String str, int i) {
        C22a c22a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Spannable.Factory.getInstance().newSpannable(str));
        C00i c00i = this.A03;
        if (((2yD) ((64H) ((AnonymousClass471) c00i.get()).A00.A00.get()).A00.A00.get()).AZk(36311173938874876L)) {
            this.A0B.A03(spannableStringBuilder, null, false);
        }
        if (((2yD) ((AnonymousClass471) c00i.get()).A01.A00.get()).AZk(2342157739385561233L) && (c22a = this.A06) != null) {
            c22a.A7O(spannableStringBuilder, i);
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A08(Message message) {
        boolean z = false;
        if (!((2yD) ((AnonymousClass471) this.A03.get()).A01.A00.get()).AZk(2342157739385561233L)) {
            return false;
        }
        if (message.A1A.intValue() > 0 && ((AnonymousClass654) this.A0A.get()).A01(message)) {
            z = true;
        }
        String str = message.A1V;
        if (str == null || z) {
            return A06(message);
        }
        1Xo r0 = (1Xo) this.A0C.get();
        Object obj = (64G) r0.A02(str);
        if (obj == null) {
            obj = new Object();
            r0.A04(str, obj);
        }
        Boolean bool = obj.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean A06 = A06(message);
        obj.A00 = Boolean.valueOf(A06);
        return A06;
    }
}
