package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.sharedimage.SharedMedia;
import java.util.List;

/* renamed from: X.8md, reason: invalid class name */
/* loaded from: 8md.class */
public final class C8md extends C1rj {
    public static final CallerContext A05 = CallerContext.A0C("M4SharedContentItemSpec", "M4SharedContentItem");
    public static final CallerContext A06 = CallerContext.A0E("M4SharedContentItemSpecVideo", "M4SharedContentItem", "VIDEO");
    public 5SA A00;
    public SharedMedia A01;
    public AYF A02;
    public Boolean A03;
    public List A04;

    public C8md() {
        super("SharedContentItem");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A01, this.A04, this.A03};
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (com.google.common.base.Objects.equal(r317, X.7zQ.A12(r302, 83433)) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        if (r0.A03(r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
    
        if (r0 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0050, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8md.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 2096925462) {
            return null;
        }
        C8md c8md = (C8md) r302.A00.A01;
        SharedMedia sharedMedia = c8md.A01;
        List list = c8md.A04;
        AYF ayf = c8md.A02;
        1BL.A1H(sharedMedia, list, ayf);
        ayf.Bog(sharedMedia, list);
        return null;
    }
}
