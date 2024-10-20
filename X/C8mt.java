package X;

import android.net.Uri;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8mt, reason: invalid class name */
/* loaded from: 8mt.class */
public final class C8mt extends C1rj {
    public static final CallerContext A0K = CallerContext.A0B("InAppNotificationComponentSpec");
    public static final ImmutableList A0L = ImmutableList.of();
    public int A00;
    public int A01;
    public int A02;
    public Uri A03;
    public View.OnClickListener A04;
    public View.OnClickListener A05;
    public View.OnClickListener A06;
    public View.OnClickListener A07;
    public View.OnClickListener A08;
    public C1u3 A09;
    public C1u4 A0A;
    public MigColorScheme A0B;
    public ImmutableList A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public C8mt() {
        super("InAppNotificationComponent");
        this.A0C = A0L;
    }

    public final Object[] A0k() {
        ImmutableList immutableList = this.A0C;
        MigColorScheme migColorScheme = this.A0B;
        View.OnClickListener onClickListener = this.A04;
        View.OnClickListener onClickListener2 = this.A05;
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(this.A01);
        C1u3 c1u3 = this.A09;
        C1u4 c1u4 = this.A0A;
        Uri uri = this.A03;
        Boolean valueOf3 = Boolean.valueOf(this.A0H);
        View.OnClickListener onClickListener3 = this.A06;
        String str = this.A0F;
        View.OnClickListener onClickListener4 = this.A07;
        String str2 = this.A0G;
        View.OnClickListener onClickListener5 = this.A08;
        Boolean A0d = 1BK.A0d();
        return new Object[]{immutableList, migColorScheme, onClickListener, onClickListener2, valueOf, valueOf2, c1u3, c1u4, uri, valueOf3, onClickListener3, str, onClickListener4, str2, onClickListener5, A0d, Boolean.valueOf(this.A0I), A0d, Boolean.valueOf(this.A0J), Integer.valueOf(this.A02), this.A0D, this.A0E, A0d, A0d};
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0592, code lost:
    
        r326 = false;
        r325 = r325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ea, code lost:
    
        if (r0 != null) goto L26;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8mt.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        View view;
        View.OnClickListener onClickListener;
        switch (r302.A01) {
            case -1921141603:
                1Is r0 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((C8mt) r0).A05;
                break;
            case -1797042752:
                1Is r02 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((C8mt) r02).A04;
                break;
            case -1351902487:
                1Is r03 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((C8mt) r03).A06;
                break;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 494443983:
                1Is r04 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((C8mt) r04).A07;
                break;
            case 779479901:
                1Is r05 = r302.A00.A01;
                view = ((3xC) obj).A00;
                onClickListener = ((C8mt) r05).A08;
                break;
            default:
                return null;
        }
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
