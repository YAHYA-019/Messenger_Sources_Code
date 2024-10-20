package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Azf, reason: case insensitive filesystem */
/* loaded from: Azf.class */
public final class C2018Azf extends C1rj {
    public FbUserSession A00;
    public DI8 A01;
    public MigColorScheme A02;
    public ImmutableList A03;
    public String A04;
    public java.util.Map A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public C2018Azf() {
        super("RoomLobbyRingableUserList");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), this.A03, this.A01, this.A04, this.A05, Boolean.valueOf(this.A09)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f1, code lost:
    
        if (r314 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0115, code lost:
    
        if (r314 == X.2QW.A0E) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v341, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Throwable, int] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Throwable, X.1u2] */
    /* JADX WARN: Type inference failed for: r1v10 */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2018Azf.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -210189502:
                1Iw r0 = r302.A00.A00;
                MotionEvent motionEvent = ((3xE) obj).A00;
                GestureDetector gestureDetector = ((B1l) 4YU.A0P(r0)).A00;
                7zR.A1N(motionEvent, gestureDetector);
                gestureDetector.onTouchEvent(motionEvent);
                z = true;
                return Boolean.valueOf(z);
            case 1296908961:
                3xE r02 = (3xE) obj;
                1Iw r03 = r302.A00.A00;
                View view = r02.A01;
                MotionEvent motionEvent2 = r02.A00;
                GestureDetector gestureDetector2 = ((B1l) 4YU.A0P(r03)).A01;
                1BL.A1H(view, motionEvent2, gestureDetector2);
                if (!view.canScrollVertically(-1)) {
                    gestureDetector2.onTouchEvent(motionEvent2);
                }
                z = false;
                return Boolean.valueOf(z);
            case 1530018698:
                DI8 di8 = ((C2018Azf) r302.A00.A01).A01;
                11T.A0F(di8, 1);
                di8.Bx8();
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1l b1l = (B1l) r303;
        DI8 di8 = this.A01;
        ImmutableList immutableList = this.A03;
        boolean z = this.A09;
        AbK.A1S(r302, di8);
        Context context = r302.A0D;
        GestureDetector gestureDetector = new GestureDetector(context, (GestureDetector.OnGestureListener) new C1624Ao2(di8, immutableList, z));
        GestureDetector gestureDetector2 = new GestureDetector(context, (GestureDetector.OnGestureListener) new JpM(di8, 1));
        b1l.A00 = gestureDetector;
        b1l.A01 = gestureDetector2;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
