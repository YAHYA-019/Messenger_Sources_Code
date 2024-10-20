package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.06b, reason: invalid class name */
/* loaded from: 06b.class */
public final class C06b implements LayoutInflater.Factory2 {
    public final 06Z A00;

    public C06b(06Z r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0125, code lost:
    
        if (r313 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012c, code lost:
    
        if (r320 == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012f, code lost:
    
        r313 = r301.A00.A0Y(r320);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0149, code lost:
    
        if (r313 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014c, code lost:
    
        r0 = r301.A00;
        r313 = r0.A0d().A02(r304.getClassLoader(), r314);
        r313.mFromLayout = true;
        r309 = r320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0179, code lost:
    
        if (r0 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017c, code lost:
    
        r309 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0180, code lost:
    
        r313.mFragmentId = r309;
        r313.mContainerId = r320;
        r313.mTag = r0;
        r313.mInLayout = true;
        r313.mFragmentManager = r0;
        r0 = r0.A05;
        r313.mHost = r0;
        r313.onInflate(r0.A01, r305, r313.mSavedFragmentState);
        r323 = r0.A0f(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01dc, code lost:
    
        if (X.06Z.A0O(2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01df, code lost:
    
        r308 = X.AnonymousClass001.A0m(r313, "Fragment ");
        r307 = " has been inflated via the <fragment> tag: id=0x";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ec, code lost:
    
        r308.append(r307);
        X.AnonymousClass001.A1E(java.lang.Integer.toHexString(r0), "FragmentManager", r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0204, code lost:
    
        r0 = (android.view.ViewGroup) r302;
        X.0AW.A01(r0, r313);
        r313.mContainer = r0;
        r323.A07();
        r323.A06();
        r0 = r313.mView;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022c, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0231, code lost:
    
        if (r0 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0234, code lost:
    
        r0.setId(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0247, code lost:
    
        if (r313.mView.getTag() != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x024a, code lost:
    
        r313.mView.setTag(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0258, code lost:
    
        r313.mView.addOnAttachStateChangeListener(new X.C0st(r323, r301, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x027a, code lost:
    
        return r313.mView;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02fd, code lost:
    
        throw X.0Pz.A07("Fragment ", r314, " did not create a view.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0284, code lost:
    
        if (r313.mInLayout != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0287, code lost:
    
        r313.mInLayout = true;
        r0 = r301.A00;
        r313.mFragmentManager = r0;
        r0 = r0.A05;
        r313.mHost = r0;
        r313.onInflate(r0.A01, r305, r313.mSavedFragmentState);
        r323 = r0.A0g(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d5, code lost:
    
        if (X.06Z.A0O(2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02d8, code lost:
    
        r308 = X.AnonymousClass001.A0k();
        r308.append("Retained Fragment ");
        r308.append(r313);
        r307 = " has been re-attached via the <fragment> tag: id=0x";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0331, code lost:
    
        throw X.AnonymousClass001.A0L(X.0Pz.A15(r305.getPositionDescription(), ": Duplicate id 0x", java.lang.Integer.toHexString(r0), ", tag ", r0, ", or parent id 0x", java.lang.Integer.toHexString(r320), " with another fragment for ", r314));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
    
        if (r313 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        if (r0 != null) goto L34;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.View r302, java.lang.String r303, android.content.Context r304, android.util.AttributeSet r305) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06b.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
