package com.facebook.phoneid;

import X.0RF;
import X.1In;
import X.1Iu;
import X.1Ka;
import X.3MN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass053;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.ArrayList;

/* loaded from: DeferredInitAbstractPhoneIdProviderDelegate.class */
public abstract class DeferredInitAbstractPhoneIdProviderDelegate extends AnonymousClass053 {
    public DeferredInitAbstractPhoneIdProviderDelegate(0RF r302) {
        super(r302);
    }

    private MatrixCursor A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        0RF r0 = this.A00;
        1Ka A0V = A0V(r0.getContext());
        if (A0V != null && A0Y(r0.getContext())) {
            String str = A0V.A01;
            String str2 = A0V.A02;
            A0s.add("COL_PHONE_ID");
            A0s.add("COL_TIMESTAMP");
            A0s.add("COL_ORIGIN");
            A0s2.add(str);
            A0s2.add(Long.toString(A0V.A00));
            A0s2.add(str2);
        }
        3MN A0W = A0W(r0.getContext());
        if (A0W != null && A0Z(r0.getContext())) {
            A0s.add("COL_SFDID");
            A0s.add("COL_SFDID_CREATION_TS");
            A0s.add("COL_SFDID_GP");
            A0s.add("COL_SFDID_GA");
            A0s2.add(A0W.A03);
            A0s2.add(Long.toString(A0W.A00));
            A0s2.add(A0W.A02);
            A0s2.add(A0W.A01);
        }
        if (A0s.isEmpty()) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(AnonymousClass002.A0b(A0s));
        matrixCursor.addRow(A0s2.toArray(new String[A0s2.size()]));
        return matrixCursor;
    }

    public static void A01(Context context) {
        1Iu.A00(context);
    }

    @Override // X.AnonymousClass053
    public int A0C(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.AnonymousClass053
    public int A0D(Uri uri, String str, String[] strArr) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.AnonymousClass053
    public Cursor A0H(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A0X();
        try {
            A01(this.A00.getContext());
            return A00();
        } catch (Exception e) {
            if (A0U() == null) {
                return null;
            }
            A0U().A00("AbstractPhoneIdProvider", e.getMessage(), e);
            return null;
        }
    }

    @Override // X.AnonymousClass053
    public Uri A0J(Uri uri, ContentValues contentValues) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.AnonymousClass053
    public String A0M(Uri uri) {
        throw AnonymousClass001.A0p();
    }

    public abstract 1In A0U();

    public abstract 1Ka A0V(Context context);

    public abstract 3MN A0W(Context context);

    public abstract void A0X();

    public abstract boolean A0Y(Context context);

    public abstract boolean A0Z(Context context);
}
