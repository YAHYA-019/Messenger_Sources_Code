package X;

import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;

/* renamed from: X.053, reason: invalid class name */
/* loaded from: 053.class */
public abstract class AnonymousClass053 {
    public final 0RF A00;

    public AnonymousClass053(0RF r302) {
        C0y3.A00();
        this.A00 = r302;
    }

    public void A0B() {
    }

    public abstract int A0C(Uri uri, ContentValues contentValues, String str, String[] strArr);

    public abstract int A0D(Uri uri, String str, String[] strArr);

    public int A0E(Uri uri, ContentValues[] contentValuesArr) {
        return this.A00.A04(uri, contentValuesArr);
    }

    public AssetFileDescriptor A0F(Uri uri, String str) {
        return this.A00.A05(uri, str);
    }

    public AssetFileDescriptor A0G(Uri uri, String str, Bundle bundle) {
        return this.A00.A06(uri, str, bundle);
    }

    public abstract Cursor A0H(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    public Cursor A0I(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return A0H(uri, strArr, str, strArr2, str2);
    }

    public abstract Uri A0J(Uri uri, ContentValues contentValues);

    public Bundle A0K(String str, String str2, Bundle bundle) {
        return this.A00.A07(str, str2, bundle);
    }

    public ParcelFileDescriptor A0L(Uri uri, String str) {
        return this.A00.A08(uri, str);
    }

    public abstract String A0M(Uri uri);

    public void A0N() {
        this.A00.A0A();
    }

    public void A0O() {
        this.A00.A0B();
    }

    public void A0P(int i) {
        this.A00.A0C(i);
    }

    public void A0Q(Configuration configuration) {
        this.A00.A0D(configuration);
    }

    public boolean A0R() {
        return this.A00.A0F();
    }

    public ContentProviderResult[] A0S(ArrayList arrayList) {
        return this.A00.A0G(arrayList);
    }

    public String[] A0T(Uri uri, String str) {
        return this.A00.A0H(uri, str);
    }

    public Context getContext() {
        return this.A00.getContext();
    }
}
