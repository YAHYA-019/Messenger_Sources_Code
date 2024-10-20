package com.facebook.appuserstatus;

import X.0Pz;
import X.0RF;
import X.0nD;
import X.1Bi;
import X.1Bn;
import X.AnonymousClass001;
import X.C00i;
import X.C15h;
import android.content.ContentValues;
import android.net.Uri;
import com.facebook.secure.content.SecureContentDelegateDI;

/* loaded from: BaseAppUserStatusDelegate.class */
public abstract class BaseAppUserStatusDelegate extends SecureContentDelegateDI {
    public C15h A00;
    public final C00i A01;
    public final C00i A02;

    public BaseAppUserStatusDelegate(0RF r302) {
        super(r302);
        this.A01 = 1Bi.A00(68335);
        this.A02 = 1Bn.A03(49343);
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw AnonymousClass001.A0T("update should not be called on this content provider");
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public int A0V(Uri uri, String str, String[] strArr) {
        throw AnonymousClass001.A0T("delete should not be called on this content provider");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0122, code lost:
    
        if (r0.equals(((X.C10504tm) r301.A02.get()).A00()) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0157, code lost:
    
        if (r0.equals(r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d7, code lost:
    
        if (A0e().equals(r0) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e5, code lost:
    
        r319 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e8, code lost:
    
        r315 = A0f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e2, code lost:
    
        if (r318 != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.database.Cursor A0X(android.net.Uri r302, java.lang.String[] r303, java.lang.String r304, java.lang.String[] r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appuserstatus.BaseAppUserStatusDelegate.A0X(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public Uri A0Y(Uri uri, ContentValues contentValues) {
        throw AnonymousClass001.A0T("insert should not be called on this content provider");
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public String A0a(Uri uri) {
        return 0Pz.A0W("vnd.android.cursor.dir/", "content://com.facebook.orca.notify.MessengerLoggedInUserProvider/logged_in_user");
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public void A0b() {
        this.A00 = new 0nD(this, 0);
    }

    public abstract String A0e();

    public abstract boolean A0f();

    public abstract boolean A0g();

    public abstract boolean A0h();
}
